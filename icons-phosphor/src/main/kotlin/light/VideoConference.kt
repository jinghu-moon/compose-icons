package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorLightIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 56.000 L 218.000 122.000 L 166.000 122.000 L 166.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 38.000 200.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 154.000 54.000 L 154.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 ZM 216.000 202.000 L 166.000 202.000 L 166.000 134.000 L 218.000 134.000 L 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 ZM 182.000 88.000 C 182.000 82.477 186.477 78.000 192.000 78.000 C 197.523 78.000 202.000 82.477 202.000 88.000 C 202.000 93.523 197.523 98.000 192.000 98.000 C 186.477 98.000 182.000 93.523 182.000 88.000 ZM 202.000 168.000 C 202.000 173.523 197.523 178.000 192.000 178.000 C 186.477 178.000 182.000 173.523 182.000 168.000 C 182.000 162.477 186.477 158.000 192.000 158.000 C 197.523 158.000 202.000 162.477 202.000 168.000 ZM 133.810 166.510 C 131.098 156.459 124.382 147.961 115.230 143.000 C 124.923 134.909 128.512 121.615 124.209 109.745 C 119.906 97.875 108.631 89.970 96.005 89.970 C 83.379 89.970 72.104 97.875 67.801 109.745 C 63.498 121.615 67.087 134.909 76.780 143.000 C 67.626 147.956 60.906 156.451 58.190 166.500 C 57.362 169.709 59.291 172.982 62.500 173.810 C 65.709 174.638 68.982 172.709 69.810 169.500 C 72.670 158.380 83.930 150.000 96.000 150.000 C 108.070 150.000 119.340 158.380 122.190 169.490 C 123.018 172.699 126.291 174.628 129.500 173.800 C 132.709 172.972 134.638 169.699 133.810 166.490 ZM 78.000 120.000 C 78.000 110.059 86.059 102.000 96.000 102.000 C 105.941 102.000 114.000 110.059 114.000 120.000 C 114.000 129.941 105.941 138.000 96.000 138.000 C 86.059 138.000 78.000 129.941 78.000 120.000 Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
