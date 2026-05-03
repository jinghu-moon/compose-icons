package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorRegularIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 100.0f),
                    PathNode.CurveTo(136.0f, 106.62742f, 130.62741f, 112.0f, 124.0f, 112.0f),
                    PathNode.CurveTo(117.37258f, 112.0f, 112.0f, 106.62742f, 112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 93.37258f, 117.37258f, 88.0f, 124.0f, 88.0f),
                    PathNode.CurveTo(130.62741f, 88.0f, 136.0f, 93.37258f, 136.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 129.48f),
                    PathNode.CurveTo(231.06418f, 185.46802f, 186.08131f, 230.72458f, 130.1f, 232.0f),
                    PathNode.LineTo(127.93f, 232.0f),
                    PathNode.CurveTo(102.42557f, 232.17899f, 77.7562f, 222.91818f, 58.67f, 206.0f),
                    PathNode.CurveTo(55.356293f, 203.05356f, 55.05856f, 197.97871f, 58.005f, 194.665f),
                    PathNode.CurveTo(60.95144f, 191.35127f, 66.02629f, 191.05356f, 69.34f, 194.0f),
                    PathNode.CurveTo(75.367355f, 199.39339f, 82.13607f, 203.89577f, 89.44f, 207.37f),
                    PathNode.LineTo(116.0f, 170.84f),
                    PathNode.CurveTo(93.22f, 161.01f, 68.53f, 165.19f, 54.6f, 167.55f),
                    PathNode.CurveTo(42.56979f, 169.62762f, 30.410852f, 164.64363f, 23.3f, 154.72f),
                    PathNode.LineTo(23.0f, 154.29f),
                    PathNode.LineTo(9.22f, 132.29f),
                    PathNode.CurveTo(8.091316f, 130.48303f, 7.730024f, 128.30049f, 8.216215f, 126.22619f),
                    PathNode.CurveTo(8.702407f, 124.15189f, 9.995916f, 122.357216f, 11.81f, 121.24f),
                    PathNode.LineTo(112.0f, 59.53f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.CurveTo(112.0f, 27.581722f, 115.58172f, 24.0f, 120.0f, 24.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.CurveTo(155.84087f, 23.99718f, 182.52046f, 35.15722f, 202.06737f, 54.982277f),
                    PathNode.CurveTo(221.61424f, 74.807335f, 232.3962f, 101.64195f, 232.0f, 129.48f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 129.26f),
                    PathNode.CurveTo(216.33733f, 105.70341f, 207.21504f, 82.9952f, 190.67514f, 66.218475f),
                    PathNode.CurveTo(174.13524f, 49.44175f, 151.559f, 39.997585f, 128.0f, 40.0f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.CurveTo(127.998276f, 66.77747f, 126.55605f, 69.3553f, 124.19f, 70.81f),
                    PathNode.LineTo(27.06f, 130.59f),
                    PathNode.LineTo(36.42f, 145.59f),
                    PathNode.CurveTo(40.020763f, 150.43837f, 46.054863f, 152.83188f, 52.0f, 151.77f),
                    PathNode.CurveTo(68.0f, 149.07f, 100.77f, 143.53f, 130.07f, 159.95f),
                    PathNode.CurveTo(151.31615f, 158.81876f, 167.97168f, 141.27621f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 115.58172f, 171.58173f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(180.41827f, 112.0f, 184.0f, 115.58172f, 184.0f, 120.0f),
                    PathNode.CurveTo(183.9597f, 149.28064f, 161.39565f, 173.60016f, 132.2f, 175.83f),
                    PathNode.LineTo(105.09f, 213.11f),
                    PathNode.CurveTo(113.1488f, 215.19955f, 121.45648f, 216.17198f, 129.78f, 216.0f),
                    PathNode.CurveTo(177.13487f, 214.89651f, 215.18127f, 176.62067f, 216.0f, 129.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
