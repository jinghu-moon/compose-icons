package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeakLine: ImageVector
    get() {
        if (_speakLine != null) return _speakLine!!
        _speakLine = remixIcon(
            name = "SpeakLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.934 8.965C16.426 5.036 13.068 2 9 2 4.582 2 1 5.582 1 10c0 1.892 .657 3.631 1.756 5.001 .808 1.008 1.245 2.124 1.245 3.305L4 22h9l.001-3h1.999c1.105 0 2-.895 2-2v-2.929l1.959-.839c.343-.147 .373-.495 .225-.728L16.934 8.965ZM3 10C3 6.686 5.686 4 9 4c3.024 0 5.566 2.251 5.95 5.221l.057 .441 1.542 2.425L15 12.752v4.248h-3.998l-.001 3h-5.001l0-1.694C6 16.667 5.41 15.114 4.316 13.75 3.468 12.693 3 11.385 3 10ZM21.153 18.102 19.489 16.993C20.444 15.564 21 13.847 21 12 21 10.153 20.444 8.436 19.489 7.007L21.153 5.898C22.32 7.644 23 9.743 23 12c0 2.257-.68 4.356-1.847 6.102Z"),
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
        return _speakLine!!
    }

private var _speakLine: ImageVector? = null
