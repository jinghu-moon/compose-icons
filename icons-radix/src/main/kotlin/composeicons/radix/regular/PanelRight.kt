package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PanelRight: ImageVector
    get() {
        if (_panelRight != null) return _panelRight!!
        _panelRight = radixIcon(
            name = "PanelRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.653 2.008C14.41 2.085 15 2.723 15 3.5v8l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L13.5 13h-12l-.153-.008C.641 12.92 .079 12.359 .008 11.653L0 11.5v-8C0 2.723 .59 2.085 1.347 2.008L1.5 2h12l.153 .008ZM1.5 2.984c-.285 0-.516 .231-.516 .516v8c0 .285 .231 .516 .516 .516h8.5v-9.031h-8.5ZM11 12.016h2.5c.285 0 .516-.231 .516-.516v-8c0-.285-.231-.516-.516-.516h-2.5v9.031Z"),
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
        return _panelRight!!
    }

private var _panelRight: ImageVector? = null
