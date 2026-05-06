package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LockStarFill: ImageVector
    get() {
        if (_lockStarFill != null) return _lockStarFill!!
        _lockStarFill = remixIcon(
            name = "LockStarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1C8.686 1 6 3.686 6 7v1h-2C3.448 8 3 8.448 3 9v12c0 .552 .448 1 1 1h9.044c-.349-.761-.544-1.608-.544-2.5 0-3.314 2.686-6 6-6 .892 0 1.739 .195 2.5 .544v-5.044C21 8.448 20.552 8 20 8h-2v-1C18 3.686 15.314 1 12 1ZM16 8h-8v-1C8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4v1ZM21.145 23.141l-.505-2.945 2.14-2.086-2.957-.43L18.5 15l-1.323 2.68-2.957 .43 2.14 2.086-.505 2.945 2.645-1.391 2.645 1.391Z"),
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
        return _lockStarFill!!
    }

private var _lockStarFill: ImageVector? = null
