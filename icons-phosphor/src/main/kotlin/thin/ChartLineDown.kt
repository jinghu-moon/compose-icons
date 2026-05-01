package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorThinIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 29.790861f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(34.20914f, 44.0f, 36.0f, 45.79086f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 62.34f),
                    PathNode.LineTo(96.0f, 122.34f),
                    PathNode.LineTo(125.17f, 93.17f),
                    PathNode.CurveTo(125.92027f, 92.418884f, 126.93836f, 91.99686f, 128.0f, 91.99686f),
                    PathNode.CurveTo(129.06163f, 91.99686f, 130.07973f, 92.418884f, 130.83f, 93.17f),
                    PathNode.LineTo(196.0f, 158.34f),
                    PathNode.LineTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 125.79086f, 197.79086f, 124.0f, 200.0f, 124.0f),
                    PathNode.CurveTo(202.20914f, 124.0f, 204.0f, 125.79086f, 204.0f, 128.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.CurveTo(203.99812f, 168.26195f, 203.97134f, 168.52313f, 203.92f, 168.78f),
                    PathNode.CurveTo(203.89265f, 168.895f, 203.85927f, 169.0085f, 203.82f, 169.12f),
                    PathNode.CurveTo(203.78725f, 169.2598f, 203.74377f, 169.39687f, 203.69f, 169.53f),
                    PathNode.CurveTo(203.63338f, 169.6649f, 203.56651f, 169.7953f, 203.49f, 169.92f),
                    PathNode.CurveTo(203.44f, 170.02f, 203.39f, 170.12f, 203.33f, 170.22f),
                    PathNode.CurveTo(203.03323f, 170.65663f, 202.65663f, 171.03323f, 202.22f, 171.33f),
                    PathNode.LineTo(201.91f, 171.49f),
                    PathNode.CurveTo(201.78757f, 171.56442f, 201.66066f, 171.63123f, 201.53f, 171.69f),
                    PathNode.CurveTo(201.39687f, 171.74377f, 201.2598f, 171.78725f, 201.12f, 171.82f),
                    PathNode.CurveTo(201.0085f, 171.85927f, 200.895f, 171.89265f, 200.78f, 171.92f),
                    PathNode.CurveTo(200.52313f, 171.97134f, 200.26195f, 171.99812f, 200.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(157.79086f, 172.0f, 156.0f, 170.20914f, 156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 165.79086f, 157.79086f, 164.0f, 160.0f, 164.0f),
                    PathNode.LineTo(190.34f, 164.0f),
                    PathNode.LineTo(128.0f, 101.66f),
                    PathNode.LineTo(98.83f, 130.83f),
                    PathNode.CurveTo(98.07973f, 131.58112f, 97.06164f, 132.00314f, 96.0f, 132.00314f),
                    PathNode.CurveTo(94.93836f, 132.00314f, 93.92027f, 131.58112f, 93.17f, 130.83f),
                    PathNode.LineTo(36.0f, 73.66f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
