package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AedElectrodesLine: ImageVector
    get() {
        if (_aedElectrodesLine != null) return _aedElectrodesLine!!
        _aedElectrodesLine = remixIcon(
            name = "AedElectrodesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 4.000 C 7.000 3.448 7.448 3.000 8.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 16.000 C 21.000 16.552 20.552 17.000 20.000 17.000 L 17.000 17.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 11.000 21.000 L 11.000 23.000 L 9.000 23.000 L 9.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000 L 7.000 7.000 L 7.000 4.000 ZM 19.000 15.000 L 19.000 5.000 L 9.000 5.000 L 9.000 7.000 L 16.000 7.000 C 16.552 7.000 17.000 7.448 17.000 8.000 L 17.000 15.000 L 19.000 15.000 ZM 5.000 9.000 L 5.000 19.000 L 15.000 19.000 L 15.000 9.000 L 5.000 9.000 Z"),
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
        return _aedElectrodesLine!!
    }

private var _aedElectrodesLine: ImageVector? = null
