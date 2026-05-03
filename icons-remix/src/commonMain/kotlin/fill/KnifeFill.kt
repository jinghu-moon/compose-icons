package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KnifeFill: ImageVector
    get() {
        if (_knifeFill != null) return _knifeFill!!
        _knifeFill = remixIcon(
            name = "KnifeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.374 19.439 C 22.960 20.025 22.960 20.975 22.374 21.561 C 21.789 22.146 20.839 22.146 20.253 21.561 L 15.657 16.965 L 12.121 20.500 L 4.343 12.722 C 1.278 9.657 1.220 4.723 4.170 1.587 L 4.343 1.408 L 22.374 19.439 Z"),
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
        return _knifeFill!!
    }

private var _knifeFill: ImageVector? = null
