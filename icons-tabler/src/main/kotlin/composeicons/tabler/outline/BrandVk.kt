package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVk: ImageVector
    get() {
        if (_brandVk != null) return _brandVk!!
        _brandVk = tablerOutlineIcon(
            name = "BrandVk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 19h-4C5.582 19 2 15.418 2 11v-5h4v5c0 2.209 1.791 4 4 4v-9h4v4.5h.03C16.298 10.217 18 8.289 18 6.004h4l-.342 1.711C21.243 9.79 19.893 11.558 18 12.504c1.85 .616 3.217 2.192 3.566 4.111L22 19.004h-4c-0-2.285-1.702-4.213-3.97-4.496v4.5L14 19"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandVk!!
    }

private var _brandVk: ImageVector? = null
