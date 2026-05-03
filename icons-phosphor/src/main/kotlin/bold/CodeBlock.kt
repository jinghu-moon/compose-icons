package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorBoldIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.510 104.490 L 19.510 72.490 C 17.251 70.238 15.981 67.180 15.981 63.990 C 15.981 60.800 17.251 57.742 19.510 55.490 L 51.510 23.490 C 56.204 18.796 63.816 18.796 68.510 23.490 C 73.204 28.184 73.204 35.796 68.510 40.490 L 45.000 64.000 L 68.490 87.510 C 73.184 92.204 73.184 99.816 68.490 104.510 C 63.796 109.204 56.184 109.204 51.490 104.510 ZM 99.510 104.490 C 101.762 106.749 104.820 108.019 108.010 108.019 C 111.200 108.019 114.258 106.749 116.510 104.490 L 148.510 72.490 C 150.769 70.238 152.039 67.180 152.039 63.990 C 152.039 60.800 150.769 57.742 148.510 55.490 L 116.510 23.490 C 111.816 18.796 104.204 18.796 99.510 23.490 C 94.816 28.184 94.816 35.796 99.510 40.490 L 123.000 64.000 L 99.510 87.510 C 97.257 89.761 95.991 92.815 95.991 96.000 C 95.991 99.185 97.257 102.239 99.510 104.490 ZM 200.000 36.000 L 180.000 36.000 C 173.373 36.000 168.000 41.373 168.000 48.000 C 168.000 54.627 173.373 60.000 180.000 60.000 L 196.000 60.000 L 196.000 196.000 L 60.000 196.000 L 60.000 140.000 C 60.000 133.373 54.627 128.000 48.000 128.000 C 41.373 128.000 36.000 133.373 36.000 140.000 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 56.000 C 220.000 44.954 211.046 36.000 200.000 36.000 Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
