package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorLightIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 116.24f),
                    PathNode.CurveTo(201.89746f, 118.57962f, 198.10254f, 118.57962f, 195.76f, 116.24f),
                    PathNode.LineTo(134.0f, 54.49f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 54.49f),
                    PathNode.LineTo(60.24f, 116.24f),
                    PathNode.CurveTo(57.875923f, 118.44287f, 54.19192f, 118.37787f, 51.907024f, 116.09297f),
                    PathNode.CurveTo(49.622128f, 113.808075f, 49.55713f, 110.12408f, 51.76f, 107.76f),
                    PathNode.LineTo(123.76f, 35.76f),
                    PathNode.CurveTo(126.10254f, 33.420372f, 129.89746f, 33.420372f, 132.24f, 35.76f),
                    PathNode.LineTo(204.24f, 107.76f),
                    PathNode.CurveTo(206.57962f, 110.10254f, 206.57962f, 113.89746f, 204.24f, 116.24f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
