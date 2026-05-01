package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorLightIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 100.24f),
                    PathNode.LineTo(132.24f, 180.24f),
                    PathNode.CurveTo(129.89746f, 182.57962f, 126.10254f, 182.57962f, 123.76f, 180.24f),
                    PathNode.LineTo(43.76f, 100.24f),
                    PathNode.CurveTo(41.55713f, 97.87592f, 41.622128f, 94.191925f, 43.907024f, 91.90703f),
                    PathNode.CurveTo(46.19192f, 89.62213f, 49.875923f, 89.55713f, 52.24f, 91.76f),
                    PathNode.LineTo(128.0f, 167.51f),
                    PathNode.LineTo(203.76f, 91.76f),
                    PathNode.CurveTo(206.12408f, 89.55713f, 209.80807f, 89.62213f, 212.09297f, 91.90703f),
                    PathNode.CurveTo(214.37787f, 94.191925f, 214.44287f, 97.87592f, 212.24f, 100.24f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
