package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorBoldIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 80c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM232 44v168c0 11.046-8.954 20-20 20h-168C32.954 232 24 223.046 24 212v-168C24 32.954 32.954 24 44 24h168c11.046 0 20 8.954 20 20ZM208 48h-160v160h160ZM139.51 123.51l-16 16c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l16-16c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM124.51 107.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-8 8c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l8-8c2.257-2.254 3.523-5.314 3.519-8.504-.004-3.19-1.277-6.247-3.539-8.496ZM128 196c19.868-.015 38.737-8.711 51.654-23.806 12.917-15.095 18.592-35.082 15.536-54.714-1.019-6.55-7.155-11.034-13.705-10.015-6.55 1.019-11.034 7.155-10.015 13.705 2.956 18.821-6.536 37.406-23.517 46.044-16.981 8.638-37.592 5.367-51.063-8.104C83.419 145.638 80.147 125.027 88.786 108.047 97.424 91.066 116.009 81.574 134.83 84.53c6.55 1.019 12.686-3.465 13.705-10.015 1.019-6.55-3.465-12.686-10.015-13.705C113.281 56.879 87.969 67.424 72.985 88.11c-14.984 20.686-17.111 48.025-5.508 70.78C79.08 181.646 102.457 195.979 128 196Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
