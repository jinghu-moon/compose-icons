package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorDuotoneIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 32.000 L 208.000 192.000 L 72.000 192.000 C 58.745 192.000 48.000 202.745 48.000 216.000 L 48.000 56.000 C 48.000 42.745 58.745 32.000 72.000 32.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 24.000 L 72.000 24.000 C 54.327 24.000 40.000 38.327 40.000 56.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 L 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 C 200.000 219.582 196.418 216.000 192.000 216.000 L 56.000 216.000 C 56.000 207.163 63.163 200.000 72.000 200.000 L 208.000 200.000 C 212.418 200.000 216.000 196.418 216.000 192.000 L 216.000 32.000 C 216.000 27.582 212.418 24.000 208.000 24.000 ZM 200.000 184.000 L 72.000 184.000 C 66.381 183.992 60.861 185.472 56.000 188.290 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 L 200.000 40.000 Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
