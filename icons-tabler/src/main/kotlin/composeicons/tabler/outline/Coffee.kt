package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = tablerOutlineIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.83f, 14.642f, 5.077f, 15.017f, 6.5f, 15.0f),
                    PathNode.CurveTo(7.923f, 15.017f, 9.17f, 14.642f, 10.0f, 14.0f),
                    PathNode.CurveTo(10.83f, 13.358f, 12.077f, 12.983f, 13.5f, 13.0f),
                    PathNode.CurveTo(14.923f, 12.983f, 16.17f, 13.358f, 17.0f, 14.0f)
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
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.CurveTo(7.357493f, 3.461177f, 6.983437f, 4.209288f, 7.0f, 5.0f),
                    PathNode.CurveTo(6.983437f, 5.790712f, 7.357493f, 6.538824f, 8.0f, 7.0f)
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
                    PathNode.CurveTo(11.357492f, 3.461177f, 10.983437f, 4.209288f, 11.0f, 5.0f),
                    PathNode.CurveTo(10.983437f, 5.790712f, 11.357492f, 6.538824f, 12.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.0f, 18.31371f, 14.313708f, 21.0f, 11.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(5.686292f, 21.0f, 3.0f, 18.31371f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 10.0f)
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
                    PathNode.MoveTo(16.746f, 16.726f),
                    PathNode.CurveTo(17.974825f, 17.290112f, 19.429155f, 16.962488f, 20.297396f, 15.925961f),
                    PathNode.CurveTo(21.165638f, 14.889434f, 21.233196f, 13.400188f, 20.462372f, 12.289306f),
                    PathNode.CurveTo(19.691547f, 11.178423f, 18.272854f, 10.720467f, 16.998f, 11.171f)
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
