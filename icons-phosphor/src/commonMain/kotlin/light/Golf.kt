package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorLightIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 100.0f),
                    PathNode.CurveTo(174.0f, 105.52285f, 169.52284f, 110.0f, 164.0f, 110.0f),
                    PathNode.CurveTo(158.47716f, 110.0f, 154.0f, 105.52285f, 154.0f, 100.0f),
                    PathNode.CurveTo(154.0f, 94.47715f, 158.47716f, 90.0f, 164.0f, 90.0f),
                    PathNode.CurveTo(169.52284f, 90.0f, 174.0f, 94.47715f, 174.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 122.0f),
                    PathNode.CurveTo(126.47715f, 122.0f, 122.0f, 126.47715f, 122.0f, 132.0f),
                    PathNode.CurveTo(122.0f, 137.52284f, 126.47715f, 142.0f, 132.0f, 142.0f),
                    PathNode.CurveTo(137.52284f, 142.0f, 142.0f, 137.52284f, 142.0f, 132.0f),
                    PathNode.CurveTo(142.0f, 126.47715f, 137.52284f, 122.0f, 132.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 96.0f),
                    PathNode.CurveTo(214.0f, 143.49649f, 175.49649f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(80.50351f, 182.0f, 42.0f, 143.49649f, 42.0f, 96.0f),
                    PathNode.CurveTo(42.0f, 48.503513f, 80.50351f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(175.47365f, 10.055106f, 213.9449f, 48.526356f, 214.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 96.0f),
                    PathNode.CurveTo(202.0f, 55.130928f, 168.86908f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(87.13093f, 22.0f, 54.0f, 55.130928f, 54.0f, 96.0f),
                    PathNode.CurveTo(54.0f, 136.86908f, 87.13093f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(168.84851f, 169.95041f, 201.95041f, 136.84851f, 202.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.86f, 194.4f),
                    PathNode.CurveTo(152.48f, 199.51f, 140.09f, 202.0f, 128.0f, 202.0f),
                    PathNode.CurveTo(115.91f, 202.0f, 103.52f, 199.51f, 90.14f, 194.4f),
                    PathNode.CurveTo(88.11676f, 193.53027f, 85.77966f, 193.83882f, 84.05146f, 195.20384f),
                    PathNode.CurveTo(82.32327f, 196.56885f, 81.481766f, 198.77094f, 81.85921f, 200.9406f),
                    PathNode.CurveTo(82.23664f, 203.11026f, 83.77236f, 204.89879f, 85.86f, 205.6f),
                    PathNode.CurveTo(97.41976f, 210.15634f, 109.60627f, 212.92477f, 122.0f, 213.81f),
                    PathNode.LineTo(122.0f, 248.0f),
                    PathNode.CurveTo(122.0f, 251.3137f, 124.686295f, 254.0f, 128.0f, 254.0f),
                    PathNode.CurveTo(131.3137f, 254.0f, 134.0f, 251.3137f, 134.0f, 248.0f),
                    PathNode.LineTo(134.0f, 213.81f),
                    PathNode.CurveTo(146.39374f, 212.92477f, 158.58025f, 210.15634f, 170.14f, 205.6f),
                    PathNode.CurveTo(173.09651f, 204.32907f, 174.5239f, 200.95203f, 173.37514f, 197.94594f),
                    PathNode.CurveTo(172.22638f, 194.93985f, 168.91061f, 193.37532f, 165.86f, 194.4f),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
