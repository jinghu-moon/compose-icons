package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorDuotoneIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 120c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24ZM143.75 144h-31.5c-4.96-.05-9.665 2.195-12.746 6.082-3.081 3.887-4.194 8.98-3.014 13.798l12.19 48c1.865 7.168 8.354 12.158 15.76 12.12h7.12c7.406 .038 13.895-4.952 15.76-12.12l12.19-48c1.18-4.818 .068-9.911-3.014-13.798-3.081-3.887-7.786-6.132-12.746-6.082Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M154.2 138.33c9.325-13.298 7.209-31.472-4.921-42.273-12.13-10.8-30.428-10.8-42.558 0-12.13 10.8-14.246 28.975-4.921 42.273-3.428 1.615-6.429 4.012-8.76 7-4.539 5.791-6.128 13.363-4.3 20.49l12.18 48c2.749 10.733 12.441 18.224 23.52 18.18h7.12c11.07 .048 20.759-7.429 23.52-18.15l12.18-48c1.828-7.127 .239-14.699-4.3-20.49-2.328-2.998-5.329-5.407-8.76-7.03ZM128 104c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM151.75 161.91l-12.18 48c-.957 3.623-4.253 6.132-8 6.09h-7.12c-3.747 .042-7.043-2.467-8-6.09l-12.18-48c-.609-2.342-.083-4.834 1.42-6.73 1.58-2.025 4.012-3.201 6.58-3.18h31.5c2.568-.021 5 1.155 6.58 3.18 1.496 1.9 2.015 4.391 1.4 6.73ZM72 128c-.011 5.067 .661 10.113 2 15 1.072 4.214-1.418 8.513-5.607 9.68-4.189 1.166-8.543-1.228-9.803-5.39C50.44 117.969 61.605 86.69 86.48 69.157c24.875-17.533 58.086-17.533 82.961 0 24.875 17.533 36.04 48.812 27.89 78.133-1.499 3.824-5.649 5.891-9.604 4.785C183.771 150.968 181.296 147.046 182 143c5.77-21.007-1.167-43.454-17.783-57.543C147.601 71.367 124.322 68.193 104.541 77.319 84.759 86.445 72.066 106.215 72 128ZM232 128c.019 34.726-17.308 67.166-46.18 86.46-3.673 2.458-8.642 1.473-11.1-2.2-2.458-3.673-1.473-8.642 2.2-11.1 32.215-21.544 46.543-61.628 35.286-98.712C200.948 65.364 166.755 40.011 128 40.011c-38.755 0-72.948 25.354-84.206 62.438-11.258 37.084 3.071 77.167 35.286 98.712 3.673 2.458 4.658 7.427 2.2 11.1-2.458 3.673-7.427 4.658-11.1 2.2C28.946 186.88 12.931 134.016 31.927 88.19 50.924 42.363 99.642 16.333 148.296 26.014 196.95 35.695 231.993 78.392 232 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
