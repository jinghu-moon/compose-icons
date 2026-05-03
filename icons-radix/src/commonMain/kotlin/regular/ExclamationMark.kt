package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = radixIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 10.750 C 7.914 10.750 8.250 11.086 8.250 11.500 C 8.250 11.914 7.914 12.250 7.500 12.250 C 7.086 12.250 6.750 11.914 6.750 11.500 C 6.750 11.086 7.086 10.750 7.500 10.750 ZM 7.483 2.250 C 8.001 2.251 8.414 2.680 8.394 3.198 L 8.206 8.805 C 8.191 9.183 7.881 9.482 7.503 9.482 C 7.124 9.482 6.814 9.183 6.800 8.805 L 6.571 3.198 C 6.551 2.680 6.965 2.250 7.483 2.250 Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
