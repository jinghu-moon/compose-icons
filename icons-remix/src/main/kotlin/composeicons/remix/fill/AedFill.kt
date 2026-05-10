package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AedFill: ImageVector
    get() {
        if (_aedFill != null) return _aedFill!!
        _aedFill = remixIcon(
            name = "AedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 3C4.343 3 3 4.343 3 6v12c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-12C21 4.343 19.657 3 18 3h-12ZM16 11l-5 7v-5h-3L13 6v5h3Z"),
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
        return _aedFill!!
    }

private var _aedFill: ImageVector? = null
