package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NpmjsLine: ImageVector
    get() {
        if (_npmjsLine != null) return _npmjsLine!!
        _npmjsLine = remixIcon(
            name = "NpmjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.001 3.000 C 20.553 3.000 21.001 3.448 21.001 4.000 L 21.001 20.000 C 21.001 20.552 20.553 21.000 20.001 21.000 L 4.001 21.000 C 3.449 21.000 3.001 20.552 3.001 20.000 L 3.001 4.000 C 3.001 3.448 3.449 3.000 4.001 3.000 L 20.001 3.000 ZM 19.001 5.000 L 5.001 5.000 L 5.001 19.000 L 19.001 19.000 L 19.001 5.000 ZM 17.001 7.000 L 17.001 17.000 L 14.501 17.000 L 14.501 9.500 L 12.001 9.500 L 12.001 17.000 L 7.001 17.000 L 7.001 7.000 L 17.001 7.000 Z"),
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
        return _npmjsLine!!
    }

private var _npmjsLine: ImageVector? = null
