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
                pathData = parseSvgPathData("M6 2h12v2h-12v-2ZM16.95 9.45 12 4.5 7.053 9.447l1.414 1.414L11 8.328v7.342L8.465 13.136 7.051 14.55 12 19.5l4.95-4.95L15.535 13.136 13 15.672v-7.343l2.535 2.536L16.95 9.45ZM18 20v2h-12v-2h12Z"),
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
