package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CakeFill: ImageVector
    get() {
        if (_cakeFill != null) return _cakeFill!!
        _cakeFill = remixIcon(
            name = "CakeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 7v4h7c.552 0 1 .448 1 1v8h2v2h-22v-2h2v-8c0-.552 .448-1 1-1h7v-4h2ZM13.83 .402c.828 1.435 .337 3.27-1.098 4.098L11 5.5C10.172 4.065 10.663 2.23 12.098 1.402L13.83 .402Z"),
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
        return _cakeFill!!
    }

private var _cakeFill: ImageVector? = null
