package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopyleftFill: ImageVector
    get() {
        if (_copyleftFill != null) return _copyleftFill!!
        _copyleftFill = remixIcon(
            name = "CopyleftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10ZM12 17c2.76 0 5-2.24 5-5C17 9.24 14.76 7 12 7 10.181 7 8.587 7.973 7.712 9.428l1.715 1.028C9.952 9.583 10.907 9 12 9c1.658 0 3 1.342 3 3 0 1.658-1.342 3-3 3C10.907 15 9.951 14.416 9.426 13.543L7.712 14.572C8.587 16.027 10.181 17 12 17Z"),
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
        return _copyleftFill!!
    }

private var _copyleftFill: ImageVector? = null
