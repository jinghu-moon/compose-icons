package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BarcodeLine: ImageVector
    get() {
        if (_barcodeLine != null) return _barcodeLine!!
        _barcodeLine = remixIcon(
            name = "BarcodeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4h2v16h-2v-16ZM6 4h1v16h-1v-16ZM8 4h2v16h-2v-16ZM11 4h2v16h-2v-16ZM14 4h2v16h-2v-16ZM17 4h1v16h-1v-16ZM19 4h3v16h-3v-16Z"),
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
        return _barcodeLine!!
    }

private var _barcodeLine: ImageVector? = null
