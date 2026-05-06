package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RulerSquare: ImageVector
    get() {
        if (_rulerSquare != null) return _rulerSquare!!
        _rulerSquare = radixIcon(
            name = "RulerSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.601 .01C14.829 .056 15 .258 15 .5v4C15 4.776 14.776 5 14.5 5h-9.5v9.5C5 14.776 4.776 15 4.5 15h-4C.224 15 0 14.776 0 14.5v-14L.01 .399C.056 .171 .258 0 .5 0h14l.101 .01ZM1 4.925v9.075h3v-1.075h-1.25c-.235 0-.425-.19-.425-.425 0-.235 .19-.425 .425-.425h1.25v-1.15h-1.75c-.235 0-.425-.19-.425-.425 0-.235 .19-.425 .425-.425h1.75v-1.15h-1.25C2.515 8.925 2.325 8.735 2.325 8.5c0-.235 .19-.425 .425-.425h1.25v-1.15h-1.25c-.235 0-.425-.19-.425-.425 0-.235 .19-.425 .425-.425h1.25v-1.15h-3ZM1 4.075h3.075v-3.075h-3.075v3.075ZM4.925 4h1.15v-1.25c0-.235 .19-.425 .425-.425 .235 0 .425 .19 .425 .425v1.25h1.15v-1.25c0-.235 .19-.425 .425-.425 .235 0 .425 .19 .425 .425v1.25h1.15v-1.75c0-.235 .19-.425 .425-.425 .235 0 .425 .19 .425 .425v1.75h1.15v-1.25c0-.235 .19-.425 .425-.425 .235 0 .425 .19 .425 .425v1.25h1.075v-3h-9.075v3Z"),
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
        return _rulerSquare!!
    }

private var _rulerSquare: ImageVector? = null
