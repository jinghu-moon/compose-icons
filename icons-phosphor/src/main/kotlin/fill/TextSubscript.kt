package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorFillIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 126.550 147.410 C 128.264 149.748 128.579 152.830 127.374 155.467 C 126.169 158.103 123.631 159.881 120.742 160.115 C 117.852 160.348 115.062 158.999 113.450 156.590 L 92.000 126.000 L 70.550 156.590 C 68.938 158.999 66.148 160.348 63.258 160.115 C 60.369 159.881 57.831 158.103 56.626 155.467 C 55.421 152.830 55.736 149.748 57.450 147.410 L 82.230 112.000 L 57.450 76.590 C 55.030 72.974 55.944 68.086 59.507 65.589 C 63.071 63.092 67.977 63.901 70.550 67.410 L 92.000 98.050 L 113.450 67.410 C 116.023 63.901 120.929 63.092 124.493 65.589 C 128.056 68.086 128.970 72.974 126.550 76.590 L 101.770 112.000 ZM 192.000 192.000 L 152.000 192.000 C 148.970 192.000 146.200 190.288 144.845 187.578 C 143.489 184.867 143.782 181.624 145.600 179.200 L 181.600 131.200 C 184.276 127.785 184.901 123.192 183.233 119.186 C 181.566 115.181 177.867 112.387 173.558 111.880 C 169.249 111.373 165.002 113.231 162.450 116.740 C 161.261 118.144 160.382 119.783 159.870 121.550 C 159.326 124.375 157.307 126.691 154.582 127.614 C 151.858 128.538 148.847 127.927 146.697 126.015 C 144.548 124.103 143.590 121.184 144.190 118.370 C 146.494 107.049 155.477 98.283 166.850 96.255 C 178.223 94.228 189.682 99.350 195.756 109.177 C 201.830 119.004 201.289 131.543 194.390 140.810 L 168.000 176.000 L 192.000 176.000 C 196.418 176.000 200.000 179.582 200.000 184.000 C 200.000 188.418 196.418 192.000 192.000 192.000 Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
