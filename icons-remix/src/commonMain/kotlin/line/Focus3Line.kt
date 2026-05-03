package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Focus3Line: ImageVector
    get() {
        if (_focus3Line != null) return _focus3Line!!
        _focus3Line = remixIcon(
            name = "Focus3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 1.000 L 13.001 4.062 C 16.619 4.514 19.487 7.382 19.938 11.000 L 23.000 11.000 L 23.000 13.000 L 19.938 13.001 C 19.486 16.619 16.619 19.486 13.001 19.938 L 13.000 23.000 L 11.000 23.000 L 11.000 19.938 C 7.382 19.487 4.514 16.619 4.062 13.001 L 1.000 13.000 L 1.000 11.000 L 4.062 11.000 C 4.513 7.381 7.381 4.513 11.000 4.062 L 11.000 1.000 L 13.000 1.000 ZM 12.000 6.000 C 8.686 6.000 6.000 8.686 6.000 12.000 C 6.000 15.314 8.686 18.000 12.000 18.000 C 15.314 18.000 18.000 15.314 18.000 12.000 C 18.000 8.686 15.314 6.000 12.000 6.000 ZM 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 Z"),
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
        return _focus3Line!!
    }

private var _focus3Line: ImageVector? = null
