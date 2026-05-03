package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserLocationFill: ImageVector
    get() {
        if (_userLocationFill != null) return _userLocationFill!!
        _userLocationFill = remixIcon(
            name = "UserLocationFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 14.000 L 12.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 20.828 20.828 L 18.000 23.657 L 15.172 20.828 C 13.609 19.266 13.609 16.734 15.172 15.172 C 16.734 13.609 19.266 13.609 20.828 15.172 C 22.390 16.734 22.390 19.266 20.828 20.828 ZM 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 C 17.000 18.552 17.448 19.000 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 C 19.000 17.448 18.552 17.000 18.000 17.000 Z"),
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
        return _userLocationFill!!
    }

private var _userLocationFill: ImageVector? = null
