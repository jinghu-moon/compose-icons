package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorDuotoneIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v112h-36.69c-2.122-.002-4.158 .84-5.66 2.34l-19.31 19.32c-1.502 1.5-3.538 2.342-5.66 2.34h-41.37c-2.122 .002-4.158-.84-5.66-2.34L82.34 162.34C80.838 160.84 78.802 159.998 76.68 160h-36.68v-112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 48v104h-28.7c-4.242-.011-8.312 1.678-11.3 4.69L148.69 176h-41.38L88 156.69C85.01 153.676 80.936 151.986 76.69 152h-28.69v-104ZM208 208h-160v-40h28.69L96 187.31c2.99 3.014 7.064 4.704 11.31 4.69h41.38c4.246 .014 8.32-1.676 11.31-4.69L179.31 168h28.69v40ZM90.34 109.66C88.838 108.159 87.994 106.123 87.994 104c0-2.123 .844-4.159 2.346-5.66l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32 32c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L136 91.31v60.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-60.69l-18.34 18.35c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
