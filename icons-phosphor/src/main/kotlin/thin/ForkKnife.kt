package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorThinIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 76.000 88.000 L 76.000 40.000 C 76.000 37.791 77.791 36.000 80.000 36.000 C 82.209 36.000 84.000 37.791 84.000 40.000 L 84.000 88.000 C 84.000 90.209 82.209 92.000 80.000 92.000 C 77.791 92.000 76.000 90.209 76.000 88.000 ZM 212.000 40.000 L 212.000 224.000 C 212.000 226.209 210.209 228.000 208.000 228.000 C 205.791 228.000 204.000 226.209 204.000 224.000 L 204.000 172.000 L 152.000 172.000 C 149.791 172.000 148.000 170.209 148.000 168.000 C 148.368 149.153 150.752 130.400 155.110 112.060 C 164.580 72.840 182.320 46.650 206.420 36.320 C 207.657 35.788 209.078 35.914 210.202 36.656 C 211.326 37.397 212.002 38.654 212.000 40.000 ZM 204.000 46.460 C 162.250 70.330 156.810 145.750 156.100 164.000 L 204.000 164.000 ZM 116.000 39.340 C 115.635 37.158 113.572 35.685 111.390 36.050 C 109.208 36.415 107.735 38.478 108.100 40.660 L 116.100 88.320 C 116.100 108.202 99.982 124.320 80.100 124.320 C 60.218 124.320 44.100 108.202 44.100 88.320 L 52.100 40.660 C 52.465 38.478 50.992 36.415 48.810 36.050 C 46.628 35.685 44.565 37.158 44.200 39.340 L 36.200 87.340 C 36.118 87.555 36.051 87.776 36.000 88.000 C 36.032 110.737 53.360 129.715 76.000 131.810 L 76.000 224.000 C 76.000 226.209 77.791 228.000 80.000 228.000 C 82.209 228.000 84.000 226.209 84.000 224.000 L 84.000 131.810 C 106.640 129.715 123.968 110.737 124.000 88.000 C 124.015 87.780 124.015 87.560 124.000 87.340 Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
