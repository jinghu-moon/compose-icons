package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicroscopeLine: ImageVector
    get() {
        if (_microscopeLine != null) return _microscopeLine!!
        _microscopeLine = remixIcon(
            name = "MicroscopeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.196 2.268 L 16.446 7.897 C 16.722 8.375 16.558 8.987 16.080 9.263 L 14.781 10.012 L 15.781 11.745 L 14.049 12.745 L 13.049 11.012 L 11.750 11.763 C 11.272 12.039 10.660 11.875 10.384 11.397 L 8.546 8.215 C 6.494 8.837 5.000 10.744 5.000 13.000 C 5.000 13.625 5.115 14.224 5.324 14.776 C 6.099 14.284 7.016 14.000 8.000 14.000 C 9.684 14.000 11.174 14.833 12.080 16.109 L 19.768 11.670 L 20.768 13.403 L 12.890 17.951 C 12.962 18.289 13.000 18.640 13.000 19.000 C 13.000 19.343 12.965 19.677 12.900 20.001 L 21.000 20.000 L 21.000 22.000 L 4.001 22.001 C 3.372 21.165 3.000 20.126 3.000 19.000 C 3.000 17.993 3.298 17.055 3.810 16.270 C 3.293 15.295 3.000 14.182 3.000 13.000 C 3.000 10.005 4.881 7.449 7.527 6.449 L 7.134 5.768 C 6.582 4.811 6.909 3.588 7.866 3.036 L 10.464 1.536 C 11.421 0.984 12.644 1.311 13.196 2.268 ZM 8.000 16.000 C 6.343 16.000 5.000 17.343 5.000 19.000 C 5.000 19.351 5.060 19.687 5.171 20.000 L 10.829 20.000 C 10.940 19.687 11.000 19.351 11.000 19.000 C 11.000 17.343 9.657 16.000 8.000 16.000 ZM 11.464 3.268 L 8.866 4.768 L 11.616 9.531 L 14.214 8.031 L 11.464 3.268 Z"),
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
        return _microscopeLine!!
    }

private var _microscopeLine: ImageVector? = null
