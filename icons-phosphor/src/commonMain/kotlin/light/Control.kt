package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorLightIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 124.24f),
                    PathNode.CurveTo(201.89746f, 126.57962f, 198.10254f, 126.57962f, 195.76f, 124.24f),
                    PathNode.LineTo(128.0f, 56.49f),
                    PathNode.LineTo(60.24f, 124.24f),
                    PathNode.CurveTo(57.875923f, 126.44287f, 54.19192f, 126.37787f, 51.907024f, 124.09297f),
                    PathNode.CurveTo(49.622128f, 121.808075f, 49.55713f, 118.12408f, 51.76f, 115.76f),
                    PathNode.LineTo(123.76f, 43.76f),
                    PathNode.CurveTo(126.10254f, 41.420372f, 129.89746f, 41.420372f, 132.24f, 43.76f),
                    PathNode.LineTo(204.24f, 115.76f),
                    PathNode.CurveTo(206.57962f, 118.10254f, 206.57962f, 121.89746f, 204.24f, 124.24f),
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
        return _control!!
    }

private var _control: ImageVector? = null
