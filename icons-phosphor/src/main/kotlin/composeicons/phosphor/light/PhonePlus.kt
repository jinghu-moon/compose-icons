package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorLightIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.59 168.3 166.35 147.13c-4.348-1.863-9.344-1.404-13.28 1.22-.197 .126-.384 .267-.56 .42l-24.69 21c-.519 .283-1.142 .305-1.68 .06-15.87-7.66-32.31-24-40-39.65-.259-.526-.259-1.144 0-1.67l21.07-25.06c.151-.185 .291-.379 .42-.58 2.588-3.951 3.009-8.941 1.12-13.27L87.73 42.49C85.278 36.772 79.346 33.358 73.17 34.11 46.139 37.668 25.948 60.736 26 88c0 78.3 63.7 142 142 142 27.264 .052 50.332-20.139 53.89-47.17 .751-6.146-2.625-12.055-8.3-14.53ZM168 218C96.32 218 38 159.68 38 88 37.931 66.774 53.628 48.795 74.67 46h.23c.825 .015 1.556 .536 1.84 1.31L97.84 94.42c.244 .53 .244 1.14 0 1.67L76.73 121.15c-.157 .179-.301 .369-.43 .57-2.687 4.102-3.032 9.31-.91 13.73 8.87 18.16 27.17 36.32 45.53 45.19 4.447 2.11 9.675 1.731 13.77-1 .19-.13 .38-.27 .56-.42l24.68-21c.493-.265 1.078-.302 1.6-.1l47.25 21.17c.791 .337 1.279 1.142 1.21 2C207.21 202.342 189.234 218.057 168 218ZM138 80c0-3.314 2.686-6 6-6h26v-26c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v26h26c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-26v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-26c-3.314 0-6-2.686-6-6Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
