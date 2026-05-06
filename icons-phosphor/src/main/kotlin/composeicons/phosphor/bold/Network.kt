package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorBoldIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 108h-92v-16h4c11.046 0 20-8.954 20-20v-32C164 28.954 155.046 20 144 20h-32C100.954 20 92 28.954 92 40v32c0 11.046 8.954 20 20 20h4v16h-92c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v24h-4c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-4v-24h104v24h-4c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-4v-24h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM116 44h24v24h-24ZM76 204h-24v-24h24ZM204 204h-24v-24h24Z"),
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
