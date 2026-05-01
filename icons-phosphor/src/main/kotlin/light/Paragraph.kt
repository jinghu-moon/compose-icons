package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorLightIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(96.0f, 42.0f),
                    PathNode.CurveTo(61.758347f, 42.0f, 34.0f, 69.75835f, 34.0f, 104.0f),
                    PathNode.CurveTo(34.0f, 138.24165f, 61.758347f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(138.0f, 166.0f),
                    PathNode.LineTo(138.0f, 208.0f),
                    PathNode.CurveTo(138.0f, 211.3137f, 140.6863f, 214.0f, 144.0f, 214.0f),
                    PathNode.CurveTo(147.3137f, 214.0f, 150.0f, 211.3137f, 150.0f, 208.0f),
                    PathNode.LineTo(150.0f, 54.0f),
                    PathNode.LineTo(178.0f, 54.0f),
                    PathNode.LineTo(178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 211.3137f, 180.6863f, 214.0f, 184.0f, 214.0f),
                    PathNode.CurveTo(187.3137f, 214.0f, 190.0f, 211.3137f, 190.0f, 208.0f),
                    PathNode.LineTo(190.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(211.3137f, 54.0f, 214.0f, 51.31371f, 214.0f, 48.0f),
                    PathNode.CurveTo(214.0f, 44.68629f, 211.3137f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.CurveTo(68.385765f, 154.0f, 46.0f, 131.61424f, 46.0f, 104.0f),
                    PathNode.CurveTo(46.0f, 76.385765f, 68.385765f, 54.0f, 96.0f, 54.0f),
                    PathNode.LineTo(138.0f, 54.0f),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
