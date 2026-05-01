package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = tablerOutlineIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(6.553f, 16.724f),
                    PathNode.CurveTo(6.214271f, 16.893263f, 6.000202f, 17.239334f, 6.0f, 17.618f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 17.618f),
                    PathNode.CurveTo(17.999798f, 17.239334f, 17.78573f, 16.893263f, 17.447f, 16.724f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 4.552285f, 11.447715f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.552285f, 5.0f, 13.0f, 4.552285f, 13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 12.552285f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.447715f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f)
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
                    PathNode.MoveTo(9.5f, 16.0f),
                    PathNode.CurveTo(7.833f, 16.0f, 7.0f, 14.331f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 9.333f, 8.667f, 7.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.333f, 7.0f, 17.0f, 9.427f, 17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 14.284f, 16.225f, 15.881f, 14.675f, 16.0f),
                    PathNode.LineTo(14.5f, 16.0f),
                    PathNode.LineTo(9.5f, 16.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(12.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 6.0f)
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
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
