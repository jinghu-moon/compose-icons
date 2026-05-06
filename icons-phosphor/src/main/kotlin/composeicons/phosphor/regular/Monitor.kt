package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorRegularIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160C34.745 40 24 50.745 24 64v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 50.745 221.255 40 208 40ZM216 176c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
