package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorBoldIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.510 197.940 C 231.930 183.142 230.125 162.067 216.356 149.426 C 202.586 136.786 181.434 136.786 167.664 149.426 C 153.895 162.067 152.090 183.142 163.510 197.940 C 156.142 203.786 150.854 211.852 148.430 220.940 C 146.734 227.343 150.548 233.910 156.950 235.610 C 157.945 235.873 158.971 236.004 160.000 236.000 C 165.438 235.996 170.194 232.336 171.590 227.080 C 174.000 218.200 182.350 212.000 192.000 212.000 C 201.650 212.000 210.000 218.200 212.400 227.080 C 214.188 233.382 220.699 237.086 227.030 235.401 C 233.360 233.717 237.170 227.267 235.590 220.910 C 233.164 211.831 227.876 203.776 220.510 197.940 ZM 192.000 164.000 C 198.627 164.000 204.000 169.373 204.000 176.000 C 204.000 182.627 198.627 188.000 192.000 188.000 C 185.373 188.000 180.000 182.627 180.000 176.000 C 180.000 169.373 185.373 164.000 192.000 164.000 ZM 236.000 88.000 L 236.000 108.000 C 236.000 114.627 230.627 120.000 224.000 120.000 C 217.373 120.000 212.000 114.627 212.000 108.000 L 212.000 92.000 L 130.670 92.000 C 126.344 91.993 122.135 90.590 118.670 88.000 L 92.000 68.000 L 44.000 68.000 L 44.000 196.000 L 112.000 196.000 C 118.627 196.000 124.000 201.373 124.000 208.000 C 124.000 214.627 118.627 220.000 112.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 64.000 C 20.000 52.954 28.954 44.000 40.000 44.000 L 93.330 44.000 C 97.656 44.009 101.864 45.411 105.330 48.000 L 132.000 68.000 L 216.000 68.000 C 227.046 68.000 236.000 76.954 236.000 88.000 Z"),
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
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
