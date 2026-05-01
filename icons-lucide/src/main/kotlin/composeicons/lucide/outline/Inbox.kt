package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Inbox: ImageVector
    get() {
        if (_inbox != null) return _inbox!!
        _inbox = lucideOutlineIcon(
            name = "Inbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(2.0f, 12.0f)
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
                    PathNode.MoveTo(5.45f, 5.11f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.10457f, 2.895431f, 20.0f, 4.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(21.10457f, 20.0f, 22.0f, 19.10457f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(18.55f, 5.11f),
                    PathNode.CurveTo(18.21227f, 4.430342f, 17.518944f, 4.000403f, 16.76f, 4.0f),
                    PathNode.LineTo(7.24f, 4.0f),
                    PathNode.CurveTo(6.481056f, 4.000403f, 5.78773f, 4.430342f, 5.45f, 5.11f),
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
        return _inbox!!
    }

private var _inbox: ImageVector? = null
