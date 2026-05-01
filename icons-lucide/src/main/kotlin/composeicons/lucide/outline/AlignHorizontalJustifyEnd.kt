package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalJustifyEnd: ImageVector
    get() {
        if (_alignHorizontalJustifyEnd != null) return _alignHorizontalJustifyEnd!!
        _alignHorizontalJustifyEnd = lucideOutlineIcon(
            name = "AlignHorizontalJustifyEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(7.10457f, 5.0f, 8.0f, 5.895431f, 8.0f, 7.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 18.10457f, 7.10457f, 19.0f, 6.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(2.895431f, 19.0f, 2.0f, 18.10457f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.895431f, 2.895431f, 5.0f, 4.0f, 5.0f),
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(17.10457f, 7.0f, 18.0f, 7.895431f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 16.10457f, 17.10457f, 17.0f, 16.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(12.895431f, 17.0f, 12.0f, 16.10457f, 12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 7.895431f, 12.895431f, 7.0f, 14.0f, 7.0f),
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
                    PathNode.MoveTo(22.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _alignHorizontalJustifyEnd!!
    }

private var _alignHorizontalJustifyEnd: ImageVector? = null
