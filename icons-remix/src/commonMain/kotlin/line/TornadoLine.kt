package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TornadoLine: ImageVector
    get() {
        if (_tornadoLine != null) return _tornadoLine!!
        _tornadoLine = remixIcon(
            name = "TornadoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 3.000 L 22.000 3.000 L 22.000 5.000 L 2.000 5.000 L 2.000 3.000 ZM 4.000 7.000 L 20.000 7.000 L 20.000 9.000 L 4.000 9.000 L 4.000 7.000 ZM 8.000 11.000 L 22.000 11.000 L 22.000 13.000 L 8.000 13.000 L 8.000 11.000 ZM 10.000 15.000 L 18.000 15.000 L 18.000 17.000 L 10.000 17.000 L 10.000 15.000 ZM 8.000 19.000 L 14.000 19.000 L 14.000 21.000 L 8.000 21.000 L 8.000 19.000 Z"),
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
        return _tornadoLine!!
    }

private var _tornadoLine: ImageVector? = null
