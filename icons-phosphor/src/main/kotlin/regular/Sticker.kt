package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorRegularIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 32.000 L 88.000 32.000 C 57.086 32.033 32.033 57.086 32.000 88.000 L 32.000 168.000 C 32.033 198.914 57.086 223.967 88.000 224.000 L 136.000 224.000 C 136.860 223.999 137.714 223.861 138.530 223.590 C 164.760 214.840 214.840 164.760 223.590 138.530 C 223.861 137.714 223.999 136.860 224.000 136.000 L 224.000 88.000 C 223.967 57.086 198.914 32.033 168.000 32.000 ZM 48.000 168.000 L 48.000 88.000 C 48.000 65.909 65.909 48.000 88.000 48.000 L 168.000 48.000 C 190.091 48.000 208.000 65.909 208.000 88.000 L 208.000 128.000 L 184.000 128.000 C 153.086 128.033 128.033 153.086 128.000 184.000 L 128.000 208.000 L 88.000 208.000 C 65.909 208.000 48.000 190.091 48.000 168.000 ZM 144.000 203.140 L 144.000 184.000 C 144.000 161.909 161.909 144.000 184.000 144.000 L 203.140 144.000 C 191.000 163.500 163.500 191.000 144.000 203.140 Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
