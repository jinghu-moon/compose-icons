package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorThinIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 84.000 108.000 C 84.000 103.582 87.582 100.000 92.000 100.000 C 96.418 100.000 100.000 103.582 100.000 108.000 C 100.000 112.418 96.418 116.000 92.000 116.000 C 87.582 116.000 84.000 112.418 84.000 108.000 ZM 172.000 108.000 C 172.000 112.418 168.418 116.000 164.000 116.000 C 159.582 116.000 156.000 112.418 156.000 108.000 C 156.000 103.582 159.582 100.000 164.000 100.000 C 168.418 100.000 172.000 103.582 172.000 108.000 ZM 171.460 174.000 C 172.562 175.911 171.909 178.354 170.000 179.460 C 169.394 179.816 168.703 180.002 168.000 180.000 C 166.572 179.999 165.254 179.236 164.540 178.000 C 156.330 163.810 143.350 156.000 128.000 156.000 C 112.650 156.000 99.670 163.810 91.460 178.000 C 90.310 179.809 87.938 180.390 86.083 179.317 C 84.227 178.244 83.546 175.899 84.540 174.000 C 94.090 157.480 109.940 148.000 128.000 148.000 C 146.060 148.000 161.910 157.480 171.460 174.000 Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
