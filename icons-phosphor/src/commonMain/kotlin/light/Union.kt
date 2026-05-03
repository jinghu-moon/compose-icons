package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorLightIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 64.0f),
                    PathNode.LineTo(206.0f, 144.0f),
                    PathNode.CurveTo(206.0f, 187.07822f, 171.07822f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(84.92179f, 222.0f, 50.0f, 187.07822f, 50.0f, 144.0f),
                    PathNode.LineTo(50.0f, 64.0f),
                    PathNode.CurveTo(50.0f, 60.68629f, 52.68629f, 58.0f, 56.0f, 58.0f),
                    PathNode.CurveTo(59.31371f, 58.0f, 62.0f, 60.68629f, 62.0f, 64.0f),
                    PathNode.LineTo(62.0f, 144.0f),
                    PathNode.CurveTo(62.0f, 180.45079f, 91.54921f, 210.0f, 128.0f, 210.0f),
                    PathNode.CurveTo(164.45079f, 210.0f, 194.0f, 180.45079f, 194.0f, 144.0f),
                    PathNode.LineTo(194.0f, 64.0f),
                    PathNode.CurveTo(194.0f, 60.68629f, 196.6863f, 58.0f, 200.0f, 58.0f),
                    PathNode.CurveTo(203.3137f, 58.0f, 206.0f, 60.68629f, 206.0f, 64.0f),
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
        return _union!!
    }

private var _union: ImageVector? = null
