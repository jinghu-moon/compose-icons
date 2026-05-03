package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorDuotoneIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 220.41827f, 200.0f, 216.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(45.15f, 230.11f),
                    PathNode.CurveTo(42.7711f, 232.11124f, 39.448254f, 232.55315f, 36.62899f, 231.24321f),
                    PathNode.CurveTo(33.809734f, 229.93327f, 32.004616f, 227.10872f, 32.0f, 224.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(44.46f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(23.963074f, 230.22911f, 27.57827f, 235.90231f, 33.24f, 238.5f),
                    PathNode.CurveTo(35.358177f, 239.48347f, 37.664646f, 239.99527f, 40.0f, 240.0f),
                    PathNode.CurveTo(43.7587f, 239.98909f, 47.39264f, 238.65027f, 50.26f, 236.22f),
                    PathNode.LineTo(50.34f, 236.15f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(189.92f, 208.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 192.0f),
                    PathNode.CurveTo(78.079094f, 192.00102f, 76.22269f, 192.69319f, 74.77f, 193.95f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(59.0f, 64.0f),
                    PathNode.LineTo(175.37f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 186.0f),
                    PathNode.CurveTo(232.0f, 190.41827f, 228.41827f, 194.0f, 224.0f, 194.0f),
                    PathNode.CurveTo(219.58173f, 194.0f, 216.0f, 190.41827f, 216.0f, 186.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.LineTo(105.79f, 64.0f),
                    PathNode.CurveTo(101.37172f, 64.0f, 97.79f, 60.418278f, 97.79f, 56.0f),
                    PathNode.CurveTo(97.79f, 51.581722f, 101.37172f, 48.0f, 105.79f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(224.83656f, 48.0f, 232.0f, 55.163445f, 232.0f, 64.0f),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
