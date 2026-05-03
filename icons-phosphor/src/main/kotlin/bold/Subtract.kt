package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorBoldIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 78.000 C 169.084 37.210 131.562 9.161 89.917 12.154 C 48.272 15.146 15.146 48.272 12.154 89.917 C 9.161 131.562 37.210 169.084 78.000 178.000 C 86.916 218.790 124.438 246.839 166.083 243.846 C 207.728 240.854 240.854 207.728 243.846 166.083 C 246.839 124.438 218.790 86.916 178.000 78.000 ZM 220.000 160.000 C 219.995 162.222 219.868 164.442 219.620 166.650 L 175.620 122.650 C 177.716 116.368 179.059 109.859 179.620 103.260 C 203.835 111.584 220.068 134.395 220.000 160.000 ZM 36.000 96.000 C 36.000 62.863 62.863 36.000 96.000 36.000 C 129.137 36.000 156.000 62.863 156.000 96.000 C 156.000 129.137 129.137 156.000 96.000 156.000 C 62.879 155.961 36.039 129.121 36.000 96.000 ZM 103.280 179.660 C 109.879 179.099 116.388 177.756 122.670 175.660 L 166.670 219.660 C 164.455 219.896 162.228 220.009 160.000 220.000 C 134.412 220.066 111.615 203.852 103.280 179.660 ZM 191.810 210.840 L 145.080 164.110 C 152.381 158.824 158.794 152.411 164.080 145.110 L 210.810 191.840 C 205.982 199.519 199.489 206.012 191.810 210.840 Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
