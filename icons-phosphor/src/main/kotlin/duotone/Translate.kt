package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorDuotoneIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 184.000 L 144.000 184.000 L 184.000 104.000 ZM 96.000 127.560 L 96.000 127.560 C 116.386 109.364 128.030 83.326 128.000 56.000 L 64.000 56.000 C 63.970 83.326 75.614 109.364 96.000 127.560 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 247.150 212.420 L 191.150 100.420 C 189.795 97.710 187.025 95.999 183.995 95.999 C 180.965 95.999 178.195 97.710 176.840 100.420 L 155.130 143.850 C 138.113 142.893 121.740 137.015 108.000 126.930 C 124.121 109.715 133.889 87.516 135.690 64.000 L 160.000 64.000 C 164.418 64.000 168.000 60.418 168.000 56.000 C 168.000 51.582 164.418 48.000 160.000 48.000 L 104.000 48.000 L 104.000 32.000 C 104.000 27.582 100.418 24.000 96.000 24.000 C 91.582 24.000 88.000 27.582 88.000 32.000 L 88.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 C 24.000 60.418 27.582 64.000 32.000 64.000 L 119.630 64.000 C 117.853 83.608 109.529 102.047 96.000 116.350 C 87.572 107.457 81.099 96.897 77.000 85.350 C 76.083 82.608 73.757 80.574 70.917 80.031 C 68.077 79.487 65.165 80.519 63.300 82.728 C 61.435 84.938 60.907 87.982 61.920 90.690 C 66.693 104.189 74.211 116.552 84.000 127.000 C 68.928 138.076 50.704 144.033 32.000 144.000 C 27.582 144.000 24.000 147.582 24.000 152.000 C 24.000 156.418 27.582 160.000 32.000 160.000 C 55.206 160.026 77.747 152.249 96.000 137.920 C 110.896 149.559 128.678 156.925 147.440 159.230 L 120.840 212.420 C 118.863 216.372 120.463 221.178 124.415 223.155 C 128.367 225.132 133.173 223.532 135.150 219.580 L 148.940 192.000 L 219.050 192.000 L 232.840 219.580 C 234.197 222.291 236.969 224.002 240.000 224.000 C 242.772 223.999 245.346 222.562 246.803 220.203 C 248.259 217.844 248.391 214.899 247.150 212.420 ZM 156.940 176.000 L 184.000 121.890 L 211.050 176.000 Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
