package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ZcoolFill: ImageVector
    get() {
        if (_zcoolFill != null) return _zcoolFill!!
        _zcoolFill = remixIcon(
            name = "ZcoolFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.903 21.839 C 5.539 21.839 2.001 18.300 2.001 13.936 C 2.001 10.290 4.468 7.060 7.825 6.309 C 11.746 5.431 13.529 4.742 14.902 2.000 C 15.900 3.935 15.225 5.710 14.903 6.677 C 19.600 5.548 21.273 3.396 21.676 3.129 C 21.676 7.081 20.445 9.581 19.257 11.193 C 20.733 11.138 21.266 10.710 22.001 10.607 C 21.676 12.055 20.500 14.097 17.670 15.402 C 16.983 19.066 13.767 21.839 9.903 21.839 ZM 13.613 15.387 C 13.613 15.710 13.559 15.871 13.210 15.871 L 10.059 15.873 L 13.020 12.625 C 13.880 11.765 13.880 11.335 13.880 10.237 C 13.880 9.903 13.832 9.520 13.928 9.186 C 13.975 9.043 13.880 8.995 13.737 9.043 C 13.402 9.138 12.829 9.138 11.874 9.138 L 7.576 9.138 C 7.337 9.138 7.241 8.995 7.337 8.804 C 7.337 8.756 7.337 8.613 7.241 8.613 C 6.621 8.899 6.477 10.189 6.525 11.001 C 6.525 11.431 6.764 11.670 7.098 11.670 L 10.489 11.670 L 7.003 15.395 C 6.764 15.682 6.525 16.064 6.525 16.589 L 6.525 17.640 C 6.525 18.118 6.812 18.404 7.337 18.500 L 13.325 18.500 C 13.880 18.500 14.258 18.267 14.258 17.645 L 14.258 16.516 C 14.258 16.308 14.258 15.548 13.613 15.387 Z"),
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
        return _zcoolFill!!
    }

private var _zcoolFill: ImageVector? = null
