package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmie: ImageVector
    get() {
        if (_brandAmie != null) return _brandAmie!!
        _brandAmie = tablerOutlineIcon(
            name = "BrandAmie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 8.500 C 3.000 9.830 3.472 11.050 4.257 12.000 C 2.452 14.186 2.604 17.386 4.609 19.391 C 6.614 21.396 9.814 21.548 12.000 19.743 C 14.186 21.548 17.386 21.396 19.391 19.391 C 21.396 17.386 21.548 14.186 19.743 12.000 C 21.548 9.814 21.396 6.614 19.391 4.609 C 17.386 2.604 14.186 2.452 12.000 4.257 C 10.358 2.902 8.081 2.617 6.155 3.525 C 4.229 4.433 3.000 6.371 3.000 8.500"),
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
        pathData = parseSvgPathData("M 10.000 9.500 C 10.000 8.672 10.895 8.000 12.000 8.000 C 13.105 8.000 14.000 8.672 14.000 9.500 L 14.000 14.500 C 14.000 15.328 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 15.328 10.000 14.500 L 10.000 9.500"),
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
        return _brandAmie!!
    }

private var _brandAmie: ImageVector? = null
