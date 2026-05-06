package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorLightIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM218 128c.011 12.34-2.529 24.548-7.46 35.86L163.85 135.15c-1.659-1.043-3.52-1.725-5.46-2l-22.82-3.07c-6.042-.782-11.9 2.415-14.51 7.92h-9.92c-.767-0-1.466-.439-1.8-1.13l-3.8-7.86c-1.871-3.889-5.439-6.692-9.66-7.59L85.17 119.12 94.4 103c.359-.621 1.023-1.003 1.74-1h16.71c2.366 .001 4.692-.601 6.76-1.75l12.25-6.75c.939-.529 1.818-1.159 2.62-1.88L161.39 67.29c4.862-4.363 6.039-11.519 2.83-17.21L161 44.25c34.371 13.594 56.963 46.789 57 83.75ZM144.6 39.54l9.15 16.39c.454 .815 .284 1.836-.41 2.46L126.43 82.72c-.112 .105-.236 .196-.37 .27l-12.25 6.76c-.306 .169-.651 .255-1 .25h-16.67C91.133 89.994 86.504 92.664 84 97L73.18 115.91c-.075-.11-.138-.227-.19-.35L61.5 84.89c-.189-.475-.189-1.005 0-1.48L72.68 57.06C93.025 41.163 119.223 34.781 144.6 39.54ZM38 128C37.985 112.676 41.903 97.606 49.38 84.23c.002 1.664 .303 3.313 .89 4.87l11.49 30.67c1.661 4.472 5.494 7.785 10.16 8.78l21.44 4.6c.604 .131 1.113 .533 1.38 1.09l3.8 7.86c2.351 4.819 7.238 7.883 12.6 7.9h4.56l-8.49 19c-2.277 5.113-1.29 11.091 2.51 15.2l.1 .11 19.68 20.26c.408 .465 .578 1.093 .46 1.7L127.7 218C78.134 217.78 38.055 177.566 38 128ZM140.08 217.19l1.67-8.6c.833-4.374-.454-8.884-3.47-12.16l-.1-.11L118.5 176.06c-.52-.587-.649-1.424-.33-2.14l13.7-30.73c.358-.834 1.232-1.323 2.13-1.19l22.82 3.08c.276 .035 .542 .127 .78 .27L205 174.55c-14.097 23.282-37.954 38.952-64.92 42.64Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
