package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorDuotoneIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 128c0 39.764-32.236 72-72 72C88.235 200 56 167.764 56 128 56 88.235 88.235 56 128 56c39.764 0 72 32.235 72 72Z"),
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
                pathData = parseSvgPathData("M214.86 180.12c-1.092 1.825-2.867 3.14-4.931 3.655-2.064 .514-4.248 .185-6.069-.915L136 142.13v73.87c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-73.87L52.12 182.86c-2.452 1.507-5.525 1.58-8.047 .191-2.521-1.388-4.102-4.024-4.14-6.902-.038-2.878 1.473-5.555 3.957-7.009L112.45 128 43.89 86.86C41.406 85.406 39.895 82.729 39.933 79.851c.038-2.878 1.619-5.514 4.14-6.902 2.521-1.388 5.594-1.315 8.047 .191L120 113.87v-73.87c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v73.87L203.88 73.14c2.452-1.507 5.525-1.58 8.047-.191 2.521 1.388 4.102 4.024 4.14 6.902 .038 2.878-1.473 5.555-3.957 7.009L143.55 128l68.56 41.14c1.822 1.091 3.135 2.861 3.651 4.92 .516 2.059 .192 4.239-.901 6.06Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
