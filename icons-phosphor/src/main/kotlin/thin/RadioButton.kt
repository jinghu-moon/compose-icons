package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RadioButton: ImageVector
    get() {
        if (_radioButton != null) return _radioButton!!
        _radioButton = phosphorThinIcon(
            name = "RadioButton",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 128.000 76.000 C 99.281 76.000 76.000 99.281 76.000 128.000 C 76.000 156.719 99.281 180.000 128.000 180.000 C 156.719 180.000 180.000 156.719 180.000 128.000 C 179.967 99.295 156.705 76.033 128.000 76.000 ZM 128.000 172.000 C 103.699 172.000 84.000 152.301 84.000 128.000 C 84.000 103.699 103.699 84.000 128.000 84.000 C 152.301 84.000 172.000 103.699 172.000 128.000 C 171.972 152.289 152.289 171.972 128.000 172.000 Z"),
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
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null
