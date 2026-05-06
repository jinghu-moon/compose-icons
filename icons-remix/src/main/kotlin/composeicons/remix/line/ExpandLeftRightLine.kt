package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandLeftRightLine: ImageVector
    get() {
        if (_expandLeftRightLine != null) return _expandLeftRightLine!!
        _expandLeftRightLine = remixIcon(
            name = "ExpandLeftRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.043 5.793 2.836 12l6.207 6.207 1.414-1.414L5.664 12 10.457 7.207 9.043 5.793ZM14.957 18.207l6.207-6.207L14.957 5.793 13.543 7.207l4.793 4.793-4.793 4.793 1.414 1.414Z"),
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
        return _expandLeftRightLine!!
    }

private var _expandLeftRightLine: ImageVector? = null
