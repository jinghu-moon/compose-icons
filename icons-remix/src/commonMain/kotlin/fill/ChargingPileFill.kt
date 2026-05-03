package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChargingPileFill: ImageVector
    get() {
        if (_chargingPileFill != null) return _chargingPileFill!!
        _chargingPileFill = remixIcon(
            name = "ChargingPileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 19.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 13.000 3.000 C 13.552 3.000 14.000 3.448 14.000 4.000 L 14.000 12.000 L 16.000 12.000 C 17.105 12.000 18.000 12.895 18.000 14.000 L 18.000 18.000 C 18.000 18.552 18.448 19.000 19.000 19.000 C 19.552 19.000 20.000 18.552 20.000 18.000 L 20.000 11.000 L 18.000 11.000 C 17.448 11.000 17.000 10.552 17.000 10.000 L 17.000 6.414 L 15.343 4.757 L 16.757 3.343 L 21.707 8.293 C 21.902 8.488 22.000 8.744 22.000 9.000 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 C 17.343 21.000 16.000 19.657 16.000 18.000 L 16.000 14.000 L 14.000 14.000 L 14.000 19.000 L 15.000 19.000 L 15.000 21.000 L 2.000 21.000 L 2.000 19.000 L 3.000 19.000 ZM 9.000 11.000 L 9.000 7.000 L 5.000 13.000 L 8.000 13.000 L 8.000 17.000 L 12.000 11.000 L 9.000 11.000 Z"),
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
        return _chargingPileFill!!
    }

private var _chargingPileFill: ImageVector? = null
