package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SchoolFill: ImageVector
    get() {
        if (_schoolFill != null) return _schoolFill!!
        _schoolFill = remixIcon(
            name = "SchoolFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 23.000 19.000 L 22.000 19.000 L 22.000 9.000 L 18.000 9.000 L 18.000 6.586 L 12.000 0.586 L 6.000 6.586 L 6.000 9.000 L 2.000 9.000 L 2.000 19.000 L 1.000 19.000 L 1.000 21.000 L 23.000 21.000 L 23.000 19.000 ZM 6.000 19.000 L 4.000 19.000 L 4.000 11.000 L 6.000 11.000 L 6.000 19.000 ZM 18.000 11.000 L 20.000 11.000 L 20.000 19.000 L 18.000 19.000 L 18.000 11.000 ZM 11.000 12.000 L 13.000 12.000 L 13.000 19.000 L 11.000 19.000 L 11.000 12.000 Z"),
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
        return _schoolFill!!
    }

private var _schoolFill: ImageVector? = null
