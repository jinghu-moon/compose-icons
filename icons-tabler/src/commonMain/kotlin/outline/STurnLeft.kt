package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnLeft: ImageVector
    get() {
        if (_sTurnLeft != null) return _sTurnLeft!!
        _sTurnLeft = tablerOutlineIcon(
            name = "STurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.CurveTo(17.89543f, 7.0f, 17.0f, 6.10457f, 17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 3.895431f, 17.89543f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.10457f, 20.10457f, 7.0f, 19.0f, 7.0f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(7.5f, 5.0f),
                    PathNode.CurveTo(5.567004f, 5.0f, 4.0f, 6.567004f, 4.0f, 8.5f),
                    PathNode.CurveTo(4.0f, 10.432997f, 5.567004f, 12.0f, 7.5f, 12.0f),
                    PathNode.LineTo(16.5f, 12.0f),
                    PathNode.CurveTo(18.432997f, 12.0f, 20.0f, 13.567003f, 20.0f, 15.5f),
                    PathNode.CurveTo(20.0f, 17.432997f, 18.432997f, 19.0f, 16.5f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f)
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.LineTo(6.0f, 22.0f)
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
        return _sTurnLeft!!
    }

private var _sTurnLeft: ImageVector? = null
