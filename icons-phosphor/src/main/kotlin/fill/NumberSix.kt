package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorFillIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 128.000 192.000 C 112.362 191.992 97.904 183.685 90.021 170.180 C 82.139 156.674 82.016 140.000 89.700 126.380 L 123.380 68.000 C 125.589 64.173 130.483 62.861 134.310 65.070 C 138.137 67.279 139.449 72.173 137.240 76.000 L 120.720 104.610 C 123.126 104.209 125.561 104.005 128.000 104.000 C 152.301 104.000 172.000 123.699 172.000 148.000 C 172.000 172.301 152.301 192.000 128.000 192.000 ZM 156.000 148.000 C 156.000 163.464 143.464 176.000 128.000 176.000 C 112.536 176.000 100.000 163.464 100.000 148.000 C 100.000 132.536 112.536 120.000 128.000 120.000 C 143.464 120.000 156.000 132.536 156.000 148.000 Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
