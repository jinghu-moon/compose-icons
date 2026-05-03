package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorThinIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 56.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 C 141.791 180.000 140.000 178.209 140.000 176.000 L 140.000 120.000 L 44.000 120.000 L 44.000 176.000 C 44.000 178.209 42.209 180.000 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 C 42.209 52.000 44.000 53.791 44.000 56.000 L 44.000 112.000 L 140.000 112.000 L 140.000 56.000 C 140.000 53.791 141.791 52.000 144.000 52.000 C 146.209 52.000 148.000 53.791 148.000 56.000 ZM 240.000 204.000 L 200.000 204.000 L 238.360 152.850 C 244.987 144.038 245.827 132.158 240.504 122.502 C 235.181 112.846 224.687 107.213 213.698 108.113 C 202.710 109.012 193.272 116.277 189.590 126.670 C 189.058 128.031 189.310 129.574 190.248 130.694 C 191.185 131.815 192.660 132.335 194.093 132.051 C 195.526 131.767 196.691 130.724 197.130 129.330 C 197.816 127.420 198.783 125.624 200.000 124.000 C 206.627 115.163 219.163 113.373 228.000 120.000 C 236.837 126.627 238.627 139.163 232.000 148.000 L 188.800 205.600 C 187.891 206.812 187.745 208.434 188.422 209.789 C 189.100 211.144 190.485 212.000 192.000 212.000 L 240.000 212.000 C 242.209 212.000 244.000 210.209 244.000 208.000 C 244.000 205.791 242.209 204.000 240.000 204.000 Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
