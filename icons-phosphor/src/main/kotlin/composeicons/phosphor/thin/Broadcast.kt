package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorThinIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C164 108.118 147.882 92 128 92ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM204 128c.026 18.7-6.866 36.748-19.35 50.67-1.475 1.657-4.013 1.805-5.67 .33-1.657-1.475-1.805-4.013-.33-5.67 23.12-25.798 23.12-64.862 0-90.66-1.475-1.657-1.327-4.195 .33-5.67 1.657-1.475 4.195-1.327 5.67 .33C197.134 91.252 204.026 109.3 204 128ZM65.34 101.53c-10.246 24.237-5.571 52.212 12 71.8 1.475 1.657 1.327 4.195-.33 5.67-1.657 1.475-4.195 1.327-5.67-.33C45.5 149.832 45.5 106.168 71.34 77.33c1.475-1.657 4.013-1.805 5.67-.33 1.657 1.475 1.805 4.013 .33 5.67-5.013 5.582-9.068 11.954-12 18.86ZM244 128c.034 30.36-11.868 59.517-33.14 81.18-1.546 1.58-4.08 1.606-5.66 .06-1.58-1.546-1.606-4.08-.06-5.66 41.196-41.966 41.196-109.194 0-151.16-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06C232.132 68.483 244.034 97.64 244 128ZM50.86 203.58c1.546 1.58 1.52 4.114-.06 5.66-1.58 1.546-4.114 1.52-5.66-.06C.906 164.099 .906 91.901 45.14 46.82c1.546-1.58 4.08-1.606 5.66-.06 1.58 1.546 1.606 4.08 .06 5.66C9.664 94.386 9.664 161.614 50.86 203.58Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
