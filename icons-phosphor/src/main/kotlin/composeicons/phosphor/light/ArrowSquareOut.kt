package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorLightIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 104c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-49.51l-69.75 69.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L201.51 46h-49.51c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM184 130c-3.314 0-6 2.686-6 6v72c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-72C40.268 66 34 72.268 34 80v128c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-72c0-3.314-2.686-6-6-6Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
