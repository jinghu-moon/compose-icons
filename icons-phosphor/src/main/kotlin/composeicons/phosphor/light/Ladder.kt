package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorLightIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.64 214 162.38 73l9.82-27h11.8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h7.43L34.36 214c-1.095 3.114 .531 6.528 3.64 7.64 .642 .23 1.318 .352 2 .36 2.524 0 4.778-1.578 5.64-3.95L55.84 190h51.23l-8.71 24c-.544 1.496-.471 3.146 .202 4.589 .673 1.442 1.892 2.558 3.388 3.101 .642 .23 1.318 .352 2 .36 2.524 0 4.778-1.578 5.64-3.95L128.57 166h54.86l18.93 52.05c.862 2.372 3.116 3.95 5.64 3.95 .699-.003 1.392-.124 2.05-.36 3.089-1.132 4.69-4.54 3.59-7.64ZM128.89 130h-51.23L90.75 94h51.25ZM159.43 46 146.34 82h-51.23L108.2 46ZM60.2 178 73.29 142h51.23l-13.09 36ZM132.93 154 156 90.56 179.07 154Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
