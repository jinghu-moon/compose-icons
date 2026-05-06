package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseDiagonal2Line: ImageVector
    get() {
        if (_collapseDiagonal2Line != null) return _collapseDiagonal2Line!!
        _collapseDiagonal2Line = remixIcon(
            name = "CollapseDiagonal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4h2v7h-7v-2h3.586L3.293 4.707 4.707 3.293 9 7.586v-3.586ZM20 15h-3.586l4.293 4.293-1.414 1.414L15 16.414v3.586h-2v-7h7v2Z"),
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
        return _collapseDiagonal2Line!!
    }

private var _collapseDiagonal2Line: ImageVector? = null
