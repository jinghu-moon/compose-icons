package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) return _brandPatreon!!
        _brandPatreon = tablerFilledIcon(
            name = "BrandPatreon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.462 3.100 C 10.077 1.832 13.688 1.654 16.525 2.597 C 19.093 3.450 20.996 5.772 21.000 8.407 C 21.004 11.468 19.058 13.899 16.104 14.650 C 14.411 15.080 13.766 15.400 13.162 16.232 C 12.924 16.560 12.712 16.977 12.366 17.765 L 12.146 18.265 C 11.000 20.866 9.990 22.027 7.910 22.000 C 5.678 21.970 4.307 20.258 3.597 17.520 C 3.139 15.752 2.980 13.712 3.003 11.644 C 3.047 7.651 4.423 4.572 7.463 3.099 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
