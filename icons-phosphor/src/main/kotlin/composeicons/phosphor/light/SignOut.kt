package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorLightIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118 216c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6v-176c0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-58v164h58c3.314 0 6 2.686 6 6ZM228.24 123.76l-40-40c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L209.51 122h-97.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h97.51l-29.75 29.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l40-40c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
