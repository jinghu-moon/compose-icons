package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandHorizontalSLine: ImageVector
    get() {
        if (_expandHorizontalSLine != null) return _expandHorizontalSLine!!
        _expandHorizontalSLine = remixIcon(
            name = "ExpandHorizontalSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.45 7.05 2.5 12l4.947 4.947L8.861 15.533 6.328 13h11.342l-2.535 2.535 1.414 1.414 4.95-4.95L16.55 7.05 15.136 8.464 17.672 11h-11.344L8.864 8.465 7.45 7.05Z"),
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
        return _expandHorizontalSLine!!
    }

private var _expandHorizontalSLine: ImageVector? = null
