package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorDuotoneIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 104.000 C 232.000 128.000 192.000 152.000 128.000 152.000 C 64.000 152.000 24.000 128.000 24.000 104.000 C 24.000 80.000 64.000 56.000 128.000 56.000 C 192.000 56.000 232.000 80.000 232.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 207.580 63.840 C 186.850 53.480 159.330 48.000 128.000 48.000 C 96.670 48.000 69.150 53.480 48.420 63.840 C 27.690 74.200 16.000 88.780 16.000 104.000 L 16.000 152.000 C 16.000 167.220 27.820 181.850 48.420 192.160 C 69.020 202.470 96.670 208.000 128.000 208.000 C 159.330 208.000 186.850 202.520 207.580 192.160 C 228.310 181.800 240.000 167.220 240.000 152.000 L 240.000 104.000 C 240.000 88.780 228.180 74.150 207.580 63.840 ZM 128.000 64.000 C 190.640 64.000 224.000 87.230 224.000 104.000 C 224.000 120.770 190.640 144.000 128.000 144.000 C 65.360 144.000 32.000 120.770 32.000 104.000 C 32.000 87.230 65.360 64.000 128.000 64.000 ZM 120.000 159.860 L 120.000 191.860 C 101.000 191.240 85.000 188.440 72.000 184.370 L 72.000 153.050 C 87.671 157.225 103.786 159.511 120.000 159.860 ZM 136.000 159.860 C 152.214 159.511 168.329 157.225 184.000 153.050 L 184.000 184.360 C 171.000 188.430 155.000 191.230 136.000 191.850 ZM 32.000 152.000 L 32.000 133.530 C 37.035 137.709 42.546 141.277 48.420 144.160 C 50.850 145.370 53.420 146.510 56.000 147.590 L 56.000 178.000 C 40.170 170.160 32.000 160.290 32.000 152.000 ZM 200.000 178.000 L 200.000 147.590 C 202.610 146.510 205.150 145.370 207.580 144.160 C 213.454 141.277 218.965 137.709 224.000 133.530 L 224.000 152.000 C 224.000 160.290 215.830 170.160 200.000 178.000 Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
