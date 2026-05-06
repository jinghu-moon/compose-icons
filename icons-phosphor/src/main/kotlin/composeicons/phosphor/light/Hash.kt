package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorLightIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 90h-51l8.89-48.93c.468-2.144-.272-4.372-1.929-5.81-1.657-1.438-3.967-1.857-6.024-1.092-2.057 .765-3.532 2.591-3.847 4.763L160.81 90h-51.81l8.89-48.93c.464-3.198-1.688-6.188-4.867-6.765-3.179-.577-6.244 1.468-6.933 4.625L96.81 90h-48.81c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h46.63l-9.46 52h-53.17c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h51l-8.9 48.93c-.292 1.569 .054 3.19 .961 4.504 .906 1.314 2.299 2.212 3.869 2.496 .354 .057 .712 .081 1.07 .07 2.896-.007 5.374-2.081 5.89-4.93L95.19 166h51.81l-8.89 48.93c-.292 1.569 .054 3.19 .961 4.504 .906 1.314 2.299 2.212 3.869 2.496 .356 .068 .718 .101 1.08 .1 2.896-.007 5.374-2.081 5.89-4.93L159.19 166h48.81c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-46.63l9.46-52h53.17c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM149.17 154h-51.8l9.46-52h51.8Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
