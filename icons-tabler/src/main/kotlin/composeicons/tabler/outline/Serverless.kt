package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Serverless: ImageVector
    get() {
        if (_serverless != null) return _serverless!!
        _serverless = tablerOutlineIcon(
            name = "Serverless",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 19l3.03 1.748c.603 .335 1.337 .335 1.94 0l6-3.843c.637-.353 1.031-1.025 1.03-1.753v-6.152l-8 3L4 15v-6.405C4 7.867 4.394 7.196 5.03 6.843L11.03 3.261c.621-.347 1.379-.347 2 0L16 5"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _serverless!!
    }

private var _serverless: ImageVector? = null
