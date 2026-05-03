package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ServiceFill: ImageVector
    get() {
        if (_serviceFill != null) return _serviceFill!!
        _serviceFill = remixIcon(
            name = "ServiceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.121 10.479 C 13.731 10.089 13.098 10.089 12.707 10.479 L 12.000 11.186 C 11.219 11.967 9.953 11.967 9.172 11.186 C 8.390 10.405 8.390 9.139 9.172 8.358 L 14.802 2.726 C 16.906 2.250 19.201 2.831 20.839 4.469 C 23.258 6.888 23.372 10.740 21.179 13.294 L 19.071 15.429 L 14.121 10.479 ZM 3.161 4.469 C 5.335 2.295 8.664 1.983 11.170 3.531 L 7.757 6.944 C 6.195 8.506 6.195 11.038 7.757 12.601 C 9.272 14.115 11.700 14.161 13.269 12.738 L 13.414 12.601 L 17.657 16.843 L 13.414 21.086 C 12.633 21.867 11.367 21.867 10.586 21.086 L 3.161 13.661 C 0.623 11.123 0.623 7.007 3.161 4.469 Z"),
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
        return _serviceFill!!
    }

private var _serviceFill: ImageVector? = null
