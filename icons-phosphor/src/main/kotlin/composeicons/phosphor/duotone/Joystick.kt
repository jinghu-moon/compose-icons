package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorDuotoneIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 160v48c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM128 88c17.673 0 32-14.327 32-32C160 38.327 145.673 24 128 24 110.327 24 96 38.327 96 56c0 17.673 14.327 32 32 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 144h-72v-48.81c20.12-4.107 33.861-22.782 31.797-43.212C165.734 31.547 148.535 15.998 128 15.998c-20.535 0-37.734 15.549-39.797 35.98C86.139 72.408 99.88 91.083 120 95.19v48.81h-72c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM104 56c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 80 104 69.255 104 56ZM208 208h-160v-48h160v48ZM168 112h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
