package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Megaphone2Line: ImageVector
    get() {
        if (_megaphone2Line != null) return _megaphone2Line!!
        _megaphone2Line = remixIcon(
            name = "Megaphone2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.31 20.095c.106 1.065-.646 2.024-1.705 2.176-.935 .133-1.835-.407-2.158-1.295L7 16.999h5l.31 3.096ZM19.445 2.036C20.11 1.593 21 2.07 21 2.868v15.263c-0 .798-.89 1.275-1.555 .832L15 16h-7.5C4.463 16 2 13.537 2 10.5 2 7.463 4.462 5 7.5 5h7.5L19.445 2.036ZM15.606 7h-8.106C5.567 7 4 8.567 4 10.5c.001 1.933 1.568 3.5 3.5 3.5h8.106L19 16.261v-11.524L15.606 7Z"),
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
        return _megaphone2Line!!
    }

private var _megaphone2Line: ImageVector? = null
