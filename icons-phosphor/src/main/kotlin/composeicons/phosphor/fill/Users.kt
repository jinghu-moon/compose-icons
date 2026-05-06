package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorFillIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.47 195.63c1.604 2.459 1.732 5.599 .333 8.18-1.398 2.581-4.098 4.19-7.033 4.19h-147.54c-2.936-0-5.635-1.609-7.033-4.19-1.398-2.581-1.27-5.721 .333-8.18C14.791 178.296 31.355 165.068 50.75 157.92 28.735 143.264 18.913 115.922 26.569 90.607 34.225 65.292 57.553 47.976 84 47.976c26.447 0 49.775 17.317 57.431 42.631 7.656 25.315-2.166 52.657-24.181 67.313 19.395 7.148 35.959 20.376 47.22 37.71ZM252.38 195.48C241.116 178.219 224.589 165.048 205.25 157.92c26.272-17.697 34.261-52.768 18.246-80.098C207.481 50.493 172.98 40.32 144.7 54.59c-1.055 .545-1.813 1.53-2.07 2.689-.257 1.159 .014 2.372 .74 3.311 20.797 25.942 22.269 62.406 3.63 89.94-1.222 1.825-.744 4.293 1.07 5.53 11.839 8.263 21.974 18.73 29.85 30.83 3.176 4.865 4.474 10.719 3.65 16.47-.188 1.158 .142 2.34 .903 3.233 .76 .893 1.874 1.408 3.047 1.407h60.3c3.622 .001 6.793-2.431 7.73-5.93 .562-2.263 .137-4.659-1.17-6.59Z"),
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
