package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorBoldIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 128.000 C 252.000 134.627 246.627 140.000 240.000 140.000 L 226.600 140.000 C 221.010 163.428 200.086 179.969 176.000 180.000 L 140.000 180.000 L 140.000 196.000 L 160.000 196.000 C 179.882 196.000 196.000 212.118 196.000 232.000 C 196.000 238.627 190.627 244.000 184.000 244.000 C 177.373 244.000 172.000 238.627 172.000 232.000 C 172.000 225.373 166.627 220.000 160.000 220.000 L 140.000 220.000 L 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 L 116.000 220.000 L 96.000 220.000 C 89.373 220.000 84.000 225.373 84.000 232.000 C 84.000 238.627 78.627 244.000 72.000 244.000 C 65.373 244.000 60.000 238.627 60.000 232.000 C 60.000 212.118 76.118 196.000 96.000 196.000 L 116.000 196.000 L 116.000 180.000 L 80.000 180.000 C 55.914 179.969 34.990 163.428 29.400 140.000 L 16.000 140.000 C 9.373 140.000 4.000 134.627 4.000 128.000 C 4.000 121.373 9.373 116.000 16.000 116.000 L 40.000 116.000 C 46.627 116.000 52.000 121.373 52.000 128.000 C 52.000 143.464 64.536 156.000 80.000 156.000 L 176.000 156.000 C 191.464 156.000 204.000 143.464 204.000 128.000 C 204.000 121.373 209.373 116.000 216.000 116.000 L 240.000 116.000 C 246.627 116.000 252.000 121.373 252.000 128.000 ZM 72.820 133.000 C 69.038 128.587 67.363 122.747 68.230 117.000 L 81.800 29.000 C 83.248 19.199 91.682 11.953 101.590 12.000 L 154.410 12.000 C 164.318 11.953 172.752 19.199 174.200 29.000 L 187.770 117.000 C 188.644 122.762 186.962 128.618 183.163 133.037 C 179.365 137.456 173.827 139.999 168.000 140.000 L 88.000 140.000 C 82.161 139.995 76.616 137.437 72.820 133.000 ZM 92.670 116.000 L 163.330 116.000 L 151.000 36.000 L 105.000 36.000 Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
