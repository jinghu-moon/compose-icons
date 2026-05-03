package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsSaLine: ImageVector
    get() {
        if (_creativeCommonsSaLine != null) return _creativeCommonsSaLine!!
        _creativeCommonsSaLine = remixIcon(
            name = "CreativeCommonsSaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 12.000 C 17.000 8.686 14.762 6.000 12.000 6.000 C 9.823 6.000 7.971 7.670 7.284 10.001 L 6.000 10.000 L 8.500 13.000 L 11.000 10.000 L 9.401 10.000 C 9.920 8.805 10.889 8.000 12.000 8.000 C 13.657 8.000 15.000 9.791 15.000 12.000 C 15.000 14.209 13.657 16.000 12.000 16.000 C 10.890 16.000 9.921 15.196 9.402 14.001 L 7.285 14.001 C 7.971 16.331 9.823 18.000 12.000 18.000 C 14.762 18.000 17.000 15.314 17.000 12.000 ZM 12.000 2.000 C 9.240 2.000 6.739 3.121 4.930 4.930 C 3.121 6.739 2.000 9.240 2.000 12.000 C 2.000 14.760 3.121 17.261 4.930 19.070 C 6.739 20.879 9.240 22.000 12.000 22.000 C 14.760 22.000 17.261 20.879 19.070 19.070 C 20.879 17.261 22.000 14.760 22.000 12.000 C 22.000 9.240 20.879 6.739 19.070 4.930 C 17.261 3.121 14.760 2.000 12.000 2.000 ZM 6.344 6.344 C 7.794 4.895 9.792 4.000 12.000 4.000 C 14.208 4.000 16.206 4.895 17.656 6.344 C 19.105 7.794 20.000 9.792 20.000 12.000 C 20.000 14.208 19.105 16.206 17.656 17.656 C 16.206 19.105 14.208 20.000 12.000 20.000 C 9.792 20.000 7.794 19.105 6.344 17.656 C 4.895 16.206 4.000 14.208 4.000 12.000 C 4.000 9.792 4.895 7.794 6.344 6.344 Z"),
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
        return _creativeCommonsSaLine!!
    }

private var _creativeCommonsSaLine: ImageVector? = null
