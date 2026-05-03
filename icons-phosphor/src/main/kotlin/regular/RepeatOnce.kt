package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorRegularIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 128.000 C 24.044 88.254 56.254 56.044 96.000 56.000 L 204.690 56.000 L 194.340 45.660 C 191.214 42.534 191.214 37.466 194.340 34.340 C 197.466 31.214 202.534 31.214 205.660 34.340 L 229.660 58.340 C 231.162 59.841 232.006 61.877 232.006 64.000 C 232.006 66.123 231.162 68.159 229.660 69.660 L 205.660 93.660 C 202.534 96.786 197.466 96.786 194.340 93.660 C 191.214 90.534 191.214 85.466 194.340 82.340 L 204.690 72.000 L 96.000 72.000 C 65.086 72.033 40.033 97.086 40.000 128.000 C 40.000 132.418 36.418 136.000 32.000 136.000 C 27.582 136.000 24.000 132.418 24.000 128.000 ZM 224.000 120.000 C 219.582 120.000 216.000 123.582 216.000 128.000 C 215.967 158.914 190.914 183.967 160.000 184.000 L 51.310 184.000 L 61.660 173.660 C 64.786 170.534 64.786 165.466 61.660 162.340 C 58.534 159.214 53.466 159.214 50.340 162.340 L 26.340 186.340 C 24.838 187.841 23.994 189.877 23.994 192.000 C 23.994 194.123 24.838 196.159 26.340 197.660 L 50.340 221.660 C 53.466 224.786 58.534 224.786 61.660 221.660 C 64.786 218.534 64.786 213.466 61.660 210.340 L 51.310 200.000 L 160.000 200.000 C 199.746 199.956 231.956 167.746 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 ZM 136.000 160.000 C 140.418 160.000 144.000 156.418 144.000 152.000 L 144.000 104.000 C 144.002 101.226 142.567 98.649 140.207 97.190 C 137.848 95.731 134.901 95.599 132.420 96.840 L 116.420 104.840 C 112.468 106.817 110.868 111.623 112.845 115.575 C 114.822 119.527 119.628 121.127 123.580 119.150 L 128.000 116.940 L 128.000 152.000 C 128.000 156.418 131.582 160.000 136.000 160.000 Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
