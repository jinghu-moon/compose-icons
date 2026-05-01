package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = tablerOutlineIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 8.447715f, 3.447715f, 8.0f, 4.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.552284f, 8.0f, 21.0f, 8.447715f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 11.552285f, 20.552284f, 12.0f, 20.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(3.447715f, 12.0f, 3.0f, 11.552285f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 12.0f)
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
                    PathNode.MoveTo(7.5f, 8.0f),
                    PathNode.CurveTo(6.119288f, 8.0f, 5.0f, 6.880712f, 5.0f, 5.5f),
                    PathNode.CurveTo(5.0f, 4.119288f, 6.119288f, 3.0f, 7.5f, 3.0f),
                    PathNode.CurveTo(9.474232f, 2.965603f, 11.25973f, 4.949492f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.74027f, 4.949492f, 14.525768f, 2.965603f, 16.5f, 3.0f),
                    PathNode.CurveTo(17.880713f, 3.0f, 19.0f, 4.119288f, 19.0f, 5.5f),
                    PathNode.CurveTo(19.0f, 6.880712f, 17.880713f, 8.0f, 16.5f, 8.0f)
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
        return _gift!!
    }

private var _gift: ImageVector? = null
