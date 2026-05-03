package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorBoldIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 224.000 196.000 C 235.046 196.000 244.000 187.046 244.000 176.000 L 244.000 80.000 C 244.000 68.954 235.046 60.000 224.000 60.000 ZM 220.000 172.000 L 36.000 172.000 L 36.000 84.000 L 220.000 84.000 ZM 164.000 128.000 C 164.000 119.163 171.163 112.000 180.000 112.000 C 188.837 112.000 196.000 119.163 196.000 128.000 C 196.000 136.837 188.837 144.000 180.000 144.000 C 171.163 144.000 164.000 136.837 164.000 128.000 Z"),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
