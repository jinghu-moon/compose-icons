package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorThinIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.0f, 65.59f),
                    PathNode.CurveTo(184.1659f, 38.05559f, 157.58922f, 19.952852f, 128.0f, 19.952852f),
                    PathNode.CurveTo(98.41079f, 19.952852f, 71.834114f, 38.05559f, 61.0f, 65.59f),
                    PathNode.CurveTo(36.12578f, 76.2711f, 20.002287f, 100.73949f, 20.0f, 127.81f),
                    PathNode.CurveTo(19.9f, 163.81f, 50.24f, 195.07f, 86.25f, 195.98f),
                    PathNode.CurveTo(99.57102f, 196.2994f, 112.69411f, 192.71184f, 124.0f, 185.66f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 185.67f),
                    PathNode.CurveTo(142.79846f, 192.41081f, 155.27031f, 195.98953f, 168.0f, 196.0f),
                    PathNode.LineTo(169.72f, 196.0f),
                    PathNode.CurveTo(205.72f, 195.09f, 236.06f, 163.87f, 235.96f, 127.83f),
                    PathNode.CurveTo(235.96994f, 100.76258f, 219.86348f, 76.288284f, 195.0f, 65.59f),
                    PathNode.Close,
                    PathNode.MoveTo(169.55f, 188.0f),
                    PathNode.CurveTo(156.04073f, 188.33157f, 142.81334f, 184.10445f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 130.5f),
                    PathNode.LineTo(177.79f, 107.61f),
                    PathNode.CurveTo(179.76718f, 106.62141f, 180.56859f, 104.21718f, 179.58f, 102.24f),
                    PathNode.CurveTo(178.59142f, 100.26282f, 176.18718f, 99.46141f, 174.21f, 100.45f),
                    PathNode.LineTo(132.0f, 121.53f),
                    PathNode.LineTo(132.0f, 88.0f),
                    PathNode.CurveTo(132.0f, 85.79086f, 130.20914f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(125.79086f, 84.0f, 124.0f, 85.79086f, 124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 145.53f),
                    PathNode.LineTo(81.79f, 124.42f),
                    PathNode.CurveTo(79.81282f, 123.43141f, 77.40859f, 124.23282f, 76.42f, 126.21f),
                    PathNode.CurveTo(75.43141f, 128.18718f, 76.23282f, 130.59142f, 78.21f, 131.58f),
                    PathNode.LineTo(124.0f, 154.47f),
                    PathNode.LineTo(124.0f, 176.0f),
                    PathNode.CurveTo(113.192116f, 184.115f, 99.96096f, 188.34334f, 86.45f, 188.0f),
                    PathNode.CurveTo(54.68f, 187.2f, 27.91f, 159.65f, 28.0f, 127.85f),
                    PathNode.CurveTo(28.005827f, 103.3961f, 42.90728f, 81.41231f, 65.62f, 72.35f),
                    PathNode.CurveTo(66.67288f, 71.923164f, 67.49458f, 71.06874f, 67.88f, 70.0f),
                    PathNode.CurveTo(77.098206f, 44.746082f, 101.11626f, 27.945059f, 128.0f, 27.945059f),
                    PathNode.CurveTo(154.88374f, 27.945059f, 178.9018f, 44.746082f, 188.12f, 70.0f),
                    PathNode.CurveTo(188.51018f, 71.061165f, 189.33122f, 71.90764f, 190.38f, 72.33f),
                    PathNode.CurveTo(213.08908f, 81.39683f, 227.98865f, 103.37781f, 228.0f, 127.83f),
                    PathNode.CurveTo(228.09f, 159.63f, 201.32f, 187.18f, 169.55f, 188.0f),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
