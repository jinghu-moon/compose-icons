package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HdLine: ImageVector
    get() {
        if (_hdLine != null) return _hdLine!!
        _hdLine = remixIcon(
            name = "HdLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 7.500 11.250 L 9.500 11.250 L 9.500 9.000 L 11.000 9.000 L 11.000 15.000 L 9.500 15.000 L 9.500 12.750 L 7.500 12.750 L 7.500 15.000 L 6.000 15.000 L 6.000 9.000 L 7.500 9.000 L 7.500 11.250 ZM 14.500 10.500 L 14.500 13.500 L 16.000 13.500 C 16.276 13.500 16.500 13.276 16.500 13.000 L 16.500 11.000 C 16.500 10.724 16.276 10.500 16.000 10.500 L 14.500 10.500 ZM 13.000 9.000 L 16.000 9.000 C 17.105 9.000 18.000 9.895 18.000 11.000 L 18.000 13.000 C 18.000 14.105 17.105 15.000 16.000 15.000 L 13.000 15.000 L 13.000 9.000 Z"),
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
        return _hdLine!!
    }

private var _hdLine: ImageVector? = null
