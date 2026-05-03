package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LockLine: ImageVector
    get() {
        if (_lockLine != null) return _lockLine!!
        _lockLine = remixIcon(
            name = "LockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 10.448 21.000 11.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 11.000 C 3.000 10.448 3.448 10.000 4.000 10.000 L 5.000 10.000 L 5.000 9.000 C 5.000 5.134 8.134 2.000 12.000 2.000 C 15.866 2.000 19.000 5.134 19.000 9.000 L 19.000 10.000 ZM 5.000 12.000 L 5.000 20.000 L 19.000 20.000 L 19.000 12.000 L 5.000 12.000 ZM 11.000 14.000 L 13.000 14.000 L 13.000 18.000 L 11.000 18.000 L 11.000 14.000 ZM 17.000 10.000 L 17.000 9.000 C 17.000 6.239 14.761 4.000 12.000 4.000 C 9.239 4.000 7.000 6.239 7.000 9.000 L 7.000 10.000 L 17.000 10.000 Z"),
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
        return _lockLine!!
    }

private var _lockLine: ImageVector? = null
