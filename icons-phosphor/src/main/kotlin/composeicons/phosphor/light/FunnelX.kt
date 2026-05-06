package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorLightIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.79 50.34C226.587 45.245 221.551 41.961 216 42h-176c-5.537 .011-10.548 3.284-12.783 8.35-2.235 5.066-1.273 10.974 2.453 15.07l.06 .06L98 138.38v77.62c.005 5.16 2.847 9.898 7.396 12.332 4.55 2.434 10.069 2.168 14.364-.692l32-21.33c3.897-2.595 6.239-6.967 6.24-11.65v-56.28L226.34 65.38c3.754-4.071 4.718-9.988 2.45-15.04ZM217.53 57.28l-69.9 74.62c-1.044 1.11-1.627 2.576-1.63 4.1v58.66c.002 .671-.332 1.298-.89 1.67l-32 21.33c-.613 .409-1.402 .448-2.052 .101-.65-.347-1.057-1.024-1.058-1.761v-80c-0-1.523-.579-2.988-1.62-4.1L38.53 57.32c-.544-.572-.675-1.421-.33-2.13C38.497 54.46 39.212 53.987 40 54h176c.796-.024 1.523 .451 1.82 1.19 .343 .69 .228 1.52-.29 2.09ZM244.24 211.77c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L216 200.49l-19.75 19.76c-2.347 2.312-6.12 2.299-8.451-.029-2.331-2.328-2.349-6.101-.039-8.451L207.52 192 187.76 172.24c-2.344-2.344-2.344-6.146 0-8.49 2.344-2.344 6.146-2.344 8.49 0L216 183.52l19.76-19.76c2.35-2.309 6.122-2.292 8.451 .039 2.328 2.331 2.341 6.104 .029 8.451L224.49 192Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
