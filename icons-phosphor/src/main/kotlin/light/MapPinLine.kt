package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorLightIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 226.000 L 145.220 226.000 C 154.963 217.650 164.090 208.606 172.530 198.940 C 199.660 167.740 214.000 134.940 214.000 104.000 C 214.000 56.504 175.496 18.000 128.000 18.000 C 80.504 18.000 42.000 56.504 42.000 104.000 C 42.000 134.910 56.340 167.740 83.470 198.940 C 91.910 208.606 101.037 217.650 110.780 226.000 L 56.000 226.000 C 52.686 226.000 50.000 228.686 50.000 232.000 C 50.000 235.314 52.686 238.000 56.000 238.000 L 200.000 238.000 C 203.314 238.000 206.000 235.314 206.000 232.000 C 206.000 228.686 203.314 226.000 200.000 226.000 ZM 54.000 104.000 C 54.000 63.131 87.131 30.000 128.000 30.000 C 168.869 30.000 202.000 63.131 202.000 104.000 C 202.000 163.620 143.000 212.930 128.000 224.510 C 113.000 212.930 54.000 163.620 54.000 104.000 ZM 166.000 104.000 C 166.000 83.013 148.987 66.000 128.000 66.000 C 107.013 66.000 90.000 83.013 90.000 104.000 C 90.000 124.987 107.013 142.000 128.000 142.000 C 148.987 142.000 166.000 124.987 166.000 104.000 ZM 102.000 104.000 C 102.000 89.641 113.641 78.000 128.000 78.000 C 142.359 78.000 154.000 89.641 154.000 104.000 C 154.000 118.359 142.359 130.000 128.000 130.000 C 113.641 130.000 102.000 118.359 102.000 104.000 Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
