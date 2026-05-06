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
                pathData = parseSvgPathData("M15.936 2.501l5.565 5.565v7.87l-5.565 5.565h-7.87L2.501 15.936v-7.87L8.066 2.501h7.87ZM15.108 4.501h-6.213L4.501 8.894v6.213l4.393 4.393h6.213l4.393-4.393v-6.213L15.108 4.501Z"),
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
