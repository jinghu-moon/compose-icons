package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorFillIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 253.660 101.660 L 217.660 137.660 C 216.159 139.162 214.123 140.006 212.000 140.006 C 209.877 140.006 207.841 139.162 206.340 137.660 L 170.340 101.660 L 170.000 101.280 L 169.660 101.660 L 135.310 136.000 L 169.660 170.340 C 171.162 171.841 172.006 173.877 172.006 176.000 C 172.006 178.123 171.162 180.159 169.660 181.660 L 133.660 217.660 C 132.159 219.162 130.123 220.006 128.000 220.006 C 125.877 220.006 123.841 219.162 122.340 217.660 L 86.340 181.660 C 84.838 180.159 83.994 178.123 83.994 176.000 C 83.994 173.877 84.838 171.841 86.340 170.340 L 120.690 136.000 L 86.340 101.660 L 86.000 101.280 L 85.660 101.660 L 49.660 137.660 C 48.159 139.162 46.123 140.006 44.000 140.006 C 41.877 140.006 39.841 139.162 38.340 137.660 L 2.340 101.660 C 0.838 100.159 -0.006 98.123 -0.006 96.000 C -0.006 93.877 0.838 91.841 2.340 90.340 L 38.340 54.340 C 39.841 52.838 41.877 51.994 44.000 51.994 C 46.123 51.994 48.159 52.838 49.660 54.340 L 85.660 90.340 L 86.000 90.720 L 86.340 90.340 L 122.340 54.340 C 123.841 52.838 125.877 51.994 128.000 51.994 C 130.123 51.994 132.159 52.838 133.660 54.340 L 169.660 90.340 L 170.000 90.720 L 170.340 90.340 L 206.340 54.340 C 207.841 52.838 209.877 51.994 212.000 51.994 C 214.123 51.994 216.159 52.838 217.660 54.340 L 253.660 90.340 C 255.162 91.841 256.006 93.877 256.006 96.000 C 256.006 98.123 255.162 100.159 253.660 101.660 Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
