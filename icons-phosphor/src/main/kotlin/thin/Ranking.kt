package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorThinIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.210 101.260 C 115.518 99.167 116.649 96.909 118.740 96.210 L 130.740 92.210 C 131.958 91.806 133.297 92.011 134.338 92.761 C 135.380 93.512 135.998 94.716 136.000 96.000 L 136.000 136.000 C 136.000 138.209 134.209 140.000 132.000 140.000 C 129.791 140.000 128.000 138.209 128.000 136.000 L 128.000 101.550 L 121.260 103.790 C 119.167 104.482 116.909 103.351 116.210 101.260 ZM 244.000 208.000 C 244.000 210.209 242.209 212.000 240.000 212.000 L 16.000 212.000 C 13.791 212.000 12.000 210.209 12.000 208.000 C 12.000 205.791 13.791 204.000 16.000 204.000 L 28.000 204.000 L 28.000 104.000 C 28.000 97.373 33.373 92.000 40.000 92.000 L 84.000 92.000 L 84.000 56.000 C 84.000 49.373 89.373 44.000 96.000 44.000 L 160.000 44.000 C 166.627 44.000 172.000 49.373 172.000 56.000 L 172.000 132.000 L 216.000 132.000 C 222.627 132.000 228.000 137.373 228.000 144.000 L 228.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 205.791 244.000 208.000 ZM 172.000 140.000 L 172.000 204.000 L 220.000 204.000 L 220.000 144.000 C 220.000 141.791 218.209 140.000 216.000 140.000 ZM 92.000 204.000 L 164.000 204.000 L 164.000 56.000 C 164.000 53.791 162.209 52.000 160.000 52.000 L 96.000 52.000 C 93.791 52.000 92.000 53.791 92.000 56.000 ZM 36.000 204.000 L 84.000 204.000 L 84.000 100.000 L 40.000 100.000 C 37.791 100.000 36.000 101.791 36.000 104.000 Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
