package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorLightIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 88.0f),
                    PathNode.LineTo(198.0f, 192.0f),
                    PathNode.CurveTo(198.0f, 195.3137f, 195.3137f, 198.0f, 192.0f, 198.0f),
                    PathNode.LineTo(88.0f, 198.0f),
                    PathNode.CurveTo(84.686295f, 198.0f, 82.0f, 195.3137f, 82.0f, 192.0f),
                    PathNode.CurveTo(82.0f, 188.6863f, 84.686295f, 186.0f, 88.0f, 186.0f),
                    PathNode.LineTo(177.52f, 186.0f),
                    PathNode.LineTo(59.76f, 68.24f),
                    PathNode.CurveTo(57.55713f, 65.87592f, 57.622128f, 62.19192f, 59.907024f, 59.907024f),
                    PathNode.CurveTo(62.19192f, 57.622128f, 65.87592f, 57.55713f, 68.24f, 59.76f),
                    PathNode.LineTo(186.0f, 177.52f),
                    PathNode.LineTo(186.0f, 88.0f),
                    PathNode.CurveTo(186.0f, 84.686295f, 188.6863f, 82.0f, 192.0f, 82.0f),
                    PathNode.CurveTo(195.3137f, 82.0f, 198.0f, 84.686295f, 198.0f, 88.0f),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
