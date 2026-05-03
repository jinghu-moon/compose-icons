package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinkedinLine: ImageVector
    get() {
        if (_linkedinLine != null) return _linkedinLine!!
        _linkedinLine = remixIcon(
            name = "LinkedinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 9.550 C 12.918 8.613 14.112 8.000 15.501 8.000 C 18.538 8.000 21.001 10.462 21.001 13.500 L 21.001 21.000 L 19.001 21.000 L 19.001 13.500 C 19.001 11.567 17.434 10.000 15.501 10.000 C 13.568 10.000 12.001 11.567 12.001 13.500 L 12.001 21.000 L 10.001 21.000 L 10.001 8.500 L 12.001 8.500 L 12.001 9.550 ZM 5.001 6.500 C 4.173 6.500 3.501 5.828 3.501 5.000 C 3.501 4.172 4.173 3.500 5.001 3.500 C 5.829 3.500 6.501 4.172 6.501 5.000 C 6.501 5.828 5.829 6.500 5.001 6.500 ZM 4.001 8.500 L 6.001 8.500 L 6.001 21.000 L 4.001 21.000 L 4.001 8.500 Z"),
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
        return _linkedinLine!!
    }

private var _linkedinLine: ImageVector? = null
