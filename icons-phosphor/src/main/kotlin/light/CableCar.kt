package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorLightIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.910 31.000 C 245.630 29.426 244.734 28.028 243.420 27.118 C 242.105 26.207 240.482 25.859 238.910 26.150 L 15.000 66.100 C 11.966 66.659 9.850 69.428 10.108 72.503 C 10.367 75.578 12.915 77.955 16.000 78.000 C 16.359 77.999 16.716 77.969 17.070 77.910 L 122.000 59.170 L 122.000 98.000 L 64.000 98.000 C 47.431 98.000 34.000 111.431 34.000 128.000 L 34.000 192.000 C 34.000 208.569 47.431 222.000 64.000 222.000 L 192.000 222.000 C 208.569 222.000 222.000 208.569 222.000 192.000 L 222.000 128.000 C 222.000 111.431 208.569 98.000 192.000 98.000 L 134.000 98.000 L 134.000 57.000 L 241.050 37.910 C 244.292 37.331 246.461 34.247 245.910 31.000 ZM 102.000 162.000 L 102.000 110.000 L 154.000 110.000 L 154.000 162.000 ZM 64.000 110.000 L 90.000 110.000 L 90.000 162.000 L 46.000 162.000 L 46.000 128.000 C 46.000 118.059 54.059 110.000 64.000 110.000 ZM 192.000 210.000 L 64.000 210.000 C 54.059 210.000 46.000 201.941 46.000 192.000 L 46.000 174.000 L 210.000 174.000 L 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 ZM 210.000 128.000 L 210.000 162.000 L 166.000 162.000 L 166.000 110.000 L 192.000 110.000 C 201.941 110.000 210.000 118.059 210.000 128.000 Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
