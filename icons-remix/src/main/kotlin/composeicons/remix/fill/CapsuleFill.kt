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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.779 4.222c2.343 2.343 2.343 6.142 0 8.485l-2.122 2.121-4.949 4.951c-2.343 2.343-6.142 2.343-8.485 0-2.343-2.343-2.343-6.142 0-8.485L11.293 4.222c2.343-2.343 6.142-2.343 8.485 0ZM14.829 14.828 9.172 9.172 5.636 12.707c-1.562 1.562-1.562 4.095 0 5.657 1.562 1.562 4.095 1.562 5.657 0l3.536-3.536Z"),
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
        return _capsuleFill!!
    }

private var _capsuleFill: ImageVector? = null
