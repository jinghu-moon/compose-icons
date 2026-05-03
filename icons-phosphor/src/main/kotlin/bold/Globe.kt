package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorBoldIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 207.000 C 119.158 196.652 112.251 184.796 107.610 172.000 L 148.430 172.000 C 145.789 179.236 142.439 186.193 138.430 192.770 C 135.345 197.788 131.857 202.547 128.000 207.000 ZM 101.510 148.000 C 99.530 134.740 99.530 121.260 101.510 108.000 L 154.510 108.000 C 156.490 121.260 156.490 134.740 154.510 148.000 ZM 44.000 128.000 C 44.000 121.260 44.816 114.544 46.430 108.000 L 77.250 108.000 C 75.583 121.281 75.583 134.719 77.250 148.000 L 46.430 148.000 C 44.816 141.456 44.000 134.740 44.000 128.000 ZM 128.000 49.000 C 136.842 59.348 143.749 71.204 148.390 84.000 L 107.590 84.000 C 110.231 76.764 113.581 69.807 117.590 63.230 C 120.669 58.212 124.150 53.453 128.000 49.000 ZM 178.730 108.000 L 209.550 108.000 C 212.790 121.137 212.790 134.863 209.550 148.000 L 178.750 148.000 C 180.417 134.719 180.417 121.281 178.750 108.000 ZM 199.500 84.000 L 173.710 84.000 C 170.107 71.904 164.893 60.347 158.210 49.640 C 175.351 56.294 189.855 68.358 199.520 84.000 ZM 97.790 49.640 C 91.107 60.347 85.893 71.904 82.290 84.000 L 56.480 84.000 C 66.145 68.358 80.649 56.294 97.790 49.640 ZM 56.480 172.000 L 82.290 172.000 C 85.893 184.096 91.107 195.653 97.790 206.360 C 80.649 199.706 66.145 187.642 56.480 172.000 ZM 158.210 206.360 C 164.893 195.653 170.107 184.096 173.710 172.000 L 199.520 172.000 C 189.855 187.642 175.351 199.706 158.210 206.360 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
