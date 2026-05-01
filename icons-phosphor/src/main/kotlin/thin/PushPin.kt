package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorThinIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 84.2f),
                    PathNode.LineTo(171.8f, 23.51f),
                    PathNode.CurveTo(169.54837f, 21.250546f, 166.48982f, 19.980537f, 163.3f, 19.980537f),
                    PathNode.CurveTo(160.11017f, 19.980537f, 157.05162f, 21.250546f, 154.8f, 23.51f),
                    PathNode.LineTo(99.45f, 79.07f),
                    PathNode.CurveTo(91.37f, 76.07f, 66.66f, 69.62f, 40.45f, 90.74f),
                    PathNode.CurveTo(37.788303f, 92.87055f, 36.158527f, 96.03274f, 35.967716f, 99.436775f),
                    PathNode.CurveTo(35.77691f, 102.84082f, 37.04308f, 106.16533f, 39.45f, 108.58f),
                    PathNode.LineTo(90.58f, 159.71f),
                    PathNode.LineTo(45.17f, 205.17f),
                    PathNode.CurveTo(43.607033f, 206.73297f, 43.607033f, 209.26703f, 45.17f, 210.83f),
                    PathNode.CurveTo(46.732967f, 212.39296f, 49.267033f, 212.39296f, 50.83f, 210.83f),
                    PathNode.LineTo(96.29f, 165.36f),
                    PathNode.LineTo(147.41f, 216.48f),
                    PathNode.CurveTo(149.66072f, 218.73354f, 152.71501f, 219.99985f, 155.9f, 220.0f),
                    PathNode.CurveTo(156.18f, 220.0f, 156.47f, 220.0f, 156.75f, 220.0f),
                    PathNode.CurveTo(160.20807f, 219.75519f, 163.3913f, 218.02686f, 165.48f, 215.26f),
                    PathNode.CurveTo(185.31f, 188.9f, 181.99f, 168.08f, 177.19f, 156.69f),
                    PathNode.LineTo(232.49f, 101.2f),
                    PathNode.CurveTo(234.74945f, 98.94838f, 236.01947f, 95.88982f, 236.01947f, 92.7f),
                    PathNode.CurveTo(236.01947f, 89.510185f, 234.74945f, 86.45162f, 232.49f, 84.2f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 95.51f),
                    PathNode.LineTo(226.83f, 95.51f),
                    PathNode.LineTo(169.56f, 153.0f),
                    PathNode.CurveTo(168.34566f, 154.216f, 168.04375f, 156.07176f, 168.81f, 157.61f),
                    PathNode.CurveTo(179.24f, 178.46f, 167.19f, 199.61f, 159.08f, 210.44f),
                    PathNode.CurveTo(158.37978f, 211.35416f, 157.31955f, 211.92221f, 156.1706f, 211.99881f),
                    PathNode.CurveTo(155.02162f, 212.0754f, 153.89537f, 211.65312f, 153.08f, 210.84f),
                    PathNode.LineTo(45.17f, 102.93f),
                    PathNode.CurveTo(44.348907f, 102.12425f, 43.91448f, 101.004005f, 43.977654f, 99.85535f),
                    PathNode.CurveTo(44.04083f, 98.70669f, 44.595497f, 97.64083f, 45.5f, 96.93f),
                    PathNode.CurveTo(58.44f, 86.53f, 70.86f, 83.74f, 80.44f, 83.74f),
                    PathNode.CurveTo(86.68331f, 83.648056f, 92.87441f, 84.88901f, 98.6f, 87.38f),
                    PathNode.CurveTo(100.1408f, 88.15112f, 102.00226f, 87.84894f, 103.22f, 86.63f),
                    PathNode.LineTo(160.49f, 29.17f),
                    PathNode.CurveTo(161.2403f, 28.418892f, 162.25836f, 27.996853f, 163.32f, 27.996853f),
                    PathNode.CurveTo(164.38164f, 27.996853f, 165.39973f, 28.418892f, 166.15f, 29.17f),
                    PathNode.LineTo(226.83f, 89.86f),
                    PathNode.CurveTo(228.38753f, 91.42131f, 228.38753f, 93.94869f, 226.83f, 95.51f),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
