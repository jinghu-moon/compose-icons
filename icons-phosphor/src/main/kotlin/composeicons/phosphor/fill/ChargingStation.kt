package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorFillIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241 69.66 221.66 50.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L229.66 81c1.493 1.494 2.334 3.518 2.34 5.63v81.37c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40c0-13.255-10.745-24-24-24h-16v-48C176 42.745 165.255 32 152 32h-80C58.745 32 48 42.745 48 56v152h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-88h16c4.418 0 8 3.582 8 8v40c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24v-81.37c.024-6.364-2.496-12.474-7-16.97ZM135.43 131l-16 40c-1.657 4.103-6.327 6.087-10.43 4.43-4.103-1.657-6.087-6.327-4.43-10.43l11.61-29h-20.18c-2.663 .005-5.153-1.316-6.643-3.522-1.49-2.206-1.785-5.01-.787-7.478l16-40c1.657-4.103 6.327-6.087 10.43-4.43 4.103 1.657 6.087 6.327 4.43 10.43l-11.61 29h20.18c2.663-.005 5.153 1.316 6.643 3.522 1.49 2.206 1.785 5.01 .787 7.478Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
