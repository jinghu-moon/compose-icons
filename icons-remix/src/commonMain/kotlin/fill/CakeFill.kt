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
                pathData = parseSvgPathData("M 13.000 7.000 L 13.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 L 21.000 20.000 L 23.000 20.000 L 23.000 22.000 L 1.000 22.000 L 1.000 20.000 L 3.000 20.000 L 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000 L 11.000 11.000 L 11.000 7.000 L 13.000 7.000 ZM 13.830 0.402 C 14.659 1.837 14.167 3.671 12.732 4.500 L 11.000 5.500 C 10.172 4.065 10.663 2.230 12.098 1.402 L 13.830 0.402 Z"),
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
