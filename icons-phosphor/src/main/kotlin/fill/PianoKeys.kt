package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorFillIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 88.000 208.000 L 48.000 208.000 L 48.000 48.000 L 72.000 48.000 L 72.000 144.000 C 72.000 148.418 75.582 152.000 80.000 152.000 L 88.000 152.000 ZM 152.000 208.000 L 104.000 208.000 L 104.000 152.000 L 112.000 152.000 C 116.418 152.000 120.000 148.418 120.000 144.000 L 120.000 48.000 L 136.000 48.000 L 136.000 144.000 C 136.000 148.418 139.582 152.000 144.000 152.000 L 152.000 152.000 ZM 208.000 208.000 L 168.000 208.000 L 168.000 152.000 L 176.000 152.000 C 180.418 152.000 184.000 148.418 184.000 144.000 L 184.000 48.000 L 208.000 48.000 L 208.000 208.000 Z"),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
