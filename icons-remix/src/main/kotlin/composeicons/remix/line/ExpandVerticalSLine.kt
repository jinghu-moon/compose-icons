package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandVerticalSLine: ImageVector
    get() {
        if (_expandVerticalSLine != null) return _expandVerticalSLine!!
        _expandVerticalSLine = remixIcon(
            name = "ExpandVerticalSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.949 7.449 12 2.5 7.052 7.447 8.466 8.861 11 6.328v11.342L8.464 15.135 7.05 16.55 12 21.5l4.95-4.95L15.535 15.136l-2.536 2.536v-11.344l2.535 2.536L16.949 7.449Z"),
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
        return _expandVerticalSLine!!
    }

private var _expandVerticalSLine: ImageVector? = null
