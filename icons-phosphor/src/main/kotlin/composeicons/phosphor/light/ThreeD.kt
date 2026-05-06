package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorLightIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98 148C98 135.85 88.15 126 76 126c-2.238 .002-4.291-1.242-5.325-3.227-1.034-1.984-.878-4.38 .405-6.213L92.48 86h-36.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c2.238-.002 4.291 1.242 5.325 3.227 1.034 1.984 .878 4.38-.405 6.213L86.39 115.62c13.455 4.322 22.833 16.516 23.557 30.629 .724 14.113-7.358 27.203-20.3 32.879-12.942 5.676-28.045 2.754-37.937-7.338-2.317-2.369-2.274-6.168 .095-8.485 2.369-2.317 6.168-2.274 8.485 .095 6.257 6.382 15.753 8.345 24.028 4.966C92.592 164.987 98 156.938 98 148ZM160 74c29.823 0 54 24.177 54 54 0 29.823-24.177 54-54 54h-24c-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6ZM160 86h-18v84h18c23.196 0 42-18.804 42-42C202 104.804 183.196 86 160 86ZM32 54h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-192c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM224 202h-192c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
