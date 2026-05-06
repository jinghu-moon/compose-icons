package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = phosphorBoldIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 208c0 6.627-5.373 12-12 12h-48C30 219.993 20.762 214.654 15.765 205.992 10.768 197.33 10.77 186.66 15.77 178L45.22 127.12l-4.76 1.27c-4.175 1.21-8.677 .068-11.771-2.986-3.093-3.054-4.294-7.541-3.138-11.731 1.156-4.19 4.487-7.427 8.708-8.463L67.03 96.44c6.398-1.711 12.972 2.084 14.69 8.48l8.79 32.77c1.252 4.185 .13 8.72-2.928 11.839-3.058 3.119-7.57 4.33-11.779 3.162-4.209-1.168-7.451-4.532-8.463-8.781L66.08 139 36.58 190c-.711 1.231-.715 2.746-.011 3.981 .704 1.235 2.01 2.003 3.431 2.019h48c6.627 0 12 5.373 12 12ZM128 36c1.435-.026 2.767 .743 3.46 2l29.45 50.87-4.75-1.27c-4.2-1.279-8.762-.163-11.897 2.91-3.135 3.073-4.341 7.613-3.146 11.837 1.196 4.224 4.602 7.458 8.883 8.433l32.77 8.79c6.398 1.711 12.972-2.084 14.69-8.48l8.74-32.79c1.718-6.407-2.083-12.992-8.49-14.71C191.303 61.872 184.718 65.674 183 72.08l-1.31 4.86L152.23 26C147.223 17.355 137.99 12.032 128 12.032c-9.99 0-19.223 5.323-24.23 13.968L80.61 66c-2.313 3.719-2.416 8.404-.268 12.221 2.148 3.817 6.205 6.161 10.585 6.115 4.38-.046 8.387-2.475 10.454-6.337L124.54 38c.693-1.257 2.025-2.026 3.46-2ZM240.19 178 217.05 138c-2.067-3.862-6.074-6.291-10.454-6.337-4.38-.046-8.437 2.298-10.585 6.115-2.148 3.817-2.045 8.502 .268 12.221l23.14 40c.714 1.237 .715 2.761 .001 3.998-.714 1.237-2.033 2-3.461 2.002h-58.96l3.51-3.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-24 24c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l24 24c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L157 220h59c10-.007 19.238-5.346 24.235-14.008 4.997-8.662 4.995-19.332-.005-27.992Z"),
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
        return _recycle!!
    }

private var _recycle: ImageVector? = null
