package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorRegularIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.62 123.51c1.492 2.198 1.795 4.993 .81 7.46l-16 40c-1.649 4.103-6.312 6.094-10.415 4.445-4.103-1.649-6.094-6.312-4.445-10.415l11.61-29h-20.18c-2.663 .005-5.153-1.316-6.643-3.522-1.49-2.206-1.785-5.01-.787-7.478l16-40c1.657-4.103 6.327-6.087 10.43-4.43 4.103 1.657 6.087 6.327 4.43 10.43l-11.61 29h20.18c2.652 0 5.132 1.315 6.62 3.51ZM248 86.63v81.37c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24v-40c0-4.418-3.582-8-8-8h-16v88h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-152C48 42.745 58.745 32 72 32h80c13.255 0 24 10.745 24 24v48h16c13.255 0 24 10.745 24 24v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-81.37c-.006-2.112-.847-4.136-2.34-5.63L210.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L241 69.66c4.504 4.496 7.024 10.606 7 16.97ZM160 208v-152c0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8v152Z"),
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
