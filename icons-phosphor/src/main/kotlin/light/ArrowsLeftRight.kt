package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorLightIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 171.76f),
                    PathNode.CurveTo(214.57962f, 174.10254f, 214.57962f, 177.89746f, 212.24f, 180.24f),
                    PathNode.LineTo(180.24f, 212.24f),
                    PathNode.CurveTo(177.87592f, 214.44287f, 174.19193f, 214.37787f, 171.90703f, 212.09297f),
                    PathNode.CurveTo(169.62213f, 209.80807f, 169.55713f, 206.12408f, 171.76f, 203.76f),
                    PathNode.LineTo(193.51f, 182.0f),
                    PathNode.LineTo(48.0f, 182.0f),
                    PathNode.CurveTo(44.68629f, 182.0f, 42.0f, 179.3137f, 42.0f, 176.0f),
                    PathNode.CurveTo(42.0f, 172.6863f, 44.68629f, 170.0f, 48.0f, 170.0f),
                    PathNode.LineTo(193.51f, 170.0f),
                    PathNode.LineTo(171.76f, 148.24f),
                    PathNode.CurveTo(169.55713f, 145.87592f, 169.62213f, 142.19193f, 171.90703f, 139.90703f),
                    PathNode.CurveTo(174.19193f, 137.62213f, 177.87592f, 137.55713f, 180.24f, 139.76f),
                    PathNode.Close,
                    PathNode.MoveTo(75.76f, 116.24f),
                    PathNode.CurveTo(78.12408f, 118.44287f, 81.808075f, 118.37787f, 84.09297f, 116.09297f),
                    PathNode.CurveTo(86.37787f, 113.808075f, 86.44287f, 110.12408f, 84.24f, 107.76f),
                    PathNode.LineTo(62.49f, 86.0f),
                    PathNode.LineTo(208.0f, 86.0f),
                    PathNode.CurveTo(211.3137f, 86.0f, 214.0f, 83.313705f, 214.0f, 80.0f),
                    PathNode.CurveTo(214.0f, 76.686295f, 211.3137f, 74.0f, 208.0f, 74.0f),
                    PathNode.LineTo(62.49f, 74.0f),
                    PathNode.LineTo(84.24f, 52.24f),
                    PathNode.CurveTo(86.44287f, 49.875923f, 86.37787f, 46.19192f, 84.09297f, 43.907024f),
                    PathNode.CurveTo(81.808075f, 41.622128f, 78.12408f, 41.55713f, 75.76f, 43.76f),
                    PathNode.LineTo(43.76f, 75.76f),
                    PathNode.CurveTo(41.420372f, 78.10254f, 41.420372f, 81.89746f, 43.76f, 84.24f),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
