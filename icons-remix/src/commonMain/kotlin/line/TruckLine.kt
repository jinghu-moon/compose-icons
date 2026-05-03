package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TruckLine: ImageVector
    get() {
        if (_truckLine != null) return _truckLine!!
        _truckLine = remixIcon(
            name = "TruckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.965 18.000 C 8.722 19.696 7.263 21.000 5.500 21.000 C 3.737 21.000 2.278 19.696 2.035 18.000 L 1.000 18.000 L 1.000 6.000 C 1.000 5.448 1.448 5.000 2.000 5.000 L 16.000 5.000 C 16.552 5.000 17.000 5.448 17.000 6.000 L 17.000 8.000 L 20.000 8.000 L 23.000 12.056 L 23.000 18.000 L 20.965 18.000 C 20.722 19.696 19.263 21.000 17.500 21.000 C 15.737 21.000 14.278 19.696 14.035 18.000 L 8.965 18.000 ZM 15.000 7.000 L 3.000 7.000 L 3.000 15.050 C 3.635 14.402 4.521 14.000 5.500 14.000 C 6.896 14.000 8.101 14.818 8.663 16.000 L 14.337 16.000 C 14.505 15.647 14.730 15.326 15.000 15.050 L 15.000 7.000 ZM 17.000 13.000 L 21.000 13.000 L 21.000 12.715 L 18.992 10.000 L 17.000 10.000 L 17.000 13.000 ZM 17.500 19.000 C 18.153 19.000 18.709 18.583 18.915 18.000 C 18.970 17.844 19.000 17.675 19.000 17.500 C 19.000 16.672 18.328 16.000 17.500 16.000 C 16.672 16.000 16.000 16.672 16.000 17.500 C 16.000 17.675 16.030 17.844 16.085 18.000 C 16.291 18.583 16.847 19.000 17.500 19.000 ZM 7.000 17.500 C 7.000 16.672 6.328 16.000 5.500 16.000 C 4.672 16.000 4.000 16.672 4.000 17.500 C 4.000 17.675 4.030 17.844 4.085 18.000 C 4.291 18.583 4.847 19.000 5.500 19.000 C 6.153 19.000 6.709 18.583 6.915 18.000 C 6.970 17.844 7.000 17.675 7.000 17.500 Z"),
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
        return _truckLine!!
    }

private var _truckLine: ImageVector? = null
