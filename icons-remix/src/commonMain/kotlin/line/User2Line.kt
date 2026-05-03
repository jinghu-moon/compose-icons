package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User2Line: ImageVector
    get() {
        if (_user2Line != null) return _user2Line!!
        _user2Line = remixIcon(
            name = "User2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 16.418 14.000 20.000 17.582 20.000 22.000 L 4.000 22.000 ZM 13.000 16.083 L 13.000 20.000 L 17.659 20.000 C 16.942 17.973 15.168 16.447 13.000 16.083 ZM 11.000 20.000 L 11.000 16.083 C 8.832 16.447 7.058 17.973 6.341 20.000 L 11.000 20.000 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 12.000 11.000 C 14.210 11.000 16.000 9.210 16.000 7.000 C 16.000 4.790 14.210 3.000 12.000 3.000 C 9.790 3.000 8.000 4.790 8.000 7.000 C 8.000 9.210 9.790 11.000 12.000 11.000 Z"),
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
        return _user2Line!!
    }

private var _user2Line: ImageVector? = null
