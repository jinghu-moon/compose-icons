package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirebase: ImageVector
    get() {
        if (_brandFirebase != null) return _brandFirebase!!
        _brandFirebase = tablerOutlineIcon(
            name = "BrandFirebase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.530 17.050 L 10.680 5.330 L 10.660 5.330 C 11.040 4.590 11.940 4.310 12.670 4.700 C 12.930 4.840 13.150 5.060 13.290 5.320 L 14.350 7.330"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.470 6.450 C 16.050 5.860 17.000 5.860 17.580 6.440 C 17.800 6.660 17.940 6.940 17.990 7.250 L 19.490 16.360 C 19.590 16.980 19.290 17.600 18.730 17.900 L 12.660 20.800 C 12.200 21.050 11.650 21.060 11.200 20.800 L 5.180 17.880 C 4.630 17.570 4.330 16.960 4.430 16.340 L 6.390 4.300 C 6.510 3.480 7.280 2.920 8.090 3.050 C 8.550 3.120 8.960 3.410 9.180 3.820 L 10.420 5.580"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 4.570 17.180 L 15.500 6.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandFirebase!!
    }

private var _brandFirebase: ImageVector? = null
