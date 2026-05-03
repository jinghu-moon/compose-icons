package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorBoldIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 180.000 C 144.000 188.837 136.837 196.000 128.000 196.000 C 119.163 196.000 112.000 188.837 112.000 180.000 C 112.000 171.163 119.163 164.000 128.000 164.000 C 136.837 164.000 144.000 171.163 144.000 180.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 ZM 128.000 64.000 C 103.740 64.000 84.000 81.940 84.000 104.000 L 84.000 108.000 C 84.000 114.627 89.373 120.000 96.000 120.000 C 102.627 120.000 108.000 114.627 108.000 108.000 L 108.000 104.000 C 108.000 95.180 117.000 88.000 128.000 88.000 C 139.000 88.000 148.000 95.180 148.000 104.000 C 148.000 112.820 139.000 120.000 128.000 120.000 C 121.373 120.000 116.000 125.373 116.000 132.000 L 116.000 140.000 C 115.985 146.140 120.608 151.301 126.713 151.960 C 132.818 152.618 138.435 148.562 139.730 142.560 C 158.310 137.880 172.000 122.370 172.000 104.000 C 172.000 81.940 152.260 64.000 128.000 64.000 Z"),
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
        return _question!!
    }

private var _question: ImageVector? = null
