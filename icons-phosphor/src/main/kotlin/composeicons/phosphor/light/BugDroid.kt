package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorLightIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M189 51.47 204.22 36.24c1.605-1.496 2.266-3.748 1.723-5.874-.543-2.126-2.203-3.786-4.329-4.329-2.126-.543-4.379 .118-5.874 1.723L180 43.54C149.288 20.122 106.712 20.122 76 43.54L60.24 27.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L67 51.47C50.982 67.541 41.992 89.309 42 112v40c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86v-40c.008-22.691-8.982-44.459-25-60.53ZM128 38c40.849 .05 73.95 33.151 74 74v10h-148v-10C54.05 71.151 87.151 38.05 128 38ZM128 226C87.151 225.95 54.05 192.849 54 152v-18h148v18c-.05 40.849-33.151 73.95-74 74ZM146 92c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM90 92c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C94.477 102 90 97.523 90 92Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
