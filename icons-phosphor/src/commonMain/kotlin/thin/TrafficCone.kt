package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorThinIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 212.0f),
                    PathNode.LineTo(210.84f, 212.0f),
                    PathNode.LineTo(149.65f, 36.06f),
                    PathNode.CurveTo(147.972f, 31.232655f, 143.42067f, 27.99776f, 138.31f, 28.0f),
                    PathNode.LineTo(117.69f, 28.0f),
                    PathNode.CurveTo(112.57933f, 27.99776f, 108.028f, 31.232655f, 106.35f, 36.06f),
                    PathNode.LineTo(45.16f, 212.0f),
                    PathNode.LineTo(24.0f, 212.0f),
                    PathNode.CurveTo(21.790861f, 212.0f, 20.0f, 213.79086f, 20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 218.20914f, 21.790861f, 220.0f, 24.0f, 220.0f),
                    PathNode.LineTo(232.0f, 220.0f),
                    PathNode.CurveTo(234.20914f, 220.0f, 236.0f, 218.20914f, 236.0f, 216.0f),
                    PathNode.CurveTo(236.0f, 213.79086f, 234.20914f, 212.0f, 232.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.58f, 100.0f),
                    PathNode.LineTo(163.42f, 100.0f),
                    PathNode.LineTo(182.89f, 156.0f),
                    PathNode.LineTo(73.11f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.91f, 38.69f),
                    PathNode.CurveTo(114.4682f, 37.07957f, 115.98557f, 35.99975f, 117.69f, 36.0f),
                    PathNode.LineTo(138.31f, 36.0f),
                    PathNode.CurveTo(140.01443f, 35.99975f, 141.5318f, 37.07957f, 142.09f, 38.69f),
                    PathNode.LineTo(160.63f, 92.0f),
                    PathNode.LineTo(95.37f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.32f, 164.0f),
                    PathNode.LineTo(185.68f, 164.0f),
                    PathNode.LineTo(202.37f, 212.0f),
                    PathNode.LineTo(53.63f, 212.0f),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
