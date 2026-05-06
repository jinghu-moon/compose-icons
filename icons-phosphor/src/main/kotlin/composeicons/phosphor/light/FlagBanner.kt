package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorLightIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.07 52.8C235.972 51.059 234.058 50.002 232 50h-192c-2.425 .002-4.611 1.464-5.538 3.705-.928 2.241-.415 4.819 1.298 6.535L79.51 104 35.76 147.76c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705h136.78l-30.2 63.42c-1.425 2.993-.153 6.575 2.84 8 2.993 1.425 6.575 .153 8-2.84l80-168c.882-1.859 .75-4.041-.35-5.78ZM182.5 146h-128L92.25 108.24c2.34-2.343 2.34-6.137 0-8.48L54.49 62h168Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
