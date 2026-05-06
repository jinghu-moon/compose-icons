package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorLightIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.59 160.3 174.35 139.13c-4.348-1.863-9.344-1.404-13.28 1.22-.197 .126-.384 .267-.56 .42l-24.69 21c-.519 .283-1.142 .305-1.68 .06-15.87-7.66-32.31-24-40-39.65-.26-.53-.26-1.15 0-1.68l21.07-25c.151-.185 .291-.379 .42-.58 2.588-3.951 3.009-8.941 1.12-13.27L95.73 34.49C93.278 28.772 87.346 25.358 81.17 26.11 54.137 29.664 33.943 52.734 34 80c0 78.3 63.7 142 142 142 27.264 .052 50.332-20.139 53.89-47.17 .751-6.146-2.625-12.055-8.3-14.53ZM176 210C104.32 210 46 151.68 46 80 45.931 58.774 61.628 40.795 82.67 38h.23c.825 .015 1.556 .536 1.84 1.31l21.1 47.11c.244 .53 .244 1.14 0 1.67L84.73 113.15c-.157 .179-.301 .369-.43 .57-2.687 4.102-3.032 9.31-.91 13.73 8.87 18.16 27.17 36.32 45.53 45.19 4.447 2.11 9.675 1.731 13.77-1 .19-.13 .38-.27 .56-.42l24.68-21c.493-.265 1.078-.302 1.6-.1l47.25 21.17c.791 .337 1.279 1.142 1.21 2C215.21 194.342 197.234 210.057 176 210Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
