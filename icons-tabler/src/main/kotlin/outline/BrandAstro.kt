package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAstro: ImageVector
    get() {
        if (_brandAstro != null) return _brandAstro!!
        _brandAstro = tablerOutlineIcon(
            name = "BrandAstro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.972 3.483 C 15.135 3.679 15.219 3.943 15.385 4.470 L 19.025 16.000 C 17.653 15.314 16.186 14.835 14.673 14.580 L 12.303 6.857 C 12.261 6.729 12.141 6.643 12.007 6.644 C 11.873 6.644 11.754 6.730 11.712 6.858 L 9.370 14.576 C 7.851 14.830 6.378 15.309 5.000 15.998 L 8.657 4.468 C 8.825 3.941 8.908 3.678 9.072 3.482 C 9.216 3.310 9.403 3.176 9.616 3.094 C 9.858 3.000 10.143 3.000 10.715 3.000 L 13.327 3.000 C 13.899 3.000 14.185 3.000 14.427 3.094 C 14.640 3.176 14.827 3.311 14.972 3.484"),
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
        pathData = parseSvgPathData("M 9.000 18.000 C 9.000 19.500 11.000 21.000 12.000 22.000 C 13.000 21.000 15.000 19.000 15.000 18.000 Q 12.000 19.500 9.000 18.000"),
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
        return _brandAstro!!
    }

private var _brandAstro: ImageVector? = null
