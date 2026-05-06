package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseDiagonalLine: ImageVector
    get() {
        if (_collapseDiagonalLine != null) return _collapseDiagonalLine!!
        _collapseDiagonalLine = remixIcon(
            name = "CollapseDiagonalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4h-2v7h7v-2h-3.586L20.707 4.707 19.293 3.293 15 7.586v-3.586ZM4 15h3.586L3.293 19.293l1.414 1.414L9 16.414v3.586h2v-7h-7v2Z"),
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
        return _collapseDiagonalLine!!
    }

private var _collapseDiagonalLine: ImageVector? = null
