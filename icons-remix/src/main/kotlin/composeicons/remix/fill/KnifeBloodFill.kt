package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KnifeBloodFill: ImageVector
    get() {
        if (_knifeBloodFill != null) return _knifeBloodFill!!
        _knifeBloodFill = remixIcon(
            name = "KnifeBloodFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.343 1.408 22.374 19.439c.586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0L15.657 16.965l-3.536 3.535L8.001 16.379l0 2.621c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552-.448-1-1-1-.513 0-.936 .386-.993 .883l-.007 .117v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1L2.001 7.214C1.964 5.194 2.687 3.164 4.17 1.587l.174-.179Z"),
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
        return _knifeBloodFill!!
    }

private var _knifeBloodFill: ImageVector? = null
