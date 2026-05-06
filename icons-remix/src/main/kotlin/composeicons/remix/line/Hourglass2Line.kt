package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Hourglass2Line: ImageVector
    get() {
        if (_hourglass2Line != null) return _hourglass2Line!!
        _hourglass2Line = remixIcon(
            name = "Hourglass2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h16v4.46L13.537 12 20 17.54v4.46h-16v-4.46L10.463 12 4 6.46v-4.46ZM12 10.683 18 5.54v-1.54h-12v1.54l6 5.143ZM12 13.317 6 18.46v1.54h12v-1.54L12 13.317Z"),
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
        return _hourglass2Line!!
    }

private var _hourglass2Line: ImageVector? = null
