package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MedalFill: ImageVector
    get() {
        if (_medalFill != null) return _medalFill!!
        _medalFill = remixIcon(
            name = "MedalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 7.000 C 16.418 7.000 20.000 10.582 20.000 15.000 C 20.000 19.418 16.418 23.000 12.000 23.000 C 7.582 23.000 4.000 19.418 4.000 15.000 C 4.000 10.582 7.582 7.000 12.000 7.000 ZM 12.000 10.500 L 10.677 13.180 L 7.720 13.609 L 9.860 15.695 L 9.355 18.641 L 12.000 17.250 L 14.645 18.641 L 14.140 15.695 L 16.280 13.609 L 13.323 13.180 L 12.000 10.500 ZM 13.000 1.999 L 18.000 2.000 L 18.000 5.000 L 16.637 6.138 C 15.531 5.558 14.302 5.179 13.001 5.050 L 13.000 1.999 ZM 11.000 1.999 L 11.000 5.049 C 9.698 5.179 8.470 5.557 7.364 6.137 L 6.000 5.000 L 6.000 2.000 L 11.000 1.999 Z"),
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
        return _medalFill!!
    }

private var _medalFill: ImageVector? = null
