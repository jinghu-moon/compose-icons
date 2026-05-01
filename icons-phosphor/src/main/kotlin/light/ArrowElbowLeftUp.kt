package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorLightIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 192.0f),
                    PathNode.CurveTo(238.0f, 195.3137f, 235.3137f, 198.0f, 232.0f, 198.0f),
                    PathNode.LineTo(88.0f, 198.0f),
                    PathNode.CurveTo(84.686295f, 198.0f, 82.0f, 195.3137f, 82.0f, 192.0f),
                    PathNode.LineTo(82.0f, 62.49f),
                    PathNode.LineTo(44.24f, 100.24f),
                    PathNode.CurveTo(41.875923f, 102.44287f, 38.19192f, 102.37787f, 35.907024f, 100.09297f),
                    PathNode.CurveTo(33.622128f, 97.808075f, 33.55713f, 94.12408f, 35.76f, 91.76f),
                    PathNode.LineTo(83.76f, 43.76f),
                    PathNode.CurveTo(86.10254f, 41.420372f, 89.89746f, 41.420372f, 92.24f, 43.76f),
                    PathNode.LineTo(140.24f, 91.76f),
                    PathNode.CurveTo(141.84523f, 93.25577f, 142.506f, 95.508446f, 141.96309f, 97.6343f),
                    PathNode.CurveTo(141.42018f, 99.76018f, 139.76018f, 101.42017f, 137.63431f, 101.96308f),
                    PathNode.CurveTo(135.50844f, 102.506f, 133.25577f, 101.84522f, 131.76f, 100.24f),
                    PathNode.LineTo(94.0f, 62.49f),
                    PathNode.LineTo(94.0f, 186.0f),
                    PathNode.LineTo(232.0f, 186.0f),
                    PathNode.CurveTo(235.3137f, 186.0f, 238.0f, 188.6863f, 238.0f, 192.0f),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
