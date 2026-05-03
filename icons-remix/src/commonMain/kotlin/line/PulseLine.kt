package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PulseLine: ImageVector
    get() {
        if (_pulseLine != null) return _pulseLine!!
        _pulseLine = remixIcon(
            name = "PulseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 7.539 L 15.000 21.539 L 18.659 13.000 L 23.000 13.000 L 23.000 11.000 L 17.341 11.000 L 15.000 16.461 L 9.000 2.461 L 5.341 11.000 L 1.000 11.000 L 1.000 13.000 L 6.659 13.000 L 9.000 7.539 Z"),
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
        return _pulseLine!!
    }

private var _pulseLine: ImageVector? = null
