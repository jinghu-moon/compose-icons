package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCaseToggle: ImageVector
    get() {
        if (_letterCaseToggle != null) return _letterCaseToggle!!
        _letterCaseToggle = tablerOutlineIcon(
            name = "LetterCaseToggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.5f),
                    PathNode.CurveTo(3.0f, 17.432997f, 4.567004f, 19.0f, 6.5f, 19.0f),
                    PathNode.CurveTo(8.432997f, 19.0f, 10.0f, 17.432997f, 10.0f, 15.5f),
                    PathNode.CurveTo(10.0f, 13.567003f, 8.432997f, 12.0f, 6.5f, 12.0f),
                    PathNode.CurveTo(4.567004f, 12.0f, 3.0f, 13.567003f, 3.0f, 15.5f)
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
                    PathNode.MoveTo(14.0f, 19.0f),
                    PathNode.LineTo(14.0f, 8.5f),
                    PathNode.CurveTo(14.0f, 6.567004f, 15.567003f, 5.0f, 17.5f, 5.0f),
                    PathNode.CurveTo(19.432997f, 5.0f, 21.0f, 6.567004f, 21.0f, 8.5f),
                    PathNode.LineTo(21.0f, 19.0f)
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
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 19.0f)
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
        return _letterCaseToggle!!
    }

private var _letterCaseToggle: ImageVector? = null
