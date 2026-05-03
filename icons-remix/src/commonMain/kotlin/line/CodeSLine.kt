package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CodeSLine: ImageVector
    get() {
        if (_codeSLine != null) return _codeSLine!!
        _codeSLine = remixIcon(
            name = "CodeSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 12.000 L 18.343 17.657 L 16.929 16.243 L 21.172 12.000 L 16.929 7.757 L 18.343 6.343 L 24.000 12.000 ZM 2.828 12.000 L 7.071 16.243 L 5.657 17.657 L 0.000 12.000 L 5.657 6.343 L 7.071 7.757 L 2.828 12.000 Z"),
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
        return _codeSLine!!
    }

private var _codeSLine: ImageVector? = null
