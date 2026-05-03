package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorBoldIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.270 21.220 C 153.152 19.207 148.247 19.715 144.630 22.530 L 75.880 76.000 L 32.000 76.000 C 20.954 76.000 12.000 84.954 12.000 96.000 L 12.000 160.000 C 12.000 171.046 20.954 180.000 32.000 180.000 L 75.880 180.000 L 144.630 233.470 C 148.247 236.285 153.153 236.794 157.271 234.780 C 161.389 232.767 164.000 228.584 164.000 224.000 L 164.000 32.000 C 164.000 27.416 161.388 23.233 157.270 21.220 ZM 36.000 100.000 L 68.000 100.000 L 68.000 156.000 L 36.000 156.000 ZM 140.000 199.470 L 92.000 162.120 L 92.000 93.880 L 140.000 56.540 ZM 248.490 143.520 C 253.184 148.214 253.184 155.826 248.490 160.520 C 243.796 165.214 236.184 165.214 231.490 160.520 L 216.000 145.000 L 200.490 160.520 C 195.796 165.214 188.184 165.214 183.490 160.520 C 178.796 155.826 178.796 148.214 183.490 143.520 L 199.000 128.000 L 183.480 112.490 C 178.786 107.796 178.786 100.184 183.480 95.490 C 188.174 90.796 195.786 90.796 200.480 95.490 L 216.000 111.000 L 231.510 95.490 C 236.204 90.796 243.816 90.796 248.510 95.490 C 253.204 100.184 253.204 107.796 248.510 112.490 L 233.000 128.000 Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
