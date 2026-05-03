package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorBoldIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 35.520 C 177.620 25.510 153.480 20.000 128.000 20.000 C 102.520 20.000 78.380 25.510 60.000 35.520 C 39.370 46.790 28.000 62.580 28.000 80.000 L 28.000 176.000 C 28.000 193.420 39.370 209.210 60.000 220.480 C 78.350 230.480 102.490 236.000 128.000 236.000 C 153.510 236.000 177.620 230.490 196.000 220.480 C 216.660 209.210 228.000 193.420 228.000 176.000 L 228.000 80.000 C 228.000 62.580 216.630 46.790 196.000 35.520 ZM 204.000 128.000 C 204.000 145.000 172.790 164.000 128.000 164.000 C 83.210 164.000 52.000 145.000 52.000 128.000 L 52.000 119.540 C 54.578 121.327 57.248 122.976 60.000 124.480 C 78.350 134.480 102.490 140.000 128.000 140.000 C 153.510 140.000 177.620 134.490 196.000 124.480 C 198.752 122.976 201.422 121.327 204.000 119.540 ZM 128.000 44.000 C 172.790 44.000 204.000 63.000 204.000 80.000 C 204.000 97.000 172.790 116.000 128.000 116.000 C 83.210 116.000 52.000 97.000 52.000 80.000 C 52.000 63.000 83.210 44.000 128.000 44.000 ZM 128.000 212.000 C 83.210 212.000 52.000 193.000 52.000 176.000 L 52.000 167.540 C 54.578 169.327 57.248 170.976 60.000 172.480 C 78.350 182.480 102.490 188.000 128.000 188.000 C 153.510 188.000 177.620 182.490 196.000 172.480 C 198.752 170.976 201.422 169.327 204.000 167.540 L 204.000 176.000 C 204.000 193.000 172.790 212.000 128.000 212.000 Z"),
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
