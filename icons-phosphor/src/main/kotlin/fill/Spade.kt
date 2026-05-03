package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorFillIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 136.000 C 231.993 155.880 221.447 174.267 204.290 184.310 C 187.133 194.353 165.938 194.547 148.600 184.820 L 159.660 221.700 C 160.387 224.122 159.926 226.745 158.417 228.774 C 156.908 230.803 154.529 231.999 152.000 232.000 L 104.000 232.000 C 101.471 231.999 99.092 230.803 97.583 228.774 C 96.074 226.745 95.613 224.122 96.340 221.700 L 107.400 184.820 C 90.062 194.547 68.867 194.353 51.710 184.310 C 34.553 174.267 24.007 155.880 24.000 136.000 C 24.000 104.000 41.650 73.160 75.000 46.730 C 90.311 34.655 107.071 24.540 124.890 16.620 C 126.859 15.790 129.081 15.790 131.050 16.620 C 148.890 24.536 165.670 34.651 181.000 46.730 C 214.350 73.160 232.000 104.000 232.000 136.000 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
