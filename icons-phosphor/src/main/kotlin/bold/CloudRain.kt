package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorBoldIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 12.0f),
                    PathNode.CurveTo(124.01682f, 12.004757f, 95.09237f, 31.007433f, 82.39f, 60.36f),
                    PathNode.CurveTo(80.26846f, 60.11991f, 78.13508f, 59.99972f, 76.0f, 60.0f),
                    PathNode.CurveTo(45.072056f, 60.0f, 20.000002f, 85.07206f, 20.000002f, 116.0f),
                    PathNode.CurveTo(20.000002f, 146.92795f, 45.072056f, 172.0f, 76.0f, 172.0f),
                    PathNode.LineTo(105.58f, 172.0f),
                    PathNode.LineTo(86.0f, 201.34f),
                    PathNode.CurveTo(82.321785f, 206.86285f, 83.817154f, 214.32178f, 89.34f, 218.0f),
                    PathNode.CurveTo(94.86285f, 221.67822f, 102.321785f, 220.18285f, 106.0f, 214.66f),
                    PathNode.LineTo(134.42f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.CurveTo(200.18279f, 172.0f, 236.0f, 136.18279f, 236.0f, 92.0f),
                    PathNode.CurveTo(236.0f, 47.81722f, 200.18279f, 12.0f, 156.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 148.0f),
                    PathNode.LineTo(76.0f, 148.0f),
                    PathNode.CurveTo(58.32689f, 148.0f, 44.0f, 133.67311f, 44.0f, 116.0f),
                    PathNode.CurveTo(44.0f, 98.32689f, 58.32689f, 84.0f, 76.0f, 84.0f),
                    PathNode.LineTo(76.28f, 84.0f),
                    PathNode.CurveTo(76.17f, 85.1f, 76.08f, 86.2f, 76.02f, 87.3f),
                    PathNode.CurveTo(75.63616f, 93.927414f, 80.697586f, 99.61116f, 87.325f, 99.995f),
                    PathNode.CurveTo(93.952415f, 100.37884f, 99.63616f, 95.31741f, 100.02f, 88.69f),
                    PathNode.CurveTo(101.79033f, 58.20459f, 127.63426f, 34.743736f, 158.1483f, 35.921734f),
                    PathNode.CurveTo(188.66234f, 37.099724f, 212.62064f, 62.483192f, 212.0354f, 93.01435f),
                    PathNode.CurveTo(211.4502f, 123.54551f, 186.53677f, 147.99222f, 156.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.65f, 206.66f),
                    PathNode.LineTo(129.98f, 246.66f),
                    PathNode.CurveTo(126.30178f, 252.18285f, 118.84285f, 253.67822f, 113.32f, 250.0f),
                    PathNode.CurveTo(107.79715f, 246.32178f, 106.30178f, 238.86285f, 109.98f, 233.34f),
                    PathNode.LineTo(136.64f, 193.34f),
                    PathNode.CurveTo(140.31822f, 187.81715f, 147.77715f, 186.32178f, 153.3f, 190.0f),
                    PathNode.CurveTo(158.82285f, 193.67822f, 160.31822f, 201.13715f, 156.64f, 206.66f),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
