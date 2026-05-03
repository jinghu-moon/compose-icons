package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorBoldIcon(
            name = "CloudLightning",
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
                    PathNode.LineTo(106.81f, 172.0f),
                    PathNode.LineTo(93.71f, 193.82f),
                    PathNode.CurveTo(91.48253f, 197.52751f, 91.42257f, 202.14685f, 93.55306f, 205.91093f),
                    PathNode.CurveTo(95.683556f, 209.67502f, 99.67481f, 212.00134f, 104.0f, 212.0f),
                    PathNode.LineTo(122.81f, 212.0f),
                    PathNode.LineTo(109.71f, 233.82f),
                    PathNode.CurveTo(106.299644f, 239.503f, 108.14199f, 246.87465f, 113.825f, 250.285f),
                    PathNode.CurveTo(119.50801f, 253.69536f, 126.87964f, 251.85301f, 130.29f, 246.17f),
                    PathNode.LineTo(154.29f, 206.17f),
                    PathNode.CurveTo(156.51224f, 202.46303f, 156.56937f, 197.84743f, 154.43954f, 194.08661f),
                    PathNode.CurveTo(152.30972f, 190.32578f, 148.32204f, 188.00081f, 144.0f, 188.0f),
                    PathNode.LineTo(125.19f, 188.0f),
                    PathNode.LineTo(134.79f, 172.0f),
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
