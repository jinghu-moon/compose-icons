package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorRegularIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 104.000 C 231.967 73.086 206.914 48.033 176.000 48.000 L 136.000 48.000 C 136.000 34.745 146.745 24.000 160.000 24.000 C 164.418 24.000 168.000 20.418 168.000 16.000 C 168.000 11.582 164.418 8.000 160.000 8.000 C 137.909 8.000 120.000 25.909 120.000 48.000 L 80.000 48.000 C 49.086 48.033 24.033 73.086 24.000 104.000 C 24.009 109.707 27.058 114.977 32.000 117.830 L 32.000 128.000 C 32.000 163.530 65.120 190.120 91.740 211.490 C 103.660 221.070 120.000 234.180 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 C 136.000 234.180 152.340 221.070 164.260 211.490 C 190.880 190.120 224.000 163.530 224.000 128.000 L 224.000 117.830 C 228.942 114.977 231.991 109.707 232.000 104.000 ZM 80.000 64.000 L 176.000 64.000 C 198.078 64.033 215.967 81.922 216.000 104.000 L 40.000 104.000 C 40.000 81.909 57.909 64.000 80.000 64.000 ZM 154.250 199.000 C 143.630 207.520 134.250 215.000 128.000 222.370 C 121.750 215.050 112.370 207.520 101.750 199.000 C 77.800 179.790 48.000 155.860 48.000 128.000 L 48.000 120.000 L 208.000 120.000 L 208.000 128.000 C 208.000 155.860 178.200 179.790 154.250 199.000 Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
