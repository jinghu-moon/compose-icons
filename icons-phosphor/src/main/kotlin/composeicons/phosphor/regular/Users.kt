package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorRegularIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M117.25 157.92c22.015-14.656 31.837-41.998 24.181-67.313C133.775 65.292 110.447 47.976 84 47.976c-26.447 0-49.775 17.317-57.431 42.631-7.656 25.315 2.166 52.657 24.181 67.313C31.355 165.068 14.791 178.296 3.53 195.63c-1.611 2.394-1.808 5.47-.515 8.05 1.293 2.58 3.874 4.264 6.756 4.406 2.882 .143 5.617-1.277 7.159-3.716C31.688 181.671 56.926 167.978 84 167.978c27.074 0 52.312 13.694 67.07 36.392 2.442 3.629 7.345 4.624 11.008 2.235 3.663-2.389 4.729-7.278 2.392-10.975C153.209 178.296 136.645 165.068 117.25 157.92ZM40 108C40 83.699 59.699 64 84 64c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C59.711 151.972 40.028 132.289 40 108ZM250.14 206.7c-3.7 2.413-8.656 1.37-11.07-2.33C224.329 181.656 199.078 167.964 172 168c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 17.721-.017 33.702-10.662 40.545-27.008 6.843-16.346 3.213-35.202-9.21-47.839C190.912 64.517 172.12 60.566 155.66 67.13c-2.672 1.155-5.76 .768-8.064-1.011-2.304-1.779-3.46-4.669-3.018-7.546 .441-2.877 2.411-5.287 5.142-6.293 28.53-11.378 61.045 .627 75.336 27.814 14.291 27.187 5.743 60.777-19.806 77.826 19.395 7.148 35.959 20.376 47.22 37.71 2.413 3.7 1.37 8.656-2.33 11.07Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
