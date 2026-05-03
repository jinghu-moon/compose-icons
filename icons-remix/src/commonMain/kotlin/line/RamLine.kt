package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RamLine: ImageVector
    get() {
        if (_ramLine != null) return _ramLine!!
        _ramLine = remixIcon(
            name = "RamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 7.000 L 21.000 7.000 L 21.000 17.000 L 19.000 17.000 L 19.000 15.000 L 17.000 15.000 L 17.000 17.000 L 15.000 17.000 L 15.000 15.000 L 13.000 15.000 L 13.000 17.000 L 11.000 17.000 L 11.000 15.000 L 9.000 15.000 L 9.000 17.000 L 7.000 17.000 L 7.000 15.000 L 5.000 15.000 L 5.000 17.000 L 3.000 17.000 L 3.000 7.000 ZM 2.000 5.000 C 1.448 5.000 1.000 5.448 1.000 6.000 L 1.000 18.000 C 1.000 18.552 1.448 19.000 2.000 19.000 L 22.000 19.000 C 22.552 19.000 23.000 18.552 23.000 18.000 L 23.000 6.000 C 23.000 5.448 22.552 5.000 22.000 5.000 L 2.000 5.000 ZM 11.000 9.000 L 5.000 9.000 L 5.000 12.000 L 11.000 12.000 L 11.000 9.000 ZM 13.000 9.000 L 19.000 9.000 L 19.000 12.000 L 13.000 12.000 L 13.000 9.000 Z"),
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
        return _ramLine!!
    }

private var _ramLine: ImageVector? = null
