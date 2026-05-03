package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignpostFill: ImageVector
    get() {
        if (_signpostFill != null) return _signpostFill!!
        _signpostFill = remixIcon(
            name = "SignpostFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 5.000 L 12.000 2.000 L 10.000 2.000 L 10.000 5.000 L 4.000 5.000 C 3.448 5.000 3.000 5.448 3.000 6.000 L 3.000 14.000 C 3.000 14.552 3.448 15.000 4.000 15.000 L 17.414 15.000 L 21.707 10.707 C 22.098 10.317 22.098 9.683 21.707 9.293 L 17.414 5.000 L 12.000 5.000 ZM 12.000 17.000 L 10.000 17.000 L 10.000 22.000 L 12.000 22.000 L 12.000 17.000 Z"),
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
        return _signpostFill!!
    }

private var _signpostFill: ImageVector? = null
