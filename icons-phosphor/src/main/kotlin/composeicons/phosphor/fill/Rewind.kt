package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorFillIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 71.84v112.32c-.03 5.798-3.21 11.122-8.302 13.896-5.092 2.775-11.289 2.561-16.178-.556L128 146.86v37.3c-.03 5.798-3.21 11.122-8.302 13.896-5.092 2.775-11.289 2.561-16.178-.556L15.33 141.34C10.763 138.442 7.997 133.409 7.997 128c0-5.409 2.767-10.442 7.333-13.34L103.52 58.5c4.888-3.125 11.089-3.342 16.183-.566 5.094 2.776 8.273 8.105 8.297 13.906v37.3L207.52 58.5c4.888-3.125 11.089-3.342 16.183-.566 5.094 2.776 8.273 8.105 8.297 13.906Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
