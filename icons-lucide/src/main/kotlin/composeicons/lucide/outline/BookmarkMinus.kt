package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookmarkMinus: ImageVector
    get() {
        if (_bookmarkMinus != null) return _bookmarkMinus!!
        _bookmarkMinus = lucideOutlineIcon(
            name = "BookmarkMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f)
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
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.CurveTo(18.10457f, 3.0f, 19.0f, 3.895431f, 19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(18.999886f, 20.356384f, 18.810112f, 20.685774f, 18.501856f, 20.864628f),
                    PathNode.CurveTo(18.193602f, 21.043482f, 17.813456f, 21.044767f, 17.504f, 20.868f),
                    PathNode.LineTo(12.992f, 18.29f),
                    PathNode.CurveTo(12.377276f, 17.93886f, 11.622724f, 17.93886f, 11.008f, 18.29f),
                    PathNode.LineTo(6.496f, 20.868f),
                    PathNode.CurveTo(6.186544f, 21.044767f, 5.806399f, 21.043482f, 5.498143f, 20.864628f),
                    PathNode.CurveTo(5.189889f, 20.685774f, 5.000115f, 20.356384f, 5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
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
        return _bookmarkMinus!!
    }

private var _bookmarkMinus: ImageVector? = null
