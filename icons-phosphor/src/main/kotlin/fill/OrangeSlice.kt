package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorFillIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.18f, 145.51f),
                    PathNode.CurveTo(38.71024f, 128.93192f, 31.977537f, 108.74433f, 32.0f, 88.0f),
                    PathNode.CurveTo(32.0f, 86.59f, 32.0f, 85.19f, 32.09f, 83.79f),
                    PathNode.CurveTo(32.201805f, 81.66328f, 33.96034f, 79.99706f, 36.09f, 80.0f),
                    PathNode.LineTo(107.0f, 80.0f),
                    PathNode.CurveTo(108.61882f, 79.998726f, 110.07882f, 80.97331f, 110.69849f, 82.46884f),
                    PathNode.CurveTo(111.31816f, 83.96437f, 110.97532f, 85.68595f, 109.83f, 86.83f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 183.66f),
                    PathNode.LineTo(120.0f, 99.31f),
                    PathNode.LineTo(61.83f, 157.49f),
                    PathNode.CurveTo(77.6559f, 172.61005f, 98.18744f, 181.84694f, 120.0f, 183.66f),
                    PathNode.Close,
                    PathNode.MoveTo(204.82f, 145.51f),
                    PathNode.CurveTo(217.28976f, 128.93192f, 224.02246f, 108.74433f, 224.0f, 88.0f),
                    PathNode.CurveTo(224.0f, 86.59f, 224.0f, 85.19f, 223.91f, 83.79f),
                    PathNode.CurveTo(223.79819f, 81.66328f, 222.03966f, 79.99706f, 219.91f, 80.0f),
                    PathNode.LineTo(149.0f, 80.0f),
                    PathNode.CurveTo(147.38118f, 79.998726f, 145.92119f, 80.97331f, 145.30151f, 82.46884f),
                    PathNode.CurveTo(144.68184f, 83.96437f, 145.02467f, 85.68595f, 146.17f, 86.83f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 80.0f),
                    PathNode.LineTo(243.92f, 80.0f),
                    PathNode.CurveTo(242.83443f, 79.99934f, 241.79521f, 80.439926f, 241.04091f, 81.22063f),
                    PathNode.CurveTo(240.2866f, 82.001335f, 239.882f, 83.055084f, 239.92f, 84.14f),
                    PathNode.CurveTo(239.92f, 85.42f, 239.99f, 86.71f, 239.99f, 88.0f),
                    PathNode.CurveTo(239.40942f, 149.44026f, 189.438f, 198.94171f, 127.995f, 198.94171f),
                    PathNode.CurveTo(66.552f, 198.94171f, 16.580576f, 149.44026f, 16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 86.71f, 16.0f, 85.42f, 16.07f, 84.14f),
                    PathNode.CurveTo(16.107996f, 83.055084f, 15.703402f, 82.001335f, 14.949099f, 81.22063f),
                    PathNode.CurveTo(14.194796f, 80.439926f, 13.155574f, 79.99934f, 12.07f, 80.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(3.581722f, 80.0f, 0f, 83.58172f, 0f, 88.0f),
                    PathNode.CurveTo(0f, 158.69244f, 57.307552f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(198.69244f, 216.0f, 256.0f, 158.69244f, 256.0f, 88.0f),
                    PathNode.CurveTo(256.0f, 83.58172f, 252.41827f, 80.0f, 248.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 99.31f),
                    PathNode.LineTo(136.0f, 183.66f),
                    PathNode.CurveTo(157.81256f, 181.84694f, 178.3441f, 172.61005f, 194.17f, 157.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
