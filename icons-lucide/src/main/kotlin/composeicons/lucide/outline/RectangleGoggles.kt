package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleGoggles: ImageVector
    get() {
        if (_rectangleGoggles != null) return _rectangleGoggles!!
        _rectangleGoggles = lucideOutlineIcon(
            name = "RectangleGoggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.10457f, 21.10457f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(15.370485f, 18.0f, 14.777709f, 17.703611f, 14.4f, 17.2f),
                    PathNode.LineTo(12.8f, 15.07f),
                    PathNode.CurveTo(12.611146f, 14.818194f, 12.314757f, 14.67f, 12.0f, 14.67f),
                    PathNode.CurveTo(11.685243f, 14.67f, 11.388854f, 14.818194f, 11.2f, 15.07f),
                    PathNode.LineTo(9.6f, 17.2f),
                    PathNode.CurveTo(9.222291f, 17.703611f, 8.629515f, 18.0f, 8.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
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
        return _rectangleGoggles!!
    }

private var _rectangleGoggles: ImageVector? = null
