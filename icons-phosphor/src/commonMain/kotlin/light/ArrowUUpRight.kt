package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorLightIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.76f, 131.76f),
                    PathNode.LineTo(209.51f, 94.0f),
                    PathNode.LineTo(88.0f, 94.0f),
                    PathNode.CurveTo(60.38576f, 94.0f, 38.0f, 116.385765f, 38.0f, 144.0f),
                    PathNode.CurveTo(38.0f, 171.61424f, 60.38576f, 194.0f, 88.0f, 194.0f),
                    PathNode.LineTo(176.0f, 194.0f),
                    PathNode.CurveTo(179.3137f, 194.0f, 182.0f, 196.6863f, 182.0f, 200.0f),
                    PathNode.CurveTo(182.0f, 203.3137f, 179.3137f, 206.0f, 176.0f, 206.0f),
                    PathNode.LineTo(88.0f, 206.0f),
                    PathNode.CurveTo(53.758347f, 206.0f, 26.0f, 178.24165f, 26.0f, 144.0f),
                    PathNode.CurveTo(26.0f, 109.75835f, 53.758347f, 82.0f, 88.0f, 82.0f),
                    PathNode.LineTo(209.51f, 82.0f),
                    PathNode.LineTo(171.76f, 44.24f),
                    PathNode.CurveTo(169.55713f, 41.875923f, 169.62213f, 38.19192f, 171.90703f, 35.907024f),
                    PathNode.CurveTo(174.19193f, 33.622128f, 177.87592f, 33.55713f, 180.24f, 35.76f),
                    PathNode.LineTo(228.24f, 83.76f),
                    PathNode.CurveTo(230.57962f, 86.10254f, 230.57962f, 89.89746f, 228.24f, 92.24f),
                    PathNode.LineTo(180.24f, 140.24f),
                    PathNode.CurveTo(177.87592f, 142.44287f, 174.19193f, 142.37787f, 171.90703f, 140.09297f),
                    PathNode.CurveTo(169.62213f, 137.80807f, 169.55713f, 134.12408f, 171.76f, 131.76f),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
