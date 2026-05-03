package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorLightIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.24f, 171.76f),
                    PathNode.CurveTo(118.57962f, 174.10254f, 118.57962f, 177.89746f, 116.24f, 180.24f),
                    PathNode.LineTo(84.24f, 212.24f),
                    PathNode.CurveTo(81.89746f, 214.57962f, 78.10254f, 214.57962f, 75.76f, 212.24f),
                    PathNode.LineTo(43.76f, 180.24f),
                    PathNode.CurveTo(41.55713f, 177.87592f, 41.622128f, 174.19193f, 43.907024f, 171.90703f),
                    PathNode.CurveTo(46.19192f, 169.62213f, 49.875923f, 169.55713f, 52.24f, 171.76f),
                    PathNode.LineTo(74.0f, 193.51f),
                    PathNode.LineTo(74.0f, 48.0f),
                    PathNode.CurveTo(74.0f, 44.68629f, 76.686295f, 42.0f, 80.0f, 42.0f),
                    PathNode.CurveTo(83.313705f, 42.0f, 86.0f, 44.68629f, 86.0f, 48.0f),
                    PathNode.LineTo(86.0f, 193.51f),
                    PathNode.LineTo(107.76f, 171.76f),
                    PathNode.CurveTo(110.10254f, 169.42038f, 113.89746f, 169.42038f, 116.24f, 171.76f),
                    PathNode.Close,
                    PathNode.MoveTo(212.24f, 75.76f),
                    PathNode.LineTo(180.24f, 43.76f),
                    PathNode.CurveTo(177.89746f, 41.420372f, 174.10254f, 41.420372f, 171.76f, 43.76f),
                    PathNode.LineTo(139.76f, 75.76f),
                    PathNode.CurveTo(137.55713f, 78.12408f, 137.62213f, 81.808075f, 139.90703f, 84.09297f),
                    PathNode.CurveTo(142.19193f, 86.37787f, 145.87592f, 86.44287f, 148.24f, 84.24f),
                    PathNode.LineTo(170.0f, 62.49f),
                    PathNode.LineTo(170.0f, 208.0f),
                    PathNode.CurveTo(170.0f, 211.3137f, 172.6863f, 214.0f, 176.0f, 214.0f),
                    PathNode.CurveTo(179.3137f, 214.0f, 182.0f, 211.3137f, 182.0f, 208.0f),
                    PathNode.LineTo(182.0f, 62.49f),
                    PathNode.LineTo(203.76f, 84.24f),
                    PathNode.CurveTo(206.12408f, 86.44287f, 209.80807f, 86.37787f, 212.09297f, 84.09297f),
                    PathNode.CurveTo(214.37787f, 81.808075f, 214.44287f, 78.12408f, 212.24f, 75.76f),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
