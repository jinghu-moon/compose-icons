package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorFillIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.32 96 96 235.31c-3.001 3.001-7.071 4.688-11.315 4.688-4.244 0-8.314-1.686-11.315-4.688L20.68 182.63c-3.001-3.001-4.688-7.071-4.688-11.315 0-4.244 1.686-8.314 4.688-11.315L49.85 130.83c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l34.83 34.83c1.572 1.571 3.727 2.418 5.949 2.336 2.221-.082 4.309-1.084 5.761-2.766 2.725-3.287 2.463-8.116-.6-11.09L66.82 119.51c-1.558-1.561-1.558-4.089 0-5.65l15-15c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l34.83 34.83c1.572 1.571 3.727 2.418 5.949 2.336 2.221-.082 4.309-1.084 5.761-2.766 2.725-3.287 2.463-8.116-.6-11.09L98.83 87.51c-1.558-1.561-1.558-4.089 0-5.65l15-15c1.561-1.558 4.089-1.558 5.65 0l34.83 34.83c1.573 1.575 3.73 2.423 5.954 2.341 2.224-.082 4.313-1.086 5.766-2.771 2.722-3.289 2.456-8.119-.61-11.09L130.83 55.51c-1.558-1.561-1.558-4.089 0-5.65L160 20.69c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l52.69 52.68c3.001 3.001 4.688 7.071 4.688 11.315 0 4.244-1.686 8.314-4.688 11.315Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
