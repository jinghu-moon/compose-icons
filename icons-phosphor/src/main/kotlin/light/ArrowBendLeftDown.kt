package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorLightIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 32.0f),
                    PathNode.CurveTo(206.0f, 35.31371f, 203.3137f, 38.0f, 200.0f, 38.0f),
                    PathNode.CurveTo(150.31721f, 38.05511f, 110.055115f, 78.317215f, 110.0f, 128.0f),
                    PathNode.LineTo(110.0f, 209.51f),
                    PathNode.LineTo(147.76f, 171.76f),
                    PathNode.CurveTo(150.12408f, 169.55713f, 153.80807f, 169.62213f, 156.09297f, 171.90703f),
                    PathNode.CurveTo(158.37787f, 174.19193f, 158.44287f, 177.87592f, 156.24f, 180.24f),
                    PathNode.LineTo(108.24f, 228.24f),
                    PathNode.CurveTo(105.89746f, 230.57962f, 102.10254f, 230.57962f, 99.76f, 228.24f),
                    PathNode.LineTo(51.76f, 180.24f),
                    PathNode.CurveTo(49.55713f, 177.87592f, 49.622128f, 174.19193f, 51.907024f, 171.90703f),
                    PathNode.CurveTo(54.19192f, 169.62213f, 57.875923f, 169.55713f, 60.24f, 171.76f),
                    PathNode.LineTo(98.0f, 209.51f),
                    PathNode.LineTo(98.0f, 128.0f),
                    PathNode.CurveTo(98.06612f, 71.69437f, 143.69437f, 26.066126f, 200.0f, 26.0f),
                    PathNode.CurveTo(203.3137f, 26.0f, 206.0f, 28.68629f, 206.0f, 32.0f),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
