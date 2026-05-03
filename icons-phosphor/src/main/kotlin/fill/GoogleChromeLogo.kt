package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorFillIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 40.000 C 157.756 40.012 185.490 55.061 201.720 80.000 L 128.000 80.000 C 107.277 80.023 88.900 93.322 82.400 113.000 L 59.320 73.000 C 76.007 52.132 101.281 39.988 128.000 40.000 ZM 40.000 128.000 C 39.983 114.144 43.260 100.482 49.560 88.140 L 86.430 152.000 C 86.490 152.100 86.560 152.190 86.620 152.280 C 97.040 170.059 117.646 179.202 137.820 175.000 L 114.720 215.000 C 71.773 208.384 40.055 171.454 40.000 128.000 ZM 132.690 215.870 L 169.570 152.000 C 169.650 151.860 169.710 151.720 169.790 151.580 C 179.936 133.688 177.521 111.315 163.790 96.000 L 210.000 96.000 C 220.268 122.309 217.285 151.947 201.981 175.682 C 186.677 199.418 160.911 214.366 132.710 215.870 Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
