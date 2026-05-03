package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorFillIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 64.000 L 32.000 64.000 C 23.163 64.000 16.000 71.163 16.000 80.000 L 16.000 176.000 C 16.000 184.837 23.163 192.000 32.000 192.000 L 224.000 192.000 C 232.837 192.000 240.000 184.837 240.000 176.000 L 240.000 80.000 C 240.000 71.163 232.837 64.000 224.000 64.000 ZM 188.000 140.000 C 181.373 140.000 176.000 134.627 176.000 128.000 C 176.000 121.373 181.373 116.000 188.000 116.000 C 194.627 116.000 200.000 121.373 200.000 128.000 C 200.000 134.627 194.627 140.000 188.000 140.000 Z"),
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
