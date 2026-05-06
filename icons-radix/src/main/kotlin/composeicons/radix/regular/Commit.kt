package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Commit: ImageVector
    get() {
        if (_commit != null) return _commit!!
        _commit = radixIcon(
            name = "Commit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.676 4.105c1.628 .083 2.954 1.311 3.188 2.896h3.637l.101 .01c.228 .047 .399 .249 .399 .49-0 .241-.172 .444-.399 .49l-.101 .01h-3.637c-.242 1.64-1.656 2.899-3.363 2.899l-.175-.005C5.697 10.812 4.371 9.584 4.138 8h-3.638C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h3.638C4.379 5.36 5.792 4.1 7.5 4.1l.176 .005ZM7.5 5.05C6.147 5.05 5.051 6.147 5.051 7.5c0 1.353 1.096 2.45 2.449 2.45C8.853 9.949 9.95 8.852 9.95 7.5 9.95 6.147 8.853 5.051 7.5 5.05Z"),
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
        return _commit!!
    }

private var _commit: ImageVector? = null
