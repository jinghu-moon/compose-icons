package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorLightIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.63 48c-.182-3.031-2.599-5.448-5.63-5.63-51-3-91.88 12.42-109.35 41.26-11.63 19.21-11.38 42.68 .53 65-7.636 8.742-12.959 19.259-15.48 30.59L95.9 159.41c8.15-16.1 8.1-32.95-.32-46.85C82.77 91.41 53 80.07 15.9 82.27c-3.034 .182-5.453 2.605-5.63 5.64C8.09 125 19.41 154.77 40.56 167.58c6.888 4.21 14.807 6.432 22.88 6.42 8.36-.085 16.583-2.141 24-6L114 194.48v29.52c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-29.49c-.04-13.745 4.841-27.051 13.76-37.51 11.21 5.93 22.72 8.91 33.82 8.91 10.857 .036 21.513-2.93 30.79-8.57C233.21 139.89 248.63 99 245.63 48ZM46.78 157.31C30.47 147.44 21.39 124 22 94c30-.65 53.41 8.44 63.28 24.75 5.68 9.37 6.16 20.38 1.54 31.59L60.24 123.75c-2.344-2.344-6.146-2.344-8.49 0-2.344 2.344-2.344 6.146 0 8.49l26.62 26.61C67.16 163.47 56.15 163 46.78 157.31ZM198.16 147.09c-14.74 8.92-32.14 9.18-49.67 .9L204.25 92.24c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0L140 139.51c-8.28-17.53-8-34.93 .9-49.66 14.52-24 49.06-37.18 93-35.75 1.43 43.9-11.76 78.46-35.74 92.99Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
