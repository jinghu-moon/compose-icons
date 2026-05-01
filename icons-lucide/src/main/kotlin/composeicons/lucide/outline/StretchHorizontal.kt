package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StretchHorizontal: ImageVector
    get() {
        if (_stretchHorizontal != null) return _stretchHorizontal!!
        _stretchHorizontal = lucideOutlineIcon(
            name = "StretchHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(21.10457f, 4.0f, 22.0f, 4.895431f, 22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 9.104569f, 21.10457f, 10.0f, 20.0f, 10.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(2.895431f, 10.0f, 2.0f, 9.104569f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 4.895431f, 2.895431f, 4.0f, 4.0f, 4.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(21.10457f, 14.0f, 22.0f, 14.895431f, 22.0f, 16.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.10457f, 21.10457f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 14.895431f, 2.895431f, 14.0f, 4.0f, 14.0f),
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
        return _stretchHorizontal!!
    }

private var _stretchHorizontal: ImageVector? = null
