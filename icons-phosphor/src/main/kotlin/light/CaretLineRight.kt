package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorLightIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.24f, 123.76f),
                    PathNode.CurveTo(150.57962f, 126.10254f, 150.57962f, 129.89746f, 148.24f, 132.24f),
                    PathNode.LineTo(68.24f, 212.24f),
                    PathNode.CurveTo(65.87592f, 214.44287f, 62.19192f, 214.37787f, 59.907024f, 212.09297f),
                    PathNode.CurveTo(57.622128f, 209.80807f, 57.55713f, 206.12408f, 59.76f, 203.76f),
                    PathNode.LineTo(135.51f, 128.0f),
                    PathNode.LineTo(59.76f, 52.24f),
                    PathNode.CurveTo(57.55713f, 49.875923f, 57.622128f, 46.19192f, 59.907024f, 43.907024f),
                    PathNode.CurveTo(62.19192f, 41.622128f, 65.87592f, 41.55713f, 68.24f, 43.76f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 42.0f),
                    PathNode.CurveTo(180.6863f, 42.0f, 178.0f, 44.68629f, 178.0f, 48.0f),
                    PathNode.LineTo(178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 211.3137f, 180.6863f, 214.0f, 184.0f, 214.0f),
                    PathNode.CurveTo(187.3137f, 214.0f, 190.0f, 211.3137f, 190.0f, 208.0f),
                    PathNode.LineTo(190.0f, 48.0f),
                    PathNode.CurveTo(190.0f, 44.68629f, 187.3137f, 42.0f, 184.0f, 42.0f),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
