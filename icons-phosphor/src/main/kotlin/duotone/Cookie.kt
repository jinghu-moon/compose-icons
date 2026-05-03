package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorDuotoneIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 128.000 58.510 149.490 80.000 176.000 80.000 C 176.000 106.510 197.490 128.000 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 164.490 163.510 C 169.164 168.201 169.156 175.791 164.470 180.471 C 159.785 185.150 152.195 185.150 147.510 180.471 C 142.824 175.791 142.816 168.201 147.490 163.510 C 149.742 161.251 152.800 159.981 155.990 159.981 C 159.180 159.981 162.238 161.251 164.490 163.510 ZM 83.490 155.510 C 78.816 160.201 78.824 167.791 83.510 172.471 C 88.195 177.150 95.785 177.150 100.470 172.471 C 105.156 167.791 105.164 160.201 100.490 155.510 C 98.239 153.257 95.185 151.991 92.000 151.991 C 88.815 151.991 85.761 153.257 83.510 155.510 ZM 92.490 116.510 C 97.164 111.819 97.156 104.229 92.470 99.549 C 87.785 94.870 80.195 94.870 75.510 99.549 C 70.824 104.229 70.816 111.819 75.490 116.510 C 77.744 118.767 80.804 120.033 83.994 120.029 C 87.184 120.026 90.241 118.752 92.490 116.490 ZM 140.490 115.510 C 135.799 110.836 128.209 110.844 123.529 115.530 C 118.850 120.215 118.850 127.805 123.529 132.490 C 128.209 137.176 135.799 137.184 140.490 132.510 C 142.749 130.258 144.019 127.200 144.019 124.010 C 144.019 120.820 142.749 117.762 140.490 115.510 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 C 136.000 54.091 153.909 72.000 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 C 184.000 102.091 201.909 120.000 224.000 120.000 C 228.418 120.000 232.000 123.582 232.000 128.000 ZM 215.690 135.390 C 191.082 131.655 171.872 112.161 168.500 87.500 C 143.839 84.128 124.345 64.918 120.610 40.310 C 74.089 44.231 38.727 83.798 40.035 130.465 C 41.344 177.133 78.867 214.656 125.535 215.965 C 172.202 217.273 211.769 181.911 215.690 135.390 Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
