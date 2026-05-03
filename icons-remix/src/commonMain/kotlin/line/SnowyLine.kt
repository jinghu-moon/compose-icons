package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SnowyLine: ImageVector
    get() {
        if (_snowyLine != null) return _snowyLine!!
        _snowyLine = remixIcon(
            name = "SnowyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 16.268 L 14.964 15.134 L 15.964 16.866 L 14.000 18.000 L 15.964 19.134 L 14.964 20.866 L 13.000 19.732 L 13.000 22.000 L 11.000 22.000 L 11.000 19.732 L 9.036 20.866 L 8.036 19.134 L 10.000 18.000 L 8.036 16.866 L 9.036 15.134 L 11.000 16.268 L 11.000 14.000 L 13.000 14.000 L 13.000 16.268 ZM 17.000 18.000 L 17.000 16.000 L 17.500 16.000 C 19.433 16.000 21.000 14.433 21.000 12.500 C 21.000 10.567 19.433 9.000 17.500 9.000 C 16.521 9.000 15.635 9.402 15.000 10.051 C 15.000 10.034 15.000 10.017 15.000 10.000 C 15.000 6.686 12.314 4.000 9.000 4.000 C 5.686 4.000 3.000 6.686 3.000 10.000 C 3.000 12.612 4.670 14.835 7.000 15.659 L 7.000 17.748 C 3.550 16.860 1.000 13.728 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.538 20.538 18.000 17.500 18.000 L 17.000 18.000 Z"),
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
        return _snowyLine!!
    }

private var _snowyLine: ImageVector? = null
