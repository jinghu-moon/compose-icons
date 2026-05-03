package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorLightIcon(
            name = "Book",
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
                    PathNode.MoveTo(202.0f, 186.0f),
                    PathNode.LineTo(72.0f, 186.0f),
                    PathNode.CurveTo(65.50737f, 185.99059f, 59.188454f, 188.09688f, 54.0f, 192.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 46.058876f, 62.058876f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(202.0f, 38.0f),
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
        return _book!!
    }

private var _book: ImageVector? = null
