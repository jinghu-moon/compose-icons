package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorFillIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 126.550 179.410 C 128.264 181.748 128.579 184.830 127.374 187.467 C 126.169 190.103 123.631 191.881 120.742 192.115 C 117.852 192.348 115.062 190.999 113.450 188.590 L 92.000 158.000 L 70.550 188.590 C 68.938 190.999 66.148 192.348 63.258 192.115 C 60.369 191.881 57.831 190.103 56.626 187.467 C 55.421 184.830 55.736 181.748 57.450 179.410 L 82.230 144.000 L 57.450 108.590 C 55.736 106.252 55.421 103.170 56.626 100.533 C 57.831 97.897 60.369 96.119 63.258 95.885 C 66.148 95.652 68.938 97.001 70.550 99.410 L 92.000 130.050 L 113.450 99.410 C 116.023 95.901 120.929 95.092 124.493 97.589 C 128.056 100.086 128.970 104.974 126.550 108.590 L 101.770 144.000 ZM 192.000 160.000 L 152.000 160.000 C 148.970 160.000 146.200 158.288 144.845 155.578 C 143.489 152.867 143.782 149.624 145.600 147.200 L 181.600 99.200 C 184.276 95.785 184.901 91.192 183.233 87.186 C 181.566 83.181 177.867 80.387 173.558 79.880 C 169.249 79.373 165.002 81.231 162.450 84.740 C 161.261 86.144 160.382 87.783 159.870 89.550 C 159.326 92.375 157.307 94.691 154.582 95.614 C 151.858 96.538 148.847 95.927 146.697 94.015 C 144.548 92.103 143.590 89.184 144.190 86.370 C 146.494 75.049 155.477 66.283 166.850 64.255 C 178.223 62.228 189.682 67.350 195.756 77.177 C 201.830 87.004 201.289 99.543 194.390 108.810 L 168.000 144.000 L 192.000 144.000 C 196.418 144.000 200.000 147.582 200.000 152.000 C 200.000 156.418 196.418 160.000 192.000 160.000 Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
