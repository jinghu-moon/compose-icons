package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorLightIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.18f, 173.0f),
                    PathNode.CurveTo(230.84557f, 175.86115f, 229.87897f, 179.53069f, 227.02f, 181.2f),
                    PathNode.LineTo(131.02f, 237.2f),
                    PathNode.CurveTo(129.16359f, 238.27179f, 126.8764f, 238.27179f, 125.02f, 237.2f),
                    PathNode.LineTo(29.02f, 181.2f),
                    PathNode.CurveTo(26.404222f, 179.43633f, 25.601072f, 175.94818f, 27.182165f, 173.21817f),
                    PathNode.CurveTo(28.763258f, 170.48814f, 32.18846f, 169.44887f, 35.02f, 170.84f),
                    PathNode.LineTo(128.02f, 225.07f),
                    PathNode.LineTo(221.02f, 170.84f),
                    PathNode.CurveTo(223.87224f, 169.2015f, 227.51193f, 170.16496f, 229.18f, 173.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.0f, 122.82f),
                    PathNode.LineTo(128.0f, 177.05f),
                    PathNode.LineTo(35.0f, 122.82f),
                    PathNode.CurveTo(32.16846f, 121.42886f, 28.743258f, 122.46815f, 27.162165f, 125.198166f),
                    PathNode.CurveTo(25.581072f, 127.928185f, 26.384224f, 131.41632f, 29.0f, 133.18f),
                    PathNode.LineTo(125.0f, 189.18f),
                    PathNode.CurveTo(126.85641f, 190.2518f, 129.1436f, 190.2518f, 131.0f, 189.18f),
                    PathNode.LineTo(227.0f, 133.18f),
                    PathNode.CurveTo(229.61577f, 131.41632f, 230.41893f, 127.928185f, 228.83783f, 125.198166f),
                    PathNode.CurveTo(227.25674f, 122.46815f, 223.83154f, 121.42886f, 221.0f, 122.82f),
                    PathNode.Close,
                    PathNode.MoveTo(26.0f, 80.0f),
                    PathNode.CurveTo(26.00576f, 77.86218f, 27.148582f, 75.88891f, 29.0f, 74.82f),
                    PathNode.LineTo(125.0f, 18.82f),
                    PathNode.CurveTo(126.85641f, 17.748203f, 129.1436f, 17.748203f, 131.0f, 18.82f),
                    PathNode.LineTo(227.0f, 74.82f),
                    PathNode.CurveTo(228.84073f, 75.895935f, 229.9722f, 77.86789f, 229.9722f, 80.0f),
                    PathNode.CurveTo(229.9722f, 82.13211f, 228.84073f, 84.104065f, 227.0f, 85.18f),
                    PathNode.LineTo(131.0f, 141.18f),
                    PathNode.CurveTo(129.1436f, 142.2518f, 126.85641f, 142.2518f, 125.0f, 141.18f),
                    PathNode.LineTo(29.0f, 85.18f),
                    PathNode.CurveTo(27.148582f, 84.11109f, 26.00576f, 82.13782f, 26.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(43.91f, 80.0f),
                    PathNode.LineTo(128.0f, 129.05f),
                    PathNode.LineTo(212.09f, 80.0f),
                    PathNode.LineTo(128.0f, 31.0f),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
