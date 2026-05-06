package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseHorizontalLine: ImageVector
    get() {
        if (_collapseHorizontalLine != null) return _collapseHorizontalLine!!
        _collapseHorizontalLine = remixIcon(
            name = "CollapseHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 12 18.45 7.05l1.414 1.414L17.328 11h5.672v2h-5.672l2.533 2.533-1.414 1.414L13.5 12ZM1 13h5.671L4.136 15.535l1.414 1.414 4.95-4.95L5.55 7.05 4.136 8.464 6.672 11h-5.672v2Z"),
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
        return _collapseHorizontalLine!!
    }

private var _collapseHorizontalLine: ImageVector? = null
