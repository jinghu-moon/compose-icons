package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorThinIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 68.000 L 204.000 68.000 L 204.000 48.000 C 204.000 45.791 202.209 44.000 200.000 44.000 L 56.000 44.000 C 53.791 44.000 52.000 45.791 52.000 48.000 L 52.000 68.000 L 24.000 68.000 C 17.373 68.000 12.000 73.373 12.000 80.000 L 12.000 96.000 C 12.000 115.882 28.118 132.000 48.000 132.000 L 54.660 132.000 C 63.293 163.640 91.249 186.173 124.000 187.890 L 124.000 220.000 L 96.000 220.000 C 93.791 220.000 92.000 221.791 92.000 224.000 C 92.000 226.209 93.791 228.000 96.000 228.000 L 160.000 228.000 C 162.209 228.000 164.000 226.209 164.000 224.000 C 164.000 221.791 162.209 220.000 160.000 220.000 L 132.000 220.000 L 132.000 187.880 C 164.930 186.140 192.410 162.970 201.110 132.000 L 208.000 132.000 C 227.882 132.000 244.000 115.882 244.000 96.000 L 244.000 80.000 C 244.000 73.373 238.627 68.000 232.000 68.000 ZM 48.000 124.000 C 32.536 124.000 20.000 111.464 20.000 96.000 L 20.000 80.000 C 20.000 77.791 21.791 76.000 24.000 76.000 L 52.000 76.000 L 52.000 112.000 C 52.020 116.020 52.354 120.032 53.000 124.000 ZM 196.000 111.100 C 196.000 148.810 165.210 179.720 128.000 180.000 C 90.445 180.000 60.000 149.555 60.000 112.000 L 60.000 52.000 L 196.000 52.000 ZM 236.000 96.000 C 236.000 111.464 223.464 124.000 208.000 124.000 L 202.900 124.000 C 203.627 119.738 203.994 115.423 204.000 111.100 L 204.000 76.000 L 232.000 76.000 C 234.209 76.000 236.000 77.791 236.000 80.000 Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
