package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorThinIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 69.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L192 106.34 149.66 64 186.83 26.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L144 58.34 114.83 29.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L118.34 44 62.54 99.8c-14.03 14.07-14.03 36.84 0 50.91l18.55 18.54L29.17 221.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L86.75 174.91l18.54 18.55c14.072 14.025 36.838 14.025 50.91 0L212 137.66l9.17 9.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L197.66 112 234.83 74.83c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM150.54 187.8c-10.934 10.929-28.656 10.929-39.59 0L68.2 145.05c-10.929-10.934-10.929-28.656 0-39.59L124 49.66 206.34 132Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
