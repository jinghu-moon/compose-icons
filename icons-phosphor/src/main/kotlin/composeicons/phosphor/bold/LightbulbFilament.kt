package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorBoldIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 232c0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12ZM220 104c-.08 29.021-13.78 56.321-37 73.73-1.926 1.505-3.036 3.826-3 6.27 0 11.046-8.954 20-20 20h-64C84.954 204 76 195.046 76 184v-.23c-.037-2.466-1.243-4.767-3.25-6.2C49.692 160.378 36.076 133.332 36 104.57 35.73 54.69 76 13.2 125.79 12c24.781-.595 48.753 8.834 66.487 26.152C210.012 55.47 220.007 79.212 220 104ZM196 104c.005-18.324-7.385-35.875-20.497-48.676C162.392 42.523 144.669 35.555 126.35 36 89.56 36.89 59.8 67.56 60 104.39c.046 21.277 10.118 41.288 27.18 54h0c6.942 5.208 11.483 13.002 12.59 21.61h16.23v-31L87.51 120.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 127l23.51-23.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L140 149v31h16.25c1.066-8.545 5.542-16.296 12.41-21.49C185.936 145.732 196.09 125.488 196 104Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
