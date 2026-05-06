package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorLightIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 220.44c-1.177 1.072-2.732 1.633-4.323 1.557-1.591-.075-3.086-.779-4.157-1.957L134 143.52v50.48h26c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-63.68L62 64.32v23.68c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c.004-1.287 .421-2.538 1.19-3.57L43.56 44c-1.865-2.484-1.526-5.981 .782-8.06 2.308-2.079 5.821-2.053 8.098 .06L212.44 212c2.196 2.457 1.999 6.225-.44 8.44ZM105.79 62h16.21v18.43c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18.43h60v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6h-94.21c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
