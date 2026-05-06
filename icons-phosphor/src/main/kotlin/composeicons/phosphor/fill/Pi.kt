package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorFillIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM172 168c6.627 0 12-5.373 12-12 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28v-60h-32v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80h-8C74.745 96 64 106.745 64 120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C48 97.909 65.909 80 88 80h104c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32v60c0 6.627 5.373 12 12 12Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
