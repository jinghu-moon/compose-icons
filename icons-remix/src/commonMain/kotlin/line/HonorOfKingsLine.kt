package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HonorOfKingsLine: ImageVector
    get() {
        if (_honorOfKingsLine != null) return _honorOfKingsLine!!
        _honorOfKingsLine = remixIcon(
            name = "HonorOfKingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.329 4.256 L 16.906 5.679 C 13.768 3.237 9.229 3.459 6.344 6.343 C 3.970 8.717 3.400 12.211 4.634 15.123 L 7.051 12.706 C 6.838 11.203 7.309 9.621 8.465 8.464 C 10.176 6.754 12.817 6.542 14.758 7.828 L 13.294 9.292 C 12.179 8.760 10.803 8.955 9.880 9.879 C 8.956 10.802 8.761 12.178 9.293 13.293 L 2.843 19.742 C 2.809 16.243 2.252 14.931 2.055 13.041 C 1.754 10.147 2.712 7.147 4.930 4.929 C 8.596 1.263 14.401 1.038 18.329 4.256 ZM 21.159 4.258 C 21.193 7.757 21.750 9.069 21.947 10.959 C 22.248 13.853 21.290 16.853 19.072 19.071 C 15.406 22.737 9.601 22.962 5.673 19.744 L 7.096 18.321 C 10.234 20.763 14.773 20.541 17.658 17.657 C 20.032 15.283 20.602 11.789 19.368 8.877 L 16.951 11.294 C 17.164 12.797 16.693 14.379 15.536 15.535 C 13.826 17.246 11.185 17.458 9.244 16.172 L 10.708 14.708 C 11.823 15.240 13.199 15.045 14.122 14.121 C 15.046 13.198 15.241 11.822 14.709 10.707 L 21.159 4.258 Z"),
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
        return _honorOfKingsLine!!
    }

private var _honorOfKingsLine: ImageVector? = null
