package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloseLargeLine: ImageVector
    get() {
        if (_closeLargeLine != null) return _closeLargeLine!!
        _closeLargeLine = remixIcon(
            name = "CloseLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.586 12.000 L 2.793 4.207 L 4.207 2.793 L 12.000 10.586 L 19.793 2.793 L 21.207 4.207 L 13.414 12.000 L 21.207 19.793 L 19.793 21.207 L 12.000 13.414 L 4.207 21.207 L 2.793 19.793 L 10.586 12.000 Z"),
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
        return _closeLargeLine!!
    }

private var _closeLargeLine: ImageVector? = null
