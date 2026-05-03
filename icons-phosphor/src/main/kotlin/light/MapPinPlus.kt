package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorLightIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 104.000 C 166.000 107.314 163.314 110.000 160.000 110.000 L 134.000 110.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 L 122.000 110.000 L 96.000 110.000 C 92.686 110.000 90.000 107.314 90.000 104.000 C 90.000 100.686 92.686 98.000 96.000 98.000 L 122.000 98.000 L 122.000 72.000 C 122.000 68.686 124.686 66.000 128.000 66.000 C 131.314 66.000 134.000 68.686 134.000 72.000 L 134.000 98.000 L 160.000 98.000 C 163.314 98.000 166.000 100.686 166.000 104.000 ZM 214.000 104.000 C 214.000 134.910 199.660 167.740 172.530 198.940 C 160.285 213.091 146.503 225.836 131.440 236.940 C 129.374 238.385 126.626 238.385 124.560 236.940 C 109.497 225.836 95.715 213.091 83.470 198.940 C 56.340 167.740 42.000 134.910 42.000 104.000 C 42.000 56.504 80.504 18.000 128.000 18.000 C 175.496 18.000 214.000 56.504 214.000 104.000 ZM 202.000 104.000 C 202.000 63.131 168.869 30.000 128.000 30.000 C 87.131 30.000 54.000 63.131 54.000 104.000 C 54.000 163.620 113.000 212.930 128.000 224.510 C 143.000 212.930 202.000 163.620 202.000 104.000 Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
