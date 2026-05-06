package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorLightIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.24 67.76c2.34 2.343 2.34 6.137 0 8.48l-16 16c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l16-16c2.343-2.34 6.137-2.34 8.48 0ZM222 72c.029 10.084-3.979 19.76-11.13 26.87l-24 24c-.878 .877-2.007 1.461-3.23 1.67C131.5 133.54 45.11 219.38 44.24 220.24c-.521 .529-1.139 .953-1.82 1.25h0c-.764 .333-1.587 .506-2.42 .51-2.425-.002-4.611-1.464-5.538-3.705-.928-2.241-.415-4.82 1.298-6.535h0c1.4-1.41 86.78-87.44 95.69-139.39 .209-1.223 .793-2.352 1.67-3.23l24-24c10.866-10.874 27.212-14.13 41.415-8.25C212.738 42.77 222 56.628 222 72ZM210 72C209.996 61.487 203.661 52.011 193.948 47.988c-9.713-4.023-20.893-1.8-28.328 5.632L142.93 76.3c-4.14 20.79-18.62 47.61-43.13 79.9 32.29-24.51 59.11-39 79.9-43.13L202.38 90.38C207.276 85.519 210.021 78.899 210 72Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
