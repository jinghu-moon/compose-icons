package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorBoldIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.15 78.54 193.46 25.85c-7.81-7.808-20.47-7.808-28.28 0L57.86 133.17c-7.808 7.81-7.808 20.47 0 28.28l17.86 17.86L31.52 223.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L92.72 196.3l17.86 17.86c7.81 7.808 20.47 7.808 28.28 0L246.15 106.82c7.808-7.81 7.808-20.47 0-28.28ZM124.69 194.34l-15-15 26.83-26.83c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L92.69 162.34l-15-15L109 116h47v47ZM180 139v-35c0-6.627-5.373-12-12-12h-35L179.34 45.66l47 47ZM60 92C77.673 92 92 77.673 92 60 92 42.327 77.673 28 60 28 42.327 28 28 42.327 28 60c0 17.673 14.327 32 32 32ZM60 52c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
