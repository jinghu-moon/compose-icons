package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TriangularFlagFill: ImageVector
    get() {
        if (_triangularFlagFill != null) return _triangularFlagFill!!
        _triangularFlagFill = remixIcon(
            name = "TriangularFlagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.661 2.181C5.015 1.613 4 2.072 4 2.932v19.068h2v-4h14.99c.922 0 1.353-1.142 .661-1.751L5.661 2.181Z"),
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
        return _triangularFlagFill!!
    }

private var _triangularFlagFill: ImageVector? = null
