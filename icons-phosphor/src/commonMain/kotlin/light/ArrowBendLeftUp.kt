package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorLightIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 224.0f),
                    PathNode.CurveTo(206.0f, 227.3137f, 203.3137f, 230.0f, 200.0f, 230.0f),
                    PathNode.CurveTo(143.69437f, 229.93387f, 98.06612f, 184.30563f, 98.0f, 128.0f),
                    PathNode.LineTo(98.0f, 46.49f),
                    PathNode.LineTo(60.24f, 84.24f),
                    PathNode.CurveTo(57.875923f, 86.44287f, 54.19192f, 86.37787f, 51.907024f, 84.09297f),
                    PathNode.CurveTo(49.622128f, 81.808075f, 49.55713f, 78.12408f, 51.76f, 75.76f),
                    PathNode.LineTo(99.76f, 27.76f),
                    PathNode.CurveTo(102.10254f, 25.420374f, 105.89746f, 25.420374f, 108.24f, 27.76f),
                    PathNode.LineTo(156.24f, 75.76f),
                    PathNode.CurveTo(157.84523f, 77.25577f, 158.506f, 79.508446f, 157.96309f, 81.6343f),
                    PathNode.CurveTo(157.42018f, 83.76018f, 155.76018f, 85.42017f, 153.63431f, 85.96308f),
                    PathNode.CurveTo(151.50844f, 86.506f, 149.25575f, 85.84522f, 147.76f, 84.24f),
                    PathNode.LineTo(110.0f, 46.49f),
                    PathNode.LineTo(110.0f, 128.0f),
                    PathNode.CurveTo(110.055115f, 177.68279f, 150.31721f, 217.94489f, 200.0f, 218.0f),
                    PathNode.CurveTo(203.3137f, 218.0f, 206.0f, 220.6863f, 206.0f, 224.0f),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
