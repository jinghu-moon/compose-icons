package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorRegularIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 112h-96v-24h8c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h8v24h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v32h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-8v-32h112v32h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-8v-32h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 40h32v32h-32ZM80 208h-32v-32h32ZM208 208h-32v-32h32Z"),
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
        return _network!!
    }

private var _network: ImageVector? = null
