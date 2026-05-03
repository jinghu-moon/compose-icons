package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorBoldIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 80.000 C 152.000 73.373 157.373 68.000 164.000 68.000 L 244.000 68.000 C 250.627 68.000 256.000 73.373 256.000 80.000 C 256.000 86.627 250.627 92.000 244.000 92.000 L 164.000 92.000 C 157.373 92.000 152.000 86.627 152.000 80.000 ZM 244.000 116.000 L 164.000 116.000 C 157.373 116.000 152.000 121.373 152.000 128.000 C 152.000 134.627 157.373 140.000 164.000 140.000 L 244.000 140.000 C 250.627 140.000 256.000 134.627 256.000 128.000 C 256.000 121.373 250.627 116.000 244.000 116.000 ZM 244.000 164.000 L 188.000 164.000 C 181.373 164.000 176.000 169.373 176.000 176.000 C 176.000 182.627 181.373 188.000 188.000 188.000 L 244.000 188.000 C 250.627 188.000 256.000 182.627 256.000 176.000 C 256.000 169.373 250.627 164.000 244.000 164.000 ZM 155.620 189.000 C 157.277 195.418 153.418 201.963 147.000 203.620 C 140.582 205.277 134.037 201.418 132.380 195.000 C 126.660 172.770 104.140 156.000 80.000 156.000 C 55.860 156.000 33.340 172.760 27.620 195.000 C 25.963 201.418 19.418 205.277 13.000 203.620 C 6.582 201.963 2.723 195.418 4.380 189.000 C 9.760 168.100 24.470 150.840 43.490 141.000 C 28.461 126.189 23.872 103.763 31.876 84.239 C 39.880 64.715 58.889 51.963 79.990 51.963 C 101.091 51.963 120.100 64.715 128.104 84.239 C 136.108 103.763 131.519 126.189 116.490 141.000 C 135.530 150.850 150.240 168.110 155.620 189.000 ZM 80.000 132.000 C 95.464 132.000 108.000 119.464 108.000 104.000 C 108.000 88.536 95.464 76.000 80.000 76.000 C 64.536 76.000 52.000 88.536 52.000 104.000 C 52.000 119.464 64.536 132.000 80.000 132.000 Z"),
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
        return _userList!!
    }

private var _userList: ImageVector? = null
