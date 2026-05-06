package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandVerticalLine: ImageVector
    get() {
        if (_expandVerticalLine != null) return _expandVerticalLine!!
        _expandVerticalLine = remixIcon(
            name = "ExpandVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .5l4.95 4.95L15.535 6.863 13 4.328v5.672h-2v-5.672L8.466 6.861 7.052 5.447 12 .5ZM11 14v5.671L8.464 17.135 7.05 18.55 12 23.5l4.95-4.95L15.535 17.136l-2.536 2.536v-5.672h-2Z"),
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
        return _expandVerticalLine!!
    }

private var _expandVerticalLine: ImageVector? = null
