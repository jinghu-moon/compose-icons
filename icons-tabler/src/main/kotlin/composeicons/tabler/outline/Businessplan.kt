package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Businessplan: ImageVector
    get() {
        if (_businessplan != null) return _businessplan!!
        _businessplan = tablerOutlineIcon(
            name = "Businessplan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 7.656854f, 13.238576f, 9.0f, 16.0f, 9.0f),
                    PathNode.CurveTo(18.761423f, 9.0f, 21.0f, 7.656854f, 21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 4.343146f, 18.761423f, 3.0f, 16.0f, 3.0f),
                    PathNode.CurveTo(13.238576f, 3.0f, 11.0f, 4.343146f, 11.0f, 6.0f)
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
                    PathNode.MoveTo(11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 11.657f, 13.239f, 13.0f, 16.0f, 13.0f),
                    PathNode.CurveTo(18.761f, 13.0f, 21.0f, 11.657f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 6.0f)
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
                    PathNode.MoveTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(11.0f, 15.657f, 13.239f, 17.0f, 16.0f, 17.0f),
                    PathNode.CurveTo(18.761f, 17.0f, 21.0f, 15.657f, 21.0f, 14.0f),
                    PathNode.LineTo(21.0f, 10.0f)
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
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.657f, 13.239f, 21.0f, 16.0f, 21.0f),
                    PathNode.CurveTo(18.761f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f),
                    PathNode.LineTo(21.0f, 14.0f)
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
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.LineTo(4.5f, 9.0f),
                    PathNode.CurveTo(3.671573f, 9.0f, 3.0f, 9.671573f, 3.0f, 10.5f),
                    PathNode.CurveTo(3.0f, 11.328427f, 3.671573f, 12.0f, 4.5f, 12.0f),
                    PathNode.LineTo(5.5f, 12.0f),
                    PathNode.CurveTo(6.328428f, 12.0f, 7.0f, 12.671573f, 7.0f, 13.5f),
                    PathNode.CurveTo(7.0f, 14.328427f, 6.328428f, 15.0f, 5.5f, 15.0f),
                    PathNode.LineTo(3.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 9.0f)
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
        return _businessplan!!
    }

private var _businessplan: ImageVector? = null
