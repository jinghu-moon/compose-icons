package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorLightIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.24 180.24l-48 48c-2.343 2.34-6.137 2.34-8.48 0l-48-48c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L162 209.51v-121.51C162 60.386 139.614 38 112 38 84.386 38 62 60.386 62 88v88c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-88C50 53.758 77.758 26 112 26c34.242 0 62 27.758 62 62v121.51l37.76-37.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
