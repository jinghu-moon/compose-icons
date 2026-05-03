package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorLightIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.41f, 104.23f),
                    PathNode.LineTo(181.64f, 30.3f),
                    PathNode.CurveTo(180.88707f, 27.751476f, 178.54742f, 26.00183f, 175.89f, 26.0f),
                    PathNode.LineTo(80.11f, 26.0f),
                    PathNode.CurveTo(77.45258f, 26.00183f, 75.11294f, 27.751476f, 74.36f, 30.3f),
                    PathNode.LineTo(52.59f, 104.23f),
                    PathNode.CurveTo(45.83922f, 126.62218f, 52.378036f, 150.90535f, 69.46f, 166.88f),
                    PathNode.CurveTo(83.81167f, 180.33751f, 102.37191f, 188.42361f, 122.0f, 189.77f),
                    PathNode.LineTo(122.0f, 234.0f),
                    PathNode.LineTo(88.0f, 234.0f),
                    PathNode.CurveTo(84.686295f, 234.0f, 82.0f, 236.6863f, 82.0f, 240.0f),
                    PathNode.CurveTo(82.0f, 243.3137f, 84.686295f, 246.0f, 88.0f, 246.0f),
                    PathNode.LineTo(168.0f, 246.0f),
                    PathNode.CurveTo(171.3137f, 246.0f, 174.0f, 243.3137f, 174.0f, 240.0f),
                    PathNode.CurveTo(174.0f, 236.6863f, 171.3137f, 234.0f, 168.0f, 234.0f),
                    PathNode.LineTo(134.0f, 234.0f),
                    PathNode.LineTo(134.0f, 189.77f),
                    PathNode.CurveTo(153.6275f, 188.42117f, 172.18697f, 180.33542f, 186.54f, 166.88f),
                    PathNode.CurveTo(203.62196f, 150.90535f, 210.16078f, 126.62218f, 203.41f, 104.23f),
                    PathNode.Close,
                    PathNode.MoveTo(84.6f, 38.0f),
                    PathNode.LineTo(171.4f, 38.0f),
                    PathNode.LineTo(191.91f, 107.63f),
                    PathNode.CurveTo(192.17f, 108.53f, 192.41f, 109.43f, 192.62f, 110.33f),
                    PathNode.CurveTo(170.08f, 119.4f, 144.45f, 109.6f, 130.71f, 102.65f),
                    PathNode.CurveTo(104.1f, 89.17f, 83.48f, 88.34f, 68.83f, 91.52f),
                    PathNode.Close,
                    PathNode.MoveTo(178.35f, 158.11f),
                    PathNode.CurveTo(150.02219f, 184.63176f, 105.97781f, 184.63176f, 77.65f, 158.11f),
                    PathNode.CurveTo(63.89653f, 145.23212f, 58.6407f, 125.66615f, 64.09f, 107.63f),
                    PathNode.LineTo(64.83f, 105.12f),
                    PathNode.CurveTo(77.17f, 100.66f, 97.09f, 99.07f, 125.29f, 113.35f),
                    PathNode.CurveTo(136.29f, 118.9f, 153.94f, 125.99f, 172.81f, 125.99f),
                    PathNode.CurveTo(180.01047f, 126.03796f, 187.16966f, 124.89939f, 194.0f, 122.62f),
                    PathNode.CurveTo(193.861f, 136.09343f, 188.20451f, 148.9208f, 178.35f, 158.11f),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
