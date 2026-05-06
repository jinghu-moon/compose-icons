package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandDiagonalS2Fill: ImageVector
    get() {
        if (_expandDiagonalS2Fill != null) return _expandDiagonalS2Fill!!
        _expandDiagonalS2Fill = remixIcon(
            name = "ExpandDiagonalS2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5v7.5L8.043 9.457l6.5 6.5L11.5 19h7.5v-7.5l-3.043 3.043L9.457 8.043 12.5 5h-7.5Z"),
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
        return _expandDiagonalS2Fill!!
    }

private var _expandDiagonalS2Fill: ImageVector? = null
