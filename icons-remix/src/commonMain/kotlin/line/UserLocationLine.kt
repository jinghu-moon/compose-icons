package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserLocationLine: ImageVector
    get() {
        if (_userLocationLine != null) return _userLocationLine!!
        _userLocationLine = remixIcon(
            name = "UserLocationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.000 L 12.000 16.000 C 8.686 16.000 6.000 18.686 6.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 12.000 11.000 C 14.210 11.000 16.000 9.210 16.000 7.000 C 16.000 4.790 14.210 3.000 12.000 3.000 C 9.790 3.000 8.000 4.790 8.000 7.000 C 8.000 9.210 9.790 11.000 12.000 11.000 ZM 20.828 21.071 L 18.000 24.000 L 15.172 21.071 C 13.609 19.454 13.609 16.831 15.172 15.213 C 16.734 13.596 19.266 13.596 20.828 15.213 C 22.390 16.831 22.390 19.454 20.828 21.071 ZM 19.390 19.682 C 20.203 18.839 20.203 17.445 19.390 16.603 C 18.614 15.799 17.386 15.799 16.610 16.603 C 15.797 17.445 15.797 18.839 16.610 19.682 L 18.000 21.121 L 19.390 19.682 Z"),
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
        return _userLocationLine!!
    }

private var _userLocationLine: ImageVector? = null
