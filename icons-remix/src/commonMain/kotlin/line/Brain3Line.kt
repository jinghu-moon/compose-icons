package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brain3Line: ImageVector
    get() {
        if (_brain3Line != null) return _brain3Line!!
        _brain3Line = remixIcon(
            name = "Brain3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.500 4.783 L 19.500 7.671 L 22.000 9.114 L 22.000 14.887 L 19.499 16.331 L 19.500 19.218 L 14.500 22.104 L 12.000 20.661 L 9.500 22.104 L 4.500 19.218 L 4.500 16.331 L 2.000 14.888 L 2.001 9.113 L 4.500 7.670 L 4.500 4.784 L 9.500 1.897 L 11.999 3.341 L 14.501 1.896 L 19.500 4.783 ZM 13.000 5.072 L 13.000 8.000 L 11.000 8.000 L 11.000 5.073 L 9.500 4.207 L 6.499 5.938 L 6.499 8.825 L 4.000 10.268 L 4.000 13.733 L 6.500 15.177 L 6.500 18.063 L 9.500 19.796 L 11.000 18.929 L 11.000 16.000 L 13.000 16.000 L 13.001 18.930 L 14.500 19.796 L 17.500 18.062 L 17.500 15.177 L 20.000 13.732 L 20.000 10.269 L 17.499 8.825 L 17.500 5.938 L 14.501 4.206 L 13.000 5.072 Z"),
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
        return _brain3Line!!
    }

private var _brain3Line: ImageVector? = null
