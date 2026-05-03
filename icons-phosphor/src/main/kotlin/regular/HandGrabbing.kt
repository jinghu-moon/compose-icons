package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorRegularIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 80.000 C 183.332 79.993 178.737 81.163 174.640 83.400 C 171.629 74.073 163.961 66.999 154.421 64.750 C 144.882 62.500 134.861 65.401 128.000 72.400 C 120.037 64.273 107.949 61.773 97.415 66.074 C 86.882 70.375 79.998 80.622 80.000 92.000 L 80.000 112.000 L 68.000 112.000 C 52.536 112.000 40.000 124.536 40.000 140.000 L 40.000 152.000 C 40.000 200.601 79.399 240.000 128.000 240.000 C 176.601 240.000 216.000 200.601 216.000 152.000 L 216.000 108.000 C 216.000 92.536 203.464 80.000 188.000 80.000 ZM 200.000 152.000 C 200.000 191.764 167.764 224.000 128.000 224.000 C 88.235 224.000 56.000 191.764 56.000 152.000 L 56.000 140.000 C 56.000 133.373 61.373 128.000 68.000 128.000 L 80.000 128.000 L 80.000 152.000 C 80.000 156.418 83.582 160.000 88.000 160.000 C 92.418 160.000 96.000 156.418 96.000 152.000 L 96.000 92.000 C 96.000 85.373 101.373 80.000 108.000 80.000 C 114.627 80.000 120.000 85.373 120.000 92.000 L 120.000 120.000 C 120.000 124.418 123.582 128.000 128.000 128.000 C 132.418 128.000 136.000 124.418 136.000 120.000 L 136.000 92.000 C 136.000 85.373 141.373 80.000 148.000 80.000 C 154.627 80.000 160.000 85.373 160.000 92.000 L 160.000 120.000 C 160.000 124.418 163.582 128.000 168.000 128.000 C 172.418 128.000 176.000 124.418 176.000 120.000 L 176.000 108.000 C 176.000 101.373 181.373 96.000 188.000 96.000 C 194.627 96.000 200.000 101.373 200.000 108.000 Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
