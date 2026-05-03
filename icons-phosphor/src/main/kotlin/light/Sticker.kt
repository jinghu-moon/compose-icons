package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorLightIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 34.000 L 88.000 34.000 C 58.190 34.033 34.033 58.190 34.000 88.000 L 34.000 168.000 C 34.033 197.810 58.190 221.967 88.000 222.000 L 136.000 222.000 C 136.646 222.002 137.288 221.897 137.900 221.690 C 163.740 213.080 213.080 163.740 221.690 137.900 C 221.897 137.288 222.002 136.646 222.000 136.000 L 222.000 88.000 C 221.967 58.190 197.810 34.033 168.000 34.000 ZM 46.000 168.000 L 46.000 88.000 C 46.000 64.804 64.804 46.000 88.000 46.000 L 168.000 46.000 C 191.196 46.000 210.000 64.804 210.000 88.000 L 210.000 130.000 L 184.000 130.000 C 154.190 130.033 130.033 154.190 130.000 184.000 L 130.000 210.000 L 88.000 210.000 C 64.804 210.000 46.000 191.196 46.000 168.000 ZM 142.000 206.670 L 142.000 184.000 C 142.000 160.804 160.804 142.000 184.000 142.000 L 206.670 142.000 C 194.840 163.100 163.100 194.840 142.000 206.670 Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
