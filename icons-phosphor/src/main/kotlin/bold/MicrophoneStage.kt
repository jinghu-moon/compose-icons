package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorBoldIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 12.000 C 146.388 11.977 125.792 21.169 111.376 37.269 C 96.959 53.370 90.090 74.852 92.490 96.330 L 23.910 189.850 C 18.010 197.806 18.863 208.890 25.910 215.850 L 40.200 230.140 C 47.160 237.187 58.244 238.040 66.200 232.140 L 159.720 163.560 C 187.672 166.581 215.009 153.923 230.788 130.653 C 246.567 107.383 248.210 77.303 235.060 52.453 C 221.910 27.603 196.115 12.042 168.000 12.000 ZM 220.000 88.000 C 220.010 97.635 217.326 107.081 212.250 115.270 L 140.740 43.750 C 156.779 33.876 176.903 33.447 193.348 42.629 C 209.793 51.810 219.988 69.166 220.000 88.000 ZM 54.720 210.710 L 45.290 201.280 L 101.480 124.650 C 108.434 137.214 118.786 147.566 131.350 154.520 ZM 116.000 88.000 C 115.988 78.365 118.673 68.919 123.750 60.730 L 195.260 132.240 C 179.223 142.113 159.101 142.543 142.656 133.364 C 126.212 124.185 116.015 106.833 116.000 88.000 Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
