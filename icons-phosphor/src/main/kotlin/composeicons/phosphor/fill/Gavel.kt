package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorFillIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.69 99.31C49.689 96.309 48.002 92.239 48.002 87.995c0-4.244 1.686-8.314 4.688-11.315l64-64c6.249-6.249 16.381-6.249 22.63 0 6.249 6.249 6.249 16.381 0 22.63L75.32 99.31c-3.001 3.001-7.071 4.688-11.315 4.688-4.244 0-8.314-1.686-11.315-4.688ZM243.32 116.68c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688l-64 64c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315h0c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l64-64c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM208.21 100.88 155.12 47.79c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L87.8 109.45c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83L103 130.34 28.69 204.69c-5.976 6.291-5.85 16.199 .286 22.334 6.136 6.136 16.043 6.262 22.334 .286L125.66 153l15.23 15.23c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l61.66-61.66c.76-.751 1.188-1.776 1.188-2.845 0-1.069-.428-2.094-1.188-2.845Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
