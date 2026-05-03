package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InstanceFill: ImageVector
    get() {
        if (_instanceFill != null) return _instanceFill!!
        _instanceFill = remixIcon(
            name = "InstanceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 ZM 6.499 9.971 L 11.000 12.577 L 11.000 17.625 L 13.000 17.625 L 13.000 12.577 L 17.501 9.971 L 16.499 8.240 L 12.000 10.845 L 7.501 8.240 L 6.499 9.971 Z"),
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
        return _instanceFill!!
    }

private var _instanceFill: ImageVector? = null
