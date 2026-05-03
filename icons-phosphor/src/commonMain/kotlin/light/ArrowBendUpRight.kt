package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorLightIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 108.24f),
                    PathNode.LineTo(180.24f, 156.24f),
                    PathNode.CurveTo(177.87592f, 158.44287f, 174.19193f, 158.37787f, 171.90703f, 156.09297f),
                    PathNode.CurveTo(169.62213f, 153.80807f, 169.55713f, 150.12408f, 171.76f, 147.76f),
                    PathNode.LineTo(209.51f, 110.0f),
                    PathNode.LineTo(128.0f, 110.0f),
                    PathNode.CurveTo(78.317215f, 110.055115f, 38.05511f, 150.31721f, 38.0f, 200.0f),
                    PathNode.CurveTo(38.0f, 203.3137f, 35.31371f, 206.0f, 32.0f, 206.0f),
                    PathNode.CurveTo(28.68629f, 206.0f, 26.0f, 203.3137f, 26.0f, 200.0f),
                    PathNode.CurveTo(26.066126f, 143.69437f, 71.69437f, 98.06612f, 128.0f, 98.0f),
                    PathNode.LineTo(209.51f, 98.0f),
                    PathNode.LineTo(171.76f, 60.24f),
                    PathNode.CurveTo(169.55713f, 57.875923f, 169.62213f, 54.19192f, 171.90703f, 51.907024f),
                    PathNode.CurveTo(174.19193f, 49.622128f, 177.87592f, 49.55713f, 180.24f, 51.76f),
                    PathNode.LineTo(228.24f, 99.76f),
                    PathNode.CurveTo(230.57962f, 102.10254f, 230.57962f, 105.89746f, 228.24f, 108.24f),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
