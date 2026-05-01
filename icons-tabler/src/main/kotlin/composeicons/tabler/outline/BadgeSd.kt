package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerOutlineIcon(
            name = "BadgeSd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 5.895431f, 3.895431f, 5.0f, 5.0f, 5.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.10457f, 5.0f, 21.0f, 5.895431f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 18.10457f, 20.10457f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.895431f, 19.0f, 3.0f, 18.10457f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(16.10457f, 15.0f, 17.0f, 14.104569f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.0f, 9.895431f, 16.10457f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f)
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
                    PathNode.MoveTo(7.0f, 14.25f),
                    PathNode.CurveTo(7.0f, 14.664f, 7.336f, 15.0f, 7.75f, 15.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.552285f, 15.0f, 10.0f, 14.552285f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 12.447715f, 9.552285f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.447716f, 12.0f, 7.0f, 11.552285f, 7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 9.447715f, 7.447716f, 9.0f, 8.0f, 9.0f),
                    PathNode.LineTo(9.25f, 9.0f),
                    PathNode.CurveTo(9.664213f, 9.0f, 10.0f, 9.335787f, 10.0f, 9.75f)
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
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
