package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Anticlockwise2Line: ImageVector
    get() {
        if (_anticlockwise2Line != null) return _anticlockwise2Line!!
        _anticlockwise2Line = remixIcon(
            name = "Anticlockwise2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.414 6.000 L 15.243 7.828 L 13.828 9.243 L 9.586 5.000 L 13.828 0.757 L 15.243 2.172 L 13.414 4.000 L 16.000 4.000 C 18.761 4.000 21.000 6.239 21.000 9.000 L 21.000 13.000 L 19.000 13.000 L 19.000 9.000 C 19.000 7.343 17.657 6.000 16.000 6.000 L 13.414 6.000 ZM 15.000 11.000 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 11.000 C 3.000 10.448 3.448 10.000 4.000 10.000 L 14.000 10.000 C 14.552 10.000 15.000 10.448 15.000 11.000 ZM 13.000 12.000 L 5.000 12.000 L 5.000 20.000 L 13.000 20.000 L 13.000 12.000 Z"),
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
        return _anticlockwise2Line!!
    }

private var _anticlockwise2Line: ImageVector? = null
