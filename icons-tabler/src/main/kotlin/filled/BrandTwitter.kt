package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerFilledIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.058 3.410 C 12.251 4.177 11.063 5.863 11.002 7.790 L 11.000 7.972 L 10.757 7.949 C 8.365 7.680 6.259 6.437 4.813 4.418 C 4.614 4.140 4.287 3.983 3.945 4.001 C 3.604 4.020 3.296 4.212 3.128 4.510 L 3.031 4.696 L 2.982 4.795 C 2.263 6.280 1.792 8.085 1.965 9.998 L 1.995 10.271 C 2.278 12.534 3.495 14.486 5.774 15.950 L 5.947 16.057 L 5.866 16.100 C 4.551 16.763 3.348 17.052 2.039 17.000 C 0.983 16.960 0.593 18.372 1.521 18.878 C 5.119 20.839 8.982 21.444 12.313 20.478 C 16.373 19.298 19.465 16.255 20.648 12.045 L 20.775 11.550 C 21.013 10.557 21.147 9.544 21.176 8.526 L 21.179 8.194 L 21.572 7.415 L 22.012 6.553 L 22.226 6.119 L 22.344 5.872 C 22.609 5.307 22.800 4.839 22.918 4.442 L 22.932 4.386 L 22.940 4.368 C 23.160 3.775 22.774 3.010 21.999 3.010 L 21.877 3.017 C 21.798 3.027 21.720 3.046 21.646 3.074 L 21.560 3.112 C 21.275 3.251 20.981 3.371 20.680 3.472 L 20.324 3.587 L 20.053 3.667 L 19.281 3.881 C 17.945 2.763 16.137 2.627 14.269 3.327 L 14.058 3.411 Z"),
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
