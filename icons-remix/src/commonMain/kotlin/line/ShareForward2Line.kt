package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareForward2Line: ImageVector
    get() {
        if (_shareForward2Line != null) return _shareForward2Line!!
        _shareForward2Line = remixIcon(
            name = "ShareForward2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 19.000 L 20.000 19.000 L 20.000 14.000 L 22.000 14.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 14.000 L 4.000 14.000 L 4.000 19.000 ZM 16.172 7.000 L 12.222 3.050 L 13.636 1.636 L 20.000 8.000 L 13.636 14.364 L 12.222 12.950 L 16.172 9.000 L 5.000 9.000 L 5.000 7.000 L 16.172 7.000 Z"),
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
        return _shareForward2Line!!
    }

private var _shareForward2Line: ImageVector? = null
