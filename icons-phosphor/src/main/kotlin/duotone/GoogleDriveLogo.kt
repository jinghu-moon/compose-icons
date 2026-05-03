package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorDuotoneIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 24.000 152.000 L 88.000 152.000 L 55.120 206.800 C 53.986 206.111 53.044 205.148 52.380 204.000 L 25.050 156.150 C 24.330 154.888 23.967 153.453 24.000 152.000 ZM 168.000 152.000 L 200.880 206.800 C 202.017 206.103 202.960 205.129 203.620 203.970 L 230.940 156.150 C 231.664 154.889 232.030 153.454 232.000 152.000 ZM 100.430 32.000 C 99.087 32.008 97.767 32.352 96.590 33.000 L 128.000 85.330 L 159.410 33.000 C 158.230 32.351 156.907 32.007 155.560 32.000 Z"),
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
                pathData = parseSvgPathData("M 237.600 143.780 L 169.130 31.520 C 166.218 26.828 161.082 23.982 155.560 24.000 L 100.430 24.000 C 94.911 23.982 89.777 26.828 86.870 31.520 L 86.820 31.590 L 18.440 143.700 C 15.315 148.695 15.188 155.003 18.110 160.120 L 45.430 207.940 C 48.279 212.924 53.579 216.000 59.320 216.000 L 196.670 216.000 C 202.411 216.000 207.711 212.924 210.560 207.940 L 237.880 160.120 C 240.805 155.038 240.697 148.759 237.600 143.780 ZM 219.000 144.000 L 172.520 144.000 L 137.330 85.330 L 160.080 47.410 ZM 102.130 144.000 L 128.000 100.880 L 153.870 144.000 ZM 163.470 160.000 L 187.470 200.000 L 68.530 200.000 L 92.530 160.000 ZM 128.000 69.780 L 110.120 40.000 L 145.900 39.950 ZM 95.910 47.410 L 118.670 85.330 L 83.470 144.000 L 37.000 144.000 ZM 36.540 160.000 L 73.870 160.000 L 54.720 191.920 ZM 201.280 191.930 L 182.120 160.000 L 219.530 160.000 Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
