package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorLightIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 48.0f),
                    PathNode.LineTo(142.0f, 208.0f),
                    PathNode.CurveTo(142.0f, 211.3137f, 139.3137f, 214.0f, 136.0f, 214.0f),
                    PathNode.CurveTo(132.6863f, 214.0f, 130.0f, 211.3137f, 130.0f, 208.0f),
                    PathNode.LineTo(130.0f, 58.6f),
                    PathNode.LineTo(99.09f, 77.14f),
                    PathNode.CurveTo(96.2485f, 78.84656f, 92.56156f, 77.926506f, 90.855f, 75.085f),
                    PathNode.CurveTo(89.14844f, 72.2435f, 90.0685f, 68.55656f, 92.91f, 66.85f),
                    PathNode.LineTo(132.91f, 42.85f),
                    PathNode.CurveTo(134.76453f, 41.7358f, 137.07527f, 41.706287f, 138.95764f, 42.77276f),
                    PathNode.CurveTo(140.84001f, 43.83923f, 142.00246f, 45.83651f, 142.0f, 48.0f),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
