package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TriangularFlagLine: ImageVector
    get() {
        if (_triangularFlagLine != null) return _triangularFlagLine!!
        _triangularFlagLine = remixIcon(
            name = "TriangularFlagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 5.144v10.856h12.339L6 5.144ZM4 2.932C4 2.072 5.015 1.613 5.661 2.181L21.65 16.249c.692 .609 .261 1.751-.661 1.751h-14.99v4h-2v-19.068Z"),
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
        return _triangularFlagLine!!
    }

private var _triangularFlagLine: ImageVector? = null
