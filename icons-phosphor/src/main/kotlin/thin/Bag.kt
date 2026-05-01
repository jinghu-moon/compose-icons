package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorThinIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 39.69947f, 152.30052f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(103.69947f, 20.0f, 84.0f, 39.69947f, 84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(33.37258f, 68.0f, 28.0f, 73.37258f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 73.37258f, 222.62741f, 68.0f, 216.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 44.11775f, 108.11775f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(147.88223f, 28.0f, 164.0f, 44.11775f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 77.79086f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(84.0f, 76.0f),
                    PathNode.LineTo(84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 98.20914f, 85.79086f, 100.0f, 88.0f, 100.0f),
                    PathNode.CurveTo(90.20914f, 100.0f, 92.0f, 98.20914f, 92.0f, 96.0f),
                    PathNode.LineTo(92.0f, 76.0f),
                    PathNode.LineTo(164.0f, 76.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 98.20914f, 165.79086f, 100.0f, 168.0f, 100.0f),
                    PathNode.CurveTo(170.20914f, 100.0f, 172.0f, 98.20914f, 172.0f, 96.0f),
                    PathNode.LineTo(172.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 77.79086f, 220.0f, 80.0f),
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
        return _bag!!
    }

private var _bag: ImageVector? = null
