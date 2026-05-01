package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedChevronsUp: ImageVector
    get() {
        if (_squareRoundedChevronsUp != null) return _squareRoundedChevronsUp!!
        _squareRoundedChevronsUp = tablerOutlineIcon(
            name = "SquareRoundedChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(15.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(19.2f, 3.0f, 21.0f, 4.8f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 19.2f, 19.2f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(4.8f, 21.0f, 3.0f, 19.2f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 4.8f, 4.8f, 3.0f, 12.0f, 3.0f)
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
        return _squareRoundedChevronsUp!!
    }

private var _squareRoundedChevronsUp: ImageVector? = null
