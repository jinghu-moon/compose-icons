package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Shape2Line: ImageVector
    get() {
        if (_shape2Line != null) return _shape2Line!!
        _shape2Line = remixIcon(
            name = "Shape2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 16h2v6h-6v-2h-8v2h-6v-6h2v-8h-2v-6h6v2h8v-2h6v6h-2v8ZM18 16v-8h-2v-2h-8v2h-2v8h2v2h8v-2h2ZM4 4v2h2v-2h-2ZM4 18v2h2v-2h-2ZM18 4v2h2v-2h-2ZM18 18v2h2v-2h-2Z"),
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
        return _shape2Line!!
    }

private var _shape2Line: ImageVector? = null
