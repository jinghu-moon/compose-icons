package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserSettingsFill: ImageVector
    get() {
        if (_userSettingsFill != null) return _userSettingsFill!!
        _userSettingsFill = remixIcon(
            name = "UserSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.000 L 12.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 14.595 18.812 C 14.533 18.551 14.500 18.279 14.500 18.000 C 14.500 17.721 14.533 17.449 14.594 17.189 L 13.603 16.616 L 14.603 14.884 L 15.595 15.457 C 15.988 15.085 16.468 14.803 17.000 14.645 L 17.000 13.500 L 19.000 13.500 L 19.000 14.645 C 19.532 14.803 20.012 15.085 20.405 15.457 L 21.397 14.884 L 22.397 16.616 L 21.406 17.188 C 21.467 17.449 21.500 17.721 21.500 18.000 C 21.500 18.279 21.467 18.551 21.406 18.811 L 22.397 19.384 L 21.397 21.116 L 20.405 20.543 C 20.012 20.915 19.532 21.197 19.000 21.355 L 19.000 22.500 L 17.000 22.500 L 17.000 21.355 C 16.468 21.197 15.988 20.915 15.595 20.543 L 14.603 21.116 L 13.603 19.384 L 14.595 18.812 ZM 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 C 17.000 18.552 17.448 19.000 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 C 19.000 17.448 18.552 17.000 18.000 17.000 Z"),
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
        return _userSettingsFill!!
    }

private var _userSettingsFill: ImageVector? = null
