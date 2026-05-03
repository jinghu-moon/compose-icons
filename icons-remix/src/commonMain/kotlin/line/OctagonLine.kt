package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OctagonLine: ImageVector
    get() {
        if (_octagonLine != null) return _octagonLine!!
        _octagonLine = remixIcon(
            name = "OctagonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.936 2.501 L 21.501 8.066 L 21.501 15.936 L 15.936 21.501 L 8.066 21.501 L 2.501 15.936 L 2.501 8.066 L 8.066 2.501 L 15.936 2.501 ZM 15.108 4.501 L 8.894 4.501 L 4.501 8.894 L 4.501 15.108 L 8.894 19.501 L 15.108 19.501 L 19.501 15.108 L 19.501 8.894 L 15.108 4.501 Z"),
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
        return _octagonLine!!
    }

private var _octagonLine: ImageVector? = null
