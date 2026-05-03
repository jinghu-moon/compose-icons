package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorBoldIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 20.000 L 72.000 20.000 C 52.118 20.000 36.000 36.118 36.000 56.000 L 36.000 224.000 C 36.000 230.627 41.373 236.000 48.000 236.000 L 192.000 236.000 C 198.627 236.000 204.000 230.627 204.000 224.000 C 204.000 217.373 198.627 212.000 192.000 212.000 L 60.000 212.000 L 60.000 208.000 C 60.000 201.373 65.373 196.000 72.000 196.000 L 208.000 196.000 C 214.627 196.000 220.000 190.627 220.000 184.000 L 220.000 32.000 C 220.000 25.373 214.627 20.000 208.000 20.000 ZM 196.000 172.000 L 72.000 172.000 C 67.911 171.992 63.852 172.689 60.000 174.060 L 60.000 56.000 C 60.000 49.373 65.373 44.000 72.000 44.000 L 196.000 44.000 Z"),
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
