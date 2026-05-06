package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorLightIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 88v88c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-88C194 60.386 171.614 38 144 38 116.386 38 94 60.386 94 88v121.51l37.76-37.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-48 48c-2.343 2.34-6.137 2.34-8.48 0l-48-48c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L82 209.51v-121.51C82 53.758 109.758 26 144 26c34.242 0 62 27.758 62 62Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
