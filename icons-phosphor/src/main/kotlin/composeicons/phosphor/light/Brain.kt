package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorLightIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 124C245.973 102.692 233.446 83.382 214 74.67v-2.67C213.979 51.128 199.908 32.885 179.725 27.565 159.542 22.245 138.307 31.18 128 49.33 117.693 31.18 96.458 22.245 76.275 27.565 56.092 32.885 42.021 51.128 42 72v2.67C22.536 83.353 10.001 102.672 10.001 123.985c0 21.313 12.536 40.632 31.999 49.315v2.7c.021 20.872 14.092 39.115 34.275 44.435 20.183 5.32 41.418-3.615 51.725-21.765 10.307 18.15 31.542 27.085 51.725 21.765C199.908 215.115 213.979 196.872 214 176v-2.7c19.447-8.695 31.976-27.998 32-49.3ZM88 210C69.629 210.009 54.573 195.422 54 177.06c3.297 .625 6.645 .94 10 .94h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-8C43.531 166.017 26.031 151.275 22.571 131.101 19.11 110.927 30.696 91.196 50 84.39c2.398-.848 4.001-3.116 4-5.66v-6.73C54 53.222 69.222 38 88 38c18.778 0 34 15.222 34 34v73.05C113.298 135.461 100.949 129.995 88 130c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM192 166h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c3.355-0 6.703-.315 10-.94-.581 18.629-16.051 33.317-34.685 32.933-18.634-.384-33.485-15.698-33.297-34.335C134.206 157.021 149.362 142.009 168 142c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-12.949-.005-25.298 5.461-34 15.05v-73.05c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34v6.73c-.001 2.544 1.602 4.812 4 5.66 19.304 6.806 30.89 26.537 27.429 46.711C229.969 151.275 212.469 166.017 192 166ZM206 112c0 3.314-2.686 6-6 6h-4c-18.778 0-34-15.222-34-34v-4c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v4c0 12.15 9.85 22 22 22h4c3.314 0 6 2.686 6 6ZM60 118h-4c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h4c12.15 0 22-9.85 22-22v-4c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v4c0 18.778-15.222 34-34 34Z"),
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
        return _brain!!
    }

private var _brain: ImageVector? = null
