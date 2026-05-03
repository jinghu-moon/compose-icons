package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnDown: ImageVector
    get() {
        if (_sTurnDown != null) return _sTurnDown!!
        _sTurnDown = tablerOutlineIcon(
            name = "STurnDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 6.10457f, 6.10457f, 7.0f, 5.0f, 7.0f),
                    PathNode.CurveTo(3.895431f, 7.0f, 3.0f, 6.10457f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(6.10457f, 3.0f, 7.0f, 3.895431f, 7.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.LineTo(5.0f, 16.5f),
                    PathNode.CurveTo(5.0f, 18.432997f, 6.567004f, 20.0f, 8.5f, 20.0f),
                    PathNode.CurveTo(10.432997f, 20.0f, 12.0f, 18.432997f, 12.0f, 16.5f),
                    PathNode.LineTo(12.0f, 7.5f),
                    PathNode.CurveTo(12.0f, 5.567004f, 13.567003f, 4.0f, 15.5f, 4.0f),
                    PathNode.CurveTo(17.432997f, 4.0f, 19.0f, 5.567004f, 19.0f, 7.5f),
                    PathNode.LineTo(19.0f, 21.0f)
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
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(22.0f, 18.0f)
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
        return _sTurnDown!!
    }

private var _sTurnDown: ImageVector? = null
