package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorLightIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 76.24f),
                    PathNode.LineTo(100.24f, 204.24f),
                    PathNode.CurveTo(97.89746f, 206.57962f, 94.10254f, 206.57962f, 91.76f, 204.24f),
                    PathNode.LineTo(35.76f, 148.24f),
                    PathNode.CurveTo(33.55713f, 145.87592f, 33.622128f, 142.19193f, 35.907024f, 139.90703f),
                    PathNode.CurveTo(38.19192f, 137.62213f, 41.875923f, 137.55713f, 44.24f, 139.76f),
                    PathNode.LineTo(96.0f, 191.51f),
                    PathNode.LineTo(219.76f, 67.76f),
                    PathNode.CurveTo(222.12408f, 65.55713f, 225.80807f, 65.62213f, 228.09297f, 67.90703f),
                    PathNode.CurveTo(230.37787f, 70.191925f, 230.44287f, 73.87592f, 228.24f, 76.24f),
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
        return _check!!
    }

private var _check: ImageVector? = null
