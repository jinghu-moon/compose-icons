package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorBoldIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786l7.81 8.59C17.627 89.943 11.647 137.755 31.85 177.23L21 209.66c-2.427 7.201-.563 15.156 4.81 20.53 5.374 5.374 13.328 7.237 20.53 4.81L78.77 224.19c36.164 18.491 79.641 15.146 112.55-8.66l7.8 8.58c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 212c-14.747-.001-29.234-3.888-42-11.27-2.978-1.726-6.555-2.091-9.82-1l-29.79 9.93 9.93-29.79c1.091-3.265 .726-6.842-1-9.82C37.773 139.684 40.938 101.611 63.26 74.56l111.84 123C161.201 206.982 144.792 212.013 128 212ZM236 128c.028 14.574-2.915 29.001-8.65 42.4-2.724 5.882-9.627 8.538-15.591 5.998-5.964-2.54-8.833-9.358-6.479-15.398 12.828-30.216 6.897-65.134-15.189-89.419C168.004 47.297 133.804 38.088 102.51 48 96.229 49.901 89.585 46.404 87.597 40.15 85.609 33.896 89.014 27.204 95.24 25.13c32.825-10.413 68.648-4.559 96.452 15.76C219.496 61.21 235.952 93.563 236 128Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
