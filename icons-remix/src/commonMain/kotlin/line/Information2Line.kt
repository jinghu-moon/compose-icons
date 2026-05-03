package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Information2Line: ImageVector
    get() {
        if (_information2Line != null) return _information2Line!!
        _information2Line = remixIcon(
            name = "Information2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 ZM 13.000 10.500 L 13.000 15.000 L 14.000 15.000 L 14.000 17.000 L 10.000 17.000 L 10.000 15.000 L 11.000 15.000 L 11.000 12.500 L 10.000 12.500 L 10.000 10.500 L 13.000 10.500 ZM 13.500 8.000 C 13.500 8.828 12.828 9.500 12.000 9.500 C 11.172 9.500 10.500 8.828 10.500 8.000 C 10.500 7.172 11.172 6.500 12.000 6.500 C 12.828 6.500 13.500 7.172 13.500 8.000 Z"),
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
        return _information2Line!!
    }

private var _information2Line: ImageVector? = null
