package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorLightIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 64.0f),
                    PathNode.LineTo(198.0f, 168.0f),
                    PathNode.CurveTo(198.0f, 171.3137f, 195.3137f, 174.0f, 192.0f, 174.0f),
                    PathNode.CurveTo(188.6863f, 174.0f, 186.0f, 171.3137f, 186.0f, 168.0f),
                    PathNode.LineTo(186.0f, 78.48f),
                    PathNode.LineTo(68.24f, 196.24f),
                    PathNode.CurveTo(65.87592f, 198.44287f, 62.19192f, 198.37787f, 59.907024f, 196.09297f),
                    PathNode.CurveTo(57.622128f, 193.80807f, 57.55713f, 190.12408f, 59.76f, 187.76f),
                    PathNode.LineTo(177.52f, 70.0f),
                    PathNode.LineTo(88.0f, 70.0f),
                    PathNode.CurveTo(84.686295f, 70.0f, 82.0f, 67.313705f, 82.0f, 64.0f),
                    PathNode.CurveTo(82.0f, 60.68629f, 84.686295f, 58.0f, 88.0f, 58.0f),
                    PathNode.LineTo(192.0f, 58.0f),
                    PathNode.CurveTo(195.3137f, 58.0f, 198.0f, 60.68629f, 198.0f, 64.0f),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
