package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorLightIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 84.24f),
                    PathNode.CurveTo(201.89746f, 86.57962f, 198.10254f, 86.57962f, 195.76f, 84.24f),
                    PathNode.LineTo(158.0f, 46.49f),
                    PathNode.LineTo(158.0f, 128.0f),
                    PathNode.CurveTo(157.93387f, 184.30563f, 112.30563f, 229.93387f, 56.0f, 230.0f),
                    PathNode.CurveTo(52.68629f, 230.0f, 50.0f, 227.3137f, 50.0f, 224.0f),
                    PathNode.CurveTo(50.0f, 220.6863f, 52.68629f, 218.0f, 56.0f, 218.0f),
                    PathNode.CurveTo(105.682785f, 217.94489f, 145.94489f, 177.68279f, 146.0f, 128.0f),
                    PathNode.LineTo(146.0f, 46.49f),
                    PathNode.LineTo(108.24f, 84.24f),
                    PathNode.CurveTo(105.87592f, 86.44287f, 102.191925f, 86.37787f, 99.90703f, 84.09297f),
                    PathNode.CurveTo(97.62213f, 81.808075f, 97.55713f, 78.12408f, 99.76f, 75.76f),
                    PathNode.LineTo(147.76f, 27.76f),
                    PathNode.CurveTo(150.10254f, 25.420374f, 153.89746f, 25.420374f, 156.24f, 27.76f),
                    PathNode.LineTo(204.24f, 75.76f),
                    PathNode.CurveTo(206.57962f, 78.10254f, 206.57962f, 81.89746f, 204.24f, 84.24f),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
