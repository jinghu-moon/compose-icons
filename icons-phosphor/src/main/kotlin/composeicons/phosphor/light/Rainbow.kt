package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorLightIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 168v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-23.196-18.804-42-42-42-23.196 0-42 18.804-42 42v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-29.823 24.177-54 54-54 29.823 0 54 24.177 54 54ZM128 82c-47.474 .055-85.945 38.526-86 86v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16C54 127.131 87.131 94 128 94c40.869 0 74 33.131 74 74v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16C213.945 120.526 175.474 82.055 128 82ZM128 50C62.86 50.072 10.072 102.86 10 168v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16C22 109.458 69.458 62 128 62c58.542 0 106 47.458 106 106v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16C245.928 102.86 193.14 50.072 128 50Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
