package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyPoundCircleLine: ImageVector
    get() {
        if (_moneyPoundCircleLine != null) return _moneyPoundCircleLine!!
        _moneyPoundCircleLine = remixIcon(
            name = "MoneyPoundCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.005 20.003c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM9.005 13.003h-1v-2h1v-1c0-1.933 1.567-3.5 3.5-3.5 1.469 0 2.727 .905 3.246 2.188l-1.987 .497c-.267-.412-.731-.685-1.259-.685-.828 0-1.5 .672-1.5 1.5v1h3v2h-3v2h5v2h-8v-2h1v-2Z"),
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
        return _moneyPoundCircleLine!!
    }

private var _moneyPoundCircleLine: ImageVector? = null
