package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Bug2Fill: ImageVector
    get() {
        if (_bug2Fill != null) return _bug2Fill!!
        _bug2Fill = remixIcon(
            name = "Bug2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.071 16.000 C 5.024 15.673 5.000 15.340 5.000 15.000 L 5.000 14.000 L 3.000 14.000 L 3.000 12.000 L 5.000 12.000 L 5.000 11.000 C 5.000 10.660 5.024 10.327 5.071 10.000 L 3.000 10.000 L 3.000 8.000 L 5.674 8.000 C 6.286 6.710 7.282 5.637 8.514 4.928 L 7.464 3.879 L 8.879 2.464 L 10.562 4.148 C 11.026 4.051 11.507 4.000 12.000 4.000 C 12.493 4.000 12.974 4.051 13.438 4.148 L 15.121 2.464 L 16.535 3.879 L 15.486 4.928 C 16.718 5.637 17.713 6.710 18.326 8.000 L 21.000 8.000 L 21.000 10.000 L 18.929 10.000 C 18.976 10.327 19.000 10.660 19.000 11.000 L 19.000 12.000 L 21.000 12.000 L 21.000 14.000 L 19.000 14.000 L 19.000 15.000 C 19.000 15.340 18.976 15.673 18.929 16.000 L 21.000 16.000 L 21.000 18.000 L 18.326 18.000 C 17.203 20.365 14.792 22.000 12.000 22.000 C 9.208 22.000 6.797 20.365 5.674 18.000 L 3.000 18.000 L 3.000 16.000 L 5.071 16.000 ZM 9.000 10.000 L 9.000 12.000 L 15.000 12.000 L 15.000 10.000 L 9.000 10.000 ZM 9.000 14.000 L 9.000 16.000 L 15.000 16.000 L 15.000 14.000 L 9.000 14.000 Z"),
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
        return _bug2Fill!!
    }

private var _bug2Fill: ImageVector? = null
