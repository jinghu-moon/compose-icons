package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GhostLine: ImageVector
    get() {
        if (_ghostLine != null) return _ghostLine!!
        _ghostLine = remixIcon(
            name = "GhostLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v7.5C21 20.433 19.433 22 17.5 22c-1.2 0-2.259-.604-2.889-1.524C14.098 21.386 13.12 22 12 22 10.88 22 9.902 21.386 9.387 20.475 8.759 21.396 7.7 22 6.5 22 4.631 22 3.105 20.536 3.005 18.692L3 18.5v-7.5C3 6.029 7.029 2 12 2ZM12 4C8.215 4 5.131 7.005 5.004 10.759L5 11l-.001 7.446 .003 .138C5.045 19.375 5.703 20 6.5 20c.452 0 .867-.199 1.147-.535l.088-.117c.835-1.223 2.663-1.146 3.392 .143 .177 .313 .507 .51 .872 .51 .365 0 .693-.196 .869-.507 .7-1.242 2.421-1.362 3.295-.278l.097 .13c.28 .408 .737 .654 1.239 .654 .78 0 1.42-.595 1.493-1.355L19 18.5v-7.5C19 7.134 15.866 4 12 4ZM12 12c1.105 0 2 1.119 2 2.5C14 15.881 13.105 17 12 17c-1.105 0-2-1.119-2-2.5C10 13.119 10.895 12 12 12ZM9.5 8C10.328 8 11 8.672 11 9.5 11 10.328 10.328 11 9.5 11 8.672 11 8 10.328 8 9.5 8 8.672 8.672 8 9.5 8ZM14.5 8C15.328 8 16 8.672 16 9.5 16 10.328 15.328 11 14.5 11 13.672 11 13 10.328 13 9.5 13 8.672 13.672 8 14.5 8Z"),
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
        return _ghostLine!!
    }

private var _ghostLine: ImageVector? = null
