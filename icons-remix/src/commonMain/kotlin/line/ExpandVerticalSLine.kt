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
                pathData = parseSvgPathData("M 16.949 7.449 L 12.000 2.500 L 7.052 7.447 L 8.466 8.861 L 11.000 6.328 L 11.000 17.670 L 8.464 15.135 L 7.050 16.550 L 12.000 21.500 L 16.950 16.550 L 15.535 15.136 L 13.000 17.672 L 13.000 6.328 L 15.535 8.863 L 16.949 7.449 Z"),
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
