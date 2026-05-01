package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorLightIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 138.0f),
                    PathNode.CurveTo(244.6863f, 138.0f, 242.0f, 140.6863f, 242.0f, 144.0f),
                    PathNode.LineTo(242.0f, 162.0f),
                    PathNode.LineTo(195.31f, 162.0f),
                    PathNode.CurveTo(194.78043f, 161.99777f, 194.27335f, 161.78558f, 193.9f, 161.41f),
                    PathNode.LineTo(174.14f, 141.66f),
                    PathNode.LineTo(225.9f, 89.9f),
                    PathNode.CurveTo(228.52582f, 87.27445f, 230.001f, 83.71328f, 230.001f, 80.0f),
                    PathNode.CurveTo(230.001f, 76.28672f, 228.52582f, 72.72555f, 225.9f, 70.1f),
                    PathNode.LineTo(169.9f, 14.1f),
                    PathNode.CurveTo(167.27405f, 11.471122f, 163.71072f, 9.993987f, 159.995f, 9.993987f),
                    PathNode.CurveTo(156.27927f, 9.993987f, 152.71596f, 11.471122f, 150.09f, 14.1f),
                    PathNode.LineTo(4.34f, 160.35f),
                    PathNode.CurveTo(2.056509f, 162.63902f, 1.375376f, 166.07755f, 2.613809f, 169.06424f),
                    PathNode.CurveTo(3.852243f, 172.05092f, 6.766739f, 173.9985f, 10.0f, 174.0f),
                    PathNode.LineTo(50.2f, 174.0f),
                    PathNode.LineTo(86.1f, 209.9f),
                    PathNode.CurveTo(88.72555f, 212.52582f, 92.28672f, 214.001f, 96.0f, 214.001f),
                    PathNode.CurveTo(99.71328f, 214.001f, 103.27445f, 212.52582f, 105.9f, 209.9f),
                    PathNode.LineTo(165.66f, 150.14f),
                    PathNode.LineTo(185.41f, 169.9f),
                    PathNode.CurveTo(188.03197f, 172.53107f, 191.59555f, 174.0069f, 195.31f, 174.0f),
                    PathNode.LineTo(242.0f, 174.0f),
                    PathNode.LineTo(242.0f, 192.0f),
                    PathNode.CurveTo(242.0f, 195.3137f, 244.6863f, 198.0f, 248.0f, 198.0f),
                    PathNode.CurveTo(251.3137f, 198.0f, 254.0f, 195.3137f, 254.0f, 192.0f),
                    PathNode.LineTo(254.0f, 144.0f),
                    PathNode.CurveTo(254.0f, 140.6863f, 251.3137f, 138.0f, 248.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.59f, 22.59f),
                    PathNode.CurveTo(159.37007f, 21.814552f, 160.62993f, 21.814552f, 161.41f, 22.59f),
                    PathNode.LineTo(175.51f, 36.69f),
                    PathNode.LineTo(50.2f, 162.0f),
                    PathNode.LineTo(19.64f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.41f, 201.41f),
                    PathNode.CurveTo(96.62993f, 202.18544f, 95.37007f, 202.18544f, 94.59f, 201.41f),
                    PathNode.LineTo(61.17f, 168.0f),
                    PathNode.LineTo(184.0f, 45.17f),
                    PathNode.LineTo(217.41f, 78.59f),
                    PathNode.CurveTo(218.18544f, 79.37007f, 218.18544f, 80.62993f, 217.41f, 81.41f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
