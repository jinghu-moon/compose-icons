package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorThinIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.58f, 78.59f),
                    PathNode.LineTo(132.0f, 121.07f),
                    PathNode.LineTo(132.0f, 36.07f),
                    PathNode.CurveTo(161.99211f, 37.399433f, 189.45251f, 53.268097f, 205.58f, 78.59f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 36.09f),
                    PathNode.LineTo(124.0f, 125.69f),
                    PathNode.LineTo(46.42f, 170.48f),
                    PathNode.CurveTo(31.905645f, 142.59592f, 32.63328f, 109.23115f, 48.349483f, 82.00635f),
                    PathNode.CurveTo(64.06568f, 54.78154f, 92.59465f, 37.465782f, 124.0f, 36.09f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(96.56166f, 219.9912f, 67.304436f, 203.92952f, 50.42f, 177.41f),
                    PathNode.LineTo(209.58f, 85.52f),
                    PathNode.CurveTo(224.42384f, 114.03551f, 223.3065f, 148.23102f, 206.63278f, 175.71669f),
                    PathNode.CurveTo(189.95908f, 203.20235f, 160.14769f, 219.9911f, 128.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
