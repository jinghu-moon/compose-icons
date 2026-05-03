package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorBoldIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(143.15459f, 179.95146f, 157.75969f, 185.67194f, 168.85f, 196.0f),
                    PathNode.LineTo(87.15f, 196.0f),
                    PathNode.CurveTo(98.24031f, 185.67194f, 112.84541f, 179.95146f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(199.56f, 196.0f),
                    PathNode.CurveTo(191.27696f, 182.42133f, 179.28625f, 171.4923f, 165.0f, 164.5f),
                    PathNode.CurveTo(185.11942f, 144.126f, 184.9819f, 111.32044f, 164.69241f, 91.115814f),
                    PathNode.CurveTo(144.40292f, 70.911194f, 111.59708f, 70.911194f, 91.30759f, 91.115814f),
                    PathNode.CurveTo(71.0181f, 111.32044f, 70.88059f, 144.126f, 91.0f, 164.5f),
                    PathNode.CurveTo(76.71375f, 171.4923f, 64.723045f, 182.42133f, 56.44f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
