package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorRegularIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-160c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM208 200h-160v-48h160v48ZM208 40h-160C39.163 40 32 47.163 32 56v48c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM208 104h-160v-48h160v48ZM192 80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM192 176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
