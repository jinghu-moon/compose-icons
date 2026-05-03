package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandInfakt: ImageVector
    get() {
        if (_brandInfakt != null) return _brandInfakt!!
        _brandInfakt = tablerOutlineIcon(
            name = "BrandInfakt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.936 6.063 C 14.936 7.720 16.279 9.063 17.936 9.063 C 19.593 9.063 20.936 7.720 20.936 6.063 C 20.936 4.406 19.593 3.063 17.936 3.063 C 16.279 3.063 14.936 4.406 14.936 6.063"),
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
        pathData = parseSvgPathData("M 5.520 5.000 C 5.522 4.967 3.830 6.568 6.540 8.733 C 5.448 10.748 7.393 11.725 7.393 11.725 C 6.421 13.604 8.783 14.530 8.783 14.530 C 7.783 16.920 6.783 19.210 5.228 20.984 C 6.723 21.074 7.268 20.788 8.128 20.140 C 11.514 17.588 13.065 13.669 13.893 11.520 C 14.278 10.519 13.570 9.050 12.646 8.556 C 10.126 7.206 5.468 5.030 5.519 5.001"),
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
        return _brandInfakt!!
    }

private var _brandInfakt: ImageVector? = null
