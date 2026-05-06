package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BankLine: ImageVector
    get() {
        if (_bankLine != null) return _bankLine!!
        _bankLine = remixIcon(
            name = "BankLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 20h20v2h-20v-2ZM4 12h2v7h-2v-7ZM9 12h2v7h-2v-7ZM13 12h2v7h-2v-7ZM18 12h2v7h-2v-7ZM2 7 12 2 22 7v4h-20v-4ZM4 8.236v.764h16v-.764L12 4.236 4 8.236ZM12 8C11.448 8 11 7.552 11 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _bankLine!!
    }

private var _bankLine: ImageVector? = null
