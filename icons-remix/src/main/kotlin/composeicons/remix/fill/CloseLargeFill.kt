package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloseLargeFill: ImageVector
    get() {
        if (_closeLargeFill != null) return _closeLargeFill!!
        _closeLargeFill = remixIcon(
            name = "CloseLargeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.586 12 2.793 4.207 4.207 2.793l7.793 7.793L19.793 2.793l1.414 1.414L13.414 12l7.793 7.793-1.414 1.414L12 13.414 4.207 21.207 2.793 19.793 10.586 12Z"),
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
        return _closeLargeFill!!
    }

private var _closeLargeFill: ImageVector? = null
