package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorFillIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 52.000 C 136.000 36.536 148.536 24.000 164.000 24.000 C 179.464 24.000 192.000 36.536 192.000 52.000 C 192.000 67.464 179.464 80.000 164.000 80.000 C 148.536 80.000 136.000 67.464 136.000 52.000 ZM 240.000 176.000 C 240.000 198.091 222.091 216.000 200.000 216.000 C 177.909 216.000 160.000 198.091 160.000 176.000 C 160.000 153.909 177.909 136.000 200.000 136.000 C 222.091 136.000 240.000 153.909 240.000 176.000 ZM 224.000 176.000 C 224.000 162.745 213.255 152.000 200.000 152.000 C 186.745 152.000 176.000 162.745 176.000 176.000 C 176.000 189.255 186.745 200.000 200.000 200.000 C 213.255 200.000 224.000 189.255 224.000 176.000 ZM 200.000 112.000 C 200.000 107.582 196.418 104.000 192.000 104.000 L 155.310 104.000 L 125.660 74.340 C 124.159 72.838 122.123 71.994 120.000 71.994 C 117.877 71.994 115.841 72.838 114.340 74.340 L 82.340 106.340 C 80.838 107.841 79.994 109.877 79.994 112.000 C 79.994 114.123 80.838 116.159 82.340 117.660 L 120.000 155.310 L 120.000 200.000 C 120.000 204.418 123.582 208.000 128.000 208.000 C 132.418 208.000 136.000 204.418 136.000 200.000 L 136.000 152.000 C 136.002 149.878 135.160 147.842 133.660 146.340 L 99.310 112.000 L 120.000 91.310 L 146.340 117.660 C 147.842 119.160 149.878 120.002 152.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 116.418 200.000 112.000 ZM 96.000 176.000 C 96.000 198.091 78.091 216.000 56.000 216.000 C 33.909 216.000 16.000 198.091 16.000 176.000 C 16.000 153.909 33.909 136.000 56.000 136.000 C 78.091 136.000 96.000 153.909 96.000 176.000 ZM 80.000 176.000 C 80.000 162.745 69.255 152.000 56.000 152.000 C 42.745 152.000 32.000 162.745 32.000 176.000 C 32.000 189.255 42.745 200.000 56.000 200.000 C 69.255 200.000 80.000 189.255 80.000 176.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
