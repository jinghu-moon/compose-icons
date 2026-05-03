package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorFillIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 88.000 L 200.000 88.000 L 200.000 72.000 C 200.000 49.909 182.091 32.000 160.000 32.000 L 148.820 32.000 C 136.910 21.800 120.820 16.000 104.000 16.000 C 68.710 16.000 40.000 41.120 40.000 72.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 184.000 224.000 C 192.837 224.000 200.000 216.837 200.000 208.000 L 200.000 200.000 L 216.000 200.000 C 229.255 200.000 240.000 189.255 240.000 176.000 L 240.000 112.000 C 240.000 98.745 229.255 88.000 216.000 88.000 ZM 104.000 184.000 C 104.000 188.418 100.418 192.000 96.000 192.000 C 91.582 192.000 88.000 188.418 88.000 184.000 L 88.000 104.000 C 88.000 99.582 91.582 96.000 96.000 96.000 C 100.418 96.000 104.000 99.582 104.000 104.000 ZM 152.000 184.000 C 152.000 188.418 148.418 192.000 144.000 192.000 C 139.582 192.000 136.000 188.418 136.000 184.000 L 136.000 104.000 C 136.000 99.582 139.582 96.000 144.000 96.000 C 148.418 96.000 152.000 99.582 152.000 104.000 ZM 57.000 64.000 C 61.460 45.760 80.850 32.000 104.000 32.000 C 117.870 32.000 131.060 37.000 140.210 45.780 C 141.699 47.205 143.680 48.000 145.740 48.000 L 160.000 48.000 C 170.168 48.003 179.231 54.413 182.620 64.000 ZM 224.000 176.000 C 224.000 180.418 220.418 184.000 216.000 184.000 L 200.000 184.000 L 200.000 104.000 L 216.000 104.000 C 220.418 104.000 224.000 107.582 224.000 112.000 Z"),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
