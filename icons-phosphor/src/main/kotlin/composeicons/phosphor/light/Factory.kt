package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorLightIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114 176c0 3.314-2.686 6-6 6h-28c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h28c3.314 0 6 2.686 6 6ZM176 170h-28c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h28c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM238 216c0 3.314-2.686 6-6 6h-208c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-122c0-2.273 1.284-4.35 3.317-5.367 2.033-1.016 4.465-.797 6.283 .567L98 124v-36c0-2.273 1.284-4.35 3.317-5.367 2.033-1.016 4.465-.797 6.283 .567L149 114.28 161 30.02c1.022-6.874 6.91-11.972 13.86-12h18.12c6.95 .028 12.838 5.126 13.86 12l15 105.13c0 0 .06 .59 .06 .85v74h10c1.609-.027 3.161 .593 4.307 1.722 1.147 1.128 1.793 2.67 1.793 4.278ZM160 122.49 170 130h39.08L195 31.72c-.141-.994-.996-1.73-2-1.72h-18.06c-1.004-.01-1.859 .726-2 1.72ZM46 210h164v-68h-42c-1.298 0-2.561-.421-3.6-1.2L150 130h0L110 100v36c0 2.273-1.284 4.35-3.317 5.367-2.033 1.016-4.465 .797-6.283-.567L46 100Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
