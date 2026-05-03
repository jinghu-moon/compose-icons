package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorFillIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 64.000 L 176.000 64.000 L 176.000 56.000 C 176.000 42.745 165.255 32.000 152.000 32.000 L 104.000 32.000 C 90.745 32.000 80.000 42.745 80.000 56.000 L 80.000 64.000 L 32.000 64.000 C 23.163 64.000 16.000 71.163 16.000 80.000 L 16.000 108.000 C 16.000 110.209 17.791 112.000 20.000 112.000 L 64.000 112.000 L 64.000 96.270 C 63.932 91.979 67.195 88.367 71.470 88.000 C 73.682 87.853 75.856 88.631 77.473 90.147 C 79.090 91.664 80.005 93.783 80.000 96.000 L 80.000 112.000 L 176.000 112.000 L 176.000 96.270 C 175.932 91.979 179.195 88.367 183.470 88.000 C 185.682 87.853 187.856 88.631 189.473 90.147 C 191.090 91.664 192.005 93.783 192.000 96.000 L 192.000 112.000 L 236.000 112.000 C 238.209 112.000 240.000 110.209 240.000 108.000 L 240.000 80.000 C 240.000 71.163 232.837 64.000 224.000 64.000 ZM 160.000 64.000 L 96.000 64.000 L 96.000 56.000 C 96.000 51.582 99.582 48.000 104.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 51.582 160.000 56.000 ZM 240.000 132.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 132.000 C 16.000 129.791 17.791 128.000 20.000 128.000 L 64.000 128.000 L 64.000 144.000 C 63.995 146.217 64.910 148.336 66.527 149.853 C 68.144 151.369 70.318 152.147 72.530 152.000 C 76.805 151.633 80.068 148.021 80.000 143.730 L 80.000 128.000 L 176.000 128.000 L 176.000 144.000 C 175.995 146.217 176.910 148.336 178.527 149.853 C 180.144 151.369 182.318 152.147 184.530 152.000 C 188.798 151.633 192.058 148.033 192.000 143.750 L 192.000 128.000 L 236.000 128.000 C 238.209 128.000 240.000 129.791 240.000 132.000 Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
