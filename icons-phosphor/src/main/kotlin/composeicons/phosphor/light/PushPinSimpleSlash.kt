package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorLightIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M85.25 40c0-3.314 2.686-6 6-6h100.75c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-8.85l19.17 108.64c.291 1.574-.059 3.198-.971 4.513-.913 1.314-2.313 2.21-3.889 2.487-.346 .067-.698 .101-1.05 .1-2.922-.008-5.413-2.119-5.9-5L171 46h-79.75c-3.314 0-6-2.686-6-6ZM212 220.44c-1.177 1.072-2.732 1.633-4.323 1.557-1.591-.075-3.086-.779-4.157-1.957L169 182h-35v58c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-58h-82c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h11L68.38 71.33 43.56 44c-1.865-2.484-1.526-5.981 .782-8.06 2.308-2.079 5.821-2.053 8.098 .06L212.44 212c2.196 2.457 1.999 6.225-.44 8.44ZM158 170 78.58 82.56 63.15 170Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
