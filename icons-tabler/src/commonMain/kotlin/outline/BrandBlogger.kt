package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlogger: ImageVector
    get() {
        if (_brandBlogger != null) return _brandBlogger!!
        _brandBlogger = tablerOutlineIcon(
            name = "BrandBlogger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(18.761423f, 21.0f, 21.0f, 18.761423f, 21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 11.343145f, 19.656855f, 10.0f, 18.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 5.238577f, 14.761424f, 3.0f, 12.0f, 3.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(5.238577f, 3.0f, 3.0f, 5.238577f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 18.761423f, 5.238577f, 21.0f, 8.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 8.5f),
                    PathNode.CurveTo(7.0f, 7.671573f, 7.671573f, 7.0f, 8.5f, 7.0f),
                    PathNode.LineTo(11.5f, 7.0f),
                    PathNode.CurveTo(12.328427f, 7.0f, 13.0f, 7.671573f, 13.0f, 8.5f),
                    PathNode.CurveTo(13.0f, 9.328427f, 12.328427f, 10.0f, 11.5f, 10.0f),
                    PathNode.LineTo(8.5f, 10.0f),
                    PathNode.CurveTo(7.671573f, 10.0f, 7.0f, 9.328427f, 7.0f, 8.5f)
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
                    PathNode.MoveTo(7.0f, 15.5f),
                    PathNode.CurveTo(7.0f, 14.671573f, 7.671573f, 14.0f, 8.5f, 14.0f),
                    PathNode.LineTo(15.5f, 14.0f),
                    PathNode.CurveTo(16.328426f, 14.0f, 17.0f, 14.671573f, 17.0f, 15.5f),
                    PathNode.CurveTo(17.0f, 16.328426f, 16.328426f, 17.0f, 15.5f, 17.0f),
                    PathNode.LineTo(8.5f, 17.0f),
                    PathNode.CurveTo(7.671573f, 17.0f, 7.0f, 16.328426f, 7.0f, 15.5f)
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
        return _brandBlogger!!
    }

private var _brandBlogger: ImageVector? = null
