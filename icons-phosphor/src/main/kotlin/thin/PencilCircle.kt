package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorThinIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 104.710 132.000 L 151.290 132.000 L 168.570 169.450 C 162.222 164.790 154.206 163.019 146.486 164.570 C 138.766 166.120 132.056 170.850 128.000 177.600 C 123.944 170.850 117.234 166.120 109.514 164.570 C 101.794 163.019 93.778 164.790 87.430 169.450 ZM 108.410 124.000 L 128.000 81.550 L 147.590 124.000 ZM 132.000 192.000 C 132.000 180.954 140.954 172.000 152.000 172.000 C 163.046 172.000 172.000 180.954 172.000 192.000 L 172.000 208.830 C 159.693 215.541 146.006 219.329 132.000 219.900 ZM 84.000 192.000 C 84.000 180.954 92.954 172.000 104.000 172.000 C 115.046 172.000 124.000 180.954 124.000 192.000 L 124.000 219.900 C 109.994 219.329 96.307 215.541 84.000 208.830 ZM 193.050 193.050 C 189.042 197.059 184.674 200.691 180.000 203.900 L 180.000 176.000 C 179.998 175.420 179.872 174.847 179.630 174.320 L 131.630 70.320 C 130.975 68.906 129.559 68.000 128.000 68.000 C 126.441 68.000 125.025 68.906 124.370 70.320 L 76.370 174.320 C 76.128 174.847 76.002 175.420 76.000 176.000 L 76.000 203.900 C 71.344 200.689 66.992 197.057 63.000 193.050 C 36.686 166.739 28.813 127.167 43.052 92.788 C 57.291 58.409 90.838 35.992 128.050 35.992 C 165.262 35.992 198.809 58.409 213.048 92.788 C 227.287 127.167 219.414 166.739 193.100 193.050 Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
