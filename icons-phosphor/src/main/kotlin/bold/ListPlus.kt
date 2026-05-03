package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorBoldIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 40.000 140.000 L 216.000 140.000 C 222.627 140.000 228.000 134.627 228.000 128.000 C 228.000 121.373 222.627 116.000 216.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 ZM 144.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 144.000 204.000 C 150.627 204.000 156.000 198.627 156.000 192.000 C 156.000 185.373 150.627 180.000 144.000 180.000 ZM 232.000 180.000 L 220.000 180.000 L 220.000 168.000 C 220.000 161.373 214.627 156.000 208.000 156.000 C 201.373 156.000 196.000 161.373 196.000 168.000 L 196.000 180.000 L 184.000 180.000 C 177.373 180.000 172.000 185.373 172.000 192.000 C 172.000 198.627 177.373 204.000 184.000 204.000 L 196.000 204.000 L 196.000 216.000 C 196.000 222.627 201.373 228.000 208.000 228.000 C 214.627 228.000 220.000 222.627 220.000 216.000 L 220.000 204.000 L 232.000 204.000 C 238.627 204.000 244.000 198.627 244.000 192.000 C 244.000 185.373 238.627 180.000 232.000 180.000 Z"),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
