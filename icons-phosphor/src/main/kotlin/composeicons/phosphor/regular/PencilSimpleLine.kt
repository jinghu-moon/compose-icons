package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorRegularIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.32 73.37 182.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L36.69 152c-3.014 2.99-4.704 7.064-4.69 11.31v44.69c0 8.837 7.163 16 16 16h168c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-100.68L227.32 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM92.69 208h-44.69v-44.69l88-88L180.69 120ZM192 108.69 147.32 64l24-24L216 84.69Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
