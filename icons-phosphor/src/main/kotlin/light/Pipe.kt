package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorLightIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 106.000 L 206.000 106.000 L 206.000 54.000 L 232.000 54.000 C 235.314 54.000 238.000 51.314 238.000 48.000 C 238.000 44.686 235.314 42.000 232.000 42.000 L 204.630 42.000 C 202.315 37.120 197.401 34.007 192.000 34.000 L 176.000 34.000 C 170.599 34.007 165.685 37.120 163.370 42.000 L 144.000 42.000 C 87.694 42.066 42.066 87.694 42.000 144.000 L 42.000 163.370 C 37.120 165.685 34.007 170.599 34.000 176.000 L 34.000 192.000 C 34.007 197.401 37.120 202.315 42.000 204.630 L 42.000 232.000 C 42.000 235.314 44.686 238.000 48.000 238.000 C 51.314 238.000 54.000 235.314 54.000 232.000 L 54.000 206.000 L 106.000 206.000 L 106.000 232.000 C 106.000 235.314 108.686 238.000 112.000 238.000 C 115.314 238.000 118.000 235.314 118.000 232.000 L 118.000 204.630 C 122.880 202.315 125.993 197.401 126.000 192.000 L 126.000 176.000 C 125.993 170.599 122.880 165.685 118.000 163.370 L 118.000 144.000 C 118.000 129.641 129.641 118.000 144.000 118.000 L 163.370 118.000 C 165.685 122.880 170.599 125.993 176.000 126.000 L 192.000 126.000 C 197.401 125.993 202.315 122.880 204.630 118.000 L 232.000 118.000 C 235.314 118.000 238.000 115.314 238.000 112.000 C 238.000 108.686 235.314 106.000 232.000 106.000 ZM 112.000 174.000 C 113.105 174.000 114.000 174.895 114.000 176.000 L 114.000 192.000 C 114.000 193.105 113.105 194.000 112.000 194.000 L 48.000 194.000 C 46.895 194.000 46.000 193.105 46.000 192.000 L 46.000 176.000 C 46.000 174.895 46.895 174.000 48.000 174.000 ZM 106.000 144.000 L 106.000 162.000 L 54.000 162.000 L 54.000 144.000 C 54.055 94.317 94.317 54.055 144.000 54.000 L 162.000 54.000 L 162.000 106.000 L 144.000 106.000 C 123.013 106.000 106.000 123.013 106.000 144.000 ZM 192.000 114.000 L 176.000 114.000 C 174.895 114.000 174.000 113.105 174.000 112.000 L 174.000 48.000 C 174.000 46.895 174.895 46.000 176.000 46.000 L 192.000 46.000 C 193.105 46.000 194.000 46.895 194.000 48.000 L 194.000 112.000 C 194.000 113.105 193.105 114.000 192.000 114.000 Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
