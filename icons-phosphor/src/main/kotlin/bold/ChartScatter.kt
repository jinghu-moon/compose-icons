package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorBoldIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 32.000 220.000 C 25.373 220.000 20.000 214.627 20.000 208.000 L 20.000 48.000 C 20.000 41.373 25.373 36.000 32.000 36.000 C 38.627 36.000 44.000 41.373 44.000 48.000 L 44.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 201.373 236.000 208.000 ZM 116.000 148.000 C 116.000 156.837 123.163 164.000 132.000 164.000 C 140.837 164.000 148.000 156.837 148.000 148.000 C 148.000 139.163 140.837 132.000 132.000 132.000 C 123.163 132.000 116.000 139.163 116.000 148.000 ZM 108.000 108.000 C 116.837 108.000 124.000 100.837 124.000 92.000 C 124.000 83.163 116.837 76.000 108.000 76.000 C 99.163 76.000 92.000 83.163 92.000 92.000 C 92.000 100.837 99.163 108.000 108.000 108.000 ZM 76.000 180.000 C 84.837 180.000 92.000 172.837 92.000 164.000 C 92.000 155.163 84.837 148.000 76.000 148.000 C 67.163 148.000 60.000 155.163 60.000 164.000 C 60.000 172.837 67.163 180.000 76.000 180.000 ZM 172.000 132.000 C 180.837 132.000 188.000 124.837 188.000 116.000 C 188.000 107.163 180.837 100.000 172.000 100.000 C 163.163 100.000 156.000 107.163 156.000 116.000 C 156.000 124.837 163.163 132.000 172.000 132.000 ZM 196.000 92.000 C 204.837 92.000 212.000 84.837 212.000 76.000 C 212.000 67.163 204.837 60.000 196.000 60.000 C 187.163 60.000 180.000 67.163 180.000 76.000 C 180.000 84.837 187.163 92.000 196.000 92.000 ZM 172.000 164.000 C 172.000 172.837 179.163 180.000 188.000 180.000 C 196.837 180.000 204.000 172.837 204.000 164.000 C 204.000 155.163 196.837 148.000 188.000 148.000 C 179.163 148.000 172.000 155.163 172.000 164.000 Z"),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
