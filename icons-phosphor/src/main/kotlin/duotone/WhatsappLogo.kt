package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorDuotoneIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 32.000 C 93.686 31.996 61.979 50.307 44.832 80.030 C 27.686 109.753 27.708 146.368 44.890 176.070 L 32.420 213.460 C 31.461 216.335 32.209 219.505 34.352 221.648 C 36.495 223.791 39.665 224.539 42.540 223.580 L 79.930 211.110 C 114.873 231.312 158.721 227.499 189.652 201.569 C 220.584 175.639 231.993 133.130 218.201 95.197 C 204.409 57.264 168.363 32.009 128.000 32.000 ZM 152.000 184.000 C 107.817 184.000 72.000 148.183 72.000 104.000 C 72.000 86.327 86.327 72.000 104.000 72.000 L 120.000 104.000 L 107.680 122.470 C 112.567 134.147 121.853 143.433 133.530 148.320 L 152.000 136.000 L 184.000 152.000 C 184.000 169.673 169.673 184.000 152.000 184.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 187.580 144.840 L 155.580 128.840 C 153.016 127.562 149.965 127.753 147.580 129.340 L 132.890 139.140 C 126.147 135.433 120.597 129.883 116.890 123.140 L 126.690 108.450 C 128.277 106.065 128.468 103.014 127.190 100.450 L 111.190 68.450 C 109.837 65.718 107.049 63.992 104.000 64.000 C 81.909 64.000 64.000 81.909 64.000 104.000 C 64.055 152.578 103.422 191.945 152.000 192.000 C 174.091 192.000 192.000 174.091 192.000 152.000 C 192.002 148.969 190.291 146.197 187.580 144.840 ZM 152.000 176.000 C 112.254 175.956 80.044 143.746 80.000 104.000 C 79.997 92.558 88.071 82.705 99.290 80.460 L 110.770 103.460 L 101.000 118.000 C 99.517 120.224 99.243 123.042 100.270 125.510 C 105.994 139.114 116.816 149.936 130.420 155.660 C 132.896 156.733 135.746 156.484 138.000 155.000 L 152.620 145.260 L 175.620 156.740 C 173.356 167.977 163.462 176.044 152.000 176.000 ZM 128.000 24.000 C 91.477 23.992 57.627 43.143 38.822 74.453 C 20.017 105.763 19.014 144.642 36.180 176.880 L 24.830 210.930 C 22.912 216.680 24.409 223.020 28.695 227.305 C 32.980 231.591 39.320 233.088 45.070 231.170 L 79.120 219.820 C 117.327 240.141 164.125 234.680 196.625 206.107 C 229.126 177.534 240.537 131.821 225.277 91.326 C 210.016 50.831 171.275 24.018 128.000 24.000 ZM 128.000 216.000 C 112.530 216.011 97.331 211.937 83.940 204.190 C 81.957 203.040 79.575 202.796 77.400 203.520 L 40.000 216.000 L 52.470 178.600 C 53.197 176.426 52.957 174.045 51.810 172.060 C 31.866 137.578 37.571 93.999 65.721 65.814 C 93.870 37.629 137.442 31.868 171.949 51.769 C 206.456 71.670 223.292 112.269 212.994 150.749 C 202.697 189.229 167.834 215.993 128.000 216.000 Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
