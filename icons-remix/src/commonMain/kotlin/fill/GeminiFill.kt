package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GeminiFill: ImageVector
    get() {
        if (_geminiFill != null) return _geminiFill!!
        _geminiFill = remixIcon(
            name = "GeminiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 12.024 C 17.562 12.412 12.411 17.563 12.023 24.000 L 11.976 24.000 C 11.588 17.563 6.437 12.412 0.000 12.024 L 0.000 11.976 C 6.437 11.588 11.588 6.437 11.976 0.000 L 12.023 0.000 C 12.411 6.437 17.562 11.588 24.000 11.976 L 24.000 12.024 Z"),
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
        return _geminiFill!!
    }

private var _geminiFill: ImageVector? = null
