package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StickyNoteFill: ImageVector
    get() {
        if (_stickyNoteFill != null) return _stickyNoteFill!!
        _stickyNoteFill = remixIcon(
            name = "StickyNoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 14.000 L 14.883 14.007 C 14.424 14.060 14.060 14.424 14.007 14.883 L 14.000 15.000 L 14.000 21.000 L 3.998 21.000 C 3.447 21.000 3.000 20.555 3.000 20.007 L 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.447 21.000 3.999 L 21.000 14.000 L 15.000 14.000 ZM 21.000 16.000 L 16.000 20.997 L 16.000 16.000 L 21.000 16.000 Z"),
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
        return _stickyNoteFill!!
    }

private var _stickyNoteFill: ImageVector? = null
