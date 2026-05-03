package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Radio2Line: ImageVector
    get() {
        if (_radio2Line != null) return _radio2Line!!
        _radio2Line = remixIcon(
            name = "Radio2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 3.000 L 6.000 1.000 L 8.000 1.000 L 8.000 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 6.000 3.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 9.000 15.000 C 7.343 15.000 6.000 13.657 6.000 12.000 C 6.000 10.343 7.343 9.000 9.000 9.000 C 10.657 9.000 12.000 10.343 12.000 12.000 C 12.000 13.657 10.657 15.000 9.000 15.000 ZM 14.000 9.000 L 18.000 9.000 L 18.000 11.000 L 14.000 11.000 L 14.000 9.000 ZM 14.000 13.000 L 18.000 13.000 L 18.000 15.000 L 14.000 15.000 L 14.000 13.000 Z"),
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
        return _radio2Line!!
    }

private var _radio2Line: ImageVector? = null
