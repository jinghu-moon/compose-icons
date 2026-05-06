package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoginCircleFill: ImageVector
    get() {
        if (_loginCircleFill != null) return _loginCircleFill!!
        _loginCircleFill = remixIcon(
            name = "LoginCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.999 11h-7.951C2.551 5.947 6.814 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.814 22 2.551 18.053 2.049 13h7.951v3l5-4L9.999 8v3Z"),
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
        return _loginCircleFill!!
    }

private var _loginCircleFill: ImageVector? = null
