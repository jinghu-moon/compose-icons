package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContractFill: ImageVector
    get() {
        if (_contractFill != null) return _contractFill!!
        _contractFill = remixIcon(
            name = "ContractFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 4.000 2.000 C 3.448 2.000 3.000 2.448 3.000 3.000 L 3.000 21.000 C 3.000 21.552 3.448 22.000 4.000 22.000 L 12.255 22.000 C 11.464 20.866 11.000 19.487 11.000 18.000 C 11.000 14.134 14.134 11.000 18.000 11.000 C 19.074 11.000 20.091 11.242 21.000 11.674 L 21.000 7.000 L 16.000 2.000 ZM 13.786 15.327 C 13.825 14.600 14.386 14.008 15.110 13.931 L 15.981 13.839 C 16.084 13.828 16.181 13.785 16.259 13.715 L 16.910 13.130 C 17.452 12.643 18.267 12.622 18.833 13.080 L 19.514 13.630 C 19.595 13.695 19.695 13.733 19.799 13.739 L 20.673 13.786 C 21.400 13.825 21.992 14.386 22.069 15.110 L 22.161 15.981 C 22.172 16.084 22.215 16.181 22.285 16.259 L 22.870 16.910 C 23.357 17.452 23.378 18.267 22.920 18.833 L 22.370 19.514 C 22.305 19.595 22.267 19.695 22.261 19.799 L 22.214 20.673 C 22.175 21.400 21.614 21.992 20.890 22.069 L 20.019 22.161 C 19.916 22.172 19.819 22.215 19.741 22.285 L 19.090 22.870 C 18.548 23.357 17.733 23.378 17.167 22.920 L 16.486 22.370 C 16.405 22.305 16.305 22.267 16.201 22.261 L 15.327 22.214 C 14.600 22.175 14.008 21.614 13.931 20.890 L 13.839 20.019 C 13.828 19.916 13.785 19.819 13.715 19.741 L 13.130 19.090 C 12.643 18.548 12.622 17.733 13.080 17.167 L 13.630 16.486 C 13.695 16.405 13.733 16.305 13.739 16.201 L 13.786 15.327 ZM 21.030 17.030 L 19.970 15.970 L 17.500 18.439 L 16.030 16.970 L 14.970 18.030 L 16.970 20.030 L 17.500 20.561 L 18.030 20.030 L 21.030 17.030 Z"),
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
        return _contractFill!!
    }

private var _contractFill: ImageVector? = null
