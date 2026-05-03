package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Clockwise2Line: ImageVector
    get() {
        if (_clockwise2Line != null) return _clockwise2Line!!
        _clockwise2Line = remixIcon(
            name = "Clockwise2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.586 4.000 L 8.757 2.172 L 10.172 0.757 L 14.414 5.000 L 10.172 9.243 L 8.757 7.828 L 10.586 6.000 L 8.000 6.000 C 6.343 6.000 5.000 7.343 5.000 9.000 L 5.000 13.000 L 3.000 13.000 L 3.000 9.000 C 3.000 6.239 5.239 4.000 8.000 4.000 L 10.586 4.000 ZM 9.000 11.000 C 9.000 10.448 9.448 10.000 10.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 10.448 21.000 11.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 11.000 ZM 11.000 12.000 L 11.000 20.000 L 19.000 20.000 L 19.000 12.000 L 11.000 12.000 Z"),
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
        return _clockwise2Line!!
    }

private var _clockwise2Line: ImageVector? = null
