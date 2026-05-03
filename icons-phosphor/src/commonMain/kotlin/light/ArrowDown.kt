package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorLightIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 148.24f),
                    PathNode.LineTo(132.24f, 220.24f),
                    PathNode.CurveTo(129.89746f, 222.57962f, 126.10254f, 222.57962f, 123.76f, 220.24f),
                    PathNode.LineTo(51.76f, 148.24f),
                    PathNode.CurveTo(49.55713f, 145.87592f, 49.622128f, 142.19193f, 51.907024f, 139.90703f),
                    PathNode.CurveTo(54.19192f, 137.62213f, 57.875923f, 137.55713f, 60.24f, 139.76f),
                    PathNode.LineTo(122.0f, 201.51f),
                    PathNode.LineTo(122.0f, 40.0f),
                    PathNode.CurveTo(122.0f, 36.68629f, 124.686295f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.LineTo(134.0f, 201.51f),
                    PathNode.LineTo(195.76f, 139.76f),
                    PathNode.CurveTo(198.12408f, 137.55713f, 201.80807f, 137.62213f, 204.09297f, 139.90703f),
                    PathNode.CurveTo(206.37787f, 142.19193f, 206.44287f, 145.87592f, 204.24f, 148.24f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
