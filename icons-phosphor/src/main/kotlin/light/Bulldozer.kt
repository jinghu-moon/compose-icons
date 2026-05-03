package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorLightIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 202.000 L 240.000 202.000 C 234.477 202.000 230.000 197.523 230.000 192.000 L 230.000 160.000 C 230.000 154.477 234.477 150.000 240.000 150.000 L 248.000 150.000 C 251.314 150.000 254.000 147.314 254.000 144.000 C 254.000 140.686 251.314 138.000 248.000 138.000 L 240.000 138.000 C 227.850 138.000 218.000 147.850 218.000 160.000 L 218.000 170.000 L 197.520 170.000 C 194.790 153.095 181.111 140.092 164.090 138.220 L 127.590 50.610 C 125.415 45.396 120.319 42.000 114.670 42.000 L 24.000 42.000 C 16.268 42.000 10.000 48.268 10.000 56.000 L 10.000 152.720 C 1.119 164.177 -0.469 179.689 5.904 192.708 C 12.278 205.728 25.504 213.987 40.000 214.000 L 160.000 214.000 C 178.662 213.977 194.553 200.424 197.520 182.000 L 218.000 182.000 L 218.000 192.000 C 218.000 204.150 227.850 214.000 240.000 214.000 L 248.000 214.000 C 251.314 214.000 254.000 211.314 254.000 208.000 C 254.000 204.686 251.314 202.000 248.000 202.000 ZM 116.510 55.230 L 151.000 138.000 L 62.000 138.000 L 62.000 54.000 L 114.670 54.000 C 115.475 54.002 116.200 54.487 116.510 55.230 ZM 24.000 54.000 L 50.000 54.000 L 50.000 138.000 L 40.000 138.000 C 33.716 137.994 27.530 139.555 22.000 142.540 L 22.000 56.000 C 22.000 54.895 22.895 54.000 24.000 54.000 ZM 160.000 202.000 L 40.000 202.000 C 25.641 202.000 14.000 190.359 14.000 176.000 C 14.000 161.641 25.641 150.000 40.000 150.000 L 160.000 150.000 C 174.359 150.000 186.000 161.641 186.000 176.000 C 186.000 190.359 174.359 202.000 160.000 202.000 ZM 166.000 176.000 C 166.000 179.314 163.314 182.000 160.000 182.000 L 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 C 34.000 172.686 36.686 170.000 40.000 170.000 L 160.000 170.000 C 163.314 170.000 166.000 172.686 166.000 176.000 Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
