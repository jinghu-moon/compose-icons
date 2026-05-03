package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorLightIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.590 116.350 L 159.410 60.180 C 155.107 57.450 149.660 57.274 145.190 59.720 C 140.760 62.144 138.004 66.790 138.000 71.840 L 138.000 112.840 L 55.410 60.180 C 51.107 57.450 45.660 57.274 41.190 59.720 C 36.760 62.144 34.004 66.790 34.000 71.840 L 34.000 184.160 C 34.004 189.210 36.760 193.856 41.190 196.280 C 45.660 198.726 51.107 198.550 55.410 195.820 L 138.000 143.210 L 138.000 184.160 C 138.004 189.210 140.760 193.856 145.190 196.280 C 149.660 198.726 155.107 198.550 159.410 195.820 L 247.590 139.650 C 251.582 137.122 254.002 132.725 254.002 128.000 C 254.002 123.275 251.582 118.878 247.590 116.350 ZM 137.150 129.530 L 49.000 185.690 C 48.399 186.088 47.624 186.111 47.000 185.750 C 46.383 185.463 45.992 184.841 46.000 184.160 L 46.000 71.840 C 45.992 71.159 46.383 70.537 47.000 70.250 C 47.305 70.077 47.650 69.988 48.000 69.990 C 48.357 69.999 48.704 70.110 49.000 70.310 L 137.190 126.470 C 137.720 126.798 138.042 127.377 138.042 128.000 C 138.042 128.623 137.720 129.202 137.190 129.530 ZM 241.150 129.530 L 153.000 185.690 C 152.399 186.088 151.624 186.111 151.000 185.750 C 150.383 185.463 149.992 184.841 150.000 184.160 L 150.000 71.840 C 149.992 71.159 150.383 70.537 151.000 70.250 C 151.305 70.077 151.650 69.988 152.000 69.990 C 152.357 69.999 152.704 70.110 153.000 70.310 L 241.190 126.470 C 241.720 126.798 242.042 127.377 242.042 128.000 C 242.042 128.623 241.720 129.202 241.190 129.530 Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
