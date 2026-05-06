package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorThinIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 127C232.41 85.799 205.699 50.228 167.133 35.291 128.568 20.355 84.864 28.655 54.46 56.69 34.545 74.963 22.242 100.065 20 127c-.28 3.352 .859 6.668 3.141 9.139 2.282 2.472 5.496 3.872 8.859 3.861h92v60c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-60h92c3.364 .012 6.578-1.389 8.859-3.861 2.282-2.472 3.421-5.787 3.141-9.139ZM227 130.74c-.769 .841-1.86 1.314-3 1.3h-192c-1.13 .005-2.21-.468-2.972-1.303-.762-.835-1.136-1.952-1.028-3.077C31.373 89.536 56.122 56.643 91.819 42.84c35.697-13.803 76.137-6.117 104.281 19.82 18.409 16.897 29.79 40.1 31.88 65 .091 1.116-.29 2.218-1.05 3.04Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
