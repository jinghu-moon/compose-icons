package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseVerticalLine: ImageVector
    get() {
        if (_collapseVerticalLine != null) return _collapseVerticalLine!!
        _collapseVerticalLine = remixIcon(
            name = "CollapseVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13.5l4.95 4.95-1.414 1.414L13 17.328v5.672h-2v-5.672L8.466 19.861 7.052 18.447l4.947-4.947ZM11 1v5.671L8.464 4.135 7.05 5.55 12 10.5 16.95 5.55 15.535 4.136 13 6.672v-5.672h-2Z"),
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
        return _collapseVerticalLine!!
    }

private var _collapseVerticalLine: ImageVector? = null
