package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorLightIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 72.000 C 214.000 75.314 211.314 78.000 208.000 78.000 L 176.000 78.000 C 172.686 78.000 170.000 75.314 170.000 72.000 C 170.000 68.686 172.686 66.000 176.000 66.000 L 208.000 66.000 C 211.314 66.000 214.000 68.686 214.000 72.000 ZM 208.000 98.000 L 176.000 98.000 C 172.686 98.000 170.000 100.686 170.000 104.000 C 170.000 107.314 172.686 110.000 176.000 110.000 L 208.000 110.000 C 211.314 110.000 214.000 107.314 214.000 104.000 C 214.000 100.686 211.314 98.000 208.000 98.000 ZM 246.000 48.000 L 246.000 208.000 C 246.000 215.732 239.732 222.000 232.000 222.000 L 152.000 222.000 C 144.268 222.000 138.000 215.732 138.000 208.000 L 138.000 190.000 L 94.000 190.000 L 94.000 210.000 L 112.000 210.000 C 115.314 210.000 118.000 212.686 118.000 216.000 C 118.000 219.314 115.314 222.000 112.000 222.000 L 64.000 222.000 C 60.686 222.000 58.000 219.314 58.000 216.000 C 58.000 212.686 60.686 210.000 64.000 210.000 L 82.000 210.000 L 82.000 190.000 L 32.000 190.000 C 19.850 190.000 10.000 180.150 10.000 168.000 L 10.000 96.000 C 10.000 83.850 19.850 74.000 32.000 74.000 L 138.000 74.000 L 138.000 48.000 C 138.000 40.268 144.268 34.000 152.000 34.000 L 232.000 34.000 C 239.732 34.000 246.000 40.268 246.000 48.000 ZM 138.000 178.000 L 138.000 86.000 L 32.000 86.000 C 26.477 86.000 22.000 90.477 22.000 96.000 L 22.000 168.000 C 22.000 173.523 26.477 178.000 32.000 178.000 ZM 234.000 48.000 C 234.000 46.895 233.105 46.000 232.000 46.000 L 152.000 46.000 C 150.895 46.000 150.000 46.895 150.000 48.000 L 150.000 208.000 C 150.000 209.105 150.895 210.000 152.000 210.000 L 232.000 210.000 C 233.105 210.000 234.000 209.105 234.000 208.000 ZM 192.000 170.000 C 186.477 170.000 182.000 174.477 182.000 180.000 C 182.000 185.523 186.477 190.000 192.000 190.000 C 197.523 190.000 202.000 185.523 202.000 180.000 C 202.000 174.477 197.523 170.000 192.000 170.000 Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
