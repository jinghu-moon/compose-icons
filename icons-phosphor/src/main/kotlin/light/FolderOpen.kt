package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorLightIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.360 111.810 C 240.727 108.160 236.500 105.998 232.000 106.000 L 214.000 106.000 L 214.000 88.000 C 214.000 80.268 207.732 74.000 200.000 74.000 L 130.000 74.000 L 101.740 52.800 C 99.315 50.986 96.368 50.004 93.340 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 211.100 214.000 C 213.681 213.999 215.973 212.348 216.790 209.900 L 245.280 124.430 C 246.707 120.159 245.992 115.463 243.360 111.810 ZM 40.000 62.000 L 93.340 62.000 C 93.773 62.000 94.194 62.140 94.540 62.400 L 124.400 84.800 C 125.439 85.579 126.702 86.000 128.000 86.000 L 200.000 86.000 C 201.105 86.000 202.000 86.895 202.000 88.000 L 202.000 106.000 L 69.770 106.000 C 63.745 106.000 58.396 109.855 56.490 115.570 L 38.000 171.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 ZM 233.900 120.630 L 206.780 202.000 L 40.330 202.000 L 67.870 119.370 C 68.142 118.551 68.908 117.999 69.770 118.000 L 232.000 118.000 C 232.643 117.999 233.247 118.308 233.623 118.829 C 233.999 119.350 234.102 120.020 233.900 120.630 Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
