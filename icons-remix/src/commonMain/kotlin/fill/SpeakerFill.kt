package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeakerFill: ImageVector
    get() {
        if (_speakerFill != null) return _speakerFill!!
        _speakerFill = remixIcon(
            name = "SpeakerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 ZM 12.000 20.000 C 14.761 20.000 17.000 17.761 17.000 15.000 C 17.000 12.239 14.761 10.000 12.000 10.000 C 9.239 10.000 7.000 12.239 7.000 15.000 C 7.000 17.761 9.239 20.000 12.000 20.000 ZM 12.000 8.000 C 12.828 8.000 13.500 7.328 13.500 6.500 C 13.500 5.672 12.828 5.000 12.000 5.000 C 11.172 5.000 10.500 5.672 10.500 6.500 C 10.500 7.328 11.172 8.000 12.000 8.000 ZM 12.000 18.000 C 10.343 18.000 9.000 16.657 9.000 15.000 C 9.000 13.343 10.343 12.000 12.000 12.000 C 13.657 12.000 15.000 13.343 15.000 15.000 C 15.000 16.657 13.657 18.000 12.000 18.000 Z"),
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
        return _speakerFill!!
    }

private var _speakerFill: ImageVector? = null
