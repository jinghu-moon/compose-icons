package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorFillIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(79.25f, 38.69f),
                    PathNode.CurveTo(78.1804f, 37.513046f, 77.909645f, 35.81425f, 78.56038f, 34.36311f),
                    PathNode.CurveTo(79.21112f, 32.91197f, 80.65971f, 31.984179f, 82.25f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(194.21684f, 31.995129f, 196.3363f, 32.910343f, 197.85281f, 34.527313f),
                    PathNode.CurveTo(199.36931f, 36.144287f, 200.14687f, 38.31803f, 200.0f, 40.53f),
                    PathNode.CurveTo(199.63287f, 44.80546f, 196.02065f, 48.068256f, 191.73f, 48.0f),
                    PathNode.LineTo(185.54f, 48.0f),
                    PathNode.LineTo(206.7f, 167.91f),
                    PathNode.CurveTo(207.01283f, 169.6653f, 206.12614f, 171.41573f, 204.5259f, 172.20193f),
                    PathNode.CurveTo(202.92563f, 172.98816f, 200.99823f, 172.6203f, 199.8f, 171.3f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.LineTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(66.24f, 72.0f),
                    PathNode.LineTo(49.29f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.LineTo(168.1f, 184.0f),
                    PathNode.LineTo(202.1f, 221.38f),
                    PathNode.CurveTo(204.0119f, 223.53516f, 206.93494f, 224.49586f, 209.7526f, 223.89514f),
                    PathNode.CurveTo(212.57025f, 223.29443f, 214.84729f, 221.2251f, 215.71396f, 218.47755f),
                    PathNode.CurveTo(216.58061f, 215.73003f, 215.90303f, 212.7287f, 213.94f, 210.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
