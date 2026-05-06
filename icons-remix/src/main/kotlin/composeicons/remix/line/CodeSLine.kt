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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 12l-5.657 5.657L16.929 16.243 21.172 12 16.929 7.757 18.343 6.343 24 12ZM2.828 12l4.243 4.243L5.657 17.657 0 12 5.657 6.343 7.071 7.757 2.828 12Z"),
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
        return _codeSLine!!
    }

private var _codeSLine: ImageVector? = null
