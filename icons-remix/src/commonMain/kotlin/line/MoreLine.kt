package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoreLine: ImageVector
    get() {
        if (_moreLine != null) return _moreLine!!
        _moreLine = remixIcon(
            name = "MoreLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.500 10.500 C 3.675 10.500 3.000 11.175 3.000 12.000 C 3.000 12.825 3.675 13.500 4.500 13.500 C 5.325 13.500 6.000 12.825 6.000 12.000 C 6.000 11.175 5.325 10.500 4.500 10.500 ZM 19.500 10.500 C 18.675 10.500 18.000 11.175 18.000 12.000 C 18.000 12.825 18.675 13.500 19.500 13.500 C 20.325 13.500 21.000 12.825 21.000 12.000 C 21.000 11.175 20.325 10.500 19.500 10.500 ZM 12.000 10.500 C 11.175 10.500 10.500 11.175 10.500 12.000 C 10.500 12.825 11.175 13.500 12.000 13.500 C 12.825 13.500 13.500 12.825 13.500 12.000 C 13.500 11.175 12.825 10.500 12.000 10.500 Z"),
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
        return _moreLine!!
    }

private var _moreLine: ImageVector? = null
