package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorLightIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 180.24f),
                    PathNode.LineTo(172.24f, 228.24f),
                    PathNode.CurveTo(169.89746f, 230.57962f, 166.10254f, 230.57962f, 163.76f, 228.24f),
                    PathNode.LineTo(115.76f, 180.24f),
                    PathNode.CurveTo(113.55713f, 177.87592f, 113.62213f, 174.19193f, 115.90703f, 171.90703f),
                    PathNode.CurveTo(118.191925f, 169.62213f, 121.87592f, 169.55713f, 124.24f, 171.76f),
                    PathNode.LineTo(162.0f, 209.51f),
                    PathNode.LineTo(162.0f, 88.0f),
                    PathNode.CurveTo(162.0f, 60.38576f, 139.61424f, 38.0f, 112.0f, 38.0f),
                    PathNode.CurveTo(84.385765f, 38.0f, 62.0f, 60.38576f, 62.0f, 88.0f),
                    PathNode.LineTo(62.0f, 176.0f),
                    PathNode.CurveTo(62.0f, 179.3137f, 59.31371f, 182.0f, 56.0f, 182.0f),
                    PathNode.CurveTo(52.68629f, 182.0f, 50.0f, 179.3137f, 50.0f, 176.0f),
                    PathNode.LineTo(50.0f, 88.0f),
                    PathNode.CurveTo(50.0f, 53.758347f, 77.75835f, 26.0f, 112.0f, 26.0f),
                    PathNode.CurveTo(146.24165f, 26.0f, 174.0f, 53.758347f, 174.0f, 88.0f),
                    PathNode.LineTo(174.0f, 209.51f),
                    PathNode.LineTo(211.76f, 171.76f),
                    PathNode.CurveTo(214.12408f, 169.55713f, 217.80807f, 169.62213f, 220.09297f, 171.90703f),
                    PathNode.CurveTo(222.37787f, 174.19193f, 222.44287f, 177.87592f, 220.24f, 180.24f),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
