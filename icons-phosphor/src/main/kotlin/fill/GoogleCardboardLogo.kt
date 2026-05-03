package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorFillIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 96.000 208.000 C 98.122 208.002 100.158 207.160 101.660 205.660 L 128.000 179.310 L 154.340 205.660 C 155.842 207.160 157.878 208.002 160.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 80.000 152.000 C 66.745 152.000 56.000 141.255 56.000 128.000 C 56.000 114.745 66.745 104.000 80.000 104.000 C 93.255 104.000 104.000 114.745 104.000 128.000 C 104.000 141.255 93.255 152.000 80.000 152.000 ZM 176.000 152.000 C 162.745 152.000 152.000 141.255 152.000 128.000 C 152.000 114.745 162.745 104.000 176.000 104.000 C 189.255 104.000 200.000 114.745 200.000 128.000 C 200.000 141.255 189.255 152.000 176.000 152.000 Z"),
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
