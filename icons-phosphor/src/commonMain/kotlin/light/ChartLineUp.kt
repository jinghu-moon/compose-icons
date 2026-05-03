package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorLightIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.LineTo(26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 44.68629f, 28.68629f, 42.0f, 32.0f, 42.0f),
                    PathNode.CurveTo(35.31371f, 42.0f, 38.0f, 44.68629f, 38.0f, 48.0f),
                    PathNode.LineTo(38.0f, 161.52f),
                    PathNode.LineTo(91.76f, 107.76f),
                    PathNode.CurveTo(94.10254f, 105.42038f, 97.89746f, 105.42038f, 100.24f, 107.76f),
                    PathNode.LineTo(128.0f, 135.51f),
                    PathNode.LineTo(185.52f, 78.0f),
                    PathNode.LineTo(160.0f, 78.0f),
                    PathNode.CurveTo(156.6863f, 78.0f, 154.0f, 75.313705f, 154.0f, 72.0f),
                    PathNode.CurveTo(154.0f, 68.686295f, 156.6863f, 66.0f, 160.0f, 66.0f),
                    PathNode.LineTo(200.0f, 66.0f),
                    PathNode.CurveTo(203.3137f, 66.0f, 206.0f, 68.686295f, 206.0f, 72.0f),
                    PathNode.LineTo(206.0f, 112.0f),
                    PathNode.CurveTo(206.0f, 115.313705f, 203.3137f, 118.0f, 200.0f, 118.0f),
                    PathNode.CurveTo(196.6863f, 118.0f, 194.0f, 115.313705f, 194.0f, 112.0f),
                    PathNode.LineTo(194.0f, 86.48f),
                    PathNode.LineTo(132.24f, 148.24f),
                    PathNode.CurveTo(129.89746f, 150.57962f, 126.10254f, 150.57962f, 123.76f, 148.24f),
                    PathNode.LineTo(96.0f, 120.49f),
                    PathNode.LineTo(38.0f, 178.49f),
                    PathNode.LineTo(38.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
