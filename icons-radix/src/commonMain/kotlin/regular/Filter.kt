package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Filter: ImageVector
    get() {
        if (_filter != null) return _filter!!
        _filter = radixIcon(
            name = "Filter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.601 10.010 C 9.829 10.056 10.000 10.258 10.000 10.500 C 10.000 10.742 9.829 10.944 9.601 10.990 L 9.500 11.000 L 5.500 11.000 C 5.224 11.000 5.000 10.776 5.000 10.500 C 5.000 10.224 5.224 10.000 5.500 10.000 L 9.500 10.000 L 9.601 10.010 ZM 11.601 7.010 C 11.829 7.056 12.000 7.258 12.000 7.500 C 12.000 7.742 11.829 7.944 11.601 7.990 L 11.500 8.000 L 3.500 8.000 C 3.224 8.000 3.000 7.776 3.000 7.500 C 3.000 7.224 3.224 7.000 3.500 7.000 L 11.500 7.000 L 11.601 7.010 ZM 13.500 4.000 C 13.776 4.000 14.000 4.224 14.000 4.500 C 14.000 4.776 13.776 5.000 13.500 5.000 L 1.500 5.000 C 1.224 5.000 1.000 4.776 1.000 4.500 C 1.000 4.224 1.224 4.000 1.500 4.000 L 13.500 4.000 Z"),
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
        return _filter!!
    }

private var _filter: ImageVector? = null
