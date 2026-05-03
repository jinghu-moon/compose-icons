package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandUpDownLine: ImageVector
    get() {
        if (_expandUpDownLine != null) return _expandUpDownLine!!
        _expandUpDownLine = remixIcon(
            name = "ExpandUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.207 9.043 L 12.000 2.836 L 5.793 9.043 L 7.207 10.457 L 12.000 5.664 L 16.793 10.457 L 18.207 9.043 ZM 5.793 14.957 L 12.000 21.164 L 18.207 14.957 L 16.793 13.543 L 12.000 18.336 L 7.207 13.543 L 5.793 14.957 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _expandUpDownLine!!
    }

private var _expandUpDownLine: ImageVector? = null
