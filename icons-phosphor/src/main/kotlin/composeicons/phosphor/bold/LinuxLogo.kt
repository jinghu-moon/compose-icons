package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorBoldIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.49 217.38c-2.49 1.993-5.67 2.912-8.839 2.556-3.169-.356-6.066-1.96-8.051-4.456C213.19 213.72 180 171.24 180 88 180 59.281 156.719 36 128 36 99.281 36 76 59.281 76 88 76 171.24 42.79 213.72 41.38 215.48c-4.128 5.186-11.679 6.043-16.865 1.915-5.186-4.128-6.043-11.679-1.915-16.865C23 200 52 162.06 52 88 52 46.026 86.026 12 128 12c41.974 0 76 34.026 76 76 0 74.19 29.1 112.16 29.4 112.54 4.114 5.18 3.259 12.713-1.91 16.84ZM104 120c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM168 104c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM95.26 155l28 12c3.017 1.293 6.433 1.293 9.45 0l28-12c5.613-2.881 8.036-9.615 5.546-15.412-2.49-5.797-9.043-8.675-14.996-6.588l-23.27 10L104.72 133c-5.958-2.108-12.53 .766-15.027 6.572-2.497 5.806-.062 12.553 5.567 15.428ZM128 184c-14.331 .021-28.13 5.429-38.66 15.15-4.885 4.482-5.212 12.075-.73 16.96 4.482 4.885 12.075 5.212 16.96 .73 12.626-11.788 32.224-11.788 44.85 0 4.885 4.482 12.478 4.155 16.96-.73 4.482-4.885 4.155-12.478-.73-16.96C156.124 189.43 142.328 184.022 128 184Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
