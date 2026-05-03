package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorLightIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 166.000 C 148.987 166.000 166.000 148.987 166.000 128.000 C 166.000 107.013 148.987 90.000 128.000 90.000 C 107.013 90.000 90.000 107.013 90.000 128.000 C 90.000 148.987 107.013 166.000 128.000 166.000 ZM 128.000 102.000 C 142.359 102.000 154.000 113.641 154.000 128.000 C 154.000 142.359 142.359 154.000 128.000 154.000 C 113.641 154.000 102.000 142.359 102.000 128.000 C 102.000 113.641 113.641 102.000 128.000 102.000 ZM 240.000 58.000 L 16.000 58.000 C 12.686 58.000 10.000 60.686 10.000 64.000 L 10.000 192.000 C 10.000 195.314 12.686 198.000 16.000 198.000 L 240.000 198.000 C 243.314 198.000 246.000 195.314 246.000 192.000 L 246.000 64.000 C 246.000 60.686 243.314 58.000 240.000 58.000 ZM 22.000 108.820 C 40.964 103.775 55.775 88.964 60.820 70.000 L 195.180 70.000 C 200.225 88.964 215.036 103.775 234.000 108.820 L 234.000 147.180 C 215.036 152.225 200.225 167.036 195.180 186.000 L 60.820 186.000 C 55.775 167.036 40.964 152.225 22.000 147.180 ZM 234.000 96.290 C 221.689 91.989 212.011 82.311 207.710 70.000 L 234.000 70.000 ZM 48.290 70.000 C 43.989 82.311 34.311 91.989 22.000 96.290 L 22.000 70.000 ZM 22.000 159.710 C 34.311 164.011 43.989 173.689 48.290 186.000 L 22.000 186.000 ZM 207.710 186.000 C 212.011 173.689 221.689 164.011 234.000 159.710 L 234.000 186.000 Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
