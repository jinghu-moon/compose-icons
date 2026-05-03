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
                pathData = parseSvgPathData("M 14.000 19.000 L 10.000 19.000 C 5.582 19.000 2.000 15.418 2.000 11.000 L 2.000 6.000 L 6.000 6.000 L 6.000 11.000 C 6.000 13.209 7.791 15.000 10.000 15.000 L 10.000 6.000 L 14.000 6.000 L 14.000 10.500 L 14.030 10.500 C 16.298 10.217 18.000 8.289 18.000 6.004 L 22.000 6.004 L 21.658 7.715 C 21.243 9.790 19.893 11.558 18.000 12.504 C 19.850 13.120 21.217 14.696 21.566 16.615 L 22.000 19.004 L 18.000 19.004 C 18.000 16.719 16.298 14.791 14.030 14.508 L 14.030 19.008 L 14.000 19.000"),
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
