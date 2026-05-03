package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorLightIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 80.0f),
                    PathNode.LineTo(238.0f, 152.0f),
                    PathNode.CurveTo(238.0f, 155.3137f, 235.3137f, 158.0f, 232.0f, 158.0f),
                    PathNode.CurveTo(228.6863f, 158.0f, 226.0f, 155.3137f, 226.0f, 152.0f),
                    PathNode.LineTo(226.0f, 94.48f),
                    PathNode.LineTo(124.24f, 196.24f),
                    PathNode.CurveTo(121.89746f, 198.57962f, 118.10254f, 198.57962f, 115.76f, 196.24f),
                    PathNode.LineTo(19.76f, 100.24f),
                    PathNode.CurveTo(17.557129f, 97.87592f, 17.62213f, 94.191925f, 19.907026f, 91.90703f),
                    PathNode.CurveTo(22.191923f, 89.62213f, 25.875921f, 89.55713f, 28.24f, 91.76f),
                    PathNode.LineTo(120.0f, 183.51f),
                    PathNode.LineTo(217.52f, 86.0f),
                    PathNode.LineTo(160.0f, 86.0f),
                    PathNode.CurveTo(156.6863f, 86.0f, 154.0f, 83.313705f, 154.0f, 80.0f),
                    PathNode.CurveTo(154.0f, 76.686295f, 156.6863f, 74.0f, 160.0f, 74.0f),
                    PathNode.LineTo(232.0f, 74.0f),
                    PathNode.CurveTo(235.3137f, 74.0f, 238.0f, 76.686295f, 238.0f, 80.0f),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
