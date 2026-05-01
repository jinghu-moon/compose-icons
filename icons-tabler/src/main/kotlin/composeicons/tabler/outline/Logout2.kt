package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Logout2: ImageVector
    get() {
        if (_logout2 != null) return _logout2!!
        _logout2 = tablerOutlineIcon(
            name = "Logout2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(10.0f, 4.895431f, 10.895431f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.10457f, 4.0f, 21.0f, 4.895431f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.10457f, 20.10457f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(10.895431f, 20.0f, 10.0f, 19.10457f, 10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 16.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(6.0f, 9.0f)
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
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.LineTo(3.0f, 12.0f)
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
        return _logout2!!
    }

private var _logout2: ImageVector? = null
