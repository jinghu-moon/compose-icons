package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareCircleLine: ImageVector
    get() {
        if (_shareCircleLine != null) return _shareCircleLine!!
        _shareCircleLine = remixIcon(
            name = "ShareCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.049v2.013C7.054 4.554 4 7.92 4 12c0 4.418 3.582 8 8 8 4.08 0 7.446-3.054 7.938-7h2.012c-.502 5.053-4.765 9-9.951 9C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049ZM20 5.414l-8 8L10.586 12l8-8h-4.586v-2h8v8h-2v-4.586Z"),
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
        return _shareCircleLine!!
    }

private var _shareCircleLine: ImageVector? = null
