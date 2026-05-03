package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Notification2Line: ImageVector
    get() {
        if (_notification2Line != null) return _notification2Line!!
        _notification2Line = remixIcon(
            name = "Notification2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 20.000 L 2.000 20.000 L 2.000 18.000 L 3.000 18.000 L 3.000 11.031 C 3.000 6.043 7.029 2.000 12.000 2.000 C 16.971 2.000 21.000 6.043 21.000 11.031 L 21.000 18.000 L 22.000 18.000 L 22.000 20.000 ZM 5.000 18.000 L 19.000 18.000 L 19.000 11.031 C 19.000 7.148 15.866 4.000 12.000 4.000 C 8.134 4.000 5.000 7.148 5.000 11.031 L 5.000 18.000 ZM 9.500 21.000 L 14.500 21.000 C 14.500 22.381 13.381 23.500 12.000 23.500 C 10.619 23.500 9.500 22.381 9.500 21.000 Z"),
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
        return _notification2Line!!
    }

private var _notification2Line: ImageVector? = null
