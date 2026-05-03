package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakerLine: ImageVector
    get() {
        if (_speakerLine != null) return _speakerLine!!
        _speakerLine = remixIcon(
            name = "SpeakerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 4.000 L 5.000 4.000 ZM 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 ZM 12.000 17.000 C 13.381 17.000 14.500 15.881 14.500 14.500 C 14.500 13.119 13.381 12.000 12.000 12.000 C 10.619 12.000 9.500 13.119 9.500 14.500 C 9.500 15.881 10.619 17.000 12.000 17.000 ZM 12.000 19.000 C 9.515 19.000 7.500 16.985 7.500 14.500 C 7.500 12.015 9.515 10.000 12.000 10.000 C 14.485 10.000 16.500 12.015 16.500 14.500 C 16.500 16.985 14.485 19.000 12.000 19.000 ZM 12.000 8.500 C 11.172 8.500 10.500 7.828 10.500 7.000 C 10.500 6.172 11.172 5.500 12.000 5.500 C 12.828 5.500 13.500 6.172 13.500 7.000 C 13.500 7.828 12.828 8.500 12.000 8.500 Z"),
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
        return _speakerLine!!
    }

private var _speakerLine: ImageVector? = null
