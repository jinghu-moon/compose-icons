package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SunLine: ImageVector
    get() {
        if (_sunLine != null) return _sunLine!!
        _sunLine = remixIcon(
            name = "SunLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 18.000 C 8.686 18.000 6.000 15.314 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 15.314 15.314 18.000 12.000 18.000 ZM 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 ZM 11.000 1.000 L 13.000 1.000 L 13.000 4.000 L 11.000 4.000 L 11.000 1.000 ZM 11.000 20.000 L 13.000 20.000 L 13.000 23.000 L 11.000 23.000 L 11.000 20.000 ZM 3.515 4.929 L 4.929 3.515 L 7.050 5.636 L 5.636 7.050 L 3.515 4.929 ZM 16.950 18.364 L 18.364 16.950 L 20.485 19.071 L 19.071 20.485 L 16.950 18.364 ZM 19.071 3.515 L 20.485 4.929 L 18.364 7.050 L 16.950 5.636 L 19.071 3.515 ZM 5.636 16.950 L 7.050 18.364 L 4.929 20.485 L 3.515 19.071 L 5.636 16.950 ZM 23.000 11.000 L 23.000 13.000 L 20.000 13.000 L 20.000 11.000 L 23.000 11.000 ZM 4.000 11.000 L 4.000 13.000 L 1.000 13.000 L 1.000 11.000 L 4.000 11.000 Z"),
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
        return _sunLine!!
    }

private var _sunLine: ImageVector? = null
