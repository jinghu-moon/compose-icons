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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 19.000 L 11.030 20.748 C 11.633 21.083 12.367 21.083 12.970 20.748 L 18.970 16.905 C 19.607 16.552 20.001 15.880 20.000 15.152 L 20.000 9.000 L 12.000 12.000 L 4.000 15.000 L 4.000 8.595 C 4.000 7.867 4.394 7.196 5.030 6.843 L 11.030 3.261 C 11.651 2.914 12.409 2.914 13.030 3.261 L 16.000 5.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _serverless!!
    }

private var _serverless: ImageVector? = null
