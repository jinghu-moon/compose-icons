package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MvFill: ImageVector
    get() {
        if (_mvFill != null) return _mvFill!!
        _mvFill = remixIcon(
            name = "MvFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 ZM 12.000 12.171 C 11.687 12.060 11.351 12.000 11.000 12.000 C 9.343 12.000 8.000 13.343 8.000 15.000 C 8.000 16.657 9.343 18.000 11.000 18.000 C 12.657 18.000 14.000 16.657 14.000 15.000 L 14.000 8.000 L 17.000 8.000 L 17.000 6.000 L 12.000 6.000 L 12.000 12.171 Z"),
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
        return _mvFill!!
    }

private var _mvFill: ImageVector? = null
