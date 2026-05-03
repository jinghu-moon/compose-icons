package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RocketFill: ImageVector
    get() {
        if (_rocketFill != null) return _rocketFill!!
        _rocketFill = remixIcon(
            name = "RocketFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.331 15.929 C 5.115 14.991 5.001 14.010 5.001 13.000 C 5.001 7.912 7.903 3.564 12.000 1.818 C 16.098 3.564 19.000 7.912 19.000 13.000 C 19.000 14.010 18.886 14.991 18.671 15.929 L 20.691 17.725 C 20.870 17.884 20.911 18.149 20.787 18.355 L 18.330 22.451 C 18.188 22.688 17.881 22.764 17.644 22.622 C 17.609 22.601 17.577 22.576 17.548 22.547 L 15.293 20.293 C 15.106 20.105 14.851 20.000 14.586 20.000 L 9.415 20.000 C 9.150 20.000 8.895 20.105 8.708 20.293 L 6.453 22.547 C 6.258 22.742 5.942 22.742 5.746 22.547 C 5.717 22.518 5.692 22.486 5.671 22.451 L 3.214 18.355 C 3.090 18.149 3.131 17.884 3.310 17.725 L 5.331 15.929 ZM 12.000 13.000 C 13.105 13.000 14.000 12.104 14.000 11.000 C 14.000 9.895 13.105 9.000 12.000 9.000 C 10.896 9.000 10.000 9.895 10.000 11.000 C 10.000 12.104 10.896 13.000 12.000 13.000 Z"),
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
        return _rocketFill!!
    }

private var _rocketFill: ImageVector? = null
