package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorRegularIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64 236c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM84 192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM20 192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM52 160c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM256 40c0 4.418-3.582 8-8 8h-28.69L191.46 75.86 169.8 202.65c-.994 5.905-5.202 10.761-10.906 12.585-5.704 1.823-11.949 .309-16.184-3.925l-98-98C40.469 109.071 38.955 102.818 40.785 97.108c1.831-5.709 6.7-9.916 12.615-10.898L180.14 64.54 210.34 34.34C211.842 32.84 213.878 31.998 216 32h32c4.418 0 8 3.582 8 8ZM174.21 81.79 56 102l98 98Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
