package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorDuotoneIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 184.000 40.000 L 184.000 144.000 L 144.000 144.000 L 144.000 40.000 ZM 72.000 144.000 L 112.000 144.000 L 112.000 40.000 L 72.000 40.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 48.000 L 104.000 48.000 L 104.000 136.000 L 80.000 136.000 ZM 112.000 152.000 C 116.418 152.000 120.000 148.418 120.000 144.000 L 120.000 48.000 L 136.000 48.000 L 136.000 144.000 C 136.000 148.418 139.582 152.000 144.000 152.000 L 152.000 152.000 L 152.000 208.000 L 104.000 208.000 L 104.000 152.000 ZM 152.000 136.000 L 152.000 48.000 L 176.000 48.000 L 176.000 136.000 ZM 48.000 48.000 L 64.000 48.000 L 64.000 144.000 C 64.000 148.418 67.582 152.000 72.000 152.000 L 88.000 152.000 L 88.000 208.000 L 48.000 208.000 ZM 208.000 208.000 L 168.000 208.000 L 168.000 152.000 L 184.000 152.000 C 188.418 152.000 192.000 148.418 192.000 144.000 L 192.000 48.000 L 208.000 48.000 L 208.000 208.000 Z"),
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
