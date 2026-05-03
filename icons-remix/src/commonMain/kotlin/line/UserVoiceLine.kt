package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserVoiceLine: ImageVector
    get() {
        if (_userVoiceLine != null) return _userVoiceLine!!
        _userVoiceLine = remixIcon(
            name = "UserVoiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 22.000 C 1.000 17.582 4.582 14.000 9.000 14.000 C 13.418 14.000 17.000 17.582 17.000 22.000 L 15.000 22.000 C 15.000 18.686 12.314 16.000 9.000 16.000 C 5.686 16.000 3.000 18.686 3.000 22.000 L 1.000 22.000 ZM 9.000 13.000 C 5.685 13.000 3.000 10.315 3.000 7.000 C 3.000 3.685 5.685 1.000 9.000 1.000 C 12.315 1.000 15.000 3.685 15.000 7.000 C 15.000 10.315 12.315 13.000 9.000 13.000 ZM 9.000 11.000 C 11.210 11.000 13.000 9.210 13.000 7.000 C 13.000 4.790 11.210 3.000 9.000 3.000 C 6.790 3.000 5.000 4.790 5.000 7.000 C 5.000 9.210 6.790 11.000 9.000 11.000 ZM 21.548 0.784 C 22.477 2.657 23.000 4.767 23.000 7.000 C 23.000 9.233 22.477 11.344 21.548 13.217 L 19.903 12.020 C 20.607 10.493 21.000 8.792 21.000 7.000 C 21.000 5.208 20.607 3.507 19.903 1.980 L 21.548 0.784 ZM 18.246 3.185 C 18.732 4.360 19.000 5.649 19.000 7.000 C 19.000 8.351 18.732 9.640 18.246 10.816 L 16.569 9.596 C 16.848 8.782 17.000 7.909 17.000 7.000 C 17.000 6.091 16.848 5.218 16.569 4.404 L 18.246 3.185 Z"),
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
        return _userVoiceLine!!
    }

private var _userVoiceLine: ImageVector? = null
