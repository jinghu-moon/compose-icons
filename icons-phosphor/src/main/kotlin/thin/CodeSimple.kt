package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorThinIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.660 67.000 L 22.000 128.000 L 90.640 189.000 C 92.297 190.469 92.449 193.003 90.980 194.660 C 89.511 196.317 86.977 196.469 85.320 195.000 L 13.320 131.000 C 12.459 130.241 11.966 129.148 11.966 128.000 C 11.966 126.852 12.459 125.759 13.320 125.000 L 85.320 61.000 C 86.977 59.531 89.511 59.683 90.980 61.340 C 92.449 62.997 92.297 65.531 90.640 67.000 ZM 242.660 125.000 L 170.660 61.000 C 169.003 59.531 166.469 59.683 165.000 61.340 C 163.531 62.997 163.683 65.531 165.340 67.000 L 234.000 128.000 L 165.360 189.000 C 163.703 190.469 163.551 193.003 165.020 194.660 C 166.489 196.317 169.023 196.469 170.680 195.000 L 242.680 131.000 C 243.541 130.241 244.034 129.148 244.034 128.000 C 244.034 126.852 243.541 125.759 242.680 125.000 Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
