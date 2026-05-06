package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonalLine: ImageVector
    get() {
        if (_expandDiagonalLine != null) return _expandDiagonalLine!!
        _expandDiagonalLine = remixIcon(
            name = "ExpandDiagonalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.586 5h-3.586v-2h7v7h-2v-3.586l-4.293 4.293L13.293 9.293 17.586 5ZM3 14h2v3.586L9.293 13.293l1.414 1.414L6.414 19h3.586v2h-7v-7Z"),
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
        return _expandDiagonalLine!!
    }

private var _expandDiagonalLine: ImageVector? = null
