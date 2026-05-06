package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorLightIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 78c14.359 0 26-11.641 26-26C190 37.641 178.359 26 164 26c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26ZM164 38c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM253.16 196.94 198.6 104.86c-2.499-4.254-7.066-6.865-12-6.86h0c-4.935-.009-9.504 2.603-12 6.86l-27.88 47.05-46.56-79C97.644 68.636 93.055 66.012 88.095 66.012c-4.96 0-9.549 2.624-12.065 6.898L2.83 197c-1.069 1.852-1.072 4.134-.007 5.989C3.889 204.843 5.861 205.991 8 206h240c2.156-0 4.146-1.157 5.213-3.031 1.067-1.873 1.047-4.175-.053-6.029ZM86.27 79c.358-.617 1.017-.996 1.73-.996 .713 0 1.372 .38 1.73 .996l25.34 43h-54.14ZM18.5 194 53.86 134h68.29l19.3 32.77h0l16 27.2ZM171.43 194 153.58 163.71 184.83 111c.355-.615 1.01-.996 1.72-1 .714-.011 1.376 .374 1.72 1l49.2 83Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
