package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorBoldIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 184.490 119.510 C 189.184 124.204 189.184 131.816 184.490 136.510 C 179.796 141.204 172.184 141.204 167.490 136.510 L 162.000 131.000 L 156.490 136.520 C 151.796 141.214 144.184 141.214 139.490 136.520 C 134.796 131.826 134.796 124.214 139.490 119.520 L 145.000 114.000 L 139.480 108.490 C 134.786 103.796 134.786 96.184 139.480 91.490 C 144.174 86.796 151.786 86.796 156.480 91.490 L 162.000 97.000 L 167.510 91.480 C 172.204 86.786 179.816 86.786 184.510 91.480 C 189.204 96.174 189.204 103.786 184.510 108.480 L 179.000 114.000 ZM 116.490 136.510 C 114.238 138.769 111.180 140.039 107.990 140.039 C 104.800 140.039 101.742 138.769 99.490 136.510 L 94.000 131.000 L 88.490 136.520 C 83.796 141.214 76.184 141.214 71.490 136.520 C 66.796 131.826 66.796 124.214 71.490 119.520 L 77.000 114.000 L 71.480 108.490 C 66.786 103.796 66.786 96.184 71.480 91.490 C 76.174 86.796 83.786 86.796 88.480 91.490 L 94.000 97.000 L 99.510 91.480 C 104.204 86.786 111.816 86.786 116.510 91.480 C 121.204 96.174 121.204 103.786 116.510 108.480 L 111.000 114.000 L 116.520 119.510 C 118.769 121.765 120.030 124.821 120.024 128.006 C 120.019 131.191 118.747 134.243 116.490 136.490 ZM 144.000 180.000 C 144.000 188.837 136.837 196.000 128.000 196.000 C 119.163 196.000 112.000 188.837 112.000 180.000 C 112.000 171.163 119.163 164.000 128.000 164.000 C 136.837 164.000 144.000 171.163 144.000 180.000 Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
