package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorLightIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 120.0f),
                    PathNode.LineTo(206.0f, 200.0f),
                    PathNode.CurveTo(206.0f, 203.3137f, 203.3137f, 206.0f, 200.0f, 206.0f),
                    PathNode.CurveTo(196.6863f, 206.0f, 194.0f, 203.3137f, 194.0f, 200.0f),
                    PathNode.LineTo(194.0f, 120.0f),
                    PathNode.CurveTo(194.0f, 83.54921f, 164.45079f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(91.54921f, 54.0f, 62.0f, 83.54921f, 62.0f, 120.0f),
                    PathNode.LineTo(62.0f, 200.0f),
                    PathNode.CurveTo(62.0f, 203.3137f, 59.31371f, 206.0f, 56.0f, 206.0f),
                    PathNode.CurveTo(52.68629f, 206.0f, 50.0f, 203.3137f, 50.0f, 200.0f),
                    PathNode.LineTo(50.0f, 120.0f),
                    PathNode.CurveTo(50.0f, 76.92179f, 84.92179f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(171.07822f, 42.0f, 206.0f, 76.92179f, 206.0f, 120.0f),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
