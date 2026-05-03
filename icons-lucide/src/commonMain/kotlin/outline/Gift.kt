package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = lucideOutlineIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 11.0f)
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
                    PathNode.MoveTo(7.5f, 7.0f),
                    PathNode.CurveTo(6.119288f, 7.0f, 5.0f, 5.880712f, 5.0f, 4.5f),
                    PathNode.CurveTo(5.0f, 3.119288f, 6.119288f, 2.0f, 7.5f, 2.0f),
                    PathNode.CurveTo(9.474232f, 1.965604f, 11.25973f, 3.949492f, 12.0f, 7.0f),
                    PathNode.CurveTo(12.74027f, 3.949492f, 14.525768f, 1.965604f, 16.5f, 2.0f),
                    PathNode.CurveTo(17.880713f, 2.0f, 19.0f, 3.119288f, 19.0f, 4.5f),
                    PathNode.CurveTo(19.0f, 5.880712f, 17.880713f, 7.0f, 16.5f, 7.0f)
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
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.552284f, 7.0f, 21.0f, 7.447716f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 10.552285f, 20.552284f, 11.0f, 20.0f, 11.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(3.447715f, 11.0f, 3.0f, 10.552285f, 3.0f, 10.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 7.447716f, 3.447715f, 7.0f, 4.0f, 7.0f),
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
        }
        return _gift!!
    }

private var _gift: ImageVector? = null
