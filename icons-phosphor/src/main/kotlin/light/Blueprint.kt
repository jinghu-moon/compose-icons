package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorLightIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 58.000 L 70.000 58.000 L 70.000 40.000 C 70.000 36.686 67.314 34.000 64.000 34.000 L 48.000 34.000 C 31.431 34.000 18.000 47.431 18.000 64.000 L 18.000 176.000 C 18.000 192.569 31.431 206.000 48.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 L 238.000 64.000 C 238.000 60.686 235.314 58.000 232.000 58.000 ZM 30.000 64.000 C 30.000 54.059 38.059 46.000 48.000 46.000 L 58.000 46.000 L 58.000 146.000 L 48.000 146.000 C 41.507 145.991 35.188 148.097 30.000 152.000 ZM 226.000 194.000 L 48.000 194.000 C 38.059 194.000 30.000 185.941 30.000 176.000 C 30.000 166.059 38.059 158.000 48.000 158.000 L 64.000 158.000 C 67.314 158.000 70.000 155.314 70.000 152.000 L 70.000 70.000 L 226.000 70.000 ZM 104.000 138.000 C 100.686 138.000 98.000 140.686 98.000 144.000 C 98.000 147.314 100.686 150.000 104.000 150.000 L 122.000 150.000 L 122.000 160.000 C 122.000 163.314 124.686 166.000 128.000 166.000 C 131.314 166.000 134.000 163.314 134.000 160.000 L 134.000 150.000 L 162.000 150.000 L 162.000 160.000 C 162.000 163.314 164.686 166.000 168.000 166.000 C 171.314 166.000 174.000 163.314 174.000 160.000 L 174.000 150.000 L 192.000 150.000 C 195.314 150.000 198.000 147.314 198.000 144.000 C 198.000 140.686 195.314 138.000 192.000 138.000 L 174.000 138.000 L 174.000 118.000 L 192.000 118.000 C 195.314 118.000 198.000 115.314 198.000 112.000 C 198.000 108.686 195.314 106.000 192.000 106.000 L 174.000 106.000 L 174.000 96.000 C 174.000 92.686 171.314 90.000 168.000 90.000 C 164.686 90.000 162.000 92.686 162.000 96.000 L 162.000 106.000 L 134.000 106.000 L 134.000 96.000 C 134.000 92.686 131.314 90.000 128.000 90.000 C 124.686 90.000 122.000 92.686 122.000 96.000 L 122.000 106.000 L 104.000 106.000 C 100.686 106.000 98.000 108.686 98.000 112.000 C 98.000 115.314 100.686 118.000 104.000 118.000 L 122.000 118.000 L 122.000 138.000 ZM 134.000 118.000 L 162.000 118.000 L 162.000 138.000 L 134.000 138.000 Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
