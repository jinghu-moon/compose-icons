package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CrossLine: ImageVector
    get() {
        if (_crossLine != null) return _crossLine!!
        _crossLine = remixIcon(
            name = "CrossLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 2.000 L 15.000 2.000 L 15.000 7.000 L 20.000 7.000 L 20.000 13.000 L 15.000 13.000 L 15.000 22.000 L 9.000 22.000 L 9.000 13.000 L 4.000 13.000 L 4.000 7.000 L 9.000 7.000 L 9.000 2.000 ZM 11.000 4.000 L 11.000 9.000 L 6.000 9.000 L 6.000 11.000 L 11.000 11.000 L 11.000 20.000 L 13.000 20.000 L 13.000 11.000 L 18.000 11.000 L 18.000 9.000 L 13.000 9.000 L 13.000 4.000 L 11.000 4.000 Z"),
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
        return _crossLine!!
    }

private var _crossLine: ImageVector? = null
