package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorLightIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 162.0f),
                    PathNode.CurveTo(165.19188f, 161.99608f, 154.89592f, 166.60559f, 147.7f, 174.67f),
                    PathNode.LineTo(98.8f, 143.24f),
                    PathNode.CurveTo(103.066696f, 133.52795f, 103.066696f, 122.472046f, 98.8f, 112.76f),
                    PathNode.LineTo(147.7f, 81.33f),
                    PathNode.CurveTo(160.93f, 96.087364f, 183.28033f, 98.198265f, 199.0393f, 86.17879f),
                    PathNode.CurveTo(214.79828f, 74.15931f, 218.67297f, 52.046436f, 207.93954f, 35.384888f),
                    PathNode.CurveTo(197.20615f, 18.723337f, 175.46968f, 13.109221f, 158.01027f, 22.489103f),
                    PathNode.CurveTo(140.55086f, 31.868984f, 133.23259f, 53.09245f, 141.2f, 71.24f),
                    PathNode.LineTo(92.3f, 102.67f),
                    PathNode.CurveTo(81.79723f, 90.92477f, 65.135704f, 86.87935f, 50.41634f, 92.500656f),
                    PathNode.CurveTo(35.69698f, 98.12195f, 25.973492f, 112.243774f, 25.973492f, 128.0f),
                    PathNode.CurveTo(25.973492f, 143.75623f, 35.69698f, 157.87804f, 50.41634f, 163.49934f),
                    PathNode.CurveTo(65.135704f, 169.12065f, 81.79723f, 165.07524f, 92.3f, 153.33f),
                    PathNode.LineTo(141.2f, 184.76f),
                    PathNode.CurveTo(134.45865f, 200.15805f, 138.63472f, 218.15562f, 151.46791f, 229.01175f),
                    PathNode.CurveTo(164.3011f, 239.86784f, 182.74194f, 241.00278f, 196.80951f, 231.80226f),
                    PathNode.CurveTo(210.87708f, 222.60176f, 217.22855f, 205.25208f, 212.42627f, 189.14359f),
                    PathNode.CurveTo(207.624f, 173.03506f, 192.8091f, 161.99553f, 176.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 30.0f),
                    PathNode.CurveTo(190.3594f, 30.0f, 202.0f, 41.6406f, 202.0f, 56.0f),
                    PathNode.CurveTo(202.0f, 70.359406f, 190.3594f, 82.0f, 176.0f, 82.0f),
                    PathNode.CurveTo(161.6406f, 82.0f, 150.0f, 70.359406f, 150.0f, 56.0f),
                    PathNode.CurveTo(150.0f, 41.6406f, 161.6406f, 30.0f, 176.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 154.0f),
                    PathNode.CurveTo(49.6406f, 154.0f, 38.0f, 142.3594f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 113.640594f, 49.6406f, 102.0f, 64.0f, 102.0f),
                    PathNode.CurveTo(78.359406f, 102.0f, 90.0f, 113.640594f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 142.3594f, 78.359406f, 154.0f, 64.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 226.0f),
                    PathNode.CurveTo(161.6406f, 226.0f, 150.0f, 214.3594f, 150.0f, 200.0f),
                    PathNode.CurveTo(150.0f, 185.6406f, 161.6406f, 174.0f, 176.0f, 174.0f),
                    PathNode.CurveTo(190.3594f, 174.0f, 202.0f, 185.6406f, 202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 214.3594f, 190.3594f, 226.0f, 176.0f, 226.0f),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
