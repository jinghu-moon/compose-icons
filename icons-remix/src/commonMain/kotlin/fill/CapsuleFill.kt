package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CapsuleFill: ImageVector
    get() {
        if (_capsuleFill != null) return _capsuleFill!!
        _capsuleFill = remixIcon(
            name = "CapsuleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.779 4.222 C 22.122 6.565 22.122 10.364 19.779 12.707 L 17.656 14.828 L 12.708 19.778 C 10.364 22.121 6.565 22.121 4.222 19.778 C 1.879 17.435 1.879 13.636 4.222 11.293 L 11.293 4.222 C 13.636 1.879 17.435 1.879 19.779 4.222 ZM 14.829 14.828 L 9.172 9.172 L 5.636 12.707 C 4.074 14.269 4.074 16.802 5.636 18.364 C 7.199 19.926 9.731 19.926 11.293 18.364 L 14.829 14.828 Z"),
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
        return _capsuleFill!!
    }

private var _capsuleFill: ImageVector? = null
