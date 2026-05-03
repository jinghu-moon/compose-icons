package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Prohibited2Line: ImageVector
    get() {
        if (_prohibited2Line != null) return _prohibited2Line!!
        _prohibited2Line = remixIcon(
            name = "Prohibited2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.906 5.680 L 5.680 16.906 C 4.626 15.551 4.000 13.849 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 13.849 4.000 15.551 4.626 16.906 5.680 ZM 7.094 18.320 L 18.320 7.094 C 19.374 8.449 20.000 10.151 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 10.151 20.000 8.449 19.374 7.094 18.320 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.522 6.478 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.478 17.522 2.000 12.000 2.000 Z"),
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
        return _prohibited2Line!!
    }

private var _prohibited2Line: ImageVector? = null
