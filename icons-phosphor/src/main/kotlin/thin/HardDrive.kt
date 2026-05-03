package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorThinIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 68.000 L 32.000 68.000 C 25.373 68.000 20.000 73.373 20.000 80.000 L 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 224.000 188.000 C 230.627 188.000 236.000 182.627 236.000 176.000 L 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 ZM 228.000 176.000 C 228.000 178.209 226.209 180.000 224.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 178.209 28.000 176.000 L 28.000 80.000 C 28.000 77.791 29.791 76.000 32.000 76.000 L 224.000 76.000 C 226.209 76.000 228.000 77.791 228.000 80.000 ZM 196.000 128.000 C 196.000 132.418 192.418 136.000 188.000 136.000 C 183.582 136.000 180.000 132.418 180.000 128.000 C 180.000 123.582 183.582 120.000 188.000 120.000 C 192.418 120.000 196.000 123.582 196.000 128.000 Z"),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
