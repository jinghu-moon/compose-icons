package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorLightIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 84.24f),
                    PathNode.CurveTo(217.89746f, 86.57962f, 214.10254f, 86.57962f, 211.76f, 84.24f),
                    PathNode.LineTo(174.0f, 46.49f),
                    PathNode.LineTo(174.0f, 168.0f),
                    PathNode.CurveTo(174.0f, 202.24165f, 146.24165f, 230.0f, 112.0f, 230.0f),
                    PathNode.CurveTo(77.75835f, 230.0f, 50.0f, 202.24165f, 50.0f, 168.0f),
                    PathNode.LineTo(50.0f, 80.0f),
                    PathNode.CurveTo(50.0f, 76.686295f, 52.68629f, 74.0f, 56.0f, 74.0f),
                    PathNode.CurveTo(59.31371f, 74.0f, 62.0f, 76.686295f, 62.0f, 80.0f),
                    PathNode.LineTo(62.0f, 168.0f),
                    PathNode.CurveTo(62.0f, 195.61424f, 84.385765f, 218.0f, 112.0f, 218.0f),
                    PathNode.CurveTo(139.61424f, 218.0f, 162.0f, 195.61424f, 162.0f, 168.0f),
                    PathNode.LineTo(162.0f, 46.49f),
                    PathNode.LineTo(124.24f, 84.24f),
                    PathNode.CurveTo(121.87592f, 86.44287f, 118.191925f, 86.37787f, 115.90703f, 84.09297f),
                    PathNode.CurveTo(113.62213f, 81.808075f, 113.55713f, 78.12408f, 115.76f, 75.76f),
                    PathNode.LineTo(163.76f, 27.76f),
                    PathNode.CurveTo(166.10254f, 25.420374f, 169.89746f, 25.420374f, 172.24f, 27.76f),
                    PathNode.LineTo(220.24f, 75.76f),
                    PathNode.CurveTo(222.57962f, 78.10254f, 222.57962f, 81.89746f, 220.24f, 84.24f),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
