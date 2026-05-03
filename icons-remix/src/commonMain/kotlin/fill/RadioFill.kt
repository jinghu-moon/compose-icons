package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RadioFill: ImageVector
    get() {
        if (_radioFill != null) return _radioFill!!
        _radioFill = remixIcon(
            name = "RadioFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 10.000 L 20.000 10.000 L 20.000 6.000 L 4.000 6.000 L 4.000 10.000 L 15.000 10.000 L 15.000 8.000 L 17.000 8.000 L 17.000 10.000 ZM 6.000 3.000 L 6.000 1.000 L 8.000 1.000 L 8.000 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 6.000 3.000 ZM 7.000 19.000 C 8.657 19.000 10.000 17.657 10.000 16.000 C 10.000 14.343 8.657 13.000 7.000 13.000 C 5.343 13.000 4.000 14.343 4.000 16.000 C 4.000 17.657 5.343 19.000 7.000 19.000 Z"),
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
        return _radioFill!!
    }

private var _radioFill: ImageVector? = null
