package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorLightIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 26h-128C59.85 26 50 35.85 50 48v168c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-168c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-104C222 35.85 212.15 26 200 26ZM72 38h108.41c-1.588 3.094-2.414 6.522-2.41 10v138h-116v-138C62 42.477 66.477 38 72 38ZM176 218h-112c-1.105 0-2-.895-2-2v-18h116v18c0 1.105-.895 2-2 2Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
