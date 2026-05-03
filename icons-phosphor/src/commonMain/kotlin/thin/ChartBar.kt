package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorThinIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 204.0f),
                    PathNode.LineTo(212.0f, 204.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 37.79086f, 210.20914f, 36.0f, 208.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(149.79086f, 36.0f, 148.0f, 37.79086f, 148.0f, 40.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(93.79086f, 84.0f, 92.0f, 85.79086f, 92.0f, 88.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(48.0f, 132.0f),
                    PathNode.CurveTo(45.79086f, 132.0f, 44.0f, 133.79086f, 44.0f, 136.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 205.79086f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 210.20914f, 29.790861f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 205.79086f, 226.20914f, 204.0f, 224.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 44.0f),
                    PathNode.LineTo(204.0f, 44.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 92.0f),
                    PathNode.LineTo(148.0f, 92.0f),
                    PathNode.LineTo(148.0f, 204.0f),
                    PathNode.LineTo(100.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
