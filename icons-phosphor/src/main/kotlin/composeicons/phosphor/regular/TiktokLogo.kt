package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorRegularIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 72C197.502 71.972 176.028 50.498 176 24c0-4.418-3.582-8-8-8h-40c-4.418 0-8 3.582-8 8v132c-.005 9.908-7.263 18.32-17.065 19.774-9.801 1.454-19.19-4.487-22.071-13.967-2.881-9.48 1.613-19.641 10.566-23.887 2.792-1.325 4.571-4.14 4.57-7.23v-42.69c.001-2.367-1.046-4.613-2.861-6.134C91.325 80.345 88.931 79.706 86.6 80.12 50.91 86.48 24 119.1 24 156c0 41.974 34.026 76 76 76 41.974 0 76-34.026 76-76v-39.71c14.817 7.73 31.288 11.749 48 11.71 4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM216 111.64c-15.634-1.385-30.603-6.965-43.33-16.15-2.439-1.753-5.654-1.993-8.326-.62-2.672 1.373-4.349 4.126-4.344 7.13v54c0 33.137-26.863 60-60 60C66.863 216 40 189.137 40 156 40 130.1 56.64 106.87 80 98.4v27.67c-14.281 9.542-19.832 27.843-13.259 43.71 6.573 15.868 23.44 24.882 40.285 21.531C123.87 187.96 136.002 173.175 136 156v-124h24.5c3.7 28.981 26.519 51.8 55.5 55.5Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
