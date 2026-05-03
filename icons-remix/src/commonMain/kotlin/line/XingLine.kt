package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XingLine: ImageVector
    get() {
        if (_xingLine != null) return _xingLine!!
        _xingLine = remixIcon(
            name = "XingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.444 3.500 L 13.810 14.990 L 17.857 22.000 L 15.547 22.000 L 11.502 14.991 L 11.500 14.990 L 18.134 3.500 L 20.444 3.500 ZM 8.310 7.000 L 10.732 11.196 L 10.731 11.197 L 7.669 16.500 L 5.361 16.500 L 8.422 11.195 L 6.001 7.000 L 8.310 7.000 Z"),
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
        return _xingLine!!
    }

private var _xingLine: ImageVector? = null
