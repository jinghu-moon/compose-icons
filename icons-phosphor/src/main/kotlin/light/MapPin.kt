package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorLightIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 66.000 C 107.013 66.000 90.000 83.013 90.000 104.000 C 90.000 124.987 107.013 142.000 128.000 142.000 C 148.987 142.000 166.000 124.987 166.000 104.000 C 166.000 83.013 148.987 66.000 128.000 66.000 ZM 128.000 130.000 C 113.641 130.000 102.000 118.359 102.000 104.000 C 102.000 89.641 113.641 78.000 128.000 78.000 C 142.359 78.000 154.000 89.641 154.000 104.000 C 154.000 118.359 142.359 130.000 128.000 130.000 ZM 128.000 18.000 C 80.526 18.055 42.055 56.526 42.000 104.000 C 42.000 134.910 56.340 167.740 83.470 198.940 C 95.715 213.091 109.497 225.836 124.560 236.940 C 126.626 238.385 129.374 238.385 131.440 236.940 C 146.503 225.836 160.285 213.091 172.530 198.940 C 199.660 167.740 214.000 134.940 214.000 104.000 C 213.945 56.526 175.474 18.055 128.000 18.000 ZM 128.000 224.510 C 113.000 212.930 54.000 163.620 54.000 104.000 C 54.000 63.131 87.131 30.000 128.000 30.000 C 168.869 30.000 202.000 63.131 202.000 104.000 C 202.000 163.620 143.000 212.930 128.000 224.510 Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
