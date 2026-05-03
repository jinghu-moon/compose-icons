package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorDuotoneIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 112.000 L 128.000 224.000 C 116.987 224.018 106.091 221.750 96.000 217.340 L 96.000 129.070 Z"),
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
        pathData = parseSvgPathData("M 172.000 136.000 C 178.627 136.000 184.000 141.373 184.000 148.000 C 184.000 154.627 178.627 160.000 172.000 160.000 C 165.373 160.000 160.000 154.627 160.000 148.000 C 160.000 141.373 165.373 136.000 172.000 136.000 ZM 184.620 103.250 L 118.910 72.590 C 83.965 77.021 57.366 106.100 56.060 141.300 L 124.240 104.940 C 126.719 103.620 129.709 103.697 132.118 105.142 C 134.526 106.588 136.000 109.191 136.000 112.000 L 136.000 215.550 C 164.394 212.475 188.249 192.828 196.710 165.550 C 198.049 161.328 202.558 158.991 206.780 160.330 C 211.002 161.669 213.339 166.178 212.000 170.400 C 201.827 202.512 174.217 225.999 140.889 230.891 C 107.562 235.783 74.366 221.221 55.394 193.388 C 36.422 165.554 35.003 129.332 51.740 100.100 C 36.896 92.564 29.155 75.832 33.021 59.639 C 36.887 43.447 51.352 32.017 68.000 32.000 C 69.168 32.002 70.321 32.258 71.380 32.750 L 189.630 87.930 C 200.305 87.035 208.379 77.888 207.942 67.184 C 207.505 56.481 198.712 48.022 188.000 48.000 C 183.582 48.000 180.000 44.418 180.000 40.000 C 180.000 35.582 183.582 32.000 188.000 32.000 C 207.882 32.000 224.000 48.118 224.000 68.000 C 224.000 87.882 207.882 104.000 188.000 104.000 C 186.832 103.998 185.679 103.742 184.620 103.250 ZM 88.000 203.830 L 88.000 142.400 L 57.510 158.660 C 61.377 177.124 72.322 193.338 88.000 203.830 ZM 120.000 125.330 L 104.000 133.870 L 104.000 211.870 C 109.174 213.708 114.543 214.939 120.000 215.540 ZM 96.130 62.000 L 66.370 48.070 C 57.020 48.857 49.474 56.038 48.225 65.337 C 46.976 74.636 52.359 83.554 61.170 86.780 C 61.770 86.070 62.370 85.360 63.010 84.670 C 72.156 74.663 83.491 66.905 96.130 62.000 Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
