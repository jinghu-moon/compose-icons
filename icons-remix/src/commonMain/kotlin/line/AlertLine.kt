package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlertLine: ImageVector
    get() {
        if (_alertLine != null) return _alertLine!!
        _alertLine = remixIcon(
            name = "AlertLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.866 3.000 L 22.392 19.500 C 22.668 19.979 22.504 20.590 22.026 20.866 C 21.874 20.954 21.702 21.000 21.526 21.000 L 2.474 21.000 C 1.921 21.000 1.474 20.552 1.474 20.000 C 1.474 19.825 1.520 19.652 1.608 19.500 L 11.134 3.000 C 11.410 2.522 12.022 2.358 12.500 2.634 C 12.652 2.722 12.778 2.848 12.866 3.000 ZM 4.206 19.000 L 19.794 19.000 L 12.000 5.500 L 4.206 19.000 ZM 11.000 16.000 L 13.000 16.000 L 13.000 18.000 L 11.000 18.000 L 11.000 16.000 ZM 11.000 9.000 L 13.000 9.000 L 13.000 14.000 L 11.000 14.000 L 11.000 9.000 Z"),
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
        return _alertLine!!
    }

private var _alertLine: ImageVector? = null
