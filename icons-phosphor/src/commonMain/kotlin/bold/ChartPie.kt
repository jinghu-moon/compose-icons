package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorBoldIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 44.87f),
                    PathNode.CurveTo(161.33682f, 47.95508f, 180.6707f, 59.125755f, 194.0f, 76.07f),
                    PathNode.LineTo(140.0f, 107.22f),
                    PathNode.Close,
                    PathNode.MoveTo(50.0f, 159.17f),
                    PathNode.CurveTo(40.424744f, 135.26424f, 42.352684f, 108.28608f, 55.230038f, 85.98485f),
                    PathNode.CurveTo(68.10739f, 63.68362f, 90.50895f, 48.5275f, 116.0f, 44.87f),
                    PathNode.LineTo(116.0f, 121.07f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(102.26055f, 211.99493f, 77.94844f, 200.1725f, 62.05f, 179.93f),
                    PathNode.LineTo(206.0f, 96.83f),
                    PathNode.CurveTo(216.34087f, 122.70798f, 213.17453f, 152.0298f, 197.54756f, 175.10364f),
                    PathNode.CurveTo(181.9206f, 198.17744f, 155.8676f, 211.99908f, 128.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
