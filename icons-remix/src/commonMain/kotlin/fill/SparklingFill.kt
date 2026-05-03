package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SparklingFill: ImageVector
    get() {
        if (_sparklingFill != null) return _sparklingFill!!
        _sparklingFill = remixIcon(
            name = "SparklingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 4.438 C 15.346 4.438 16.438 3.346 16.438 2.000 L 17.562 2.000 C 17.562 3.346 18.654 4.438 20.000 4.438 L 20.000 5.562 C 18.654 5.562 17.562 6.654 17.562 8.000 L 16.438 8.000 C 16.438 6.654 15.346 5.562 14.000 5.562 L 14.000 4.438 ZM 1.000 11.000 C 4.314 11.000 7.000 8.314 7.000 5.000 L 9.000 5.000 C 9.000 8.314 11.686 11.000 15.000 11.000 L 15.000 13.000 C 11.686 13.000 9.000 15.686 9.000 19.000 L 7.000 19.000 C 7.000 15.686 4.314 13.000 1.000 13.000 L 1.000 11.000 ZM 17.250 14.000 C 17.250 15.795 15.795 17.250 14.000 17.250 L 14.000 18.750 C 15.795 18.750 17.250 20.205 17.250 22.000 L 18.750 22.000 C 18.750 20.205 20.205 18.750 22.000 18.750 L 22.000 17.250 C 20.205 17.250 18.750 15.795 18.750 14.000 L 17.250 14.000 Z"),
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
        return _sparklingFill!!
    }

private var _sparklingFill: ImageVector? = null
