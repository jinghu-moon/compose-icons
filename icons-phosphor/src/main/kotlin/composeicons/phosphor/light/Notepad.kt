package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorLightIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 128c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM160 154h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM214 40v160c0 16.569-13.431 30-30 30h-112C55.431 230 42 216.569 42 200v-160c0-3.314 2.686-6 6-6h26v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h36v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h36v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h26c3.314 0 6 2.686 6 6ZM202 46h-20v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-36v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-36v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-20v154c0 9.941 8.059 18 18 18h112c9.941 0 18-8.059 18-18Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
