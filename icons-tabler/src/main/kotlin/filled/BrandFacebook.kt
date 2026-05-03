package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandFacebook: ImageVector
    get() {
        if (_brandFacebook != null) return _brandFacebook!!
        _brandFacebook = tablerFilledIcon(
            name = "BrandFacebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 2.000 C 18.507 2.000 18.934 2.380 18.993 2.883 L 19.000 3.000 L 19.000 7.000 C 19.000 7.507 18.620 7.934 18.117 7.993 L 18.000 8.000 L 15.000 8.000 L 15.000 9.000 L 18.000 9.000 C 18.288 9.000 18.562 9.124 18.752 9.341 C 18.942 9.558 19.029 9.845 18.991 10.131 L 18.971 10.243 L 17.971 14.243 C 17.869 14.647 17.527 14.946 17.113 14.993 L 17.000 15.000 L 15.000 15.000 L 15.000 21.000 C 15.000 21.507 14.620 21.934 14.117 21.993 L 14.000 22.000 L 10.000 22.000 C 9.493 22.000 9.066 21.620 9.007 21.117 L 9.000 21.000 L 9.000 15.000 L 7.000 15.000 C 6.493 15.000 6.066 14.620 6.007 14.117 L 6.000 14.000 L 6.000 10.000 C 6.000 9.493 6.380 9.066 6.883 9.007 L 7.000 9.000 L 9.000 9.000 L 9.000 8.000 C 9.000 4.774 11.551 2.125 14.775 2.004 L 15.000 2.000 L 18.000 2.000 Z"),
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
        return _brandFacebook!!
    }

private var _brandFacebook: ImageVector? = null
