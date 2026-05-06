package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorLightIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.12 142.65c-5.553-4.277-12.785-5.712-19.55-3.88l-45.24 10.4c3.01-7.987 1.909-16.942-2.947-23.962C156.527 118.189 148.535 114 140 114h-50.06c-7.961-.023-15.599 3.143-21.21 8.79L45.52 146h-29.52C8.268 146 2 152.268 2 160v40c0 7.732 6.268 14 14 14h104c.492 0 .983-.06 1.46-.18l64-16c.303-.08 .6-.181 .89-.3L225.17 181l.33-.15c6.978-3.485 11.666-10.321 12.402-18.086 .736-7.765-2.583-15.36-8.782-20.094ZM14 200v-40c0-1.105 .895-2 2-2h26v44h-26c-1.105 0-2-.895-2-2ZM220.28 170l-38.2 16.27L119.26 202h-65.26v-47.51L77.21 131.27c3.369-3.387 7.953-5.284 12.73-5.27h50.06c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14h-28c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c.451 .001 .9-.05 1.34-.15l67-15.41 .24-.06c5.222-1.424 10.678 1.316 12.655 6.354 1.977 5.039-.159 10.758-4.955 13.266ZM164 94c2.447-.001 4.888-.263 7.28-.78 5.019 17.824 23.378 28.354 41.297 23.687 17.919-4.667 28.808-22.815 24.495-40.822C232.759 58.077 214.829 46.832 196.74 50.79 191.98 33.874 175.112 23.372 157.832 26.566c-17.281 3.194-29.28 19.031-27.679 36.531C131.753 80.597 146.427 93.994 164 94ZM226 84c0 12.15-9.85 22-22 22-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22ZM164 38c10.412-.012 19.398 7.295 21.51 17.49-8.814 5.715-14.491 15.183-15.38 25.65-8.259 2.38-17.147-.268-22.758-6.78-5.61-6.511-6.915-15.693-3.341-23.51C147.606 43.034 155.405 38.015 164 38Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
