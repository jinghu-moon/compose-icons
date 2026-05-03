package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorLightIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 96.000 206.000 C 97.591 205.999 99.116 205.366 100.240 204.240 L 126.590 177.900 C 127.370 177.125 128.630 177.125 129.410 177.900 L 155.760 204.240 C 156.884 205.366 158.409 205.999 160.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 162.490 194.000 L 137.900 169.420 C 135.274 166.794 131.713 165.319 128.000 165.319 C 124.287 165.319 120.726 166.794 118.100 169.420 L 93.510 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 80.000 98.000 C 63.431 98.000 50.000 111.431 50.000 128.000 C 50.000 144.569 63.431 158.000 80.000 158.000 C 96.569 158.000 110.000 144.569 110.000 128.000 C 110.000 111.431 96.569 98.000 80.000 98.000 ZM 80.000 146.000 C 70.059 146.000 62.000 137.941 62.000 128.000 C 62.000 118.059 70.059 110.000 80.000 110.000 C 89.941 110.000 98.000 118.059 98.000 128.000 C 98.000 137.941 89.941 146.000 80.000 146.000 ZM 176.000 98.000 C 159.431 98.000 146.000 111.431 146.000 128.000 C 146.000 144.569 159.431 158.000 176.000 158.000 C 192.569 158.000 206.000 144.569 206.000 128.000 C 206.000 111.431 192.569 98.000 176.000 98.000 ZM 176.000 146.000 C 166.059 146.000 158.000 137.941 158.000 128.000 C 158.000 118.059 166.059 110.000 176.000 110.000 C 185.941 110.000 194.000 118.059 194.000 128.000 C 194.000 137.941 185.941 146.000 176.000 146.000 Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
