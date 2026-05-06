package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArmchairLine: ImageVector
    get() {
        if (_armchairLine != null) return _armchairLine!!
        _armchairLine = remixIcon(
            name = "ArmchairLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3C5.791 3 4 4.791 4 7v2.126C2.275 9.57 1 11.136 1 13c0 1.482 .805 2.773 2 3.465v2.535 2h2v-1h14v1h2v-2-2.535c1.195-.691 2-1.983 2-3.465C23 11.136 21.725 9.57 20 9.126v-2.126C20 4.791 18.209 3 16 3h-8ZM18 9.126C16.275 9.57 15 11.136 15 13h-6C9 11.136 7.725 9.57 6 9.126v-2.126C6 5.895 6.895 5 8 5h8c1.105 0 2 .895 2 2v2.126ZM9 15h6v1h2v-3c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 .869-.555 1.611-1.333 1.887-.4 .141-.667 .519-.667 .943v2.171h-14v-2.171c0-.424-.267-.802-.667-.943C3.555 14.611 3 13.869 3 13c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3h2v-1Z"),
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
        return _armchairLine!!
    }

private var _armchairLine: ImageVector? = null
