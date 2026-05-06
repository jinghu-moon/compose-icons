package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorLightIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.12 142.65c-5.553-4.277-12.785-5.712-19.55-3.88l-4.32 1C227 119.55 238 99.51 238 80 238 54.64 217.61 34 192.54 34 178.205 33.91 164.665 40.58 156 52 147.335 40.58 133.795 33.91 119.46 34 94.39 34 74 54.64 74 80c0 11.38 3.63 22.49 11.29 34.36-6.279 .968-12.083 3.923-16.56 8.43L45.52 146h-29.52C8.268 146 2 152.268 2 160v40c0 7.732 6.268 14 14 14h104c.492 0 .983-.06 1.46-.18l64-16c.303-.08 .6-.181 .89-.3L225.17 181l.33-.15c6.978-3.485 11.666-10.321 12.402-18.086 .736-7.765-2.583-15.36-8.782-20.094ZM119.46 46c13.498-.18 25.758 7.84 31 20.28 .925 2.251 3.117 3.72 5.55 3.72 2.433 0 4.625-1.469 5.55-3.72 5.242-12.44 17.502-20.46 31-20.28C210.68 46 226 61.57 226 80c0 20.24-16.18 43-46.8 65.75l-14.87 3.42c3.01-7.987 1.909-16.942-2.947-23.962C156.527 118.189 148.535 114 140 114h-40.33C90.36 101.67 86 90.81 86 80 86 61.57 101.32 46 119.46 46ZM14 200v-40c0-1.105 .895-2 2-2h26v44h-26c-1.105 0-2-.895-2-2ZM220.28 170l-38.2 16.27L119.26 202h-65.26v-47.51L77.21 131.27c3.369-3.387 7.953-5.284 12.73-5.27h50.06c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14h-28c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c.451 .001 .9-.05 1.34-.15l67-15.41 .24-.06c5.222-1.424 10.678 1.316 12.655 6.354 1.977 5.039-.159 10.758-4.955 13.266Z"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
