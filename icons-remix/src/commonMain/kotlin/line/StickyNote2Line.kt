package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StickyNote2Line: ImageVector
    get() {
        if (_stickyNote2Line != null) return _stickyNote2Line!!
        _stickyNote2Line = remixIcon(
            name = "StickyNote2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.998 21.000 C 3.447 21.000 3.000 20.555 3.000 20.007 L 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.447 21.000 3.999 L 21.000 16.000 L 15.997 21.000 L 3.998 21.000 ZM 5.000 19.000 L 15.169 19.000 L 19.000 15.171 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 Z"),
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
        return _stickyNote2Line!!
    }

private var _stickyNote2Line: ImageVector? = null
