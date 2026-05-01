package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorLightIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.24f, 147.76f),
                    PathNode.CurveTo(85.84522f, 149.25575f, 86.506f, 151.50844f, 85.96308f, 153.63431f),
                    PathNode.CurveTo(85.42017f, 155.76018f, 83.76018f, 157.42018f, 81.6343f, 157.96309f),
                    PathNode.CurveTo(79.508446f, 158.506f, 77.25577f, 157.84523f, 75.76f, 156.24f),
                    PathNode.LineTo(27.76f, 108.24f),
                    PathNode.CurveTo(25.420374f, 105.89746f, 25.420374f, 102.10254f, 27.76f, 99.76f),
                    PathNode.LineTo(75.76f, 51.76f),
                    PathNode.CurveTo(78.12408f, 49.55713f, 81.808075f, 49.622128f, 84.09297f, 51.907024f),
                    PathNode.CurveTo(86.37787f, 54.19192f, 86.44287f, 57.875923f, 84.24f, 60.24f),
                    PathNode.LineTo(40.49f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.LineTo(94.49f, 98.0f),
                    PathNode.LineTo(132.24f, 60.24f),
                    PathNode.CurveTo(134.44287f, 57.875923f, 134.37787f, 54.19192f, 132.09297f, 51.907024f),
                    PathNode.CurveTo(129.80807f, 49.622128f, 126.12408f, 49.55713f, 123.76f, 51.76f),
                    PathNode.LineTo(75.76f, 99.76f),
                    PathNode.CurveTo(73.42038f, 102.10254f, 73.42038f, 105.89746f, 75.76f, 108.24f),
                    PathNode.LineTo(123.76f, 156.24f),
                    PathNode.CurveTo(126.12408f, 158.44287f, 129.80807f, 158.37787f, 132.09297f, 156.09297f),
                    PathNode.CurveTo(134.37787f, 153.80807f, 134.44287f, 150.12408f, 132.24f, 147.76f),
                    PathNode.LineTo(94.49f, 110.0f),
                    PathNode.LineTo(128.0f, 110.0f),
                    PathNode.CurveTo(177.68279f, 110.055115f, 217.94489f, 150.31721f, 218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 203.3137f, 220.6863f, 206.0f, 224.0f, 206.0f),
                    PathNode.CurveTo(227.3137f, 206.0f, 230.0f, 203.3137f, 230.0f, 200.0f),
                    PathNode.CurveTo(229.93387f, 143.69437f, 184.30563f, 98.06612f, 128.0f, 98.0f),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
