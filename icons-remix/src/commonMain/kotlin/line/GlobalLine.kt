package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobalLine: ImageVector
    get() {
        if (_globalLine != null) return _globalLine!!
        _globalLine = remixIcon(
            name = "GlobalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 9.710 19.667 C 8.747 17.626 8.157 15.374 8.027 13.000 L 4.062 13.000 C 4.458 16.177 6.716 18.775 9.710 19.667 ZM 10.031 13.000 C 10.181 15.439 10.878 17.730 12.000 19.752 C 13.122 17.730 13.819 15.439 13.969 13.000 L 10.031 13.000 ZM 19.938 13.000 L 15.973 13.000 C 15.843 15.374 15.253 17.626 14.290 19.667 C 17.284 18.775 19.542 16.177 19.938 13.000 ZM 4.062 11.000 L 8.027 11.000 C 8.157 8.626 8.747 6.374 9.710 4.333 C 6.716 5.225 4.458 7.824 4.062 11.000 ZM 10.031 11.000 L 13.969 11.000 C 13.819 8.561 13.122 6.270 12.000 4.248 C 10.878 6.270 10.181 8.561 10.031 11.000 ZM 14.290 4.333 C 15.253 6.374 15.843 8.626 15.973 11.000 L 19.938 11.000 C 19.542 7.824 17.284 5.225 14.290 4.333 Z"),
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
        return _globalLine!!
    }

private var _globalLine: ImageVector? = null
