package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorBoldIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM108 80c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM184 120c0 6.627-5.373 12-12 12h-32v.51l26.12 41.05c3.554 5.59 1.907 13.002-3.68 16.56-1.92 1.235-4.157 1.888-6.44 1.88-4.105 .002-7.927-2.096-10.13-5.56L128 158.35l-17.88 28.09c-3.64 5.382-10.901 6.89-16.383 3.402-5.481-3.488-7.191-10.705-3.857-16.282L116 132.51v-.51h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h88c6.627 0 12 5.373 12 12Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
