package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KnifeBloodLine: ImageVector
    get() {
        if (_knifeBloodLine != null) return _knifeBloodLine!!
        _knifeBloodLine = remixIcon(
            name = "KnifeBloodLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.343 1.408 22.374 19.439c.586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0L15.657 16.965l-3.536 3.535L8.001 16.379l0 2.621c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552-.448-1-1-1-.513 0-.936 .386-.993 .883l-.007 .117v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1L2.001 7.214C1.964 5.194 2.687 3.164 4.17 1.587l.174-.179ZM4.584 4.478l-.051 .11c-.303 .669-.477 1.383-.521 2.103l-.01 .309-.001 .12c.013 1.439 .541 2.874 1.58 4.004l.177 .184 6.363 6.364 2.828-2.829L4.584 4.478Z"),
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
        return _knifeBloodLine!!
    }

private var _knifeBloodLine: ImageVector? = null
