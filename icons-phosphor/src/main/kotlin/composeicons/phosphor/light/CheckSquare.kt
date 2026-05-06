package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorLightIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.24 99.76c2.34 2.343 2.34 6.137 0 8.48l-56 56c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L112 151.51 163.76 99.76c2.343-2.34 6.137-2.34 8.48 0ZM222 48v160c0 7.732-6.268 14-14 14h-160c-7.732 0-14-6.268-14-14v-160C34 40.268 40.268 34 48 34h160c7.732 0 14 6.268 14 14ZM210 48c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v160c0 1.105 .895 2 2 2h160c1.105 0 2-.895 2-2Z"),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
