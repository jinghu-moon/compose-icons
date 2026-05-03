package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemTopLine: ImageVector
    get() {
        if (_alignItemTopLine != null) return _alignItemTopLine!!
        _alignItemTopLine = remixIcon(
            name = "AlignItemTopLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 L 3.000 3.000 L 3.000 5.000 L 21.000 5.000 L 21.000 3.000 ZM 15.000 9.000 L 15.000 15.000 L 18.000 15.000 L 18.000 9.000 L 15.000 9.000 ZM 13.000 8.000 C 13.000 7.448 13.448 7.000 14.000 7.000 L 19.000 7.000 C 19.552 7.000 20.000 7.448 20.000 8.000 L 20.000 16.000 C 20.000 16.552 19.552 17.000 19.000 17.000 L 14.000 17.000 C 13.448 17.000 13.000 16.552 13.000 16.000 L 13.000 8.000 ZM 9.000 9.000 L 9.000 19.000 L 6.000 19.000 L 6.000 9.000 L 9.000 9.000 ZM 5.000 7.000 C 4.448 7.000 4.000 7.448 4.000 8.000 L 4.000 20.000 C 4.000 20.552 4.448 21.000 5.000 21.000 L 10.000 21.000 C 10.552 21.000 11.000 20.552 11.000 20.000 L 11.000 8.000 C 11.000 7.448 10.552 7.000 10.000 7.000 L 5.000 7.000 Z"),
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
        return _alignItemTopLine!!
    }

private var _alignItemTopLine: ImageVector? = null
