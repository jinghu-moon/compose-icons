package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Friends: ImageVector
    get() {
        if (_friends != null) return _friends!!
        _friends = tablerOutlineIcon(
            name = "Friends",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 6.10457f, 5.895431f, 7.0f, 7.0f, 7.0f),
                    PathNode.CurveTo(8.10457f, 7.0f, 9.0f, 6.10457f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.895431f, 8.10457f, 3.0f, 7.0f, 3.0f),
                    PathNode.CurveTo(5.895431f, 3.0f, 5.0f, 3.895431f, 5.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 22.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 11.447715f, 4.447716f, 11.0f, 5.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.552285f, 11.0f, 10.0f, 11.447715f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 22.0f)
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 6.10457f, 15.895431f, 7.0f, 17.0f, 7.0f),
                    PathNode.CurveTo(18.10457f, 7.0f, 19.0f, 6.10457f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 3.895431f, 18.10457f, 3.0f, 17.0f, 3.0f),
                    PathNode.CurveTo(15.895431f, 3.0f, 15.0f, 3.895431f, 15.0f, 5.0f)
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
                    PathNode.MoveTo(15.0f, 22.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 11.447715f, 15.447715f, 11.0f, 16.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.552284f, 11.0f, 19.0f, 11.447715f, 19.0f, 12.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _friends!!
    }

private var _friends: ImageVector? = null
