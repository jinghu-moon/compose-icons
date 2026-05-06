package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorFillIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v104c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.268-.367-7.528-3.967-7.47-8.25v-103.75c.005-2.221-.913-4.343-2.534-5.861C203.844 40.622 201.665 39.847 199.45 40c-4.267 .387-7.515 3.996-7.45 8.28v131.72c0 2.209-1.791 4-4 4h-136c-2.209 0-4-1.791-4-4v-132C48 34.745 58.745 24 72 24h128c13.255 0 24 10.745 24 24ZM188 200h-136c-2.209 0-4 1.791-4 4v12c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-12c0-2.209-1.791-4-4-4Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
