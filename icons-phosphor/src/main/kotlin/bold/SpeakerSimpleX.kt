package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorBoldIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 165.270 21.220 C 161.152 19.207 156.247 19.715 152.630 22.530 L 83.880 76.000 L 40.000 76.000 C 28.954 76.000 20.000 84.954 20.000 96.000 L 20.000 160.000 C 20.000 171.046 28.954 180.000 40.000 180.000 L 83.880 180.000 L 152.630 233.470 C 156.247 236.285 161.153 236.794 165.271 234.780 C 169.389 232.767 172.000 228.584 172.000 224.000 L 172.000 32.000 C 172.000 27.416 169.388 23.233 165.270 21.220 ZM 148.000 199.470 L 95.370 158.530 C 93.263 156.890 90.670 156.000 88.000 156.000 L 44.000 156.000 L 44.000 100.000 L 88.000 100.000 C 90.670 100.000 93.263 99.110 95.370 97.470 L 148.000 56.540 ZM 256.490 143.520 C 261.184 148.214 261.184 155.826 256.490 160.520 C 251.796 165.214 244.184 165.214 239.490 160.520 L 224.000 145.000 L 208.490 160.520 C 203.796 165.214 196.184 165.214 191.490 160.520 C 186.796 155.826 186.796 148.214 191.490 143.520 L 207.000 128.000 L 191.480 112.490 C 186.786 107.796 186.786 100.184 191.480 95.490 C 196.174 90.796 203.786 90.796 208.480 95.490 L 224.000 111.000 L 239.510 95.490 C 244.204 90.796 251.816 90.796 256.510 95.490 C 261.204 100.184 261.204 107.796 256.510 112.490 L 241.000 128.000 Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
