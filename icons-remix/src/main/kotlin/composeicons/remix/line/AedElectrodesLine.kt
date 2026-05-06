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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4C7 3.448 7.448 3 8 3h12c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-3v3c0 .552-.448 1-1 1h-5v2h-2v-2h-5C3.448 21 3 20.552 3 20v-12C3 7.448 3.448 7 4 7h3v-3ZM19 15v-10h-10v2h7c.552 0 1 .448 1 1v7h2ZM5 9v10h10v-10h-10Z"),
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
        return _aedElectrodesLine!!
    }

private var _aedElectrodesLine: ImageVector? = null
