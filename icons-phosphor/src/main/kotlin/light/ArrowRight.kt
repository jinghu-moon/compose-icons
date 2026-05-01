package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorLightIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 132.24f),
                    PathNode.LineTo(148.24f, 204.24f),
                    PathNode.CurveTo(145.87592f, 206.44287f, 142.19193f, 206.37787f, 139.90703f, 204.09297f),
                    PathNode.CurveTo(137.62213f, 201.80807f, 137.55713f, 198.12408f, 139.76f, 195.76f),
                    PathNode.LineTo(201.51f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(36.68629f, 134.0f, 34.0f, 131.3137f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 124.686295f, 36.68629f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(201.51f, 122.0f),
                    PathNode.LineTo(139.76f, 60.24f),
                    PathNode.CurveTo(137.55713f, 57.875923f, 137.62213f, 54.19192f, 139.90703f, 51.907024f),
                    PathNode.CurveTo(142.19193f, 49.622128f, 145.87592f, 49.55713f, 148.24f, 51.76f),
                    PathNode.LineTo(220.24f, 123.76f),
                    PathNode.CurveTo(222.57962f, 126.10254f, 222.57962f, 129.89746f, 220.24f, 132.24f),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
