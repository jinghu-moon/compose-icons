package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorThinIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 84.2 171.8 23.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L99.45 79.07c-8.08-3-32.79-9.45-59 11.67-2.662 2.131-4.291 5.293-4.482 8.697-.191 3.404 1.075 6.729 3.482 9.143l51.13 51.13L45.17 205.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L96.29 165.36l51.12 51.12c2.251 2.254 5.305 3.52 8.49 3.52 .28 0 .57 0 .85 0 3.458-.245 6.641-1.973 8.73-4.74 19.83-26.36 16.51-47.18 11.71-58.57l55.3-55.49c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM226.83 95.51h0L169.56 153c-1.214 1.216-1.516 3.072-.75 4.61 10.43 20.85-1.62 42-9.73 52.83-.7 .914-1.76 1.482-2.909 1.559-1.149 .077-2.275-.346-3.091-1.159L45.17 102.93c-.821-.806-1.256-1.926-1.192-3.075 .063-1.149 .618-2.215 1.522-2.925C58.44 86.53 70.86 83.74 80.44 83.74c6.243-.092 12.434 1.149 18.16 3.64 1.541 .771 3.402 .469 4.62-.75L160.49 29.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l60.68 60.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
