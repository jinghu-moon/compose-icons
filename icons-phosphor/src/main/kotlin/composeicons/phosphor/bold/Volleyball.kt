package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorBoldIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM96.83 50c5.768-2.329 11.779-4.006 17.92-5 27.199 13.517 44.983 40.665 46.51 71h-26.33ZM134.93 140h76.2c-.887 6.156-2.46 12.194-4.69 18-25.294 16.761-57.657 18.592-84.68 4.79ZM211.13 116h-25.84C184.613 98.504 179.669 81.439 170.89 66.29 167.591 60.575 163.779 55.173 159.5 50.15c27.67 11.241 47.315 36.297 51.63 65.85ZM76.07 62.05 89 84.39C74.188 93.723 61.881 106.535 53.15 121.71c-3.301 5.736-6.073 11.761-8.28 18C40.642 110.107 52.537 80.499 76.07 62.05ZM62.79 180.87C60.932 150.598 75.537 121.676 101 105.2L114.14 128 76.07 194c-4.897-3.874-9.351-8.277-13.28-13.13ZM96.79 205.98l12.92-22.37c15.502 8.17 32.767 12.424 50.29 12.39 6.57-.002 13.127-.597 19.59-1.78C156.078 212.624 124.544 217.112 96.83 206Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
