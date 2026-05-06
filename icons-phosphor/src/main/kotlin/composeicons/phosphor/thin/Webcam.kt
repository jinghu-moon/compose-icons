package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorThinIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 104C164 84.118 147.882 68 128 68 108.118 68 92 84.118 92 104c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36ZM100 104c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM224 204h-92v-24.11c41.137-2.168 73.058-36.715 71.974-77.895C202.889 60.815 169.194 27.995 128 27.995c-41.194 0-74.889 32.819-75.974 73.999-1.084 41.18 30.836 75.727 71.974 77.895v24.11h-92c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM60 104C60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C90.461 171.961 60.039 141.539 60 104Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
