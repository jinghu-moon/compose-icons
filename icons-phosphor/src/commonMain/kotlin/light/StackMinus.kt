package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorLightIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 200.0f),
                    PathNode.CurveTo(238.0f, 203.3137f, 235.3137f, 206.0f, 232.0f, 206.0f),
                    PathNode.LineTo(184.0f, 206.0f),
                    PathNode.CurveTo(180.6863f, 206.0f, 178.0f, 203.3137f, 178.0f, 200.0f),
                    PathNode.CurveTo(178.0f, 196.6863f, 180.6863f, 194.0f, 184.0f, 194.0f),
                    PathNode.LineTo(232.0f, 194.0f),
                    PathNode.CurveTo(235.3137f, 194.0f, 238.0f, 196.6863f, 238.0f, 200.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(141.0f, 217.48f),
                    PathNode.LineTo(128.0f, 225.05f),
                    PathNode.LineTo(35.0f, 170.82f),
                    PathNode.CurveTo(32.16846f, 169.42886f, 28.743258f, 170.46814f, 27.162165f, 173.19817f),
                    PathNode.CurveTo(25.581072f, 175.92819f, 26.384224f, 179.41632f, 29.0f, 181.18f),
                    PathNode.LineTo(125.0f, 237.18f),
                    PathNode.CurveTo(126.85641f, 238.2518f, 129.1436f, 238.2518f, 131.0f, 237.18f),
                    PathNode.LineTo(147.0f, 227.85f),
                    PathNode.CurveTo(149.65901f, 226.10307f, 150.49217f, 222.58437f, 148.89885f, 219.83057f),
                    PathNode.CurveTo(147.30551f, 217.07677f, 143.83972f, 216.04541f, 141.0f, 217.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null
