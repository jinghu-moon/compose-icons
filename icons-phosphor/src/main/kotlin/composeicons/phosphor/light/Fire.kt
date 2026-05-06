package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorLightIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.92 153c-4.098 22.898-22.022 40.822-44.92 44.92-.331 .051-.665 .077-1 .08-3.128 .012-5.741-2.381-6.003-5.498-.262-3.117 1.916-5.913 5.003-6.422 17.38-2.92 32.13-17.68 35.08-35.08 .552-3.27 3.65-5.472 6.92-4.92 3.27 .552 5.472 3.65 4.92 6.92ZM214 144c0 47.496-38.504 86-86 86C80.504 230 42 191.496 42 144 42 116.53 52.85 88.39 74.25 60.36c1.04-1.381 2.624-2.247 4.348-2.375 1.724-.128 3.419 .493 4.652 1.705l26.34 25.56L132.68 21.94c.669-1.833 2.187-3.227 4.071-3.736 1.884-.509 3.898-.071 5.399 1.176C163.72 37.33 214 85.4 214 144ZM202 144C202 95.6 163.35 54.16 140.93 34.2L117.64 98.06c-.696 1.912-2.314 3.341-4.298 3.796-1.984 .455-4.063-.128-5.522-1.546l-28-27.22C62.67 97.13 54 121 54 144c0 40.869 33.131 74 74 74 40.869 0 74-33.131 74-74Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
