package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorLightIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 144.0f),
                    PathNode.CurveTo(229.96143f, 178.22566f, 202.22566f, 205.96143f, 168.0f, 206.0f),
                    PathNode.LineTo(80.0f, 206.0f),
                    PathNode.CurveTo(76.686295f, 206.0f, 74.0f, 203.3137f, 74.0f, 200.0f),
                    PathNode.CurveTo(74.0f, 196.6863f, 76.686295f, 194.0f, 80.0f, 194.0f),
                    PathNode.LineTo(168.0f, 194.0f),
                    PathNode.CurveTo(195.61424f, 194.0f, 218.0f, 171.61424f, 218.0f, 144.0f),
                    PathNode.CurveTo(218.0f, 116.385765f, 195.61424f, 94.0f, 168.0f, 94.0f),
                    PathNode.LineTo(46.49f, 94.0f),
                    PathNode.LineTo(84.24f, 131.76f),
                    PathNode.CurveTo(85.84522f, 133.25577f, 86.506f, 135.50844f, 85.96308f, 137.63431f),
                    PathNode.CurveTo(85.42017f, 139.76018f, 83.76018f, 141.42018f, 81.6343f, 141.96309f),
                    PathNode.CurveTo(79.508446f, 142.506f, 77.25577f, 141.84523f, 75.76f, 140.24f),
                    PathNode.LineTo(27.76f, 92.24f),
                    PathNode.CurveTo(25.420374f, 89.89746f, 25.420374f, 86.10254f, 27.76f, 83.76f),
                    PathNode.LineTo(75.76f, 35.76f),
                    PathNode.CurveTo(78.12408f, 33.55713f, 81.808075f, 33.622128f, 84.09297f, 35.907024f),
                    PathNode.CurveTo(86.37787f, 38.19192f, 86.44287f, 41.875923f, 84.24f, 44.24f),
                    PathNode.LineTo(46.49f, 82.0f),
                    PathNode.LineTo(168.0f, 82.0f),
                    PathNode.CurveTo(202.22566f, 82.038574f, 229.96143f, 109.77434f, 230.0f, 144.0f),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
