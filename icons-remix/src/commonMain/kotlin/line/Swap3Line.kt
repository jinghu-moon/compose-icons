package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Swap3Line: ImageVector
    get() {
        if (_swap3Line != null) return _swap3Line!!
        _swap3Line = remixIcon(
            name = "Swap3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 5.914 L 3.707 8.207 L 2.293 6.793 L 7.000 2.086 L 11.707 6.793 L 10.293 8.207 L 8.000 5.914 L 8.000 11.000 L 6.000 11.000 L 6.000 5.914 ZM 17.000 9.500 C 18.381 9.500 19.500 8.381 19.500 7.000 C 19.500 5.619 18.381 4.500 17.000 4.500 C 15.619 4.500 14.500 5.619 14.500 7.000 C 14.500 8.381 15.619 9.500 17.000 9.500 ZM 17.000 11.500 C 14.515 11.500 12.500 9.485 12.500 7.000 C 12.500 4.515 14.515 2.500 17.000 2.500 C 19.485 2.500 21.500 4.515 21.500 7.000 C 21.500 9.485 19.485 11.500 17.000 11.500 ZM 21.707 17.207 L 20.293 15.793 L 18.000 18.086 L 18.000 13.000 L 16.000 13.000 L 16.000 18.086 L 13.707 15.793 L 12.293 17.207 L 17.000 21.914 L 21.707 17.207 ZM 5.000 19.000 L 9.000 19.000 L 9.000 15.000 L 5.000 15.000 L 5.000 19.000 ZM 10.000 13.000 C 10.552 13.000 11.000 13.448 11.000 14.000 L 11.000 20.000 C 11.000 20.552 10.552 21.000 10.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 14.000 C 3.000 13.448 3.448 13.000 4.000 13.000 L 10.000 13.000 Z"),
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
        return _swap3Line!!
    }

private var _swap3Line: ImageVector? = null
