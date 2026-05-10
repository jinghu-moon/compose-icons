package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CodeBoxFill: ImageVector
    get() {
        if (_codeBoxFill != null) return _codeBoxFill!!
        _codeBoxFill = remixIcon(
            name = "CodeBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM16.465 15.535 20 12 16.465 8.464 15.05 9.879 17.172 12l-2.121 2.121 1.414 1.414ZM6.828 12 8.95 9.879 7.536 8.464 4 12l3.536 3.535L8.95 14.121 6.828 12ZM11.244 17 14.884 7h-2.128L9.116 17h2.128Z"),
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
        return _codeBoxFill!!
    }

private var _codeBoxFill: ImageVector? = null
