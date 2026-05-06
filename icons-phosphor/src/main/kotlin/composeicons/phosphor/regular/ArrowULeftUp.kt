package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorRegularIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 80v88c0 35.346-28.654 64-64 64C108.654 232 80 203.346 80 168v-116.69L45.66 85.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L82.34 26.34C83.841 24.838 85.877 23.994 88 23.994c2.123 0 4.159 .844 5.66 2.346l48 48c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L96 51.31v116.69c0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48v-88c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
