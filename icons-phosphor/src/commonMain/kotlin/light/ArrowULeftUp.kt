package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorLightIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 80.0f),
                    PathNode.LineTo(206.0f, 168.0f),
                    PathNode.CurveTo(206.0f, 202.24165f, 178.24165f, 230.0f, 144.0f, 230.0f),
                    PathNode.CurveTo(109.75835f, 230.0f, 82.0f, 202.24165f, 82.0f, 168.0f),
                    PathNode.LineTo(82.0f, 46.49f),
                    PathNode.LineTo(44.24f, 84.24f),
                    PathNode.CurveTo(41.875923f, 86.44287f, 38.19192f, 86.37787f, 35.907024f, 84.09297f),
                    PathNode.CurveTo(33.622128f, 81.808075f, 33.55713f, 78.12408f, 35.76f, 75.76f),
                    PathNode.LineTo(83.76f, 27.76f),
                    PathNode.CurveTo(86.10254f, 25.420374f, 89.89746f, 25.420374f, 92.24f, 27.76f),
                    PathNode.LineTo(140.24f, 75.76f),
                    PathNode.CurveTo(141.84523f, 77.25577f, 142.506f, 79.508446f, 141.96309f, 81.6343f),
                    PathNode.CurveTo(141.42018f, 83.76018f, 139.76018f, 85.42017f, 137.63431f, 85.96308f),
                    PathNode.CurveTo(135.50844f, 86.506f, 133.25577f, 85.84522f, 131.76f, 84.24f),
                    PathNode.LineTo(94.0f, 46.49f),
                    PathNode.LineTo(94.0f, 168.0f),
                    PathNode.CurveTo(94.0f, 195.61424f, 116.385765f, 218.0f, 144.0f, 218.0f),
                    PathNode.CurveTo(171.61424f, 218.0f, 194.0f, 195.61424f, 194.0f, 168.0f),
                    PathNode.LineTo(194.0f, 80.0f),
                    PathNode.CurveTo(194.0f, 76.686295f, 196.6863f, 74.0f, 200.0f, 74.0f),
                    PathNode.CurveTo(203.3137f, 74.0f, 206.0f, 76.686295f, 206.0f, 80.0f),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
