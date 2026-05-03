package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorThinIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 93.540 102.130 C 102.090 118.317 102.090 137.683 93.540 153.870 C 92.846 155.182 91.484 156.001 90.000 156.000 C 89.349 155.998 88.708 155.841 88.130 155.540 C 87.190 155.045 86.486 154.196 86.173 153.181 C 85.860 152.166 85.963 151.069 86.460 150.130 C 93.890 136.312 93.890 119.688 86.460 105.870 C 85.427 103.915 86.175 101.493 88.130 100.460 C 90.085 99.427 92.507 100.175 93.540 102.130 ZM 144.120 68.470 C 142.171 69.509 141.432 71.930 142.470 73.880 C 160.570 107.690 160.570 148.310 142.470 182.120 C 141.769 183.384 141.804 184.928 142.562 186.158 C 143.320 187.389 144.683 188.115 146.128 188.057 C 147.572 188.000 148.873 187.167 149.530 185.880 C 168.885 149.720 168.885 106.280 149.530 70.120 C 148.491 68.171 146.070 67.432 144.120 68.470 ZM 116.120 84.470 C 114.171 85.509 113.432 87.930 114.470 89.880 C 127.178 113.705 127.178 142.295 114.470 166.120 C 113.769 167.384 113.804 168.928 114.562 170.158 C 115.320 171.389 116.683 172.115 118.128 172.057 C 119.572 172.000 120.873 171.167 121.530 169.880 C 135.489 143.705 135.489 112.295 121.530 86.120 C 120.491 84.171 118.070 83.432 116.120 84.470 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
