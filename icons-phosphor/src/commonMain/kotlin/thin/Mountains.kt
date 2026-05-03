package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorThinIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 76.0f),
                    PathNode.CurveTo(177.25484f, 76.0f, 188.0f, 65.25484f, 188.0f, 52.0f),
                    PathNode.CurveTo(188.0f, 38.745167f, 177.25484f, 28.0f, 164.0f, 28.0f),
                    PathNode.CurveTo(150.74516f, 28.0f, 140.0f, 38.745167f, 140.0f, 52.0f),
                    PathNode.CurveTo(140.0f, 65.25484f, 150.74516f, 76.0f, 164.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 36.0f),
                    PathNode.CurveTo(172.83656f, 36.0f, 180.0f, 43.163445f, 180.0f, 52.0f),
                    PathNode.CurveTo(180.0f, 60.836555f, 172.83656f, 68.0f, 164.0f, 68.0f),
                    PathNode.CurveTo(155.16344f, 68.0f, 148.0f, 60.836555f, 148.0f, 52.0f),
                    PathNode.CurveTo(148.0f, 43.163445f, 155.16344f, 36.0f, 164.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.44f, 198.0f),
                    PathNode.LineTo(196.88f, 105.92f),
                    PathNode.CurveTo(194.74081f, 102.24365f, 190.8034f, 99.98718f, 186.55f, 100.0f),
                    PathNode.LineTo(186.55f, 100.0f),
                    PathNode.CurveTo(182.3073f, 99.97835f, 178.37453f, 102.21912f, 176.23f, 105.88f),
                    PathNode.LineTo(146.62f, 155.88f),
                    PathNode.LineTo(98.34f, 73.91f),
                    PathNode.CurveTo(96.183174f, 70.24782f, 92.250114f, 67.999695f, 88.0f, 67.999695f),
                    PathNode.CurveTo(83.749886f, 67.999695f, 79.816826f, 70.24782f, 77.66f, 73.91f),
                    PathNode.LineTo(4.55f, 198.0f),
                    PathNode.CurveTo(3.836716f, 199.23543f, 3.835368f, 200.75722f, 4.546462f, 201.9939f),
                    PathNode.CurveTo(5.257557f, 203.23059f, 6.573458f, 203.99498f, 8.0f, 204.0f),
                    PathNode.LineTo(248.0f, 204.0f),
                    PathNode.CurveTo(249.42476f, 203.99142f, 250.7374f, 203.22565f, 251.44606f, 201.98961f),
                    PathNode.CurveTo(252.15472f, 200.75357f, 252.15242f, 199.23389f, 251.44f, 198.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.55f, 78.0f),
                    PathNode.CurveTo(85.26812f, 76.77607f, 86.58094f, 76.02423f, 88.0f, 76.02423f),
                    PathNode.CurveTo(89.41906f, 76.02423f, 90.73188f, 76.77607f, 91.45f, 78.0f),
                    PathNode.LineTo(118.57f, 124.0f),
                    PathNode.LineTo(57.43f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 196.0f),
                    PathNode.LineTo(52.71f, 132.0f),
                    PathNode.LineTo(123.29f, 132.0f),
                    PathNode.LineTo(161.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.29f, 196.0f),
                    PathNode.LineTo(151.29f, 163.71f),
                    PathNode.LineTo(183.11f, 110.0f),
                    PathNode.CurveTo(183.83055f, 108.78566f, 185.13797f, 108.041176f, 186.55f, 108.041176f),
                    PathNode.CurveTo(187.96204f, 108.041176f, 189.26945f, 108.78566f, 189.99f, 110.0f),
                    PathNode.LineTo(240.99f, 196.0f),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
