package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Speaker3Line: ImageVector
    get() {
        if (_speaker3Line != null) return _speaker3Line!!
        _speaker3Line = remixIcon(
            name = "Speaker3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 ZM 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 7.000 8.000 C 6.448 8.000 6.000 7.552 6.000 7.000 C 6.000 6.448 6.448 6.000 7.000 6.000 C 7.552 6.000 8.000 6.448 8.000 7.000 C 8.000 7.552 7.552 8.000 7.000 8.000 ZM 17.000 8.000 C 16.448 8.000 16.000 7.552 16.000 7.000 C 16.000 6.448 16.448 6.000 17.000 6.000 C 17.552 6.000 18.000 6.448 18.000 7.000 C 18.000 7.552 17.552 8.000 17.000 8.000 ZM 17.000 18.000 C 16.448 18.000 16.000 17.552 16.000 17.000 C 16.000 16.448 16.448 16.000 17.000 16.000 C 17.552 16.000 18.000 16.448 18.000 17.000 C 18.000 17.552 17.552 18.000 17.000 18.000 ZM 7.000 18.000 C 6.448 18.000 6.000 17.552 6.000 17.000 C 6.000 16.448 6.448 16.000 7.000 16.000 C 7.552 16.000 8.000 16.448 8.000 17.000 C 8.000 17.552 7.552 18.000 7.000 18.000 ZM 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 ZM 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 C 7.000 9.239 9.239 7.000 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 ZM 12.000 13.000 C 11.448 13.000 11.000 12.552 11.000 12.000 C 11.000 11.448 11.448 11.000 12.000 11.000 C 12.552 11.000 13.000 11.448 13.000 12.000 C 13.000 12.552 12.552 13.000 12.000 13.000 Z"),
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
        return _speaker3Line!!
    }

private var _speaker3Line: ImageVector? = null
