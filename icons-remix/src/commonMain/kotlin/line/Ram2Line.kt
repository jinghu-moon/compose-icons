package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ram2Line: ImageVector
    get() {
        if (_ram2Line != null) return _ram2Line!!
        _ram2Line = remixIcon(
            name = "Ram2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.000 C 1.448 5.000 1.000 5.448 1.000 6.000 L 1.000 15.000 C 1.000 15.552 1.448 16.000 2.000 16.000 L 2.000 18.000 C 2.000 18.552 2.448 19.000 3.000 19.000 L 10.414 19.000 L 11.414 18.000 L 12.586 18.000 L 13.586 19.000 L 21.000 19.000 C 21.552 19.000 22.000 18.552 22.000 18.000 L 22.000 16.000 C 22.552 16.000 23.000 15.552 23.000 15.000 L 23.000 6.000 C 23.000 5.448 22.552 5.000 22.000 5.000 L 2.000 5.000 ZM 20.000 16.000 L 20.000 17.000 L 14.414 17.000 L 13.414 16.000 L 20.000 16.000 ZM 10.586 16.000 L 9.586 17.000 L 4.000 17.000 L 4.000 16.000 L 10.586 16.000 ZM 3.000 14.000 L 3.000 7.000 L 21.000 7.000 L 21.000 14.000 L 3.000 14.000 ZM 5.000 9.000 L 7.000 9.000 L 7.000 12.000 L 5.000 12.000 L 5.000 9.000 ZM 11.000 9.000 L 9.000 9.000 L 9.000 12.000 L 11.000 12.000 L 11.000 9.000 ZM 13.000 9.000 L 15.000 9.000 L 15.000 12.000 L 13.000 12.000 L 13.000 9.000 ZM 19.000 9.000 L 17.000 9.000 L 17.000 12.000 L 19.000 12.000 L 19.000 9.000 Z"),
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
        return _ram2Line!!
    }

private var _ram2Line: ImageVector? = null
