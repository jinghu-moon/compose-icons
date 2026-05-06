package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorLightIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157 187.32c-.882 1.325-2.254 2.245-3.814 2.558-1.56 .313-3.181-.006-4.506-.888-6.67-4.43-12.19-7-20.68-7-8.49 0-14 2.56-20.68 7-2.761 1.834-6.486 1.081-8.32-1.68-1.834-2.761-1.081-6.486 1.68-8.32 8.13-5.4 15.88-9 27.32-9 11.44 0 19.19 3.6 27.32 9 1.329 .88 2.254 2.253 2.569 3.816 .315 1.563-.005 3.187-.889 4.514ZM179.53 116c-3.06 3.42-9.74 6-15.53 6-5.79 0-12.47-2.58-15.53-6-1.414-1.655-3.613-2.415-5.746-1.985-2.134 .43-3.867 1.981-4.531 4.054-.663 2.073-.151 4.343 1.337 5.931 5.35 6 15.19 10 24.47 10 9.28 0 19.12-4 24.47-10 1.488-1.588 2-3.858 1.337-5.931-.663-2.073-2.397-3.625-4.531-4.054-2.134-.43-4.333 .33-5.746 1.985ZM222 48v55.77c0 35.45-9.53 68.86-26.83 94.06C177.4 223.74 153.54 238 128 238 102.46 238 78.6 223.74 60.83 197.84 43.53 172.64 34 139.23 34 103.78v-55.78c.018-4.61 2.303-8.915 6.111-11.512C43.919 33.89 48.762 33.334 53.06 35 67.25 40.46 95.86 49.7 128 49.7c32.14 0 60.75-9.24 74.94-14.7 4.298-1.666 9.141-1.11 12.949 1.488 3.808 2.597 6.094 6.903 6.111 11.512ZM210 48c.001-.66-.323-1.278-.867-1.652-.544-.374-1.237-.455-1.853-.218C192.31 52 162.1 61.7 128 61.7 93.9 61.7 63.69 52 48.72 46.14c-.614-.239-1.306-.16-1.85 .21-.544 .373-.87 .99-.87 1.65v55.76C46 171.17 82.79 226 128 226c45.21 0 82-54.83 82-122.22ZM116.47 124c1.488-1.588 2-3.858 1.337-5.931-.663-2.073-2.397-3.625-4.531-4.054-2.134-.43-4.333 .33-5.746 1.985-3.06 3.42-9.74 6-15.53 6-5.79 0-12.47-2.58-15.53-6-2.229-2.379-5.95-2.542-8.379-.368-2.429 2.174-2.678 5.89-.561 8.368 5.35 6 15.19 10 24.47 10 9.28 0 19.12-4 24.47-10Z"),
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
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
