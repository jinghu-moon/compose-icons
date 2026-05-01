package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorBoldIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.47f, 67.5f),
                    PathNode.CurveTo(228.99242f, 63.84801f, 225.8164f, 61.15389f, 221.97234f, 60.291668f),
                    PathNode.CurveTo(218.12827f, 59.429447f, 214.10583f, 60.508965f, 211.21f, 63.18f),
                    PathNode.LineTo(172.43f, 99.0f),
                    PathNode.LineTo(159.75f, 96.28f),
                    PathNode.LineTo(157.0f, 83.57f),
                    PathNode.LineTo(192.79f, 44.79f),
                    PathNode.CurveTo(195.46103f, 41.894165f, 196.54056f, 37.871735f, 195.67833f, 34.027664f),
                    PathNode.CurveTo(194.81612f, 30.183594f, 192.122f, 27.007586f, 188.47f, 25.53f),
                    PathNode.CurveTo(160.7005f, 14.351433f, 128.95659f, 20.498627f, 107.3675f, 41.23546f),
                    PathNode.CurveTo(85.778404f, 61.972294f, 78.35835f, 93.44302f, 88.41f, 121.64f),
                    PathNode.LineTo(30.92f, 174.18f),
                    PathNode.CurveTo(30.782736f, 174.299f, 30.652515f, 174.42587f, 30.53f, 174.56f),
                    PathNode.CurveTo(16.666311f, 188.65134f, 16.758476f, 211.28555f, 30.73646f, 225.26353f),
                    PathNode.CurveTo(44.714443f, 239.24153f, 67.34865f, 239.3337f, 81.44f, 225.47f),
                    PathNode.LineTo(81.82f, 225.08f),
                    PathNode.LineTo(134.36f, 167.59f),
                    PathNode.CurveTo(162.56589f, 177.66971f, 194.06139f, 170.25432f, 214.80733f, 148.64926f),
                    PathNode.CurveTo(235.55327f, 127.04421f, 241.68529f, 95.2739f, 230.47f, 67.5f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 148.0f),
                    PathNode.CurveTo(151.89062f, 148.02406f, 143.89018f, 146.13274f, 136.65f, 142.48f),
                    PathNode.CurveTo(131.84671f, 140.0585f, 126.018845f, 141.12927f, 122.39f, 145.1f),
                    PathNode.LineTo(64.31f, 208.66f),
                    PathNode.CurveTo(59.615578f, 213.35442f, 52.00442f, 213.35442f, 47.31f, 208.66f),
                    PathNode.CurveTo(42.61558f, 203.96559f, 42.61558f, 196.35442f, 47.31f, 191.66f),
                    PathNode.LineTo(110.86f, 133.59f),
                    PathNode.CurveTo(114.830734f, 129.96115f, 115.90149f, 124.13329f, 113.48f, 119.33f),
                    PathNode.CurveTo(109.84418f, 112.09245f, 107.96668f, 104.099396f, 108.0f, 96.0f),
                    PathNode.CurveTo(108.033066f, 67.2949f, 131.2949f, 44.033066f, 160.0f, 44.0f),
                    PathNode.LineTo(160.89f, 44.0f),
                    PathNode.LineTo(135.17f, 71.87f),
                    PathNode.CurveTo(132.52757f, 74.73652f, 131.44238f, 78.70806f, 132.26f, 82.52f),
                    PathNode.LineTo(137.92f, 108.87f),
                    PathNode.CurveTo(138.91185f, 113.48396f, 142.51604f, 117.08815f, 147.13f, 118.08f),
                    PathNode.LineTo(173.48f, 123.74f),
                    PathNode.CurveTo(177.29193f, 124.55761f, 181.26349f, 123.47243f, 184.13f, 120.83f),
                    PathNode.LineTo(212.0f, 95.12f),
                    PathNode.CurveTo(212.0f, 95.42f, 212.0f, 95.71f, 212.0f, 96.01f),
                    PathNode.CurveTo(211.96143f, 124.7112f, 188.7012f, 147.96695f, 160.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
