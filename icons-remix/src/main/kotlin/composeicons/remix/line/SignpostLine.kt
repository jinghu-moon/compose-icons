package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignpostLine: ImageVector
    get() {
        if (_signpostLine != null) return _signpostLine!!
        _signpostLine = remixIcon(
            name = "SignpostLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 5h5.414l4.293 4.293c.391 .391 .391 1.024 0 1.414L17.414 15h-5.414v7h-2v-7h-6C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h6v-3h2v3ZM16.586 13l3-3-3-3h-11.586v6h11.586Z"),
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
        return _signpostLine!!
    }

private var _signpostLine: ImageVector? = null
