package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorLightIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 39.910 128.000 C 44.014 130.792 47.292 134.636 49.400 139.130 C 54.000 148.620 54.000 160.510 54.000 172.000 C 54.000 196.270 55.210 210.000 80.000 210.000 C 83.314 210.000 86.000 212.686 86.000 216.000 C 86.000 219.314 83.314 222.000 80.000 222.000 C 63.120 222.000 52.190 216.400 46.600 204.870 C 42.000 195.380 42.000 183.490 42.000 172.000 C 42.000 147.730 40.790 134.000 16.000 134.000 C 12.686 134.000 10.000 131.314 10.000 128.000 C 10.000 124.686 12.686 122.000 16.000 122.000 C 40.790 122.000 42.000 108.270 42.000 84.000 C 42.000 72.510 42.000 60.620 46.600 51.130 C 52.190 39.600 63.120 34.000 80.000 34.000 C 83.314 34.000 86.000 36.686 86.000 40.000 C 86.000 43.314 83.314 46.000 80.000 46.000 C 55.210 46.000 54.000 59.730 54.000 84.000 C 54.000 95.490 54.000 107.380 49.400 116.870 C 47.292 121.364 44.014 125.208 39.910 128.000 ZM 240.000 122.000 C 215.210 122.000 214.000 108.270 214.000 84.000 C 214.000 72.510 214.000 60.620 209.400 51.130 C 203.810 39.600 192.880 34.000 176.000 34.000 C 172.686 34.000 170.000 36.686 170.000 40.000 C 170.000 43.314 172.686 46.000 176.000 46.000 C 200.790 46.000 202.000 59.730 202.000 84.000 C 202.000 95.490 202.000 107.380 206.600 116.870 C 208.708 121.364 211.986 125.208 216.090 128.000 C 211.986 130.792 208.708 134.636 206.600 139.130 C 202.000 148.620 202.000 160.510 202.000 172.000 C 202.000 196.270 200.790 210.000 176.000 210.000 C 172.686 210.000 170.000 212.686 170.000 216.000 C 170.000 219.314 172.686 222.000 176.000 222.000 C 192.880 222.000 203.810 216.400 209.400 204.870 C 214.000 195.380 214.000 183.490 214.000 172.000 C 214.000 147.730 215.210 134.000 240.000 134.000 C 243.314 134.000 246.000 131.314 246.000 128.000 C 246.000 124.686 243.314 122.000 240.000 122.000 Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
