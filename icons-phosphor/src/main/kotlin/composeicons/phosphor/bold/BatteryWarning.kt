package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorBoldIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 52h-168C12.536 52 0 64.536 0 80v96c0 15.464 12.536 28 28 28h168c15.464 0 28-12.536 28-28v-96C224 64.536 211.464 52 196 52ZM200 176c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4h168c2.209 0 4 1.791 4 4ZM256 104v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM100 116v-16c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM128 152c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
