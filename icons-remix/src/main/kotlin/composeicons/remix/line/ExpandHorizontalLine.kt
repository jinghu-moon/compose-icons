package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandHorizontalLine: ImageVector
    get() {
        if (_expandHorizontalLine != null) return _expandHorizontalLine!!
        _expandHorizontalLine = remixIcon(
            name = "ExpandHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M.5 12 5.45 7.05 6.864 8.465 4.328 11h5.672v2h-5.672l2.533 2.533L5.447 16.947 .5 12ZM14 13h5.671l-2.535 2.535 1.414 1.414 4.95-4.95L18.55 7.05 17.136 8.464 19.672 11h-5.672v2Z"),
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
        return _expandHorizontalLine!!
    }

private var _expandHorizontalLine: ImageVector? = null
