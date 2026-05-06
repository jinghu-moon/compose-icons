package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HexagonLine: ImageVector
    get() {
        if (_hexagonLine != null) return _hexagonLine!!
        _hexagonLine = remixIcon(
            name = "HexagonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.5 2.5 23 12l-5.5 9.5h-11L1 12 6.5 2.5h11ZM16.347 4.5h-8.694L3.311 12l4.342 7.5h8.694L20.689 12 16.347 4.5Z"),
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
        return _hexagonLine!!
    }

private var _hexagonLine: ImageVector? = null
