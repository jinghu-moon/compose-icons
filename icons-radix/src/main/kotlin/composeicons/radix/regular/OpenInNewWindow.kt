package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.OpenInNewWindow: ImageVector
    get() {
        if (_openInNewWindow != null) return _openInNewWindow!!
        _openInNewWindow = radixIcon(
            name = "OpenInNewWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 6c.033 0 .065 .002 .098 .009 .051 .01 .098 .03 .143 .055 .04 .022 .079 .049 .113 .083 .034 .034 .06 .072 .082 .112 .025 .044 .044 .091 .055 .143C8.997 6.434 9 6.467 9 6.5v3C9 9.776 8.776 10 8.5 10 8.224 10 8 9.776 8 9.5v-1.793L2.854 12.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L7.293 7h-1.793C5.224 7 5 6.776 5 6.5 5 6.224 5.224 6 5.5 6h3ZM12 2c.552 0 1 .448 1 1v9c0 .552-.448 1-1 1h-3.5C8.224 13 8 12.776 8 12.5 8 12.224 8.224 12 8.5 12h3.5v-9h-9v3.5C3 6.776 2.776 7 2.5 7 2.224 7 2 6.776 2 6.5v-3.5C2 2.448 2.448 2 3 2h9Z"),
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
        return _openInNewWindow!!
    }

private var _openInNewWindow: ImageVector? = null
