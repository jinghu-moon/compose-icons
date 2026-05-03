package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorBoldIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 84.000 C 185.673 84.000 200.000 69.673 200.000 52.000 C 200.000 34.327 185.673 20.000 168.000 20.000 C 150.327 20.000 136.000 34.327 136.000 52.000 C 136.000 69.673 150.327 84.000 168.000 84.000 ZM 168.000 44.000 C 172.418 44.000 176.000 47.582 176.000 52.000 C 176.000 56.418 172.418 60.000 168.000 60.000 C 163.582 60.000 160.000 56.418 160.000 52.000 C 160.000 47.582 163.582 44.000 168.000 44.000 ZM 204.000 140.000 C 181.909 140.000 164.000 157.909 164.000 180.000 C 164.000 202.091 181.909 220.000 204.000 220.000 C 226.091 220.000 244.000 202.091 244.000 180.000 C 244.000 157.909 226.091 140.000 204.000 140.000 ZM 204.000 196.000 C 195.163 196.000 188.000 188.837 188.000 180.000 C 188.000 171.163 195.163 164.000 204.000 164.000 C 212.837 164.000 220.000 171.163 220.000 180.000 C 220.000 188.837 212.837 196.000 204.000 196.000 ZM 54.000 136.000 C 30.804 136.000 12.000 154.804 12.000 178.000 C 12.000 201.196 30.804 220.000 54.000 220.000 C 77.196 220.000 96.000 201.196 96.000 178.000 C 96.000 154.804 77.196 136.000 54.000 136.000 ZM 54.000 196.000 C 44.059 196.000 36.000 187.941 36.000 178.000 C 36.000 168.059 44.059 160.000 54.000 160.000 C 63.941 160.000 72.000 168.059 72.000 178.000 C 72.000 187.941 63.941 196.000 54.000 196.000 ZM 188.000 128.000 L 152.000 128.000 C 148.816 128.003 145.762 126.740 143.510 124.490 L 120.000 101.000 L 105.000 116.000 L 136.520 147.510 C 138.759 149.767 140.010 152.821 140.000 156.000 L 140.000 204.000 C 140.000 210.627 134.627 216.000 128.000 216.000 C 121.373 216.000 116.000 210.627 116.000 204.000 L 116.000 161.000 L 79.510 124.490 C 77.251 122.238 75.981 119.180 75.981 115.990 C 75.981 112.800 77.251 109.742 79.510 107.490 L 111.510 75.490 C 113.762 73.231 116.820 71.961 120.010 71.961 C 123.200 71.961 126.258 73.231 128.510 75.490 L 157.000 104.000 L 188.000 104.000 C 194.627 104.000 200.000 109.373 200.000 116.000 C 200.000 122.627 194.627 128.000 188.000 128.000 Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
