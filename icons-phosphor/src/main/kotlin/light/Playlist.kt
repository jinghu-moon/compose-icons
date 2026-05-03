package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorLightIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 40.000 134.000 L 160.000 134.000 C 163.314 134.000 166.000 131.314 166.000 128.000 C 166.000 124.686 163.314 122.000 160.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 ZM 112.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 112.000 198.000 C 115.314 198.000 118.000 195.314 118.000 192.000 C 118.000 188.686 115.314 186.000 112.000 186.000 ZM 245.750 125.720 C 244.788 128.889 241.440 130.680 238.270 129.720 L 206.000 120.060 L 206.000 192.000 C 206.000 205.913 196.434 218.001 182.893 221.197 C 169.351 224.394 155.389 217.861 149.167 205.416 C 142.945 192.972 146.096 177.882 156.778 168.967 C 167.460 160.053 182.869 159.652 194.000 168.000 L 194.000 112.000 C 193.999 110.104 194.895 108.319 196.416 107.186 C 197.937 106.054 199.903 105.706 201.720 106.250 L 241.720 118.250 C 243.245 118.706 244.527 119.749 245.283 121.150 C 246.039 122.551 246.207 124.195 245.750 125.720 ZM 194.000 192.000 C 194.000 182.059 185.941 174.000 176.000 174.000 C 166.059 174.000 158.000 182.059 158.000 192.000 C 158.000 201.941 166.059 210.000 176.000 210.000 C 185.941 210.000 194.000 201.941 194.000 192.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _playlist!!
    }

private var _playlist: ImageVector? = null
