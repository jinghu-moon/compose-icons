package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StickyNoteLine: ImageVector
    get() {
        if (_stickyNoteLine != null) return _stickyNoteLine!!
        _stickyNoteLine = remixIcon(
            name = "StickyNoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 15.000 L 15.000 20.996 L 4.002 21.000 C 3.449 21.000 3.000 20.555 3.000 20.007 L 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.456 21.000 4.002 L 21.000 15.000 ZM 19.000 5.000 L 5.000 5.000 L 5.000 19.000 L 13.000 19.000 L 13.000 14.000 C 13.000 13.487 13.386 13.064 13.883 13.007 L 14.000 13.000 L 19.000 12.999 L 19.000 5.000 ZM 18.171 14.999 L 15.000 15.000 L 15.000 18.169 L 18.171 14.999 Z"),
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
        return _stickyNoteLine!!
    }

private var _stickyNoteLine: ImageVector? = null
