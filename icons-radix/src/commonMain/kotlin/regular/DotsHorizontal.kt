package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DotsHorizontal: ImageVector
    get() {
        if (_dotsHorizontal != null) return _dotsHorizontal!!
        _dotsHorizontal = radixIcon(
            name = "DotsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 6.375 C 3.121 6.375 3.625 6.879 3.625 7.500 C 3.625 8.121 3.121 8.625 2.500 8.625 C 1.879 8.625 1.375 8.121 1.375 7.500 C 1.375 6.879 1.879 6.375 2.500 6.375 ZM 7.500 6.375 C 8.121 6.375 8.625 6.879 8.625 7.500 C 8.625 8.121 8.121 8.625 7.500 8.625 C 6.879 8.625 6.375 8.121 6.375 7.500 C 6.375 6.879 6.879 6.375 7.500 6.375 ZM 12.500 6.375 C 13.121 6.375 13.625 6.879 13.625 7.500 C 13.625 8.121 13.121 8.625 12.500 8.625 C 11.879 8.625 11.375 8.121 11.375 7.500 C 11.375 6.879 11.879 6.375 12.500 6.375 Z"),
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
        return _dotsHorizontal!!
    }

private var _dotsHorizontal: ImageVector? = null
