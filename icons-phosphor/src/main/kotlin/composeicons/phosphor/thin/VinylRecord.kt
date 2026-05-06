package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorThinIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM128 68C94.879 68.039 68.039 94.879 68 128c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C60.039 90.461 90.461 60.039 128 60c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM196 128c-.039 37.539-30.461 67.961-68 68-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 33.121-.039 59.961-26.879 60-60 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM156 128c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM108 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
