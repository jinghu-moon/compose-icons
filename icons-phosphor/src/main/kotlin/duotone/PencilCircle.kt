package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorDuotoneIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 211.160 ZM 80.000 211.160 ZM 224.000 128.000 C 223.990 81.415 190.535 41.560 144.656 33.478 C 98.777 25.395 53.717 51.417 37.787 95.194 C 21.857 138.972 39.656 187.867 80.000 211.160 L 80.000 176.000 L 128.000 72.000 L 176.000 176.000 L 176.000 211.160 C 205.709 194.007 224.008 162.305 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 88.000 192.000 C 88.000 183.163 95.163 176.000 104.000 176.000 C 112.837 176.000 120.000 183.163 120.000 192.000 L 120.000 215.590 C 108.844 214.581 97.983 211.452 88.000 206.370 ZM 136.000 192.000 C 136.000 183.163 143.163 176.000 152.000 176.000 C 160.837 176.000 168.000 183.163 168.000 192.000 L 168.000 206.370 C 158.017 211.452 147.156 214.581 136.000 215.590 ZM 107.270 136.000 L 148.730 136.000 L 160.310 161.100 C 148.558 157.932 136.028 161.721 128.000 170.870 C 119.972 161.721 107.442 157.932 95.690 161.100 ZM 114.660 120.000 L 128.000 91.090 L 141.340 120.000 ZM 190.220 190.230 C 188.220 192.230 186.140 194.100 184.000 195.870 L 184.000 176.000 C 184.001 174.843 183.749 173.699 183.260 172.650 L 135.260 68.650 C 133.951 65.821 131.117 64.010 128.000 64.010 C 124.883 64.010 122.049 65.821 120.740 68.650 L 72.740 172.650 C 72.251 173.699 71.999 174.843 72.000 176.000 L 72.000 195.870 C 69.860 194.100 67.780 192.230 65.780 190.230 C 40.609 165.063 33.077 127.212 46.697 94.327 C 60.317 61.441 92.406 39.999 128.000 39.999 C 163.594 39.999 195.683 61.441 209.303 94.327 C 222.923 127.212 215.391 165.063 190.220 190.230 Z"),
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
