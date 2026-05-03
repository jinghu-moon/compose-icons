package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandInstagram: ImageVector
    get() {
        if (_brandInstagram != null) return _brandInstagram!!
        _brandInstagram = tablerFilledIcon(
            name = "BrandInstagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 C 18.761 3.000 21.000 5.239 21.000 8.000 L 21.000 16.000 C 21.000 18.761 18.761 21.000 16.000 21.000 L 8.000 21.000 C 5.239 21.000 3.000 18.761 3.000 16.000 L 3.000 8.000 C 3.000 5.239 5.239 3.000 8.000 3.000 ZM 12.000 8.000 C 9.869 8.000 8.112 9.671 8.005 11.800 L 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000M 16.500 6.500 C 15.993 6.500 15.566 6.880 15.507 7.383 L 15.500 7.510 C 15.501 8.039 15.913 8.476 16.441 8.507 C 16.970 8.538 17.431 8.152 17.493 7.627 L 17.500 7.500 C 17.500 6.948 17.052 6.500 16.500 6.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _brandInstagram!!
    }

private var _brandInstagram: ImageVector? = null
