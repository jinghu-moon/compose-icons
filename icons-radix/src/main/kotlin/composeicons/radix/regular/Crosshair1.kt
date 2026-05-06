package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crosshair1: ImageVector
    get() {
        if (_crosshair1 != null) return _crosshair1!!
        _crosshair1 = radixIcon(
            name = "Crosshair1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.502 .877c3.659 0 6.625 2.966 6.625 6.625-0 3.659-2.967 6.625-6.625 6.625C3.843 14.127 .877 11.161 .877 7.502 .877 3.843 3.843 .877 7.502 .877ZM8 4.5c-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-2.65C4.267 2.09 2.09 4.267 1.85 7h2.65c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-2.65c.238 2.735 2.416 4.913 5.15 5.153v-2.653c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v2.653c2.737-.238 4.916-2.417 5.154-5.153h-2.654c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h2.653C12.913 4.265 10.736 2.087 8 1.849v2.651Z"),
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
        return _crosshair1!!
    }

private var _crosshair1: ImageVector? = null
