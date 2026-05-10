package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorFillIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 120c0 4.418-3.582 8-8 8h-32v32h8c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h8v-32h-112v32h8c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96v-24h-8C103.163 88 96 80.837 96 72v-32c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-8v24h96c4.418 0 8 3.582 8 8Z"),
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
