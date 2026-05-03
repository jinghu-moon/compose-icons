package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeOffFill: ImageVector
    get() {
        if (_eyeOffFill != null) return _eyeOffFill!!
        _eyeOffFill = remixIcon(
            name = "EyeOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.520 5.935 L 1.394 2.808 L 2.808 1.394 L 22.607 21.192 L 21.193 22.607 L 17.883 19.297 C 16.181 20.375 14.164 21.000 12.000 21.000 C 6.608 21.000 2.122 17.120 1.182 12.000 C 1.618 9.623 2.819 7.513 4.520 5.935 ZM 14.758 16.172 L 13.294 14.708 C 12.902 14.895 12.463 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 11.537 9.105 11.098 9.293 10.707 L 7.829 9.243 C 7.305 10.033 7.000 10.981 7.000 12.000 C 7.000 14.762 9.239 17.000 12.000 17.000 C 13.019 17.000 13.967 16.695 14.758 16.172 ZM 7.974 3.760 C 9.221 3.270 10.579 3.000 12.000 3.000 C 17.392 3.000 21.878 6.880 22.819 12.000 C 22.507 13.700 21.804 15.263 20.807 16.593 L 16.947 12.733 C 16.982 12.494 17.000 12.249 17.000 12.000 C 17.000 9.239 14.762 7.000 12.000 7.000 C 11.751 7.000 11.507 7.018 11.268 7.053 L 7.974 3.760 Z"),
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
        return _eyeOffFill!!
    }

private var _eyeOffFill: ImageVector? = null
