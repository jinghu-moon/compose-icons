package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorLightIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 163.070 164.930 C 165.931 167.790 166.787 172.091 165.239 175.828 C 163.691 179.565 160.045 182.002 156.000 182.002 C 151.955 182.002 148.309 179.565 146.761 175.828 C 145.213 172.091 146.069 167.790 148.930 164.930 C 152.835 161.026 159.165 161.026 163.070 164.930 ZM 84.930 156.930 C 82.069 159.790 81.213 164.091 82.761 167.828 C 84.309 171.565 87.955 174.002 92.000 174.002 C 96.045 174.002 99.691 171.565 101.239 167.828 C 102.787 164.091 101.931 159.790 99.070 156.930 C 95.165 153.026 88.835 153.026 84.930 156.930 ZM 91.070 115.070 C 93.931 112.210 94.787 107.909 93.239 104.172 C 91.691 100.435 88.045 97.998 84.000 97.998 C 79.955 97.998 76.309 100.435 74.761 104.172 C 73.213 107.909 74.069 112.210 76.930 115.070 C 80.835 118.974 87.165 118.974 91.070 115.070 ZM 124.930 116.930 C 122.069 119.790 121.213 124.091 122.761 127.828 C 124.309 131.565 127.955 134.002 132.000 134.002 C 136.045 134.002 139.691 131.565 141.239 127.828 C 142.787 124.091 141.931 119.790 139.070 116.930 C 135.165 113.026 128.835 113.026 124.930 116.930 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 131.314 26.000 134.000 28.686 134.000 32.000 C 134.000 55.196 152.804 74.000 176.000 74.000 C 179.314 74.000 182.000 76.686 182.000 80.000 C 182.000 103.196 200.804 122.000 224.000 122.000 C 227.314 122.000 230.000 124.686 230.000 128.000 ZM 217.820 133.650 C 192.726 130.726 172.998 110.820 170.300 85.700 C 145.158 83.023 125.224 63.285 122.300 38.170 C 74.156 41.197 36.960 81.644 37.968 129.873 C 38.976 178.102 77.829 216.960 126.058 217.973 C 174.287 218.986 214.738 181.794 217.770 133.650 Z"),
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
