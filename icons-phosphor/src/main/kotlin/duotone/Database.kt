package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorDuotoneIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 80.000 C 216.000 106.510 176.600 128.000 128.000 128.000 C 79.400 128.000 40.000 106.510 40.000 80.000 C 40.000 53.490 79.400 32.000 128.000 32.000 C 176.600 32.000 216.000 53.490 216.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 74.170 24.000 32.000 48.600 32.000 80.000 L 32.000 176.000 C 32.000 207.400 74.170 232.000 128.000 232.000 C 181.830 232.000 224.000 207.400 224.000 176.000 L 224.000 80.000 C 224.000 48.600 181.830 24.000 128.000 24.000 ZM 208.000 128.000 C 208.000 137.620 200.120 147.430 186.390 154.920 C 170.930 163.350 150.190 168.000 128.000 168.000 C 105.810 168.000 85.070 163.350 69.610 154.920 C 55.880 147.430 48.000 137.620 48.000 128.000 L 48.000 111.360 C 65.060 126.360 94.230 136.000 128.000 136.000 C 161.770 136.000 190.940 126.320 208.000 111.360 ZM 69.610 53.080 C 85.070 44.650 105.810 40.000 128.000 40.000 C 150.190 40.000 170.930 44.650 186.390 53.080 C 200.120 60.570 208.000 70.380 208.000 80.000 C 208.000 89.620 200.120 99.430 186.390 106.920 C 170.930 115.350 150.190 120.000 128.000 120.000 C 105.810 120.000 85.070 115.350 69.610 106.920 C 55.880 99.430 48.000 89.620 48.000 80.000 C 48.000 70.380 55.880 60.570 69.610 53.080 ZM 186.390 202.920 C 170.930 211.350 150.190 216.000 128.000 216.000 C 105.810 216.000 85.070 211.350 69.610 202.920 C 55.880 195.430 48.000 185.620 48.000 176.000 L 48.000 159.360 C 65.060 174.360 94.230 184.000 128.000 184.000 C 161.770 184.000 190.940 174.320 208.000 159.360 L 208.000 176.000 C 208.000 185.620 200.120 195.430 186.390 202.920 Z"),
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
        return _database!!
    }

private var _database: ImageVector? = null
