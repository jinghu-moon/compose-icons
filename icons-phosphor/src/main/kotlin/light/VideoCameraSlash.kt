package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorLightIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.83f, 74.71f),
                    PathNode.CurveTo(248.87848f, 73.6663f, 246.51086f, 73.7816f, 244.67f, 75.01f),
                    PathNode.LineTo(206.0f, 100.79f),
                    PathNode.LineTo(206.0f, 72.0f),
                    PathNode.CurveTo(206.0f, 64.26801f, 199.73198f, 58.0f, 192.0f, 58.0f),
                    PathNode.LineTo(113.06f, 58.0f),
                    PathNode.CurveTo(109.7463f, 58.0f, 107.06f, 60.68629f, 107.06f, 64.0f),
                    PathNode.CurveTo(107.06f, 67.313705f, 109.7463f, 70.0f, 113.06f, 70.0f),
                    PathNode.LineTo(192.0f, 70.0f),
                    PathNode.CurveTo(193.10457f, 70.0f, 194.0f, 70.89543f, 194.0f, 72.0f),
                    PathNode.LineTo(194.0f, 159.63f),
                    PathNode.CurveTo(194.0f, 162.94371f, 196.6863f, 165.63f, 200.0f, 165.63f),
                    PathNode.CurveTo(203.3137f, 165.63f, 206.0f, 162.94371f, 206.0f, 159.63f),
                    PathNode.LineTo(206.0f, 155.21f),
                    PathNode.LineTo(244.67f, 181.0f),
                    PathNode.CurveTo(246.51236f, 182.22919f, 248.88202f, 182.3435f, 250.83412f, 181.29736f),
                    PathNode.CurveTo(252.78622f, 180.25122f, 254.00328f, 178.21475f, 254.0f, 176.0f),
                    PathNode.LineTo(254.0f, 80.0f),
                    PathNode.CurveTo(253.99976f, 77.786995f, 252.78137f, 75.7538f, 250.83f, 74.71f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 164.79f),
                    PathNode.LineTo(206.0f, 140.79f),
                    PathNode.LineTo(206.0f, 115.21f),
                    PathNode.LineTo(242.0f, 91.21f),
                    PathNode.Close,
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(56.25f, 58.0f),
                    PathNode.LineTo(32.0f, 58.0f),
                    PathNode.CurveTo(24.268015f, 58.0f, 18.0f, 64.26801f, 18.0f, 72.0f),
                    PathNode.LineTo(18.0f, 184.0f),
                    PathNode.CurveTo(18.0f, 191.73198f, 24.268015f, 198.0f, 32.0f, 198.0f),
                    PathNode.LineTo(183.53f, 198.0f),
                    PathNode.LineTo(203.53f, 220.0f),
                    PathNode.CurveTo(205.76123f, 222.45215f, 209.55786f, 222.63123f, 212.01f, 220.4f),
                    PathNode.CurveTo(214.46214f, 218.16876f, 214.64124f, 214.37215f, 212.41f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 186.0f),
                    PathNode.CurveTo(30.89543f, 186.0f, 30.0f, 185.10457f, 30.0f, 184.0f),
                    PathNode.LineTo(30.0f, 72.0f),
                    PathNode.CurveTo(30.0f, 70.89543f, 30.89543f, 70.0f, 32.0f, 70.0f),
                    PathNode.LineTo(67.16f, 70.0f),
                    PathNode.LineTo(172.62f, 186.0f),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
