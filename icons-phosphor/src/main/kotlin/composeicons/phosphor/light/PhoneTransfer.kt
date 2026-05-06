package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorLightIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 72c0-3.314 2.686-6 6-6h57.51L179.76 44.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l32 32c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L201.51 78h-57.51c-3.314 0-6-2.686-6-6ZM221.89 182.83C218.332 209.861 195.264 230.052 168 230 89.7 230 26 166.3 26 88 25.948 60.736 46.139 37.668 73.17 34.11c6.179-.751 12.111 2.668 14.56 8.39l21.1 47.11c1.889 4.329 1.468 9.319-1.12 13.27-.129 .198-.269 .388-.42 .57L86.22 128.51c-.259 .526-.259 1.144 0 1.67 7.66 15.69 24.1 32 40 39.65 .538 .245 1.161 .223 1.68-.06l24.69-21c.176-.153 .363-.294 .56-.42 3.936-2.624 8.932-3.083 13.28-1.22l47.24 21.17c5.644 2.501 8.983 8.404 8.22 14.53ZM210 181.32c.069-.858-.419-1.663-1.21-2L161.54 158.15c-.527-.194-1.111-.158-1.61 .1l-24.67 21c-.18 .15-.37 .29-.56 .42-4.095 2.731-9.323 3.11-13.77 1-18.36-8.87-36.66-27-45.53-45.19-2.122-4.42-1.777-9.628 .91-13.73 .129-.201 .273-.391 .43-.57L97.79 96.09c.244-.53 .244-1.14 0-1.67L76.74 47.31C76.456 46.536 75.725 46.015 74.9 46h-.23C53.631 48.799 37.935 66.775 38 88c0 71.68 58.32 130 130 130 21.228 .064 39.206-15.637 42-36.68Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
