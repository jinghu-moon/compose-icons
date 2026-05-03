package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RoadMapLine: ImageVector
    get() {
        if (_roadMapLine != null) return _roadMapLine!!
        _roadMapLine = remixIcon(
            name = "RoadMapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.143 L 4.000 18.967 L 9.065 16.796 L 15.065 19.796 L 20.000 17.681 L 20.000 4.857 L 21.303 4.299 C 21.557 4.190 21.851 4.307 21.960 4.561 C 21.986 4.624 22.000 4.691 22.000 4.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 7.000 L 4.000 6.143 ZM 16.243 11.243 L 12.000 15.485 L 7.757 11.243 C 5.414 8.899 5.414 5.101 7.757 2.757 C 10.101 0.414 13.899 0.414 16.243 2.757 C 18.586 5.101 18.586 8.899 16.243 11.243 ZM 12.000 12.657 L 14.828 9.828 C 16.390 8.266 16.390 5.734 14.828 4.172 C 13.266 2.609 10.734 2.609 9.172 4.172 C 7.609 5.734 7.609 8.266 9.172 9.828 L 12.000 12.657 Z"),
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
        return _roadMapLine!!
    }

private var _roadMapLine: ImageVector? = null
