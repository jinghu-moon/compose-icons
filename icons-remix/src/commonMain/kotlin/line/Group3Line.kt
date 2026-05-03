package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Group3Line: ImageVector
    get() {
        if (_group3Line != null) return _group3Line!!
        _group3Line = remixIcon(
            name = "Group3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.500 7.000 C 8.500 8.105 7.605 9.000 6.500 9.000 C 5.395 9.000 4.500 8.105 4.500 7.000 C 4.500 5.895 5.395 5.000 6.500 5.000 C 7.605 5.000 8.500 5.895 8.500 7.000 ZM 2.500 7.000 C 2.500 9.209 4.291 11.000 6.500 11.000 C 8.709 11.000 10.500 9.209 10.500 7.000 C 10.500 4.791 8.709 3.000 6.500 3.000 C 4.291 3.000 2.500 4.791 2.500 7.000 ZM 9.000 16.500 C 9.000 15.119 7.881 14.000 6.500 14.000 C 5.119 14.000 4.000 15.119 4.000 16.500 L 4.000 19.000 L 9.000 19.000 L 9.000 16.500 ZM 11.000 21.000 L 2.000 21.000 L 2.000 16.500 C 2.000 14.015 4.015 12.000 6.500 12.000 C 8.985 12.000 11.000 14.015 11.000 16.500 L 11.000 21.000 ZM 19.500 7.000 C 19.500 8.105 18.605 9.000 17.500 9.000 C 16.395 9.000 15.500 8.105 15.500 7.000 C 15.500 5.895 16.395 5.000 17.500 5.000 C 18.605 5.000 19.500 5.895 19.500 7.000 ZM 13.500 7.000 C 13.500 9.209 15.291 11.000 17.500 11.000 C 19.709 11.000 21.500 9.209 21.500 7.000 C 21.500 4.791 19.709 3.000 17.500 3.000 C 15.291 3.000 13.500 4.791 13.500 7.000 ZM 20.000 16.500 C 20.000 15.119 18.881 14.000 17.500 14.000 C 16.119 14.000 15.000 15.119 15.000 16.500 L 15.000 19.000 L 20.000 19.000 L 20.000 16.500 ZM 13.000 19.000 L 13.000 16.500 C 13.000 14.015 15.015 12.000 17.500 12.000 C 19.985 12.000 22.000 14.015 22.000 16.500 L 22.000 21.000 L 13.000 21.000 L 13.000 19.000 Z"),
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
        return _group3Line!!
    }

private var _group3Line: ImageVector? = null
