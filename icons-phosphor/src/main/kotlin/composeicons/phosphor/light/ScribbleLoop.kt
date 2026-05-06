package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorLightIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.45 156c-1.32-1.46-24.27-26.42-61.37-40.5-1.5-18.49-8.13-35.31-19-48C157.74 50.8 137 42 112 42 61.49 42 28.5 87.38 27.12 89.31c-1.933 2.695-1.315 6.447 1.38 8.38 2.695 1.933 6.447 1.315 8.38-1.38C37.18 95.87 67.75 54 112 54c21.37 0 39 7.35 50.93 21.27 8.26 9.62 13.64 22.14 15.62 36.06-12.359-3.525-25.148-5.319-38-5.33-25.58 0-47 6.65-62 19.22-13.1 11-20.62 26.34-20.62 42-.12 12.219 4.663 23.976 13.28 32.64C80.56 209.12 93.47 214 108.6 214c51.73 0 80.55-43.09 82.68-85.38 32.05 13.49 52 35.09 52.27 35.4 2.267 2.174 5.828 2.232 8.164 .132 2.336-2.1 2.657-5.646 .736-8.132ZM161 177.53C151.92 188.69 135.44 202 108.6 202 90 202 70 191.12 70 167.25 70 143.53 92.09 118 140.6 118c13.178 .044 26.269 2.142 38.8 6.22-.14 19.72-6.82 39.12-18.4 53.31Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
