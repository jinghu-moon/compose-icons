package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LungsLine: ImageVector
    get() {
        if (_lungsLine != null) return _lungsLine!!
        _lungsLine = remixIcon(
            name = "LungsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.001 17.000 C 22.000 21.000 22.000 21.000 18.001 21.000 C 14.001 21.000 13.001 18.000 13.001 15.000 C 13.001 14.622 12.983 14.082 12.975 13.450 L 14.998 14.619 L 15.001 15.000 C 15.001 17.776 15.817 19.000 18.001 19.000 C 19.142 19.000 19.612 18.993 19.964 18.962 C 19.994 18.611 20.001 18.140 20.001 17.000 C 20.001 13.795 19.298 10.967 18.166 9.099 C 17.328 7.718 16.553 7.258 16.134 7.397 C 15.841 7.495 15.529 8.047 15.303 9.020 L 13.512 7.987 C 13.882 6.790 14.495 5.836 15.501 5.500 C 18.501 4.500 22.004 9.500 22.001 17.000 ZM 8.500 5.500 C 9.507 5.836 10.119 6.790 10.489 7.987 L 8.699 9.020 C 8.473 8.047 8.160 7.495 7.868 7.397 C 7.448 7.258 6.673 7.718 5.836 9.099 C 4.703 10.967 4.000 13.795 4.000 17.000 C 4.000 18.140 4.007 18.611 4.037 18.962 C 4.389 18.993 4.860 19.000 6.000 19.000 C 8.184 19.000 9.000 17.776 9.000 15.000 L 9.004 14.618 L 11.027 13.450 C 11.018 14.083 11.000 14.622 11.000 15.000 C 11.000 18.000 10.000 21.000 6.000 21.000 C 2.000 21.000 2.000 21.000 2.000 17.000 C 2.000 9.500 5.501 4.500 8.500 5.500 ZM 13.000 2.000 L 13.000 9.422 L 17.696 12.134 L 16.696 13.866 L 12.000 11.155 L 7.304 13.866 L 6.304 12.134 L 11.000 9.422 L 11.000 2.000 L 13.000 2.000 Z"),
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
        return _lungsLine!!
    }

private var _lungsLine: ImageVector? = null
