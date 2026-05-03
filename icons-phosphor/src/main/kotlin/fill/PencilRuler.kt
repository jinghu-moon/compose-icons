package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorFillIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 160.000 224.000 C 151.163 224.000 144.000 216.837 144.000 208.000 L 144.000 180.000 C 144.000 177.791 145.791 176.000 148.000 176.000 L 184.000 176.000 C 186.217 176.005 188.336 175.090 189.853 173.473 C 191.369 171.856 192.147 169.682 192.000 167.470 C 191.629 163.205 188.031 159.947 183.750 160.000 L 148.000 160.000 C 145.791 160.000 144.000 158.209 144.000 156.000 L 144.000 140.000 C 144.000 137.791 145.791 136.000 148.000 136.000 L 184.000 136.000 C 186.217 136.005 188.336 135.090 189.853 133.473 C 191.369 131.856 192.147 129.682 192.000 127.470 C 191.629 123.205 188.031 119.947 183.750 120.000 L 148.000 120.000 C 145.791 120.000 144.000 118.209 144.000 116.000 L 144.000 100.000 C 144.000 97.791 145.791 96.000 148.000 96.000 L 184.000 96.000 C 186.217 96.005 188.336 95.090 189.853 93.473 C 191.369 91.856 192.147 89.682 192.000 87.470 C 191.628 83.197 188.019 79.937 183.730 80.000 L 148.000 80.000 C 145.791 80.000 144.000 78.209 144.000 76.000 L 144.000 48.000 C 144.000 39.163 151.163 32.000 160.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 109.660 58.340 C 111.160 59.842 112.002 61.878 112.000 64.000 L 112.000 208.000 C 112.000 216.837 104.837 224.000 96.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 64.000 C 31.998 61.878 32.840 59.842 34.340 58.340 L 66.340 26.340 C 67.841 24.838 69.877 23.994 72.000 23.994 C 74.123 23.994 76.159 24.838 77.660 26.340 ZM 48.000 80.000 L 48.000 184.000 L 64.000 184.000 L 64.000 80.000 ZM 80.000 80.000 L 80.000 184.000 L 96.000 184.000 L 96.000 80.000 ZM 51.310 64.000 L 92.690 64.000 L 72.000 43.310 Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
