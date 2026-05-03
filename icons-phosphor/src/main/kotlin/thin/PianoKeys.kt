package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorThinIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 76.000 44.000 L 108.000 44.000 L 108.000 140.000 L 76.000 140.000 ZM 112.000 148.000 C 114.209 148.000 116.000 146.209 116.000 144.000 L 116.000 44.000 L 140.000 44.000 L 140.000 144.000 C 140.000 146.209 141.791 148.000 144.000 148.000 L 156.000 148.000 L 156.000 212.000 L 100.000 212.000 L 100.000 148.000 ZM 148.000 140.000 L 148.000 44.000 L 180.000 44.000 L 180.000 140.000 ZM 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 68.000 44.000 L 68.000 144.000 C 68.000 146.209 69.791 148.000 72.000 148.000 L 92.000 148.000 L 92.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 164.000 212.000 L 164.000 148.000 L 184.000 148.000 C 186.209 148.000 188.000 146.209 188.000 144.000 L 188.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 Z"),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
