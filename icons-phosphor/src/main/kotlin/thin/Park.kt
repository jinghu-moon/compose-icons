package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorThinIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 196.000 L 196.000 196.000 L 196.000 164.000 L 224.000 164.000 C 225.238 164.002 226.408 163.431 227.167 162.452 C 227.926 161.474 228.190 160.199 227.880 159.000 L 195.880 31.000 C 195.434 29.220 193.835 27.972 192.000 27.972 C 190.165 27.972 188.566 29.220 188.120 31.000 L 156.120 159.000 C 155.810 160.199 156.074 161.474 156.833 162.452 C 157.592 163.431 158.762 164.002 160.000 164.000 L 188.000 164.000 L 188.000 196.000 L 116.000 196.000 L 116.000 172.000 L 128.000 172.000 C 130.209 172.000 132.000 170.209 132.000 168.000 C 132.000 165.791 130.209 164.000 128.000 164.000 L 116.000 164.000 L 116.000 140.000 L 128.000 140.000 C 130.209 140.000 132.000 138.209 132.000 136.000 C 132.000 133.791 130.209 132.000 128.000 132.000 L 40.000 132.000 C 37.791 132.000 36.000 133.791 36.000 136.000 C 36.000 138.209 37.791 140.000 40.000 140.000 L 52.000 140.000 L 52.000 164.000 L 40.000 164.000 C 37.791 164.000 36.000 165.791 36.000 168.000 C 36.000 170.209 37.791 172.000 40.000 172.000 L 52.000 172.000 L 52.000 196.000 L 24.000 196.000 C 21.791 196.000 20.000 197.791 20.000 200.000 C 20.000 202.209 21.791 204.000 24.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 C 236.000 197.791 234.209 196.000 232.000 196.000 ZM 192.000 48.490 L 218.880 156.000 L 165.120 156.000 ZM 60.000 140.000 L 108.000 140.000 L 108.000 164.000 L 60.000 164.000 ZM 60.000 172.000 L 108.000 172.000 L 108.000 196.000 L 60.000 196.000 ZM 116.000 92.000 C 129.255 92.000 140.000 81.255 140.000 68.000 C 140.000 54.745 129.255 44.000 116.000 44.000 C 102.745 44.000 92.000 54.745 92.000 68.000 C 92.000 81.255 102.745 92.000 116.000 92.000 ZM 116.000 52.000 C 124.837 52.000 132.000 59.163 132.000 68.000 C 132.000 76.837 124.837 84.000 116.000 84.000 C 107.163 84.000 100.000 76.837 100.000 68.000 C 100.000 59.163 107.163 52.000 116.000 52.000 Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
