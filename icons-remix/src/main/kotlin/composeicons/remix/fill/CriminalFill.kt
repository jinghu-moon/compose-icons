package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CriminalFill: ImageVector
    get() {
        if (_criminalFill != null) return _criminalFill!!
        _criminalFill = remixIcon(
            name = "CriminalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9 0 2.203-.792 4.221-2.106 5.786 1.255 .83 2.033 1.89 2.101 3.049L21 20l-9 2L3 20l.005-.165c.068-1.159 .846-2.219 2.101-3.049C3.792 15.222 3 13.204 3 11 3 6.029 7.029 2 12 2ZM12 13c-1.381 0-2.5 .672-2.5 1.5C9.5 15.328 10.619 16 12 16c1.381 0 2.5-.672 2.5-1.5C14.5 13.672 13.381 13 12 13ZM9 8C7.895 8 7 8.672 7 9.5 7 10.328 7.895 11 9 11c1.105 0 2-.672 2-1.5C11 8.672 10.105 8 9 8ZM15 8c-1.105 0-2 .672-2 1.5 0 .828 .895 1.5 2 1.5 1.105 0 2-.672 2-1.5C17 8.672 16.105 8 15 8Z"),
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
        return _criminalFill!!
    }

private var _criminalFill: ImageVector? = null
