package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneLockLine: ImageVector
    get() {
        if (_phoneLockLine != null) return _phoneLockLine!!
        _phoneLockLine = remixIcon(
            name = "PhoneLockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.000 10.000 L 17.000 10.000 L 17.000 4.000 L 7.000 4.000 L 7.000 20.000 L 12.000 20.000 L 12.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 18.000 2.000 ZM 18.000 12.000 C 19.657 12.000 21.000 13.343 21.000 15.000 L 21.000 16.000 L 22.000 16.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 15.000 22.000 C 14.448 22.000 14.000 21.552 14.000 21.000 L 14.000 16.000 L 15.000 16.000 L 15.000 15.000 C 15.000 13.343 16.343 12.000 18.000 12.000 ZM 20.000 18.000 L 16.000 18.000 L 16.000 20.000 L 20.000 20.000 L 20.000 18.000 ZM 18.000 14.000 C 17.492 14.000 17.000 14.450 17.000 15.000 L 17.000 16.000 L 19.000 16.000 L 19.000 15.000 C 19.000 14.448 18.552 14.000 18.000 14.000 Z"),
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
        return _phoneLockLine!!
    }

private var _phoneLockLine: ImageVector? = null
