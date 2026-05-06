package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = radixIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 0c.552 0 1 .448 1 1v1h4c.552 0 1 .448 1 1v3c0 .888-.387 1.686-1 2.234v3.266C14 12.328 13.328 13 12.5 13h-10C1.672 13 1 12.328 1 11.5v-3.267C.388 7.685 0 6.888 0 6v-3C0 2.448 .448 2 1 2h4v-1C5 .448 5.448 0 6 0h3ZM13 8.827C12.687 8.938 12.351 9 12 9h-4v.5C8 9.776 7.776 10 7.5 10 7.224 10 7 9.776 7 9.5v-.5h-4C2.649 9 2.313 8.938 2 8.827v2.673c0 .276 .224 .5 .5 .5h10c.276 0 .5-.224 .5-.5v-2.673ZM1 6c0 .654 .313 1.235 .8 1.601l.13 .089C2.239 7.886 2.606 8 3 8h4v-.5C7 7.224 7.224 7 7.5 7 7.776 7 8 7.224 8 7.5v.5h4c.451 0 .866-.148 1.2-.399l.174-.147C13.76 7.088 14 6.572 14 6v-3h-13v3ZM6 2h3v-1h-3v1Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
