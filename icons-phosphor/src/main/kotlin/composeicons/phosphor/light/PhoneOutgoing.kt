package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorLightIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M147.76 108.24c-2.34-2.343-2.34-6.137 0-8.48L185.52 62h-25.52c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-25.52l-37.76 37.76c-2.343 2.34-6.137 2.34-8.48 0ZM221.89 182.83C218.332 209.861 195.264 230.052 168 230 89.7 230 26 166.3 26 88 25.943 60.734 46.137 37.664 73.17 34.11c6.176-.752 12.108 2.662 14.56 8.38l21.1 47.11c1.889 4.329 1.468 9.319-1.12 13.27-.129 .201-.269 .395-.42 .58l-21.07 25c-.26 .53-.26 1.15 0 1.68 7.66 15.68 24.1 32 40 39.65 .538 .245 1.161 .223 1.68-.06l24.69-21c.176-.153 .363-.294 .56-.42 3.936-2.624 8.932-3.083 13.28-1.22l47.24 21.17c5.663 2.507 9.007 8.437 8.22 14.58ZM210 181.32c.069-.858-.419-1.663-1.21-2L161.54 158.15c-.522-.202-1.107-.165-1.6 .1l-24.68 21c-.18 .15-.37 .29-.56 .42-4.095 2.731-9.323 3.11-13.77 1-18.36-8.87-36.66-27-45.53-45.19-2.122-4.42-1.777-9.628 .91-13.73 .129-.201 .273-.391 .43-.57L97.79 96.09c.244-.53 .244-1.14 0-1.67L76.74 47.31C76.456 46.536 75.725 46.015 74.9 46h-.23C53.628 48.795 37.931 66.774 38 88c0 71.68 58.32 130 130 130 21.228 .064 39.206-15.637 42-36.68Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
