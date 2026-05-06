package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalCellular2Line: ImageVector
    get() {
        if (_signalCellular2Line != null) return _signalCellular2Line!!
        _signalCellular2Line = remixIcon(
            name = "SignalCellular2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 13h6v8h-6v-8ZM16 19h6v2h-6v-2ZM9 8h6v13h-6v-13ZM4 15v4h2v-4h-2ZM11 10v9h2v-9h-2Z"),
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
        return _signalCellular2Line!!
    }

private var _signalCellular2Line: ImageVector? = null
