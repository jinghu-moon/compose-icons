package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorLightIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.24f, 132.24f),
                    PathNode.LineTo(100.24f, 212.24f),
                    PathNode.CurveTo(97.87592f, 214.44287f, 94.191925f, 214.37787f, 91.90703f, 212.09297f),
                    PathNode.CurveTo(89.62213f, 209.80807f, 89.55713f, 206.12408f, 91.76f, 203.76f),
                    PathNode.LineTo(167.51f, 128.0f),
                    PathNode.LineTo(91.76f, 52.24f),
                    PathNode.CurveTo(89.55713f, 49.875923f, 89.62213f, 46.19192f, 91.90703f, 43.907024f),
                    PathNode.CurveTo(94.191925f, 41.622128f, 97.87592f, 41.55713f, 100.24f, 43.76f),
                    PathNode.LineTo(180.24f, 123.76f),
                    PathNode.CurveTo(182.57962f, 126.10254f, 182.57962f, 129.89746f, 180.24f, 132.24f),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
