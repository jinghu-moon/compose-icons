package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HammerLine: ImageVector
    get() {
        if (_hammerLine != null) return _hammerLine!!
        _hammerLine = remixIcon(
            name = "HammerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 8.000 C 21.000 8.552 20.552 9.000 20.000 9.000 L 15.000 9.000 L 15.000 22.000 C 15.000 22.552 14.552 23.000 14.000 23.000 L 10.000 23.000 C 9.448 23.000 9.000 22.552 9.000 22.000 L 9.000 9.000 L 3.500 9.000 C 2.948 9.000 2.500 8.552 2.500 8.000 L 2.500 5.618 C 2.500 5.239 2.714 4.893 3.053 4.724 L 8.500 2.000 L 20.000 2.000 ZM 15.000 4.000 L 8.972 4.000 L 4.500 6.236 L 4.500 7.000 L 11.000 7.000 L 11.000 21.000 L 13.000 21.000 L 13.000 7.000 L 15.000 7.000 L 15.000 4.000 ZM 19.000 4.000 L 17.000 4.000 L 17.000 7.000 L 19.000 7.000 L 19.000 4.000 Z"),
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
        return _hammerLine!!
    }

private var _hammerLine: ImageVector? = null
