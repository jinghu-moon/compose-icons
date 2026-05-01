package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorBoldIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.42f, 162.0f),
                    PathNode.CurveTo(237.7337f, 167.7548f, 235.7548f, 175.1063f, 230.0f, 178.42f),
                    PathNode.CurveTo(224.2452f, 181.7337f, 216.8937f, 179.7548f, 213.58f, 174.0f),
                    PathNode.LineTo(196.72f, 144.5f),
                    PathNode.CurveTo(187.31212f, 150.41838f, 177.16905f, 155.07806f, 166.55f, 158.36f),
                    PathNode.LineTo(171.84f, 190.0f),
                    PathNode.CurveTo(172.92351f, 196.53589f, 168.50534f, 202.71324f, 161.97f, 203.8f),
                    PathNode.CurveTo(161.30975f, 203.9163f, 160.64041f, 203.9732f, 159.97f, 203.97f),
                    PathNode.CurveTo(154.11896f, 203.96407f, 149.12517f, 199.73921f, 148.15f, 193.97f),
                    PathNode.LineTo(143.0f, 163.17f),
                    PathNode.CurveTo(133.01056f, 164.27667f, 122.92944f, 164.27667f, 112.94f, 163.17f),
                    PathNode.LineTo(107.84f, 194.0f),
                    PathNode.CurveTo(106.86357f, 199.77666f, 101.858604f, 204.00383f, 96.0f, 204.0f),
                    PathNode.CurveTo(95.32959f, 204.0032f, 94.66025f, 203.9463f, 94.0f, 203.83f),
                    PathNode.CurveTo(90.86092f, 203.30138f, 88.0605f, 201.54716f, 86.21505f, 198.95338f),
                    PathNode.CurveTo(84.3696f, 196.35965f, 83.63035f, 193.1389f, 84.16f, 190.0f),
                    PathNode.LineTo(89.45f, 158.28f),
                    PathNode.CurveTo(78.83094f, 154.99806f, 68.68788f, 150.33838f, 59.28f, 144.42f),
                    PathNode.LineTo(42.42f, 174.0f),
                    PathNode.CurveTo(39.106293f, 179.7548f, 31.754807f, 181.7337f, 26.0f, 178.42f),
                    PathNode.CurveTo(20.245193f, 175.1063f, 18.26629f, 167.7548f, 21.58f, 162.0f),
                    PathNode.LineTo(40.0f, 129.85f),
                    PathNode.CurveTo(33.75686f, 124.212f, 27.968851f, 118.08962f, 22.69f, 111.54f),
                    PathNode.CurveTo(18.816828f, 106.37418f, 19.725365f, 99.069756f, 24.74601f, 95.01017f),
                    PathNode.CurveTo(29.766653f, 90.95058f, 37.099434f, 91.59125f, 41.34f, 96.46f),
                    PathNode.CurveTo(57.38f, 116.32f, 85.44f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(170.56f, 140.0f, 198.62f, 116.32f, 214.66f, 96.46f),
                    PathNode.CurveTo(218.83856f, 91.35542f, 226.35396f, 90.58089f, 231.48578f, 94.72593f),
                    PathNode.CurveTo(236.61761f, 98.87098f, 237.44135f, 106.381134f, 233.33f, 111.54f),
                    PathNode.CurveTo(228.04477f, 118.09039f, 222.25005f, 124.21279f, 216.0f, 129.85f),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
