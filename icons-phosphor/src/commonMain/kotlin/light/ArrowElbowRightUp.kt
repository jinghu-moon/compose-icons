package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorLightIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 100.24f),
                    PathNode.CurveTo(217.89746f, 102.57962f, 214.10254f, 102.57962f, 211.76f, 100.24f),
                    PathNode.LineTo(174.0f, 62.49f),
                    PathNode.LineTo(174.0f, 192.0f),
                    PathNode.CurveTo(174.0f, 195.3137f, 171.3137f, 198.0f, 168.0f, 198.0f),
                    PathNode.LineTo(24.0f, 198.0f),
                    PathNode.CurveTo(20.68629f, 198.0f, 18.0f, 195.3137f, 18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 188.6863f, 20.68629f, 186.0f, 24.0f, 186.0f),
                    PathNode.LineTo(162.0f, 186.0f),
                    PathNode.LineTo(162.0f, 62.49f),
                    PathNode.LineTo(124.24f, 100.24f),
                    PathNode.CurveTo(121.87592f, 102.44287f, 118.191925f, 102.37787f, 115.90703f, 100.09297f),
                    PathNode.CurveTo(113.62213f, 97.808075f, 113.55713f, 94.12408f, 115.76f, 91.76f),
                    PathNode.LineTo(163.76f, 43.76f),
                    PathNode.CurveTo(166.10254f, 41.420372f, 169.89746f, 41.420372f, 172.24f, 43.76f),
                    PathNode.LineTo(220.24f, 91.76f),
                    PathNode.CurveTo(222.57962f, 94.10254f, 222.57962f, 97.89746f, 220.24f, 100.24f),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
