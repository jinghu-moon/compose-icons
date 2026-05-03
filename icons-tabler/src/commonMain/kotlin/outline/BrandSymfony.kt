package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSymfony: ImageVector
    get() {
        if (_brandSymfony != null) return _brandSymfony!!
        _brandSymfony = tablerOutlineIcon(
            name = "BrandSymfony",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.CurveTo(6.458f, 13.667f, 7.125f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(9.313f, 14.0f, 10.0f, 13.125f, 10.0f, 12.5f),
                    PathNode.CurveTo(10.0f, 11.0f, 8.0f, 11.5f, 8.0f, 10.5f),
                    PathNode.CurveTo(8.0f, 9.875f, 8.516f, 9.0f, 9.5f, 9.0f),
                    PathNode.CurveTo(12.0f, 9.0f, 11.063f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.667f, 11.0f, 16.0f, 10.667f, 16.0f, 10.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.CurveTo(8.905f, 17.667f, 9.238f, 18.0f, 10.0f, 18.0f),
                    PathNode.CurveTo(11.714f, 18.0f, 12.714f, 16.0f, 13.0f, 12.0f),
                    PathNode.CurveTo(13.286f, 8.0f, 14.571f, 6.0f, 16.0f, 6.0f),
                    PathNode.CurveTo(16.571f, 6.0f, 16.905f, 6.333f, 17.0f, 7.0f)
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
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f)
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
        return _brandSymfony!!
    }

private var _brandSymfony: ImageVector? = null
