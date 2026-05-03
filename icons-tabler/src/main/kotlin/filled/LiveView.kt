package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LiveView: ImageVector
    get() {
        if (_liveView != null) return _liveView!!
        _liveView = tablerFilledIcon(
            name = "LiveView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 C 9.000 4.552 8.552 5.000 8.000 5.000 L 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 8.000 C 5.000 8.552 4.552 9.000 4.000 9.000 C 3.448 9.000 3.000 8.552 3.000 8.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 4.000 15.000 C 4.552 15.000 5.000 15.448 5.000 16.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 8.000 19.000 C 8.552 19.000 9.000 19.448 9.000 20.000 C 9.000 20.552 8.552 21.000 8.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 16.000 C 3.000 15.448 3.448 15.000 4.000 15.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 8.000 C 21.000 8.552 20.552 9.000 20.000 9.000 C 19.448 9.000 19.000 8.552 19.000 8.000 L 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 L 16.000 5.000 C 15.448 5.000 15.000 4.552 15.000 4.000 C 15.000 3.448 15.448 3.000 16.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 20.000 15.000 C 20.552 15.000 21.000 15.448 21.000 16.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 16.000 21.000 C 15.448 21.000 15.000 20.552 15.000 20.000 C 15.000 19.448 15.448 19.000 16.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 16.000 C 19.000 15.448 19.448 15.000 20.000 15.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 15.190 7.214 C 17.041 8.748 17.538 11.381 16.375 13.484 L 16.319 13.574 L 12.835 18.550 C 12.812 18.586 12.786 18.620 12.758 18.653 L 12.741 18.672 L 12.684 18.728 L 12.672 18.741 L 12.653 18.758 C 12.622 18.784 12.590 18.809 12.557 18.831 L 12.504 18.861 L 12.466 18.885 L 12.455 18.890 C 12.384 18.926 12.309 18.954 12.232 18.973 L 12.187 18.981 L 12.121 18.993 C 12.041 19.003 11.959 19.003 11.879 18.993 L 11.818 18.982 L 11.768 18.972 C 11.687 18.953 11.608 18.924 11.534 18.885 L 11.487 18.857 L 11.443 18.831 L 11.432 18.823 L 11.400 18.798 L 11.347 18.758 L 11.337 18.748 L 11.328 18.741 L 11.294 18.706 L 11.259 18.672 L 11.252 18.662 L 11.242 18.653 L 11.205 18.603 L 11.181 18.573 L 7.681 13.573 L 7.625 13.484 C 6.461 11.381 6.959 8.747 8.810 7.213 C 10.660 5.680 13.341 5.680 15.191 7.214M 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 L 11.000 11.010 C 11.000 11.562 11.448 12.010 12.000 12.010 C 12.552 12.010 13.000 11.562 13.000 11.010 L 13.000 11.000 C 13.000 10.448 12.552 10.000 12.000 10.000"),
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
        return _liveView!!
    }

private var _liveView: ImageVector? = null
