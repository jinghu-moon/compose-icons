package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorBoldIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 136c0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12ZM201.19 192.28c4.264 5.076 3.605 12.646-1.47 16.91-5.076 4.264-12.646 3.605-16.91-1.47C169.12 191.42 145 172 108 172c-28.89 0-55.46 12.68-74.81 35.72-4.264 5.076-11.835 5.734-16.91 1.47-5.075-4.264-5.734-11.835-1.47-16.91C27.847 176.534 44.573 164.254 63.5 156.53 39.374 137.562 29.923 105.386 39.958 76.384 49.994 47.382 77.31 27.928 108 27.928c30.69 0 58.006 19.453 68.042 48.456 10.036 29.002 .585 61.178-23.542 80.146 18.929 7.721 35.655 20.002 48.69 35.75ZM108 148c26.51 0 48-21.49 48-48C156 73.49 134.51 52 108 52 81.49 52 60 73.49 60 100c.028 26.498 21.502 47.972 48 48Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
