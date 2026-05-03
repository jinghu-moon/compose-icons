package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorBoldIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 156.000 C 83.163 156.000 76.000 148.837 76.000 140.000 C 76.000 131.163 83.163 124.000 92.000 124.000 C 100.837 124.000 108.000 131.163 108.000 140.000 C 108.000 148.837 100.837 156.000 92.000 156.000 ZM 164.000 124.000 C 155.163 124.000 148.000 131.163 148.000 140.000 C 148.000 148.837 155.163 156.000 164.000 156.000 C 172.837 156.000 180.000 148.837 180.000 140.000 C 180.000 131.163 172.837 124.000 164.000 124.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 ZM 85.340 102.000 L 121.340 126.000 C 125.372 128.690 130.628 128.690 134.660 126.000 L 170.660 102.000 C 176.183 98.322 177.678 90.863 174.000 85.340 C 170.322 79.817 162.863 78.322 157.340 82.000 L 128.000 101.580 L 98.660 82.000 C 93.137 78.322 85.678 79.817 82.000 85.340 C 78.322 90.863 79.817 98.322 85.340 102.000 ZM 154.000 167.120 C 137.963 157.641 118.037 157.641 102.000 167.120 C 98.094 169.163 95.623 173.183 95.563 177.591 C 95.504 181.998 97.865 186.083 101.714 188.232 C 105.563 190.380 110.280 190.245 114.000 187.880 C 122.612 182.692 133.388 182.692 142.000 187.880 C 145.720 190.245 150.437 190.380 154.286 188.232 C 158.135 186.083 160.496 181.998 160.437 177.591 C 160.377 173.183 157.906 169.163 154.000 167.120 Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
