package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorLightIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.200 84.280 L 58.600 172.280 C 56.267 174.567 52.533 174.567 50.200 172.280 L 11.800 134.570 C 9.433 132.250 9.395 128.452 11.715 126.085 C 14.035 123.718 17.833 123.680 20.200 126.000 L 54.400 159.580 L 139.800 75.710 C 141.312 74.122 143.569 73.485 145.687 74.049 C 147.806 74.612 149.449 76.286 149.972 78.415 C 150.495 80.544 149.816 82.789 148.200 84.270 ZM 244.280 75.800 C 241.960 73.438 238.165 73.402 235.800 75.720 L 150.400 159.590 L 130.170 139.720 C 127.806 137.398 124.007 137.431 121.685 139.795 C 119.363 142.159 119.396 145.958 121.760 148.280 L 146.200 172.280 C 148.533 174.567 152.267 174.567 154.600 172.280 L 244.200 84.280 C 246.562 81.960 246.598 78.165 244.280 75.800 Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
