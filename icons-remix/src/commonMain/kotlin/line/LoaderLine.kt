package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoaderLine: ImageVector
    get() {
        if (_loaderLine != null) return _loaderLine!!
        _loaderLine = remixIcon(
            name = "LoaderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 6.000 C 13.000 6.552 12.552 7.000 12.000 7.000 C 11.447 7.000 11.000 6.552 11.000 6.000 L 11.000 3.000 C 11.000 2.448 11.447 2.000 12.000 2.000 ZM 12.000 17.000 C 12.552 17.000 13.000 17.448 13.000 18.000 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 11.447 22.000 11.000 21.552 11.000 21.000 L 11.000 18.000 C 11.000 17.448 11.447 17.000 12.000 17.000 ZM 20.660 7.000 C 20.936 7.478 20.772 8.090 20.294 8.366 L 17.696 9.866 C 17.217 10.142 16.606 9.978 16.330 9.500 C 16.053 9.022 16.217 8.410 16.696 8.134 L 19.294 6.634 C 19.772 6.358 20.384 6.522 20.660 7.000 ZM 7.669 14.500 C 7.945 14.978 7.782 15.590 7.303 15.866 L 4.705 17.366 C 4.227 17.642 3.615 17.478 3.339 17.000 C 3.063 16.522 3.227 15.910 3.705 15.634 L 6.303 14.134 C 6.782 13.858 7.393 14.022 7.669 14.500 ZM 20.660 17.000 C 20.384 17.478 19.772 17.642 19.294 17.366 L 16.696 15.866 C 16.217 15.590 16.053 14.978 16.330 14.500 C 16.606 14.022 17.217 13.858 17.696 14.134 L 20.294 15.634 C 20.772 15.910 20.936 16.522 20.660 17.000 ZM 7.669 9.500 C 7.393 9.978 6.782 10.142 6.303 9.866 L 3.705 8.366 C 3.227 8.090 3.063 7.478 3.339 7.000 C 3.615 6.522 4.227 6.358 4.705 6.634 L 7.303 8.134 C 7.782 8.410 7.945 9.022 7.669 9.500 Z"),
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
        return _loaderLine!!
    }

private var _loaderLine: ImageVector? = null
