package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorLightIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 75.290 26.000 34.000 49.720 34.000 80.000 L 34.000 176.000 C 34.000 206.280 75.290 230.000 128.000 230.000 C 180.710 230.000 222.000 206.280 222.000 176.000 L 222.000 80.000 C 222.000 49.720 180.710 26.000 128.000 26.000 ZM 128.000 38.000 C 172.450 38.000 210.000 57.230 210.000 80.000 C 210.000 102.770 172.450 122.000 128.000 122.000 C 83.550 122.000 46.000 102.770 46.000 80.000 C 46.000 57.230 83.550 38.000 128.000 38.000 ZM 210.000 176.000 C 210.000 198.770 172.450 218.000 128.000 218.000 C 83.550 218.000 46.000 198.770 46.000 176.000 L 46.000 154.790 C 62.000 171.160 92.370 182.000 128.000 182.000 C 163.630 182.000 194.000 171.160 210.000 154.790 ZM 210.000 128.000 C 210.000 150.770 172.450 170.000 128.000 170.000 C 83.550 170.000 46.000 150.770 46.000 128.000 L 46.000 106.790 C 62.000 123.160 92.370 134.000 128.000 134.000 C 163.630 134.000 194.000 123.160 210.000 106.790 Z"),
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
