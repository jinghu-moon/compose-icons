package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Farm: ImageVector
    get() {
        if (_farm != null) return _farm!!
        _farm = phosphorLightIcon(
            name = "Farm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 158c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-22.389-.017-44.66 3.234-66.11 9.65-7.459-4.817-15.159-9.25-23.07-13.28C171.29 131.485 201.52 125.936 232 126c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-6 0-12 .22-18 .62v-34.62c0-1.889-.889-3.667-2.4-4.8l-64-48c-2.133-1.6-5.067-1.6-7.2 0L76.4 75.2C74.889 76.333 74 78.111 74 80v38.77C57.523 115.596 40.78 113.999 24 114c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 75.95-.151 147.816 34.37 195.17 93.75 1.14 1.424 2.866 2.252 4.69 2.25 2.304-.005 4.402-1.33 5.398-3.408 .995-2.078 .713-4.543-.728-6.342-5.856-7.305-12.094-14.295-18.69-20.94 7.355-.867 14.754-1.304 22.16-1.31 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-11.129 0-22.237 .934-33.21 2.79q-9.63-8.65-20-16.25C196.191 160.186 214.062 157.99 232 158ZM126 134.56v-32.56h36v21.46c-11.574 3.209-22.912 7.218-33.93 12ZM86 83 144 39.5 202 83v32.71c-9.412 1.066-18.76 2.645-28 4.73v-24.44c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v33.85c-9.166-3.345-18.515-6.17-28-8.46ZM135.17 219.32c-.88 1.326-2.251 2.249-3.812 2.564-1.56 .315-3.182-.003-4.508-.884C96.384 200.729 60.594 189.942 24 190c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 38.956-.062 77.056 11.422 109.49 33 1.326 .88 2.249 2.251 2.564 3.812 .315 1.56-.003 3.182-.884 4.508ZM184.97 211.71c2.367 2.32 2.405 6.118 .085 8.485-2.32 2.367-6.118 2.405-8.485 .085C135.894 180.247 81.072 157.868 24 158c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 60.224-.145 118.076 23.466 161 65.71Z"),
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
        return _farm!!
    }

private var _farm: ImageVector? = null
