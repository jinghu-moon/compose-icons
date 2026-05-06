package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorDuotoneIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 80v112c0 4.418-3.582 8-8 8h-160c-8.837 0-16-7.163-16-16v-128c0 8.837 7.163 16 16 16h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M216 64h-160c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h136c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-136C42.745 32 32 42.745 32 56v128c0 13.255 10.745 24 24 24h160c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM216 192h-160c-4.418 0-8-3.582-8-8v-105.37c2.569 .911 5.275 1.374 8 1.37h160ZM168 132c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
