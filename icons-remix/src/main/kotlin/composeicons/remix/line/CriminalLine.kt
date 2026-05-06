package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CriminalLine: ImageVector
    get() {
        if (_criminalLine != null) return _criminalLine!!
        _criminalLine = remixIcon(
            name = "CriminalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9 0 2.203-.792 4.221-2.106 5.786 1.255 .83 2.033 1.89 2.101 3.049L21 20l-9 2L3 20l.005-.165c.068-1.159 .846-2.219 2.101-3.049C3.792 15.222 3 13.204 3 11 3 6.029 7.029 2 12 2ZM12 4C8.134 4 5 7.134 5 11c0 1.567 .514 3.05 1.445 4.261l.192 .239 1.443 1.717L6.118 18.516l-.137 .097L12 19.951l6.018-1.338-.049-.036-.178-.123L15.92 17.217l1.443-1.718C18.415 14.247 19 12.671 19 11 19 7.134 15.866 4 12 4ZM12 13c1.381 0 2.5 .672 2.5 1.5C14.5 15.328 13.381 16 12 16 10.619 16 9.5 15.328 9.5 14.5 9.5 13.672 10.619 13 12 13ZM9 8c1.105 0 2 .672 2 1.5C11 10.328 10.105 11 9 11 7.895 11 7 10.328 7 9.5 7 8.672 7.895 8 9 8ZM15 8c1.105 0 2 .672 2 1.5C17 10.328 16.105 11 15 11c-1.105 0-2-.672-2-1.5C13 8.672 13.895 8 15 8Z"),
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
        return _criminalLine!!
    }

private var _criminalLine: ImageVector? = null
