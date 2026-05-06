package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CodeBoxLine: ImageVector
    get() {
        if (_codeBoxLine != null) return _codeBoxLine!!
        _codeBoxLine = remixIcon(
            name = "CodeBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM4 5v14h16v-14h-16ZM20 12l-3.535 3.535L15.05 14.121 17.172 12 15.05 9.879 16.465 8.464 20 12ZM6.828 12l2.121 2.121L7.536 15.535 4 12 7.536 8.464 8.95 9.879 6.828 12ZM11.244 17h-2.128L12.756 7h2.128L11.244 17Z"),
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
        return _codeBoxLine!!
    }

private var _codeBoxLine: ImageVector? = null
