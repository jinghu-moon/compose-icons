package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) return _zoomOut!!
        _zoomOut = radixIcon(
            name = "ZoomOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.500 2.000 C 8.985 2.000 11.000 4.015 11.000 6.500 C 11.000 7.562 10.630 8.538 10.015 9.308 L 12.854 12.146 L 12.918 12.225 C 13.046 12.419 13.024 12.683 12.854 12.854 C 12.683 13.024 12.419 13.046 12.225 12.918 L 12.146 12.854 L 9.308 10.015 C 8.538 10.630 7.562 11.000 6.500 11.000 C 4.015 11.000 2.000 8.985 2.000 6.500 C 2.000 4.015 4.015 2.000 6.500 2.000 ZM 6.500 3.000 C 4.567 3.000 3.000 4.567 3.000 6.500 C 3.000 8.433 4.567 10.000 6.500 10.000 C 8.433 10.000 10.000 8.433 10.000 6.500 C 10.000 4.567 8.433 3.000 6.500 3.000 ZM 8.351 6.010 C 8.579 6.056 8.750 6.258 8.750 6.500 C 8.750 6.742 8.579 6.944 8.351 6.990 L 8.250 7.000 L 4.750 7.000 C 4.474 7.000 4.250 6.776 4.250 6.500 C 4.250 6.224 4.474 6.000 4.750 6.000 L 8.250 6.000 L 8.351 6.010 Z"),
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
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
