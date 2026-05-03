package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorFillIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 56.000 C 196.536 56.000 184.000 68.536 184.000 84.000 C 184.000 99.464 196.536 112.000 212.000 112.000 C 227.464 112.000 240.000 99.464 240.000 84.000 C 240.000 68.536 227.464 56.000 212.000 56.000 ZM 212.000 96.000 C 205.373 96.000 200.000 90.627 200.000 84.000 C 200.000 77.373 205.373 72.000 212.000 72.000 C 218.627 72.000 224.000 77.373 224.000 84.000 C 224.000 90.627 218.627 96.000 212.000 96.000 ZM 152.000 146.080 L 152.000 40.000 C 152.000 22.327 137.673 8.000 120.000 8.000 C 102.327 8.000 88.000 22.327 88.000 40.000 L 88.000 146.080 C 67.920 160.062 59.243 185.461 66.570 208.806 C 73.897 232.151 95.532 248.036 120.000 248.036 C 144.468 248.036 166.103 232.151 173.430 208.806 C 180.757 185.461 172.080 160.062 152.000 146.080 ZM 136.000 104.000 L 104.000 104.000 L 104.000 40.000 C 104.000 31.163 111.163 24.000 120.000 24.000 C 128.837 24.000 136.000 31.163 136.000 40.000 Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
