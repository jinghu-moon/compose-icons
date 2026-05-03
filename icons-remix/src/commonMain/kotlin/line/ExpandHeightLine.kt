package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandHeightLine: ImageVector
    get() {
        if (_expandHeightLine != null) return _expandHeightLine!!
        _expandHeightLine = remixIcon(
            name = "ExpandHeightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 2.000 L 18.000 2.000 L 18.000 4.000 L 6.000 4.000 L 6.000 2.000 ZM 16.950 9.450 L 12.000 4.500 L 7.053 9.447 L 8.467 10.861 L 11.000 8.328 L 11.000 15.671 L 8.465 13.136 L 7.051 14.550 L 12.000 19.500 L 16.950 14.550 L 15.535 13.136 L 13.000 15.672 L 13.000 8.328 L 15.535 10.864 L 16.950 9.450 ZM 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 18.000 20.000 Z"),
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
        return _expandHeightLine!!
    }

private var _expandHeightLine: ImageVector? = null
