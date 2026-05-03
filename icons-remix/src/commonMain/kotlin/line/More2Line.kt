package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.More2Line: ImageVector
    get() {
        if (_more2Line != null) return _more2Line!!
        _more2Line = remixIcon(
            name = "More2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 11.175 3.000 10.500 3.675 10.500 4.500 C 10.500 5.325 11.175 6.000 12.000 6.000 C 12.825 6.000 13.500 5.325 13.500 4.500 C 13.500 3.675 12.825 3.000 12.000 3.000 ZM 12.000 18.000 C 11.175 18.000 10.500 18.675 10.500 19.500 C 10.500 20.325 11.175 21.000 12.000 21.000 C 12.825 21.000 13.500 20.325 13.500 19.500 C 13.500 18.675 12.825 18.000 12.000 18.000 ZM 12.000 10.500 C 11.175 10.500 10.500 11.175 10.500 12.000 C 10.500 12.825 11.175 13.500 12.000 13.500 C 12.825 13.500 13.500 12.825 13.500 12.000 C 13.500 11.175 12.825 10.500 12.000 10.500 Z"),
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
        return _more2Line!!
    }

private var _more2Line: ImageVector? = null
