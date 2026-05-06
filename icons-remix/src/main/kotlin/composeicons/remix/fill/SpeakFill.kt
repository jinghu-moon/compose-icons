package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeakFill: ImageVector
    get() {
        if (_speakFill != null) return _speakFill!!
        _speakFill = remixIcon(
            name = "SpeakFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 2c4.068 0 7.426 3.036 7.934 6.965l2.25 3.539c.148 .233 .118 .581-.225 .728L17 14.071v2.929c0 1.105-.895 2-2 2h-1.999L13 22h-9l0-3.694C4 17.125 3.564 16.009 2.756 15.001 1.657 13.631 1 11.892 1 10 1 5.582 4.582 2 9 2ZM21.153 18.102 19.489 16.993C20.444 15.564 21 13.847 21 12 21 10.153 20.444 8.436 19.489 7.007L21.153 5.898C22.32 7.644 23 9.743 23 12c0 2.257-.68 4.356-1.847 6.102Z"),
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
        return _speakFill!!
    }

private var _speakFill: ImageVector? = null
