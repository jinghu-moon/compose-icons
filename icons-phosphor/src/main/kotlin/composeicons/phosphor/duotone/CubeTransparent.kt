package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorDuotoneIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 96v120h-120L40 160v-120h120Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M221.66 90.34h0l-56-56C164.158 32.84 162.122 31.998 160 32h-120c-4.418 0-8 3.582-8 8v120c.001 2.099 .827 4.114 2.3 5.61l56 56h0c1.503 1.528 3.557 2.389 5.7 2.39h120c4.418 0 8-3.582 8-8v-120c.002-2.122-.84-4.158-2.34-5.66ZM168 59.31 196.69 88h-28.69ZM88 196.69 59.31 168h28.69ZM88 152h-40v-92.69L88 99.31ZM59.31 48h92.69v40h-52.69ZM152 104v48h-48v-48ZM104 208v-40h52.69l40 40ZM208 196.69l-40-40v-52.69h40Z"),
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
