package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignpostLine: ImageVector
    get() {
        if (_signpostLine != null) return _signpostLine!!
        _signpostLine = remixIcon(
            name = "SignpostLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 5.000 L 17.414 5.000 L 21.707 9.293 C 22.098 9.683 22.098 10.317 21.707 10.707 L 17.414 15.000 L 12.000 15.000 L 12.000 22.000 L 10.000 22.000 L 10.000 15.000 L 4.000 15.000 C 3.448 15.000 3.000 14.552 3.000 14.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 10.000 5.000 L 10.000 2.000 L 12.000 2.000 L 12.000 5.000 ZM 16.586 13.000 L 19.586 10.000 L 16.586 7.000 L 5.000 7.000 L 5.000 13.000 L 16.586 13.000 Z"),
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
        return _signpostLine!!
    }

private var _signpostLine: ImageVector? = null
