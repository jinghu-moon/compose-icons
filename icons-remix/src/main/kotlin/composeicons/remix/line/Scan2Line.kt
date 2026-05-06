package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scan2Line: ImageVector
    get() {
        if (_scan2Line != null) return _scan2Line!!
        _scan2Line = remixIcon(
            name = "Scan2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.671 4.257 13.414 12 12 13.414 8.554 9.968C8.202 10.564 8 11.258 8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.875 14.343 8.137 12.25 8.008L10.446 6.203C10.942 6.071 11.462 6 12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12 6 10.704 6.411 9.504 7.109 8.523L5.68 7.094C4.627 8.449 4 10.151 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 10.892 4 9.836 4.225 8.876 4.633L7.374 3.132C8.758 2.409 10.331 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 8.878 3.43 6.091 5.671 4.257Z"),
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
        return _scan2Line!!
    }

private var _scan2Line: ImageVector? = null
