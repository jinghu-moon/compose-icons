package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemRightLine: ImageVector
    get() {
        if (_alignItemRightLine != null) return _alignItemRightLine!!
        _alignItemRightLine = remixIcon(
            name = "AlignItemRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 21.000 L 19.000 3.000 L 21.000 3.000 L 21.000 21.000 L 19.000 21.000 ZM 9.000 15.000 L 15.000 15.000 L 15.000 18.000 L 9.000 18.000 L 9.000 15.000 ZM 8.000 13.000 C 7.448 13.000 7.000 13.448 7.000 14.000 L 7.000 19.000 C 7.000 19.552 7.448 20.000 8.000 20.000 L 16.000 20.000 C 16.552 20.000 17.000 19.552 17.000 19.000 L 17.000 14.000 C 17.000 13.448 16.552 13.000 16.000 13.000 L 8.000 13.000 ZM 5.000 9.000 L 15.000 9.000 L 15.000 6.000 L 5.000 6.000 L 5.000 9.000 ZM 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 16.000 4.000 C 16.552 4.000 17.000 4.448 17.000 5.000 L 17.000 10.000 C 17.000 10.552 16.552 11.000 16.000 11.000 L 4.000 11.000 C 3.448 11.000 3.000 10.552 3.000 10.000 L 3.000 5.000 Z"),
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
        return _alignItemRightLine!!
    }

private var _alignItemRightLine: ImageVector? = null
