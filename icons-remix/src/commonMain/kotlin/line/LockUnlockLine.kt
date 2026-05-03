package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LockUnlockLine: ImageVector
    get() {
        if (_lockUnlockLine != null) return _lockUnlockLine!!
        _lockUnlockLine = remixIcon(
            name = "LockUnlockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 10.448 21.000 11.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 11.000 C 3.000 10.448 3.448 10.000 4.000 10.000 L 5.000 10.000 L 5.000 9.000 C 5.000 5.134 8.134 2.000 12.000 2.000 C 14.741 2.000 17.113 3.575 18.262 5.869 L 16.473 6.763 C 15.652 5.125 13.958 4.000 12.000 4.000 C 9.239 4.000 7.000 6.239 7.000 9.000 L 7.000 10.000 ZM 5.000 12.000 L 5.000 20.000 L 19.000 20.000 L 19.000 12.000 L 5.000 12.000 ZM 10.000 15.000 L 14.000 15.000 L 14.000 17.000 L 10.000 17.000 L 10.000 15.000 Z"),
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
        return _lockUnlockLine!!
    }

private var _lockUnlockLine: ImageVector? = null
