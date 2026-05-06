package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorDuotoneIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 80h-96L88 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 72c-4.418 0-8 3.582-8 8v88c0 26.51-21.49 48-48 48C117.49 216 96 194.51 96 168v-80h40c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722l-48-48C92.159 24.838 90.123 23.994 88 23.994c-2.123 0-4.159 .844-5.66 2.346L34.34 74.34c-2.291 2.288-2.976 5.731-1.737 8.722C33.842 86.053 36.762 88.003 40 88h40v80c0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64v-88c0-4.418-3.582-8-8-8ZM88 43.31 116.69 72h-57.38Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
