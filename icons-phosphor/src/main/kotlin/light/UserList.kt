package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorLightIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 154.000 80.000 C 154.000 76.686 156.686 74.000 160.000 74.000 L 248.000 74.000 C 251.314 74.000 254.000 76.686 254.000 80.000 C 254.000 83.314 251.314 86.000 248.000 86.000 L 160.000 86.000 C 156.686 86.000 154.000 83.314 154.000 80.000 ZM 248.000 122.000 L 160.000 122.000 C 156.686 122.000 154.000 124.686 154.000 128.000 C 154.000 131.314 156.686 134.000 160.000 134.000 L 248.000 134.000 C 251.314 134.000 254.000 131.314 254.000 128.000 C 254.000 124.686 251.314 122.000 248.000 122.000 ZM 248.000 170.000 L 184.000 170.000 C 180.686 170.000 178.000 172.686 178.000 176.000 C 178.000 179.314 180.686 182.000 184.000 182.000 L 248.000 182.000 C 251.314 182.000 254.000 179.314 254.000 176.000 C 254.000 172.686 251.314 170.000 248.000 170.000 ZM 149.810 190.500 C 150.638 193.709 148.709 196.982 145.500 197.810 C 142.291 198.638 139.018 196.709 138.190 193.500 C 131.700 168.290 107.230 150.000 80.000 150.000 C 52.770 150.000 28.300 168.290 21.810 193.490 C 20.982 196.699 17.709 198.628 14.500 197.800 C 11.291 196.972 9.362 193.699 10.190 190.490 C 15.930 168.210 33.190 150.420 54.860 142.490 C 37.815 131.366 30.106 110.363 35.909 90.853 C 41.712 71.344 59.646 57.968 80.000 57.968 C 100.354 57.968 118.288 71.344 124.091 90.853 C 129.894 110.363 122.185 131.366 105.140 142.490 C 126.790 150.430 144.080 168.220 149.810 190.500 ZM 80.000 138.000 C 98.778 138.000 114.000 122.778 114.000 104.000 C 114.000 85.222 98.778 70.000 80.000 70.000 C 61.222 70.000 46.000 85.222 46.000 104.000 C 46.000 122.778 61.222 138.000 80.000 138.000 Z"),
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
