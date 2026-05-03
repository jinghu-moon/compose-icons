package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorThinIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 116.000 C 103.699 116.000 84.000 135.699 84.000 160.000 C 84.000 184.301 103.699 204.000 128.000 204.000 C 152.301 204.000 172.000 184.301 172.000 160.000 C 171.972 135.711 152.289 116.028 128.000 116.000 ZM 128.000 196.000 C 108.118 196.000 92.000 179.882 92.000 160.000 C 92.000 140.118 108.118 124.000 128.000 124.000 C 147.882 124.000 164.000 140.118 164.000 160.000 C 164.000 179.882 147.882 196.000 128.000 196.000 ZM 207.220 132.000 L 177.430 47.800 C 170.494 26.657 150.873 12.270 128.623 12.012 C 106.372 11.754 86.424 25.683 79.000 46.660 L 79.000 46.660 L 49.450 130.170 C 36.289 164.905 47.503 204.159 77.027 226.699 C 106.551 249.239 147.373 249.713 177.411 227.864 C 207.450 206.014 219.572 167.030 207.220 132.000 ZM 128.000 236.000 C 103.012 235.968 79.634 223.664 65.460 203.085 C 51.285 182.506 48.123 156.278 57.000 132.920 L 86.500 49.330 C 92.772 31.538 109.688 19.724 128.552 19.961 C 147.415 20.199 164.028 32.435 169.850 50.380 L 199.670 134.660 C 207.898 157.925 204.318 183.736 190.069 203.883 C 175.820 224.031 152.677 236.006 128.000 236.000 Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
