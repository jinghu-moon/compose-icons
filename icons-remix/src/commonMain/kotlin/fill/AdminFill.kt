package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AdminFill: ImageVector
    get() {
        if (_adminFill != null) return _adminFill!!
        _adminFill = remixIcon(
            name = "AdminFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.000 L 12.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 21.000 17.000 L 22.000 17.000 L 22.000 22.000 L 14.000 22.000 L 14.000 17.000 L 15.000 17.000 L 15.000 16.000 C 15.000 14.343 16.343 13.000 18.000 13.000 C 19.657 13.000 21.000 14.343 21.000 16.000 L 21.000 17.000 ZM 19.000 17.000 L 19.000 16.000 C 19.000 15.448 18.552 15.000 18.000 15.000 C 17.448 15.000 17.000 15.448 17.000 16.000 L 17.000 17.000 L 19.000 17.000 Z"),
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
        return _adminFill!!
    }

private var _adminFill: ImageVector? = null
