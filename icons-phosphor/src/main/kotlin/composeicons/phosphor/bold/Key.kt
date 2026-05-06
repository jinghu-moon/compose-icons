package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorBoldIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 76c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM244 98.74c-1.631 45.208-38.653 81.069-83.89 81.26h-.11c-8.005 .012-15.969-1.126-23.65-3.38l-7.86 7.87c-2.252 2.25-5.306 3.512-8.49 3.51h-12v12c0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12h-32C28.954 236 20 227.046 20 216v-28.69c-.014-5.307 2.096-10.399 5.86-14.14L79.38 119.65C70.118 87.802 80.464 53.486 105.786 32.064 131.107 10.642 166.663 6.126 196.536 20.537 226.409 34.948 245.005 65.588 244 98.74ZM202.43 53.57C190.726 41.761 174.615 35.39 158 36c-32 1-58 27.89-58 59.89-.025 7.597 1.401 15.128 4.2 22.19 1.93 4.511 .921 9.742-2.55 13.21L44 189v23h16v-12c0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12h19l9.65-9.65c3.47-3.475 8.707-4.485 13.22-2.55 7.043 2.794 14.553 4.22 22.13 4.2h.08c32 0 58.87-26.07 59.89-58 .61-16.609-5.749-32.717-17.54-44.43Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
