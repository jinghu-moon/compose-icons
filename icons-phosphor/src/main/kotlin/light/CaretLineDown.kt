package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorLightIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(43.76f, 76.24f),
                    PathNode.CurveTo(41.55713f, 73.87592f, 41.622128f, 70.191925f, 43.907024f, 67.90703f),
                    PathNode.CurveTo(46.19192f, 65.62213f, 49.875923f, 65.55713f, 52.24f, 67.76f),
                    PathNode.LineTo(128.0f, 143.51f),
                    PathNode.LineTo(203.76f, 67.76f),
                    PathNode.CurveTo(206.12408f, 65.55713f, 209.80807f, 65.62213f, 212.09297f, 67.90703f),
                    PathNode.CurveTo(214.37787f, 70.191925f, 214.44287f, 73.87592f, 212.24f, 76.24f),
                    PathNode.LineTo(132.24f, 156.24f),
                    PathNode.CurveTo(129.89746f, 158.57962f, 126.10254f, 158.57962f, 123.76f, 156.24f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(44.68629f, 186.0f, 42.0f, 188.6863f, 42.0f, 192.0f),
                    PathNode.CurveTo(42.0f, 195.3137f, 44.68629f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(211.3137f, 198.0f, 214.0f, 195.3137f, 214.0f, 192.0f),
                    PathNode.CurveTo(214.0f, 188.6863f, 211.3137f, 186.0f, 208.0f, 186.0f),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
