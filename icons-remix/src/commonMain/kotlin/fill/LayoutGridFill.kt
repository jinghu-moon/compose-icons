package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutGridFill: ImageVector
    get() {
        if (_layoutGridFill != null) return _layoutGridFill!!
        _layoutGridFill = remixIcon(
            name = "LayoutGridFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.999 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 13.000 21.000 L 13.000 12.999 L 22.000 12.999 ZM 11.000 12.999 L 11.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 12.999 L 11.000 12.999 ZM 11.000 3.000 L 11.000 10.999 L 2.000 10.999 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 11.000 3.000 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 10.999 L 13.000 10.999 L 13.000 3.000 L 21.000 3.000 Z"),
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
        return _layoutGridFill!!
    }

private var _layoutGridFill: ImageVector? = null
