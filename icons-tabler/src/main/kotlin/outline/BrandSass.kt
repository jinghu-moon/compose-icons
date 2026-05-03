package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSass: ImageVector
    get() {
        if (_brandSass != null) return _brandSass!!
        _brandSass = tablerOutlineIcon(
            name = "BrandSass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 10.523 C 14.460 9.697 16.000 9.697 16.000 8.368 C 16.000 7.002 14.653 7.002 13.265 7.002 C 11.355 7.002 9.913 7.492 8.728 8.750 C 7.880 9.652 7.701 11.199 8.575 12.057 C 9.548 13.013 11.781 13.846 11.459 15.550 C 11.226 16.785 9.990 17.373 8.842 16.752 C 8.060 16.328 8.388 15.006 9.468 14.240 C 10.548 13.474 12.290 13.248 13.568 14.000 C 14.548 14.575 14.614 15.724 14.002 16.193"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandSass!!
    }

private var _brandSass: ImageVector? = null
