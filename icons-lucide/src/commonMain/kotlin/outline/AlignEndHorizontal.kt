package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignEndHorizontal: ImageVector
    get() {
        if (_alignEndHorizontal != null) return _alignEndHorizontal!!
        _alignEndHorizontal = lucideOutlineIcon(
            name = "AlignEndHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 2.0f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.CurveTo(9.104569f, 2.0f, 10.0f, 2.895431f, 10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 17.10457f, 9.104569f, 18.0f, 8.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(4.895431f, 18.0f, 4.0f, 17.10457f, 4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.CurveTo(19.10457f, 9.0f, 20.0f, 9.895431f, 20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 17.10457f, 19.10457f, 18.0f, 18.0f, 18.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(14.895431f, 18.0f, 14.0f, 17.10457f, 14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 9.895431f, 14.895431f, 9.0f, 16.0f, 9.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.LineTo(2.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _alignEndHorizontal!!
    }

private var _alignEndHorizontal: ImageVector? = null
