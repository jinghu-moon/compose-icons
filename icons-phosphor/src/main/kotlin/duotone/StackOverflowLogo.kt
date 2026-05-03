package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorDuotoneIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 152.000 L 208.000 216.000 L 48.000 216.000 L 48.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 216.000 152.090 L 216.000 216.000 C 216.000 220.418 212.418 224.000 208.000 224.000 L 48.000 224.000 C 43.582 224.000 40.000 220.418 40.000 216.000 L 40.000 152.090 C 40.000 147.672 43.582 144.090 48.000 144.090 C 52.418 144.090 56.000 147.672 56.000 152.090 L 56.000 208.000 L 200.000 208.000 L 200.000 152.090 C 200.000 147.672 203.582 144.090 208.000 144.090 C 212.418 144.090 216.000 147.672 216.000 152.090 ZM 88.000 184.090 L 168.000 184.090 C 172.418 184.090 176.000 180.508 176.000 176.090 C 176.000 171.672 172.418 168.090 168.000 168.090 L 88.000 168.090 C 83.582 168.090 80.000 171.672 80.000 176.090 C 80.000 180.508 83.582 184.090 88.000 184.090 ZM 92.880 131.090 L 170.150 151.770 C 170.828 151.956 171.527 152.050 172.230 152.050 C 176.220 152.018 179.577 149.051 180.098 145.095 C 180.619 141.139 178.146 137.404 174.300 136.340 L 97.000 115.610 C 94.153 114.558 90.957 115.208 88.746 117.287 C 86.536 119.367 85.693 122.518 86.568 125.423 C 87.444 128.329 89.889 130.489 92.880 131.000 ZM 111.330 81.160 L 180.610 121.160 C 182.448 122.221 184.632 122.509 186.682 121.959 C 188.732 121.410 190.479 120.068 191.540 118.230 C 193.736 114.407 192.426 109.528 188.610 107.320 L 119.330 67.270 C 116.850 65.694 113.706 65.604 111.139 67.036 C 108.573 68.468 106.999 71.191 107.039 74.130 C 107.079 77.068 108.726 79.748 111.330 81.110 ZM 198.660 94.160 C 201.786 97.291 206.859 97.296 209.990 94.170 C 213.121 91.044 213.126 85.971 210.000 82.840 L 153.430 26.340 C 150.287 23.349 145.333 23.408 142.263 26.473 C 139.192 29.538 139.124 34.492 142.110 37.640 Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
