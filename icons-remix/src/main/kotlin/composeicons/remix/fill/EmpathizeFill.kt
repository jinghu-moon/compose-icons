package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmpathizeFill: ImageVector
    get() {
        if (_empathizeFill != null) return _empathizeFill!!
        _empathizeFill = remixIcon(
            name = "EmpathizeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.364 10.979c1.562 1.562 1.562 4.095 0 5.657l-5.657 5.657c-.391 .39-1.024 .39-1.414 0L5.636 16.636c-1.562-1.562-1.562-4.095 0-5.657 1.562-1.562 4.095-1.562 5.657 0l.706 .706 .708-.706c1.562-1.562 4.095-1.562 5.657 0ZM12 1c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 9 8 7.209 8 5c0-2.209 1.791-4 4-4Z"),
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
        return _empathizeFill!!
    }

private var _empathizeFill: ImageVector? = null
