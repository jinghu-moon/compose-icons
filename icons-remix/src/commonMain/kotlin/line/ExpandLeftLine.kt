package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandLeftLine: ImageVector
    get() {
        if (_expandLeftLine != null) return _expandLeftLine!!
        _expandLeftLine = remixIcon(
            name = "ExpandLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.071 4.929 L 11.485 6.343 L 6.828 11.000 L 16.000 11.000 L 16.000 13.000 L 6.828 13.000 L 11.485 17.657 L 10.071 19.071 L 3.000 12.000 L 10.071 4.929 ZM 18.000 19.000 L 18.000 5.000 L 20.000 5.000 L 20.000 19.000 L 18.000 19.000 Z"),
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
        return _expandLeftLine!!
    }

private var _expandLeftLine: ImageVector? = null
