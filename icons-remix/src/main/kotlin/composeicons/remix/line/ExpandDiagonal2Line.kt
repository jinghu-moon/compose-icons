package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonal2Line: ImageVector
    get() {
        if (_expandDiagonal2Line != null) return _expandDiagonal2Line!!
        _expandDiagonal2Line = remixIcon(
            name = "ExpandDiagonal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.414 5h3.586v-2h-7v7h2v-3.586l4.293 4.293L10.707 9.293 6.414 5ZM21 14h-2v3.586L14.707 13.293l-1.414 1.414L17.586 19h-3.586v2h7v-7Z"),
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
        return _expandDiagonal2Line!!
    }

private var _expandDiagonal2Line: ImageVector? = null
