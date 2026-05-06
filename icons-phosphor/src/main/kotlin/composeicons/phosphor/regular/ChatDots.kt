package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorRegularIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
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
