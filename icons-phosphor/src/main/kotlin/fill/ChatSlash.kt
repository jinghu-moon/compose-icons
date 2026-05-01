package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorFillIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.61f),
                    PathNode.CurveTo(215.88303f, 212.71869f, 216.56061f, 215.72002f, 215.69395f, 218.46754f),
                    PathNode.CurveTo(214.82729f, 221.21509f, 212.55025f, 223.28441f, 209.73259f, 223.88515f),
                    PathNode.CurveTo(206.91493f, 224.48586f, 203.9919f, 223.52516f, 202.08f, 221.37f),
                    PathNode.LineTo(189.92f, 208.0f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(50.4f, 236.16f),
                    PathNode.LineTo(50.32f, 236.23f),
                    PathNode.CurveTo(47.435486f, 238.66997f, 43.778076f, 240.00606f, 40.0f, 240.0f),
                    PathNode.CurveTo(37.649666f, 239.99481f, 35.328854f, 239.47604f, 33.2f, 238.48f),
                    PathNode.CurveTo(27.56051f, 235.87352f, 23.963787f, 230.21259f, 24.0f, 224.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(44.46f, 48.0f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(96.75f, 48.0f),
                    PathNode.CurveTo(95.15971f, 47.98418f, 93.71112f, 48.91197f, 93.06038f, 50.36311f),
                    PathNode.CurveTo(92.409645f, 51.81425f, 92.6804f, 53.513046f, 93.75f, 54.69f),
                    PathNode.LineTo(225.0f, 199.06f),
                    PathNode.CurveTo(226.10567f, 200.31395f, 227.87456f, 200.74802f, 229.43509f, 200.14833f),
                    PathNode.CurveTo(230.99562f, 199.54863f, 232.0186f, 198.04169f, 232.0f, 196.37f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
