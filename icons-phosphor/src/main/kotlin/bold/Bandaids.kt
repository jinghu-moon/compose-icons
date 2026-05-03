package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorBoldIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.230 128.000 L 215.110 103.110 C 226.470 92.046 230.997 75.724 226.960 60.389 C 222.923 45.054 210.946 33.077 195.611 29.040 C 180.276 25.003 163.954 29.530 152.890 40.890 L 128.000 65.770 L 103.110 40.890 C 92.046 29.530 75.724 25.003 60.389 29.040 C 45.054 33.077 33.077 45.054 29.040 60.389 C 25.003 75.724 29.530 92.046 40.890 103.110 L 65.770 128.000 L 40.890 152.890 C 29.530 163.954 25.003 180.276 29.040 195.611 C 33.077 210.946 45.054 222.923 60.389 226.960 C 75.724 230.997 92.046 226.470 103.110 215.110 L 128.000 190.230 L 152.890 215.110 C 163.954 226.470 180.276 230.997 195.611 226.960 C 210.946 222.923 222.923 210.946 226.960 195.611 C 230.997 180.276 226.470 163.954 215.110 152.890 ZM 169.860 57.860 L 169.860 57.860 C 174.881 52.661 182.318 50.576 189.310 52.406 C 196.303 54.236 201.764 59.697 203.594 66.690 C 205.424 73.682 203.339 81.119 198.140 86.140 L 173.250 111.000 L 145.000 82.750 ZM 156.280 128.000 L 128.000 156.280 L 99.720 128.000 L 128.000 99.720 ZM 57.860 86.140 C 52.661 81.119 50.576 73.682 52.406 66.690 C 54.236 59.697 59.697 54.236 66.690 52.406 C 73.682 50.576 81.119 52.661 86.140 57.860 L 111.000 82.750 L 82.750 111.000 ZM 86.140 198.140 C 81.119 203.339 73.682 205.424 66.690 203.594 C 59.697 201.764 54.236 196.303 52.406 189.310 C 50.576 182.318 52.661 174.881 57.860 169.860 L 82.750 145.000 L 111.000 173.250 ZM 198.140 198.140 C 190.330 205.948 177.670 205.948 169.860 198.140 L 145.000 173.250 L 173.250 145.000 L 198.140 169.890 C 205.948 177.700 205.948 190.360 198.140 198.170 Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
