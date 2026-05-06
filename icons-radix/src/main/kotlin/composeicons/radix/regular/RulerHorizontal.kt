package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RulerHorizontal: ImageVector
    get() {
        if (_rulerHorizontal != null) return _rulerHorizontal!!
        _rulerHorizontal = radixIcon(
            name = "RulerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.601 4.01c.228 .047 .399 .249 .399 .49v6c0 .276-.224 .5-.5 .5h-14C.224 11 0 10.776 0 10.5v-6L.01 4.399C.056 4.171 .258 4 .5 4h14l.101 .01ZM1 10h13v-5h-1.075v1.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-1.5h-1.15v1.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-1.5h-1.15v2.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-2.5h-1.15v1.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-1.5h-1.15v1.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-1.5h-1.15v2.5c0 .235-.19 .425-.425 .425-.235 0-.425-.19-.425-.425v-2.5h-1.075v5Z"),
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
        return _rulerHorizontal!!
    }

private var _rulerHorizontal: ImageVector? = null
