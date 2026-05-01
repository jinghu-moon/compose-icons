package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorLightIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(32.268013f, 50.0f, 26.0f, 56.268013f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 224.0f),
                    PathNode.CurveTo(25.970455f, 229.45172f, 29.135159f, 234.41588f, 34.09f, 236.69f),
                    PathNode.CurveTo(35.942028f, 237.54909f, 37.958427f, 237.99603f, 40.0f, 238.0f),
                    PathNode.CurveTo(43.298122f, 238.0018f, 46.488956f, 236.8283f, 49.0f, 234.69f),
                    PathNode.LineTo(49.06f, 234.64f),
                    PathNode.LineTo(82.23f, 206.0f),
                    PathNode.LineTo(216.0f, 206.0f),
                    PathNode.CurveTo(223.73198f, 206.0f, 230.0f, 199.73198f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 56.268013f, 223.73198f, 50.0f, 216.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 193.10457f, 217.10457f, 194.0f, 216.0f, 194.0f),
                    PathNode.LineTo(80.0f, 194.0f),
                    PathNode.CurveTo(78.5605f, 194.00067f, 77.16921f, 194.51886f, 76.08f, 195.46f),
                    PathNode.LineTo(41.26f, 225.53f),
                    PathNode.CurveTo(40.664288f, 226.01335f, 39.8446f, 226.11336f, 39.150146f, 225.78743f),
                    PathNode.CurveTo(38.455692f, 225.46152f, 38.00885f, 224.76709f, 38.0f, 224.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 62.89543f, 38.89543f, 62.0f, 40.0f, 62.0f),
                    PathNode.LineTo(216.0f, 62.0f),
                    PathNode.CurveTo(217.10457f, 62.0f, 218.0f, 62.89543f, 218.0f, 64.0f),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
