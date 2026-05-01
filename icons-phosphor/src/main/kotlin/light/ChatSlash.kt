package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorLightIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(49.0f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(32.268013f, 50.0f, 26.0f, 56.268013f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 224.0f),
                    PathNode.CurveTo(25.965368f, 229.45319f, 29.131681f, 234.41988f, 34.09f, 236.69f),
                    PathNode.CurveTo(39.04614f, 239.04462f, 44.92393f, 238.26091f, 49.09f, 234.69f),
                    PathNode.LineTo(82.23f, 206.0f),
                    PathNode.LineTo(190.8f, 206.0f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(204.99393f, 221.61636f, 207.1862f, 222.3369f, 209.29944f, 221.88635f),
                    PathNode.CurveTo(211.41269f, 221.43582f, 213.12047f, 219.88382f, 213.77046f, 217.82317f),
                    PathNode.CurveTo(214.42044f, 215.76251f, 213.91226f, 213.51152f, 212.44f, 211.93f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 194.0f),
                    PathNode.CurveTo(78.5605f, 194.00067f, 77.16921f, 194.51886f, 76.08f, 195.46f),
                    PathNode.LineTo(41.29f, 225.46f),
                    PathNode.CurveTo(40.7047f, 225.95476f, 39.888138f, 226.07155f, 39.18762f, 225.76068f),
                    PathNode.CurveTo(38.4871f, 225.44981f, 38.02583f, 224.76596f, 38.0f, 224.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 62.89543f, 38.89543f, 62.0f, 40.0f, 62.0f),
                    PathNode.LineTo(59.89f, 62.0f),
                    PathNode.LineTo(179.89f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 64.0f),
                    PathNode.LineTo(230.0f, 186.0f),
                    PathNode.CurveTo(230.0f, 189.3137f, 227.3137f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(220.6863f, 192.0f, 218.0f, 189.3137f, 218.0f, 186.0f),
                    PathNode.LineTo(218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 62.89543f, 217.10457f, 62.0f, 216.0f, 62.0f),
                    PathNode.LineTo(105.79f, 62.0f),
                    PathNode.CurveTo(102.47629f, 62.0f, 99.79f, 59.31371f, 99.79f, 56.0f),
                    PathNode.CurveTo(99.79f, 52.68629f, 102.47629f, 50.0f, 105.79f, 50.0f),
                    PathNode.LineTo(216.0f, 50.0f),
                    PathNode.CurveTo(223.73198f, 50.0f, 230.0f, 56.268013f, 230.0f, 64.0f),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
