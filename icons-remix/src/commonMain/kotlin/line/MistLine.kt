package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MistLine: ImageVector
    get() {
        if (_mistLine != null) return _mistLine!!
        _mistLine = remixIcon(
            name = "MistLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 4.000 L 8.000 4.000 L 8.000 6.000 L 4.000 6.000 L 4.000 4.000 ZM 16.000 19.000 L 20.000 19.000 L 20.000 21.000 L 16.000 21.000 L 16.000 19.000 ZM 2.000 9.000 L 7.000 9.000 L 7.000 11.000 L 2.000 11.000 L 2.000 9.000 ZM 9.000 9.000 L 12.000 9.000 L 12.000 11.000 L 9.000 11.000 L 9.000 9.000 ZM 14.000 9.000 L 20.000 9.000 L 20.000 11.000 L 14.000 11.000 L 14.000 9.000 ZM 4.000 14.000 L 10.000 14.000 L 10.000 16.000 L 4.000 16.000 L 4.000 14.000 ZM 12.000 14.000 L 15.000 14.000 L 15.000 16.000 L 12.000 16.000 L 12.000 14.000 ZM 17.000 14.000 L 22.000 14.000 L 22.000 16.000 L 17.000 16.000 L 17.000 14.000 ZM 10.000 4.000 L 22.000 4.000 L 22.000 6.000 L 10.000 6.000 L 10.000 4.000 ZM 2.000 19.000 L 14.000 19.000 L 14.000 21.000 L 2.000 21.000 L 2.000 19.000 Z"),
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
        return _mistLine!!
    }

private var _mistLine: ImageVector? = null
