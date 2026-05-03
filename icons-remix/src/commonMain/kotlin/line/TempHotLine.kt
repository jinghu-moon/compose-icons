package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TempHotLine: ImageVector
    get() {
        if (_tempHotLine != null) return _tempHotLine!!
        _tempHotLine = remixIcon(
            name = "TempHotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000 C 14.209 1.000 16.000 2.791 16.000 5.000 L 16.000 10.255 C 17.813 11.520 19.000 13.621 19.000 16.000 C 19.000 19.866 15.866 23.000 12.000 23.000 C 8.134 23.000 5.000 19.866 5.000 16.000 C 5.000 13.621 6.187 11.520 8.000 10.255 L 8.000 5.000 ZM 9.144 11.895 C 7.809 12.826 7.000 14.343 7.000 16.000 C 7.000 18.761 9.239 21.000 12.000 21.000 C 14.761 21.000 17.000 18.761 17.000 16.000 C 17.000 14.343 16.191 12.826 14.856 11.895 L 14.000 11.298 L 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 C 10.895 3.000 10.000 3.895 10.000 5.000 L 10.000 11.298 L 9.144 11.895 ZM 11.000 12.126 L 11.000 5.000 L 13.000 5.000 L 13.000 12.126 C 14.725 12.570 16.000 14.136 16.000 16.000 C 16.000 18.209 14.209 20.000 12.000 20.000 C 9.791 20.000 8.000 18.209 8.000 16.000 C 8.000 14.136 9.275 12.570 11.000 12.126 ZM 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 Z"),
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
        return _tempHotLine!!
    }

private var _tempHotLine: ImageVector? = null
