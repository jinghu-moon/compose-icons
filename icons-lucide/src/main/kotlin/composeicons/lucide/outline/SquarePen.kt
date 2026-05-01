package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquarePen: ImageVector
    get() {
        if (_squarePen != null) return _squarePen!!
        _squarePen = lucideOutlineIcon(
            name = "SquarePen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(20.10457f, 21.0f, 21.0f, 20.10457f, 21.0f, 19.0f),
                    PathNode.LineTo(21.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.375f, 2.625f),
                    PathNode.CurveTo(19.203426f, 1.796573f, 20.546574f, 1.796573f, 21.375f, 2.625f),
                    PathNode.CurveTo(22.203426f, 3.453427f, 22.203426f, 4.796573f, 21.375f, 5.625f),
                    PathNode.LineTo(12.362f, 14.639f),
                    PathNode.CurveTo(12.124549f, 14.876246f, 11.831205f, 15.049913f, 11.509f, 15.144f),
                    PathNode.LineTo(8.636f, 15.984f),
                    PathNode.CurveTo(8.460735f, 16.035118f, 8.271542f, 15.986649f, 8.142447f, 15.857553f),
                    PathNode.CurveTo(8.013352f, 15.728458f, 7.964881f, 15.539265f, 8.016f, 15.364f),
                    PathNode.LineTo(8.856f, 12.491f),
                    PathNode.CurveTo(8.950526f, 12.169051f, 9.124534f, 11.876058f, 9.362f, 11.639f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _squarePen!!
    }

private var _squarePen: ImageVector? = null
