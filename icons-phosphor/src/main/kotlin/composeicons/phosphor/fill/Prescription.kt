package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorFillIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 120h-32v-48h32c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM189.66 186.34 175.31 172l14.35-14.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L164 160.69l-26-26c19.426-5.097 32.061-23.809 29.529-43.733C164.997 71.033 148.084 56.076 128 56h-40c-4.418 0-8 3.582-8 8v112c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h20.69l36 36-14.35 14.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L164 183.31l14.34 14.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
