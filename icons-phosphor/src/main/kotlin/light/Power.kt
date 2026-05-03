package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorLightIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 122.000 128.000 L 122.000 48.000 C 122.000 44.686 124.686 42.000 128.000 42.000 C 131.314 42.000 134.000 44.686 134.000 48.000 L 134.000 128.000 C 134.000 131.314 131.314 134.000 128.000 134.000 C 124.686 134.000 122.000 131.314 122.000 128.000 ZM 179.280 51.000 C 176.537 49.507 173.107 50.367 171.394 52.979 C 169.681 55.590 170.258 59.079 172.720 61.000 C 196.410 76.470 210.000 100.880 210.000 128.000 C 210.000 173.287 173.287 210.000 128.000 210.000 C 82.713 210.000 46.000 173.287 46.000 128.000 C 46.000 100.880 59.590 76.470 83.280 61.000 C 85.742 59.079 86.319 55.590 84.606 52.979 C 82.893 50.367 79.463 49.507 76.720 51.000 C 49.570 68.680 34.000 96.750 34.000 128.000 C 34.000 179.915 76.085 222.000 128.000 222.000 C 179.915 222.000 222.000 179.915 222.000 128.000 C 222.000 96.750 206.430 68.680 179.280 51.000 Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
