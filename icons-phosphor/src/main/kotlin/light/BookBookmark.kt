package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorLightIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(55.431458f, 26.0f, 42.0f, 39.431458f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 224.0f),
                    PathNode.CurveTo(42.0f, 227.3137f, 44.68629f, 230.0f, 48.0f, 230.0f),
                    PathNode.LineTo(192.0f, 230.0f),
                    PathNode.CurveTo(195.3137f, 230.0f, 198.0f, 227.3137f, 198.0f, 224.0f),
                    PathNode.CurveTo(198.0f, 220.6863f, 195.3137f, 218.0f, 192.0f, 218.0f),
                    PathNode.LineTo(54.0f, 218.0f),
                    PathNode.LineTo(54.0f, 216.0f),
                    PathNode.CurveTo(54.0f, 206.05887f, 62.058876f, 198.0f, 72.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(211.3137f, 198.0f, 214.0f, 195.3137f, 214.0f, 192.0f),
                    PathNode.LineTo(214.0f, 32.0f),
                    PathNode.CurveTo(214.0f, 28.68629f, 211.3137f, 26.0f, 208.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 38.0f),
                    PathNode.LineTo(170.0f, 38.0f),
                    PathNode.LineTo(170.0f, 116.0f),
                    PathNode.LineTo(147.59f, 99.2f),
                    PathNode.CurveTo(145.45667f, 97.6f, 142.52333f, 97.6f, 140.39f, 99.2f),
                    PathNode.LineTo(118.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 186.0f),
                    PathNode.LineTo(72.0f, 186.0f),
                    PathNode.CurveTo(65.50737f, 185.99059f, 59.188454f, 188.09688f, 54.0f, 192.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 46.058876f, 62.058876f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(106.0f, 38.0f),
                    PathNode.LineTo(106.0f, 128.0f),
                    PathNode.CurveTo(106.0f, 130.27263f, 107.284004f, 132.3502f, 109.31672f, 133.36656f),
                    PathNode.CurveTo(111.34943f, 134.38292f, 113.78189f, 134.16357f, 115.6f, 132.8f),
                    PathNode.LineTo(144.0f, 111.5f),
                    PathNode.LineTo(172.41f, 132.8f),
                    PathNode.CurveTo(174.22806f, 134.15764f, 176.65646f, 134.37355f, 178.68552f, 133.35796f),
                    PathNode.CurveTo(180.7146f, 132.34238f, 181.99718f, 130.26903f, 182.0f, 128.0f),
                    PathNode.LineTo(182.0f, 38.0f),
                    PathNode.LineTo(202.0f, 38.0f),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
