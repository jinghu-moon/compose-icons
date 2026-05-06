package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorLightIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.24 91.75 164 35.56C162.908 34.559 161.481 34.002 160 34h-120c-3.314 0-6 2.686-6 6v120c-.001 1.594 .632 3.123 1.76 4.25l56 56c1.126 1.122 2.651 1.751 4.24 1.75h120c3.314 0 6-2.686 6-6v-120c.001-1.594-.632-3.123-1.76-4.25ZM166 54.48 201.52 90h-35.52ZM90 201.48 54.48 166h35.52ZM90 154h-44v-99.52L90 98.48ZM54.48 46h99.52v44h-55.52ZM154 102v52h-52v-52ZM102 210v-44h55.52l44 44ZM210 201.52l-44-44v-55.52h44Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
