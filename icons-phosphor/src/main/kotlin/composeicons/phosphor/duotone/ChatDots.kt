package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorDuotoneIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64v128c0 4.418-3.582 8-8 8h-136L45.15 230.11c-2.379 2.001-5.702 2.443-8.521 1.133C33.81 229.933 32.005 227.109 32 224v-160c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM84 140c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM172 140c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM232 64v128c0 8.837-7.163 16-16 16h-133L50.4 236.16l-.09 .07C47.43 238.672 43.775 240.008 40 240c-2.35-.005-4.671-.524-6.8-1.52C27.561 235.874 23.964 230.213 24 224v-160C24 55.163 31.163 48 40 48h176c8.837 0 16 7.163 16 16ZM40 224h0ZM216 64h-176v160L74.77 194c1.445-1.275 3.303-1.985 5.23-2h136Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
