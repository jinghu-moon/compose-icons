package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorDuotoneIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 209.940 113.940 L 113.940 209.940 C 95.152 228.425 64.973 228.302 46.335 209.665 C 27.698 191.027 27.575 160.848 46.060 142.060 L 142.060 46.060 C 160.848 27.575 191.027 27.698 209.665 46.335 C 228.302 64.973 228.425 95.152 209.940 113.940 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 232.000 80.000 C 232.038 94.860 226.133 109.118 215.600 119.600 L 185.530 149.660 C 182.404 152.783 177.338 152.781 174.215 149.655 C 171.092 146.529 171.094 141.463 174.220 138.340 L 204.290 108.280 C 214.583 98.213 218.672 83.392 214.996 69.471 C 211.320 55.551 200.447 44.680 186.527 41.007 C 172.606 37.334 157.785 41.425 147.720 51.720 L 117.660 81.770 C 114.534 84.896 109.466 84.896 106.340 81.770 C 103.214 78.644 103.214 73.576 106.340 70.450 L 136.400 40.400 C 152.416 24.382 176.504 19.590 197.431 28.259 C 218.358 36.927 232.002 57.349 232.000 80.000 ZM 138.340 174.220 L 108.280 204.280 C 98.213 214.573 83.392 218.662 69.471 214.986 C 55.551 211.310 44.680 200.437 41.007 186.517 C 37.334 172.596 41.425 157.775 51.720 147.710 L 81.770 117.660 C 84.896 114.534 84.896 109.466 81.770 106.340 C 78.644 103.214 73.576 103.214 70.450 106.340 L 40.400 136.400 C 18.530 158.270 18.530 193.730 40.400 215.600 C 62.270 237.470 97.730 237.470 119.600 215.600 L 149.660 185.530 C 152.783 182.404 152.781 177.338 149.655 174.215 C 146.529 171.092 141.463 171.094 138.340 174.220 Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
