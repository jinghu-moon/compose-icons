package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorFillIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 104.000 L 216.000 152.000 C 216.000 200.601 176.601 240.000 128.000 240.000 C 79.399 240.000 40.000 200.601 40.000 152.000 L 40.000 136.000 C 40.000 127.163 47.163 120.000 56.000 120.000 C 64.837 120.000 72.000 127.163 72.000 136.000 L 72.000 144.000 C 72.000 148.418 75.582 152.000 80.000 152.000 C 84.418 152.000 88.000 148.418 88.000 144.000 L 88.000 88.000 C 88.000 79.163 95.163 72.000 104.000 72.000 C 112.837 72.000 120.000 79.163 120.000 88.000 L 120.000 104.000 C 120.000 108.418 123.582 112.000 128.000 112.000 C 132.418 112.000 136.000 108.418 136.000 104.000 L 136.000 88.000 C 136.000 79.163 143.163 72.000 152.000 72.000 C 160.837 72.000 168.000 79.163 168.000 88.000 L 168.000 104.000 C 168.000 108.418 171.582 112.000 176.000 112.000 C 180.418 112.000 184.000 108.418 184.000 104.000 C 184.000 95.163 191.163 88.000 200.000 88.000 C 208.837 88.000 216.000 95.163 216.000 104.000 Z"),
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
