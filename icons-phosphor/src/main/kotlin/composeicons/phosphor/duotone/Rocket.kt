package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorDuotoneIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94.81 192 65.36 214.24c-2.156 1.727-5.051 2.219-7.657 1.301-2.606-.917-4.554-3.114-5.153-5.811L40.19 154.1c-.54-2.42 .073-4.954 1.66-6.86L72.16 110.91C71 134.25 76.7 161.43 94.81 192ZM214.15 147.24 183.84 110.91c1.21 23.34-4.54 50.52-22.65 81.09l29.45 22.24c2.156 1.727 5.051 2.219 7.657 1.301 2.606-.917 4.554-3.114 5.153-5.811l12.36-55.63c.54-2.42-.073-4.954-1.66-6.86Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M152 224c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM128 112c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM223.62 155.83l-12.36 55.63c-1.192 5.37-5.059 9.751-10.239 11.601-5.18 1.85-10.947 .909-15.271-2.491L158.51 200h-61L70.25 220.57c-4.324 3.4-10.091 4.341-15.271 2.491-5.18-1.85-9.047-6.231-10.239-11.601L32.38 155.83c-1.062-4.837 .162-9.895 3.32-13.71L64.26 107.86c.959-12.591 3.849-24.959 8.57-36.67 12.9-32.34 36-52.63 45.37-59.85 5.769-4.47 13.831-4.47 19.6 0 9.34 7.22 32.47 27.51 45.37 59.85 4.721 11.711 7.611 24.079 8.57 36.67l28.56 34.26c3.158 3.815 4.382 8.873 3.32 13.71ZM99.43 184h57.14c21.12-37.54 25.07-73.48 11.74-106.88C156.55 47.64 134.49 29 128 24 121.49 29 99.43 47.64 87.67 77.12 74.36 110.52 78.31 146.46 99.43 184ZM84.43 189.85Q68.28 160.5 64.83 132.16L48 152.36 60.36 208l.18-.13ZM208 152.36 191.17 132.16q-3.42 28.28-19.56 57.69l23.85 18 .18 .13Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
