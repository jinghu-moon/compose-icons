package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorBoldIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 124h-16.17L243.12 76.52c2.285-6.093-.703-12.896-6.734-15.337-6.032-2.441-12.91 .37-15.506 6.337l-23 56.51h-35.8l-23-56.51c-1.836-4.527-6.234-7.489-11.12-7.489-4.886 0-9.284 2.962-11.12 7.489L93.92 124h-35.84l-23-56.51C32.484 61.523 25.606 58.712 19.574 61.153c-6.032 2.441-9.019 9.244-6.734 15.337L32.17 124h-16.17C9.373 124 4 129.373 4 136c0 6.627 5.373 12 12 12h25.92l23 56.52c1.836 4.527 6.234 7.489 11.12 7.489 4.886 0 9.284-2.962 11.12-7.489l23-56.52h35.84l23 56.52c1.836 4.527 6.234 7.489 11.12 7.489 4.886 0 9.284-2.962 11.12-7.489l23-56.52h25.76c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM76 168.12 67.83 148h16.34ZM119.83 124 128 103.89 136.17 124ZM180 168.12 171.83 148h16.34Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
