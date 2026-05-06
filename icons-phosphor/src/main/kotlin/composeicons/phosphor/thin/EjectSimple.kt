package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorThinIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 200c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM29.2 149.12c-2.038-4.206-1.449-9.212 1.51-12.83L112.37 35.46c3.816-4.72 9.561-7.462 15.63-7.462 6.069 0 11.814 2.743 15.63 7.462l81.66 100.83c2.929 3.62 3.52 8.6 1.521 12.805-1.999 4.205-6.234 6.891-10.891 6.905h-175.84c-4.654 .01-8.894-2.671-10.88-6.88ZM36.42 145.68c.659 1.424 2.09 2.332 3.66 2.32h175.84c1.57 .012 3.001-.896 3.66-2.32 .714-1.425 .514-3.138-.51-4.36L137.41 40.5C135.115 37.655 131.656 36.001 128 36.001c-3.656 0-7.115 1.654-9.41 4.499L36.93 141.32c-1.024 1.222-1.224 2.935-.51 4.36Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
