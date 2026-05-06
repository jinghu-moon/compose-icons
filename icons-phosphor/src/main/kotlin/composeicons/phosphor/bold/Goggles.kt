package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorBoldIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 60h-104C34.045 60.044 .044 94.045 0 136v4c.002 9.278 5.352 17.724 13.74 21.69 3.15 8.71 10.51 16.75 21.52 23.27 11.52 6.81 25.6 11 36.74 11 19.668-.026 36.937-13.083 42.32-32h27.36c5.369 18.932 22.641 32.009 42.32 32.04 18.53 0 50.62-12.81 58.31-34.33C250.671 157.692 255.999 149.259 256 140v-4C255.956 94.045 221.955 60.044 180 60ZM76 84h104c25.078 .034 46.569 17.94 51.13 42.6-3.203-2.871-6.684-5.417-10.39-7.6C209.22 112.19 195.14 108 184 108c-19.668 .026-36.937 13.083-42.32 32h-27.36C108.937 121.083 91.668 108.026 72 108c-13.4 0-33.9 6.71-47.13 18.56C29.452 101.918 50.936 84.035 76 84ZM72 172C57.87 172 36 159.85 36 152c0-2.74 3.55-7.61 11.48-12.3C56.48 134.38 66.28 132 72 132c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM208.52 164.3c-9 5.32-18.8 7.7-24.52 7.7-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 14.13 0 36 12.15 36 20 0 2.74-3.55 7.61-11.48 12.3Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
