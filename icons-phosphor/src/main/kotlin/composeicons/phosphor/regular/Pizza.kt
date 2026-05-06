package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorRegularIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.54 63c-.996-4.137-3.607-7.702-7.25-9.9C168.173 14.314 87.827 14.314 23.71 53.1c-3.632 2.203-6.239 5.76-7.247 9.887-1.007 4.127-.332 8.485 1.877 12.113l96 157.27c2.901 4.782 8.087 7.702 13.68 7.702 5.593 0 10.779-2.92 13.68-7.702l96-157.27c2.212-3.623 2.875-7.983 1.84-12.1ZM63.59 118.5c7.113-6.703 17.58-8.423 26.464-4.35 8.884 4.074 14.41 13.128 13.972 22.891-.438 9.764-6.753 18.286-15.966 21.548ZM151.51 185.45c-8.257-7.786-9.932-20.291-4.014-29.975 5.917-9.684 17.809-13.9 28.504-10.105ZM184.44 131.52c-18.401-8.352-40.141-1.668-50.671 15.578-10.531 17.247-6.544 39.639 9.291 52.192L128 224 96.5 172.43c14.117-6.361 23.294-20.299 23.561-35.78 .266-15.482-8.426-29.726-22.316-36.57C83.855 93.237 67.263 95.025 55.15 104.67L48.8 94.26c48.625-29.682 109.765-29.682 158.39 0ZM215.54 80.59C161.785 47.804 94.215 47.804 40.46 80.59L32 66.77c59.029-35.675 132.971-35.675 192 0Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
