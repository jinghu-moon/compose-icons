package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCloudflare: ImageVector
    get() {
        if (_brandCloudflare != null) return _brandCloudflare!!
        _brandCloudflare = tablerOutlineIcon(
            name = "BrandCloudflare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.031f, 7.007f),
                    PathNode.CurveTo(15.5f, 7.0f, 16.326f, 8.3f, 17.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 10.0f, 21.994f, 13.825f, 22.0f, 16.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.CurveTo(1.999f, 14.36f, 3.36f, 13.046f, 5.0f, 13.0f),
                    PathNode.CurveTo(5.0f, 11.5f, 6.0f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(8.66f, 8.058f, 10.562f, 7.014f, 13.031f, 7.007f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(14.5f, 16.0f)
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
        return _brandCloudflare!!
    }

private var _brandCloudflare: ImageVector? = null
