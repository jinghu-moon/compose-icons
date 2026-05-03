package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AwardLine: ImageVector
    get() {
        if (_awardLine != null) return _awardLine!!
        _awardLine = remixIcon(
            name = "AwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 15.245 L 17.000 22.117 C 17.000 22.393 16.776 22.617 16.500 22.617 C 16.409 22.617 16.320 22.592 16.243 22.546 L 12.000 20.000 L 7.757 22.546 C 7.520 22.688 7.213 22.611 7.071 22.374 C 7.025 22.296 7.000 22.208 7.000 22.117 L 7.000 15.245 C 5.171 13.779 4.000 11.526 4.000 9.000 C 4.000 4.582 7.582 1.000 12.000 1.000 C 16.418 1.000 20.000 4.582 20.000 9.000 C 20.000 11.526 18.829 13.779 17.000 15.245 ZM 9.000 16.419 L 9.000 19.468 L 12.000 17.668 L 15.000 19.468 L 15.000 16.419 C 14.074 16.794 13.061 17.000 12.000 17.000 C 10.939 17.000 9.926 16.794 9.000 16.419 ZM 12.000 15.000 C 15.314 15.000 18.000 12.314 18.000 9.000 C 18.000 5.686 15.314 3.000 12.000 3.000 C 8.686 3.000 6.000 5.686 6.000 9.000 C 6.000 12.314 8.686 15.000 12.000 15.000 Z"),
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
        return _awardLine!!
    }

private var _awardLine: ImageVector? = null
