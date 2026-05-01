package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlender: ImageVector
    get() {
        if (_brandBlender != null) return _brandBlender!!
        _brandBlender = tablerOutlineIcon(
            name = "BrandBlender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 16.761423f, 11.686292f, 19.0f, 15.0f, 19.0f),
                    PathNode.CurveTo(18.31371f, 19.0f, 21.0f, 16.761423f, 21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 11.238576f, 18.31371f, 9.0f, 15.0f, 9.0f),
                    PathNode.CurveTo(11.686292f, 9.0f, 9.0f, 11.238576f, 9.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 14.552285f, 14.447715f, 15.0f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 14.552285f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 13.447715f, 15.552285f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(14.447715f, 13.0f, 14.0f, 13.447715f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(12.0f, 9.5f)
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f)
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
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.LineTo(18.65f, 10.0f)
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
        return _brandBlender!!
    }

private var _brandBlender: ImageVector? = null
