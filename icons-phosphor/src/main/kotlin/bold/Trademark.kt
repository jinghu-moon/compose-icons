package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorBoldIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 192.000 108.000 L 192.000 148.000 C 192.000 154.627 186.627 160.000 180.000 160.000 C 173.373 160.000 168.000 154.627 168.000 148.000 L 168.000 134.090 L 159.810 141.090 C 155.316 144.942 148.684 144.942 144.190 141.090 L 136.000 134.090 L 136.000 148.000 C 136.000 154.627 130.627 160.000 124.000 160.000 C 117.373 160.000 112.000 154.627 112.000 148.000 L 112.000 120.000 L 100.000 120.000 L 100.000 148.000 C 100.000 154.627 94.627 160.000 88.000 160.000 C 81.373 160.000 76.000 154.627 76.000 148.000 L 76.000 120.000 L 72.000 120.000 C 65.373 120.000 60.000 114.627 60.000 108.000 C 60.000 101.373 65.373 96.000 72.000 96.000 L 124.000 96.000 C 126.865 96.000 129.635 97.025 131.810 98.890 L 152.000 116.200 L 172.190 98.890 C 175.748 95.840 180.756 95.140 185.014 97.098 C 189.271 99.056 192.000 103.314 192.000 108.000 Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
