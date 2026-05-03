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
                pathData = parseSvgPathData("M 9.043 5.793 L 2.836 12.000 L 9.043 18.207 L 10.457 16.793 L 5.664 12.000 L 10.457 7.207 L 9.043 5.793 ZM 14.957 18.207 L 21.164 12.000 L 14.957 5.793 L 13.543 7.207 L 18.336 12.000 L 13.543 16.793 L 14.957 18.207 Z"),
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
