package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorLightIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 L 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 C 35.314 42.000 38.000 44.686 38.000 48.000 L 38.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 ZM 132.000 158.000 C 137.523 158.000 142.000 153.523 142.000 148.000 C 142.000 142.477 137.523 138.000 132.000 138.000 C 126.477 138.000 122.000 142.477 122.000 148.000 C 122.000 153.523 126.477 158.000 132.000 158.000 ZM 108.000 102.000 C 113.523 102.000 118.000 97.523 118.000 92.000 C 118.000 86.477 113.523 82.000 108.000 82.000 C 102.477 82.000 98.000 86.477 98.000 92.000 C 98.000 97.523 102.477 102.000 108.000 102.000 ZM 76.000 174.000 C 81.523 174.000 86.000 169.523 86.000 164.000 C 86.000 158.477 81.523 154.000 76.000 154.000 C 70.477 154.000 66.000 158.477 66.000 164.000 C 66.000 169.523 70.477 174.000 76.000 174.000 ZM 172.000 126.000 C 177.523 126.000 182.000 121.523 182.000 116.000 C 182.000 110.477 177.523 106.000 172.000 106.000 C 166.477 106.000 162.000 110.477 162.000 116.000 C 162.000 121.523 166.477 126.000 172.000 126.000 ZM 196.000 86.000 C 201.523 86.000 206.000 81.523 206.000 76.000 C 206.000 70.477 201.523 66.000 196.000 66.000 C 190.477 66.000 186.000 70.477 186.000 76.000 C 186.000 81.523 190.477 86.000 196.000 86.000 ZM 188.000 154.000 C 182.477 154.000 178.000 158.477 178.000 164.000 C 178.000 169.523 182.477 174.000 188.000 174.000 C 193.523 174.000 198.000 169.523 198.000 164.000 C 198.000 158.477 193.523 154.000 188.000 154.000 Z"),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
