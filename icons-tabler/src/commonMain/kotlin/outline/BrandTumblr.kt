package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTumblr: ImageVector
    get() {
        if (_brandTumblr != null) return _brandTumblr!!
        _brandTumblr = tablerOutlineIcon(
            name = "BrandTumblr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 5.656854f, 8.656855f, 7.0f, 7.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 19.209139f, 11.790861f, 21.0f, 14.0f, 21.0f)
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
        return _brandTumblr!!
    }

private var _brandTumblr: ImageVector? = null
