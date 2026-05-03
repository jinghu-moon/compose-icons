package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorLightIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 88.0f),
                    PathNode.LineTo(206.0f, 176.0f),
                    PathNode.CurveTo(206.0f, 179.3137f, 203.3137f, 182.0f, 200.0f, 182.0f),
                    PathNode.CurveTo(196.6863f, 182.0f, 194.0f, 179.3137f, 194.0f, 176.0f),
                    PathNode.LineTo(194.0f, 88.0f),
                    PathNode.CurveTo(194.0f, 60.38576f, 171.61424f, 38.0f, 144.0f, 38.0f),
                    PathNode.CurveTo(116.385765f, 38.0f, 94.0f, 60.38576f, 94.0f, 88.0f),
                    PathNode.LineTo(94.0f, 209.51f),
                    PathNode.LineTo(131.76f, 171.76f),
                    PathNode.CurveTo(134.12408f, 169.55713f, 137.80807f, 169.62213f, 140.09297f, 171.90703f),
                    PathNode.CurveTo(142.37787f, 174.19193f, 142.44287f, 177.87592f, 140.24f, 180.24f),
                    PathNode.LineTo(92.24f, 228.24f),
                    PathNode.CurveTo(89.89746f, 230.57962f, 86.10254f, 230.57962f, 83.76f, 228.24f),
                    PathNode.LineTo(35.76f, 180.24f),
                    PathNode.CurveTo(33.55713f, 177.87592f, 33.622128f, 174.19193f, 35.907024f, 171.90703f),
                    PathNode.CurveTo(38.19192f, 169.62213f, 41.875923f, 169.55713f, 44.24f, 171.76f),
                    PathNode.LineTo(82.0f, 209.51f),
                    PathNode.LineTo(82.0f, 88.0f),
                    PathNode.CurveTo(82.0f, 53.758347f, 109.75835f, 26.0f, 144.0f, 26.0f),
                    PathNode.CurveTo(178.24165f, 26.0f, 206.0f, 53.758347f, 206.0f, 88.0f),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
