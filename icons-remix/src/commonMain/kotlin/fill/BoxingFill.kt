package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BoxingFill: ImageVector
    get() {
        if (_boxingFill != null) return _boxingFill!!
        _boxingFill = remixIcon(
            name = "BoxingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.501 11.000 L 9.645 11.007 C 10.359 11.075 10.926 11.642 10.994 12.356 L 11.001 12.500 L 10.994 12.644 C 10.926 13.358 10.359 13.925 9.645 13.993 L 9.501 14.000 L 6.001 14.000 L 6.001 16.000 L 9.501 16.000 C 11.201 16.000 12.618 14.788 12.935 13.181 L 12.965 13.001 L 19.001 13.000 C 19.712 13.000 20.389 12.851 21.001 12.584 L 21.001 17.000 C 21.001 18.306 20.167 19.417 19.002 19.829 L 19.001 21.000 C 19.001 21.552 18.553 22.000 18.001 22.000 L 6.001 22.000 C 5.449 22.000 5.001 21.552 5.001 21.000 L 5.001 19.829 C 3.836 19.417 3.001 18.306 3.001 17.000 L 3.001 13.000 C 3.001 11.895 3.896 11.000 5.001 11.000 L 9.501 11.000 ZM 22.001 7.500 L 22.001 8.000 L 21.996 8.176 C 21.908 9.693 20.694 10.907 19.177 10.995 L 19.001 11.000 L 12.664 11.000 C 12.130 9.877 11.016 9.083 9.709 9.006 L 9.501 9.000 L 5.001 9.000 C 4.272 9.000 3.589 9.195 3.000 9.536 L 3.001 6.000 C 3.001 3.791 4.792 2.000 7.001 2.000 L 16.501 2.000 C 19.539 2.000 22.001 4.462 22.001 7.500 Z"),
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
        return _boxingFill!!
    }

private var _boxingFill: ImageVector? = null
