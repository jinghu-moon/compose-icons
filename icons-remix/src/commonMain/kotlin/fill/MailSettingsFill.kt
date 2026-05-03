package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailSettingsFill: ImageVector
    get() {
        if (_mailSettingsFill != null) return _mailSettingsFill!!
        _mailSettingsFill = remixIcon(
            name = "MailSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.341 C 21.374 13.120 20.701 13.000 20.000 13.000 C 16.686 13.000 14.000 15.686 14.000 19.000 C 14.000 19.701 14.120 20.374 14.341 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.341 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 17.050 19.549 C 17.017 19.371 17.000 19.187 17.000 19.000 C 17.000 18.813 17.017 18.629 17.050 18.451 L 16.036 17.866 L 17.036 16.134 L 18.051 16.720 C 18.328 16.482 18.649 16.295 19.000 16.171 L 19.000 15.000 L 21.000 15.000 L 21.000 16.171 C 21.351 16.295 21.672 16.482 21.949 16.720 L 22.964 16.134 L 23.964 17.866 L 22.950 18.451 C 22.983 18.629 23.000 18.813 23.000 19.000 C 23.000 19.187 22.983 19.371 22.950 19.549 L 23.964 20.134 L 22.964 21.866 L 21.949 21.280 C 21.672 21.518 21.351 21.705 21.000 21.829 L 21.000 23.000 L 19.000 23.000 L 19.000 21.829 C 18.649 21.705 18.328 21.518 18.051 21.280 L 17.036 21.866 L 16.036 20.134 L 17.050 19.549 ZM 20.000 20.000 C 20.552 20.000 21.000 19.552 21.000 19.000 C 21.000 18.448 20.552 18.000 20.000 18.000 C 19.448 18.000 19.000 18.448 19.000 19.000 C 19.000 19.552 19.448 20.000 20.000 20.000 Z"),
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
        return _mailSettingsFill!!
    }

private var _mailSettingsFill: ImageVector? = null
