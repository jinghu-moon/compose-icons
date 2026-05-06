package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorBoldIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.62 61.05c-13.76-21.62-34-33-58.62-33-24.62 0-44.86 11.38-58.62 33C58.17 78.66 52 102.44 52 128c0 25.56 6.17 49.33 17.38 66.94C83.14 216.57 103.41 228 128 228c24.59 0 44.86-11.43 58.62-33.06C197.83 177.33 204 153.56 204 128c0-25.56-6.17-49.34-17.38-66.95ZM166.37 182.05C157.11 196.62 144.2 204 128 204c-16.2 0-29.11-7.38-38.37-21.94C80.84 168.25 76 149.05 76 128 76 106.95 80.84 87.75 89.63 73.94 98.89 59.38 111.8 52 128 52c16.2 0 29.11 7.38 38.37 21.94C175.16 87.75 180 107 180 128c0 21-4.84 40.25-13.63 54.06Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
