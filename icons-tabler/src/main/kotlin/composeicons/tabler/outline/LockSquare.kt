package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockSquare: ImageVector
    get() {
        if (_lockSquare != null) return _lockSquare!!
        _lockSquare = tablerOutlineIcon(
            name = "LockSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 11.447715f, 8.447715f, 11.0f, 9.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.552285f, 11.0f, 16.0f, 11.447715f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 15.552285f, 15.552285f, 16.0f, 15.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.447715f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 7.895431f, 10.895431f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 7.895431f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 11.0f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 4.895431f, 4.895431f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 6.0f)
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
        return _lockSquare!!
    }

private var _lockSquare: ImageVector? = null
