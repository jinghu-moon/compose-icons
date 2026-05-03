package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TvFill: ImageVector
    get() {
        if (_tvFill != null) return _tvFill!!
        _tvFill = remixIcon(
            name = "TvFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.414 5.000 L 21.008 5.000 C 21.556 5.000 22.000 5.445 22.000 6.001 L 22.000 19.999 C 22.000 20.552 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 19.999 L 2.000 6.001 C 2.000 5.448 2.455 5.000 2.992 5.000 L 8.586 5.000 L 6.050 2.464 L 7.464 1.050 L 11.414 5.000 L 12.586 5.000 L 16.535 1.050 L 17.950 2.464 L 15.414 5.000 Z"),
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
        return _tvFill!!
    }

private var _tvFill: ImageVector? = null
