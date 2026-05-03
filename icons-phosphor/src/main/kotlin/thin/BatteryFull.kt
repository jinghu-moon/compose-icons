package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryFull: ImageVector
    get() {
        if (_batteryFull != null) return _batteryFull!!
        _batteryFull = phosphorThinIcon(
            name = "BatteryFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 200.000 196.000 C 211.046 196.000 220.000 187.046 220.000 176.000 L 220.000 80.000 C 220.000 68.954 211.046 60.000 200.000 60.000 ZM 212.000 176.000 C 212.000 182.627 206.627 188.000 200.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 L 20.000 80.000 C 20.000 73.373 25.373 68.000 32.000 68.000 L 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 ZM 180.000 96.000 L 180.000 160.000 C 180.000 162.209 178.209 164.000 176.000 164.000 C 173.791 164.000 172.000 162.209 172.000 160.000 L 172.000 96.000 C 172.000 93.791 173.791 92.000 176.000 92.000 C 178.209 92.000 180.000 93.791 180.000 96.000 ZM 140.000 96.000 L 140.000 160.000 C 140.000 162.209 138.209 164.000 136.000 164.000 C 133.791 164.000 132.000 162.209 132.000 160.000 L 132.000 96.000 C 132.000 93.791 133.791 92.000 136.000 92.000 C 138.209 92.000 140.000 93.791 140.000 96.000 ZM 100.000 96.000 L 100.000 160.000 C 100.000 162.209 98.209 164.000 96.000 164.000 C 93.791 164.000 92.000 162.209 92.000 160.000 L 92.000 96.000 C 92.000 93.791 93.791 92.000 96.000 92.000 C 98.209 92.000 100.000 93.791 100.000 96.000 ZM 60.000 96.000 L 60.000 160.000 C 60.000 162.209 58.209 164.000 56.000 164.000 C 53.791 164.000 52.000 162.209 52.000 160.000 L 52.000 96.000 C 52.000 93.791 53.791 92.000 56.000 92.000 C 58.209 92.000 60.000 93.791 60.000 96.000 ZM 252.000 96.000 L 252.000 160.000 C 252.000 162.209 250.209 164.000 248.000 164.000 C 245.791 164.000 244.000 162.209 244.000 160.000 L 244.000 96.000 C 244.000 93.791 245.791 92.000 248.000 92.000 C 250.209 92.000 252.000 93.791 252.000 96.000 Z"),
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
        return _batteryFull!!
    }

private var _batteryFull: ImageVector? = null
