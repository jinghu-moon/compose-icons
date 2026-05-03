package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BatterySaverFill: ImageVector
    get() {
        if (_batterySaverFill != null) return _batterySaverFill!!
        _batterySaverFill = remixIcon(
            name = "BatterySaverFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 4.000 L 18.000 4.000 C 18.552 4.000 19.000 4.448 19.000 5.000 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 5.000 C 5.000 4.448 5.448 4.000 6.000 4.000 L 9.000 4.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 L 14.000 2.000 ZM 13.000 9.000 L 11.000 9.000 L 11.000 12.000 L 8.000 12.000 L 8.000 14.000 L 11.000 14.000 L 11.000 17.000 L 13.000 17.000 L 13.000 14.000 L 16.000 14.000 L 16.000 12.000 L 13.000 12.000 L 13.000 9.000 Z"),
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
        return _batterySaverFill!!
    }

private var _batterySaverFill: ImageVector? = null
