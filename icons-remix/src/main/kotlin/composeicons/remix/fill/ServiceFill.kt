package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ServiceFill: ImageVector
    get() {
        if (_serviceFill != null) return _serviceFill!!
        _serviceFill = remixIcon(
            name = "ServiceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.121 10.479c-.391-.391-1.024-.391-1.414 0L12 11.186c-.781 .781-2.047 .781-2.828 0-.781-.781-.781-2.047 0-2.828L14.802 2.726c2.104-.476 4.399 .105 6.037 1.743 2.419 2.419 2.533 6.271 .34 8.825l-2.108 2.135L14.121 10.479ZM3.161 4.469C5.335 2.295 8.664 1.983 11.17 3.531L7.757 6.944c-1.562 1.562-1.562 4.095 0 5.657 1.515 1.515 3.942 1.561 5.512 .138l.145-.138 4.243 4.243-4.243 4.243c-.781 .781-2.047 .781-2.828 0L3.161 13.661C.623 11.123 .623 7.007 3.161 4.469Z"),
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
        return _serviceFill!!
    }

private var _serviceFill: ImageVector? = null
