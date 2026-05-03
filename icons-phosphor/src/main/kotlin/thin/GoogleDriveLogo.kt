package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorThinIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.190 145.860 L 165.740 33.640 C 163.555 30.122 159.702 27.987 155.560 28.000 L 100.430 28.000 C 96.291 27.989 92.442 30.123 90.260 33.640 L 90.260 33.640 L 21.830 145.820 C 19.484 149.567 19.387 154.301 21.580 158.140 L 48.910 206.000 C 51.057 209.718 55.026 212.006 59.320 212.000 L 196.670 212.000 C 200.967 212.010 204.941 209.721 207.090 206.000 L 234.410 158.190 C 236.616 154.354 236.531 149.615 234.190 145.860 ZM 226.130 148.000 L 170.260 148.000 L 132.660 85.330 L 160.050 39.680 ZM 95.060 148.000 L 128.000 93.110 L 160.930 148.000 ZM 165.730 156.000 L 194.530 204.000 L 61.470 204.000 L 90.260 156.000 ZM 128.000 77.560 L 103.060 36.000 L 152.930 36.000 ZM 95.940 39.680 L 123.330 85.330 L 85.740 148.000 L 29.870 148.000 ZM 29.580 156.000 L 80.940 156.000 L 54.630 199.850 ZM 201.370 199.850 L 175.060 156.000 L 226.420 156.000 Z"),
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
