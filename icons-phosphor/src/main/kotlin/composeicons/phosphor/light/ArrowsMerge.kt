package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorLightIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 40v64c-.001 1.591-.634 3.116-1.76 4.24L134 162.49v55l21.76-21.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 217.51v-55L67.76 108.24C66.634 107.116 66.001 105.591 66 104v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v61.51l50 50 50-50v-61.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
