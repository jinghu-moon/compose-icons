package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorLightIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 48v160c0 7.732-6.268 14-14 14h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c1.105 0 2-.895 2-2v-160c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96C34 40.268 40.268 34 48 34h160c7.732 0 14 6.268 14 14ZM115.76 155.76 64 207.51 44.24 187.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l24 24c2.343 2.34 6.137 2.34 8.48 0l56-56c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
