package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorLightIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 172.24f),
                    PathNode.LineTo(180.24f, 220.24f),
                    PathNode.CurveTo(177.87592f, 222.44287f, 174.19193f, 222.37787f, 171.90703f, 220.09297f),
                    PathNode.CurveTo(169.62213f, 217.80807f, 169.55713f, 214.12408f, 171.76f, 211.76f),
                    PathNode.LineTo(209.51f, 174.0f),
                    PathNode.LineTo(88.0f, 174.0f),
                    PathNode.CurveTo(53.758347f, 174.0f, 26.0f, 146.24165f, 26.0f, 112.0f),
                    PathNode.CurveTo(26.0f, 77.75835f, 53.758347f, 50.0f, 88.0f, 50.0f),
                    PathNode.LineTo(176.0f, 50.0f),
                    PathNode.CurveTo(179.3137f, 50.0f, 182.0f, 52.68629f, 182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 59.31371f, 179.3137f, 62.0f, 176.0f, 62.0f),
                    PathNode.LineTo(88.0f, 62.0f),
                    PathNode.CurveTo(60.38576f, 62.0f, 38.0f, 84.385765f, 38.0f, 112.0f),
                    PathNode.CurveTo(38.0f, 139.61424f, 60.38576f, 162.0f, 88.0f, 162.0f),
                    PathNode.LineTo(209.51f, 162.0f),
                    PathNode.LineTo(171.76f, 124.24f),
                    PathNode.CurveTo(169.55713f, 121.87592f, 169.62213f, 118.191925f, 171.90703f, 115.90703f),
                    PathNode.CurveTo(174.19193f, 113.62213f, 177.87592f, 113.55713f, 180.24f, 115.76f),
                    PathNode.LineTo(228.24f, 163.76f),
                    PathNode.CurveTo(230.57962f, 166.10254f, 230.57962f, 169.89746f, 228.24f, 172.24f),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
