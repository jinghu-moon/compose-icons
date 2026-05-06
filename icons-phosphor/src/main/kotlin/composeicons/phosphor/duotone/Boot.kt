package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorDuotoneIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 168C41.22 135.94 44 79.35 32 48h112c4.418 0 8 3.582 8 8v64h40c26.51 0 48 21.49 48 48Z"),
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
                pathData = parseSvgPathData("M192 112h-32v-56c0-8.837-7.163-16-16-16h-112c-2.633 0-5.098 1.297-6.59 3.466-1.492 2.17-1.821 4.935-.88 7.394 11.06 28.84 8.76 83.71-.22 114.93-.203 .719-.307 1.463-.31 2.21v32c0 8.837 7.163 16 16 16h26.11c2.486 0 4.937-.578 7.16-1.69L85.89 208h16.22l12.62 6.31c2.223 1.112 4.674 1.69 7.16 1.69h28.22c2.486 0 4.937-.578 7.16-1.69L169.89 208h16.22l12.62 6.31c2.223 1.112 4.674 1.69 7.16 1.69h26.11c8.837 0 16-7.163 16-16v-32c-.033-30.914-25.086-55.967-56-56ZM144 56v24h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v16h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c19.001 .023 35.373 13.388 39.2 32h-188.95c6.74-30.84 8.16-74.17 .61-104ZM205.89 200l-12.62-6.31c-2.223-1.112-4.674-1.69-7.16-1.69h-16.22c-2.486-0-4.937 .578-7.16 1.69L150.11 200h-28.22l-12.62-6.31c-2.223-1.112-4.674-1.69-7.16-1.69h-16.22c-2.486-0-4.937 .578-7.16 1.69L66.11 200h-26.11v-24h192v24Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
