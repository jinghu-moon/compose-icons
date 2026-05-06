package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorLightIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 120v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM200 194c-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6ZM224 162h-18v-122c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v122h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM56 162c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM80 130h-18v-90c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v90h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM152 82h-18v-42c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v42h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
