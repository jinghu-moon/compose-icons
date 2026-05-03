package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorBoldIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 197.350 51.620 L 208.490 40.490 C 213.184 35.796 213.184 28.184 208.490 23.490 C 203.796 18.796 196.184 18.796 191.490 23.490 L 179.340 35.690 C 148.310 14.770 107.690 14.770 76.660 35.690 L 64.490 23.510 C 59.796 18.816 52.184 18.816 47.490 23.510 C 42.796 28.204 42.796 35.816 47.490 40.510 L 58.650 51.620 C 44.029 68.335 35.980 89.793 36.000 112.000 L 36.000 152.000 C 36.000 202.810 77.190 244.000 128.000 244.000 C 178.810 244.000 220.000 202.810 220.000 152.000 L 220.000 112.000 C 220.020 89.793 211.971 68.335 197.350 51.620 ZM 196.000 112.000 L 196.000 116.000 L 60.000 116.000 L 60.000 112.000 C 60.000 74.445 90.445 44.000 128.000 44.000 C 165.555 44.000 196.000 74.445 196.000 112.000 ZM 128.000 220.000 C 90.461 219.961 60.039 189.539 60.000 152.000 L 60.000 140.000 L 196.000 140.000 L 196.000 152.000 C 195.961 189.539 165.539 219.961 128.000 220.000 ZM 140.000 88.000 C 140.000 79.163 147.163 72.000 156.000 72.000 C 164.837 72.000 172.000 79.163 172.000 88.000 C 172.000 96.837 164.837 104.000 156.000 104.000 C 147.163 104.000 140.000 96.837 140.000 88.000 ZM 84.000 88.000 C 84.000 79.163 91.163 72.000 100.000 72.000 C 108.837 72.000 116.000 79.163 116.000 88.000 C 116.000 96.837 108.837 104.000 100.000 104.000 C 91.163 104.000 84.000 96.837 84.000 88.000 Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
