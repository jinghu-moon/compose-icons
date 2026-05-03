package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorRegularIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 168.000 112.000 C 168.004 93.498 155.319 77.408 137.327 73.094 C 119.336 68.780 100.733 77.367 92.346 93.859 C 83.959 110.350 87.976 130.442 102.060 142.440 L 88.680 172.770 C 87.588 175.244 87.820 178.103 89.297 180.368 C 90.774 182.634 93.295 184.000 96.000 184.000 L 160.000 184.000 C 162.705 184.000 165.226 182.634 166.703 180.368 C 168.180 178.103 168.412 175.244 167.320 172.770 L 153.940 142.440 C 162.843 134.830 167.979 123.712 168.000 112.000 ZM 136.680 143.000 L 147.680 168.050 L 108.270 168.050 L 119.270 143.000 C 120.959 139.262 119.546 134.852 116.000 132.790 C 106.593 127.359 102.006 116.286 104.818 105.794 C 107.629 95.301 117.137 88.005 128.000 88.005 C 138.863 88.005 148.371 95.301 151.182 105.794 C 153.994 116.286 149.407 127.359 140.000 132.790 C 136.435 134.835 135.000 139.249 136.680 143.000 Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
