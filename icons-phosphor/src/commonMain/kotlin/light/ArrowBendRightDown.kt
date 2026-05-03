package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorLightIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 180.24f),
                    PathNode.LineTo(156.24f, 228.24f),
                    PathNode.CurveTo(153.89746f, 230.57962f, 150.10254f, 230.57962f, 147.76f, 228.24f),
                    PathNode.LineTo(99.76f, 180.24f),
                    PathNode.CurveTo(97.55713f, 177.87592f, 97.62213f, 174.19193f, 99.90703f, 171.90703f),
                    PathNode.CurveTo(102.191925f, 169.62213f, 105.87592f, 169.55713f, 108.24f, 171.76f),
                    PathNode.LineTo(146.0f, 209.51f),
                    PathNode.LineTo(146.0f, 128.0f),
                    PathNode.CurveTo(145.94489f, 78.317215f, 105.682785f, 38.05511f, 56.0f, 38.0f),
                    PathNode.CurveTo(52.68629f, 38.0f, 50.0f, 35.31371f, 50.0f, 32.0f),
                    PathNode.CurveTo(50.0f, 28.68629f, 52.68629f, 26.0f, 56.0f, 26.0f),
                    PathNode.CurveTo(112.30563f, 26.066126f, 157.93387f, 71.69437f, 158.0f, 128.0f),
                    PathNode.LineTo(158.0f, 209.51f),
                    PathNode.LineTo(195.76f, 171.76f),
                    PathNode.CurveTo(198.12408f, 169.55713f, 201.80807f, 169.62213f, 204.09297f, 171.90703f),
                    PathNode.CurveTo(206.37787f, 174.19193f, 206.44287f, 177.87592f, 204.24f, 180.24f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
