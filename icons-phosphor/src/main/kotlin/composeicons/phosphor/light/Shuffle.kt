package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorLightIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 179.76c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L217.52 190h-16.58c-22.613-.013-43.834-10.925-57-29.31L102.23 102.29C91.336 87.069 73.778 78.027 55.06 78h-23.06c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h23.06c22.613 .013 43.834 10.925 57 29.31l41.71 58.4c10.894 15.221 28.452 24.263 47.17 24.29h16.58L203.76 164.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147ZM144.18 105.35c1.012 .732 2.231 1.124 3.48 1.12 1.94 .003 3.762-.932 4.89-2.51l1.19-1.67C164.64 87.06 182.212 78.018 200.94 78h16.58L203.76 91.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l24-24c2.34-2.343 2.34-6.137 0-8.48l-24-24c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L217.52 66h-16.58c-22.613 .013-43.834 10.925-57 29.31L142.78 97c-1.911 2.694-1.286 6.427 1.4 8.35ZM111.82 150.65c-2.695-1.927-6.442-1.305-8.37 1.39l-1.19 1.67C91.36 168.94 73.788 177.982 55.06 178h-23.06c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h23.06c22.613-.013 43.834-10.925 57-29.31l1.19-1.67c.921-1.299 1.288-2.911 1.02-4.481-.268-1.57-1.15-2.969-2.45-3.889Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
