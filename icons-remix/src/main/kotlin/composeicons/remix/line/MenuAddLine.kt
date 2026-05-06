package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuAddLine: ImageVector
    get() {
        if (_menuAddLine != null) return _menuAddLine!!
        _menuAddLine = remixIcon(
            name = "MenuAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 15l-.001 3h3.001v2h-3.001L18 23h-2l-.001-3h-2.999v-2h2.999L16 15h2ZM11 18v2h-8v-2h8ZM21 11v2h-18v-2h18ZM21 4v2h-18v-2h18Z"),
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
        return _menuAddLine!!
    }

private var _menuAddLine: ImageVector? = null
