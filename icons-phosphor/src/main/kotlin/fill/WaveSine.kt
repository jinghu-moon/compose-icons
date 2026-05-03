package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorFillIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 211.220 131.440 C 194.540 166.440 180.160 182.000 164.570 182.000 C 144.890 182.000 133.180 157.440 120.780 131.440 C 112.000 113.000 101.000 90.000 91.430 90.000 C 87.690 90.000 77.060 94.000 59.220 131.440 C 57.257 135.313 52.563 136.914 48.643 135.046 C 44.723 133.178 43.008 128.524 44.780 124.560 C 61.460 89.590 75.840 74.000 91.430 74.000 C 111.110 74.000 122.820 98.560 135.220 124.560 C 144.000 143.000 155.000 166.000 164.570 166.000 C 168.310 166.000 178.940 162.000 196.780 124.560 C 197.965 121.908 200.494 120.107 203.388 119.854 C 206.282 119.602 209.085 120.937 210.712 123.344 C 212.338 125.750 212.533 128.849 211.220 131.440 Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
