package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandArrowUp: ImageVector
    get() {
        if (_handArrowUp != null) return _handArrowUp!!
        _handArrowUp = phosphorLightIcon(
            name = "HandArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.12 142.65c-5.553-4.277-12.785-5.712-19.55-3.88l-45.24 10.4c3.01-7.987 1.909-16.942-2.947-23.962C156.527 118.189 148.535 114 140 114h-50.06c-7.961-.023-15.599 3.143-21.21 8.79L45.52 146h-29.52C8.268 146 2 152.268 2 160v40c0 7.732 6.268 14 14 14h104c.492 0 .983-.06 1.46-.18l64-16c.303-.08 .6-.181 .89-.3L225.17 181c.113-.042 .224-.092 .33-.15 6.978-3.485 11.666-10.321 12.402-18.086 .736-7.765-2.583-15.36-8.782-20.094ZM14 200v-40c0-1.105 .895-2 2-2h26v44h-26c-1.105 0-2-.895-2-2ZM220.28 170l-38.2 16.27L119.26 202h-65.26v-47.51L77.21 131.27c3.369-3.387 7.953-5.284 12.73-5.27h50.06c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14h-28c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c.451 .001 .9-.05 1.34-.15l67-15.41 .24-.06c5.222-1.424 10.678 1.316 12.655 6.354 1.977 5.039-.159 10.758-4.955 13.266ZM155.76 60.24c-2.34-2.343-2.34-6.137 0-8.48l32-32c2.343-2.34 6.137-2.34 8.48 0l32 32c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L198 38.49v65.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-65.51L164.24 60.24c-2.343 2.34-6.137 2.34-8.48 0Z"),
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
        return _handArrowUp!!
    }

private var _handArrowUp: ImageVector? = null
