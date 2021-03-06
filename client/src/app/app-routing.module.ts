import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// page components
// login
import { LoginComponent } from './components/page/login/login.component';
// dashboard
import { DashboardComponent } from './components/page/dashboard/dashboard.component';
// admin
import { AdminComponent } from './components/page/admin/admin.component';
import { UsersComponent } from './components/page/admin/users/users.component';
import { UsersNewComponent } from './components/page/admin/users-new/users-new.component';
import { UsersEditComponent } from './components/page/admin/users-edit/users-edit.component';
// stamps
import { StampsComponent } from './components/page/stamps/stamps.component';
import { StampsNewComponent } from './components/page/stamps/stamps-new/stamps-new.component';
// slideshow
import { SlideshowComponent } from './components/page/slideshow/slideshow.component';
// mypage
import { MypageComponent } from './components/page/mypage/mypage.component';
import { ProfileEditComponent } from './components/page/mypage/profile-edit/profile-edit.component';
import { PasswordEditComponent } from './components/page/mypage/password-edit/password-edit.component';
// others
import { ErrorPageComponent } from './components/page/error-page/error-page.component';
import { HeaderComponent } from './shared/components/header/header.component';

// guards
import { AuthGuard } from './shared/guards/auth.guard';
import { LoginedGuard } from './shared/guards/logined.guard';
import { AdminGuard } from './shared/guards/admin.guard';

const routes: Routes = [
  { path: 'login', component: LoginComponent, canActivate: [LoginedGuard] },
  {
    path: '',
    component: HeaderComponent,
    canActivate: [AuthGuard],
    children: [
      { path: '', component: StampsComponent },
      {
        path: 'dashboard',
        component: DashboardComponent,
      },
      {
        path: 'stamps',
        component: StampsComponent,
      },
      {
        path: 'stamps/new',
        component: StampsNewComponent,
      },
      {
        path: 'slideshow',
        component: SlideshowComponent,
      },
      {
        path: 'mypage',
        component: MypageComponent,
        children: [
          {
            path: 'profile',
            component: ProfileEditComponent,
          },
          {
            path: 'password',
            component: PasswordEditComponent,
          },
        ],
      },
      {
        path: 'admin',
        component: AdminComponent,
        canActivate: [AdminGuard],
        children: [
          { path: 'users', component: UsersComponent },
          {
            path: 'users/new',
            component: UsersNewComponent,
          },
          {
            path: 'users/:userId/edit',
            component: UsersEditComponent,
          },
        ],
      },
    ],
  },
  { path: 'error', component: ErrorPageComponent },
  { path: '**', redirectTo: '/error?status_code=404', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
