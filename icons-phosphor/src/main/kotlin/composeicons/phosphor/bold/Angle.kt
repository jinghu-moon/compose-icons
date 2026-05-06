package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorBoldIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 200c0 6.627-5.373 12-12 12h-168c-6.627 0-12-5.373-12-12v-116h-28C25.373 84 20 78.627 20 72 20 65.373 25.373 60 32 60h28v-28C60 25.373 65.373 20 72 20c6.627 0 12 5.373 12 12v156h156c6.627 0 12 5.373 12 12ZM111 84.29c40.86 3.42 73.28 35.84 76.7 76.7 .52 6.215 5.713 10.996 11.95 11 .33 0 .66 0 1 0 3.187-.254 6.141-1.77 8.206-4.211 2.065-2.441 3.071-5.604 2.794-8.789C207.252 106.441 165.55 64.752 113 60.37c-6.605-.552-12.408 4.355-12.96 10.96-.552 6.605 4.355 12.408 10.96 12.96Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
