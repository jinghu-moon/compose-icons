package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LockPasswordFill: ImageVector
    get() {
        if (_lockPasswordFill != null) return _lockPasswordFill!!
        _lockPasswordFill = remixIcon(
            name = "LockPasswordFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 8.000 L 20.000 8.000 C 20.552 8.000 21.000 8.448 21.000 9.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 9.000 C 3.000 8.448 3.448 8.000 4.000 8.000 L 6.000 8.000 L 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 L 18.000 8.000 ZM 16.000 8.000 L 16.000 7.000 C 16.000 4.791 14.209 3.000 12.000 3.000 C 9.791 3.000 8.000 4.791 8.000 7.000 L 8.000 8.000 L 16.000 8.000 ZM 11.000 14.000 L 11.000 16.000 L 13.000 16.000 L 13.000 14.000 L 11.000 14.000 ZM 7.000 14.000 L 7.000 16.000 L 9.000 16.000 L 9.000 14.000 L 7.000 14.000 ZM 15.000 14.000 L 15.000 16.000 L 17.000 16.000 L 17.000 14.000 L 15.000 14.000 Z"),
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
        return _lockPasswordFill!!
    }

private var _lockPasswordFill: ImageVector? = null
