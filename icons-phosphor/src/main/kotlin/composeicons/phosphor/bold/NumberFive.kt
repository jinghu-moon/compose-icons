package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorBoldIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 160c-.001 23.661-13.906 45.112-35.506 54.771C122.895 224.43 97.636 220.494 80 204.72c-3.31-2.827-4.829-7.225-3.97-11.493 .859-4.267 3.962-7.735 8.108-9.061 4.146-1.326 8.685-.303 11.862 2.674 14.345 12.824 36.239 12.1 49.706-1.644 13.467-13.744 13.745-35.648 .632-49.729C133.225 121.385 111.357 120.105 96.69 132.56c-3.892 3.308-9.451 3.79-13.854 1.201-4.403-2.589-6.685-7.682-5.686-12.691L92.23 45.65C93.351 40.038 98.278 35.999 104 36h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-54.16l-8.36 41.79c17.92-4.47 36.9-.437 51.455 10.932C171.49 124.092 179.998 141.531 180 160Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
