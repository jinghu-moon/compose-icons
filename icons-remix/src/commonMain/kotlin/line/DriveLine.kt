package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DriveLine: ImageVector
    get() {
        if (_driveLine != null) return _driveLine!!
        _driveLine = remixIcon(
            name = "DriveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.097 6.150 L 4.310 14.443 L 6.065 17.475 L 10.850 9.186 L 9.097 6.150 ZM 7.797 18.474 L 17.365 18.474 L 19.116 15.440 L 9.549 15.440 L 7.797 18.474 ZM 19.111 13.440 L 14.325 5.150 L 10.829 5.150 L 15.616 13.440 L 19.111 13.440 ZM 8.520 3.150 L 15.480 3.150 L 22.000 14.444 L 18.520 20.474 L 5.490 20.474 L 2.000 14.444 L 8.520 3.150 ZM 12.005 11.186 L 10.703 13.440 L 13.306 13.440 L 12.005 11.186 Z"),
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
        return _driveLine!!
    }

private var _driveLine: ImageVector? = null
