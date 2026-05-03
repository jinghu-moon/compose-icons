package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorDuotoneIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 48.000 L 68.320 70.380 C 65.647 71.383 63.711 73.734 63.240 76.550 L 40.000 216.000 L 179.450 192.760 C 182.266 192.289 184.617 190.353 185.620 187.680 L 208.000 128.000 ZM 124.000 152.000 C 112.954 152.000 104.000 143.046 104.000 132.000 C 104.000 120.954 112.954 112.000 124.000 112.000 C 135.046 112.000 144.000 120.954 144.000 132.000 C 144.000 143.046 135.046 152.000 124.000 152.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 248.000 92.680 C 248.014 88.434 246.324 84.360 243.310 81.370 L 174.630 12.680 C 171.629 9.679 167.559 7.992 163.315 7.992 C 159.071 7.992 155.001 9.679 152.000 12.680 L 123.570 41.110 L 65.570 62.880 C 60.205 64.881 56.312 69.586 55.350 75.230 L 32.110 214.680 C 31.722 217.000 32.375 219.374 33.895 221.169 C 35.414 222.964 37.648 224.000 40.000 224.000 C 40.442 223.998 40.884 223.961 41.320 223.890 L 180.760 200.650 C 186.398 199.709 191.105 195.833 193.110 190.480 L 214.880 132.480 L 243.310 104.000 C 246.326 101.007 248.015 96.929 248.000 92.680 ZM 178.130 184.870 L 63.320 204.000 L 110.690 156.630 C 122.920 163.240 138.147 159.875 146.454 148.729 C 154.761 137.582 153.632 122.028 143.802 112.198 C 133.972 102.368 118.418 101.239 107.271 109.546 C 96.125 117.853 92.760 133.080 99.370 145.310 L 52.000 192.700 L 71.130 77.860 L 126.000 57.290 L 198.700 130.000 ZM 112.000 132.000 C 112.000 125.373 117.373 120.000 124.000 120.000 C 130.627 120.000 136.000 125.373 136.000 132.000 C 136.000 138.627 130.627 144.000 124.000 144.000 C 117.373 144.000 112.000 138.627 112.000 132.000 ZM 208.000 116.680 L 139.310 48.000 L 163.310 24.000 L 232.000 92.680 Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
