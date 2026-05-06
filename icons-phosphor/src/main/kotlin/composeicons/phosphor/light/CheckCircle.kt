package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = phosphorLightIcon(
            name = "CheckCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.24 99.76c2.34 2.343 2.34 6.137 0 8.48l-56 56c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L112 151.51 163.76 99.76c2.343-2.34 6.137-2.34 8.48 0ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.306 .066 101.934 45.694 102 102ZM218 128C218 78.294 177.706 38 128 38 78.294 38 38 78.294 38 128c0 49.706 40.294 90 90 90 49.683-.055 89.945-40.317 90-90Z"),
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
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
