package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiceSix: ImageVector
    get() {
        if (_diceSix != null) return _diceSix!!
        _diceSix = phosphorRegularIcon(
            name = "DiceSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 32.000 L 64.000 32.000 C 46.327 32.000 32.000 46.327 32.000 64.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 64.000 C 224.000 46.327 209.673 32.000 192.000 32.000 ZM 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 ZM 104.000 84.000 C 104.000 90.627 98.627 96.000 92.000 96.000 C 85.373 96.000 80.000 90.627 80.000 84.000 C 80.000 77.373 85.373 72.000 92.000 72.000 C 98.627 72.000 104.000 77.373 104.000 84.000 ZM 176.000 84.000 C 176.000 90.627 170.627 96.000 164.000 96.000 C 157.373 96.000 152.000 90.627 152.000 84.000 C 152.000 77.373 157.373 72.000 164.000 72.000 C 170.627 72.000 176.000 77.373 176.000 84.000 ZM 104.000 128.000 C 104.000 134.627 98.627 140.000 92.000 140.000 C 85.373 140.000 80.000 134.627 80.000 128.000 C 80.000 121.373 85.373 116.000 92.000 116.000 C 98.627 116.000 104.000 121.373 104.000 128.000 ZM 176.000 128.000 C 176.000 134.627 170.627 140.000 164.000 140.000 C 157.373 140.000 152.000 134.627 152.000 128.000 C 152.000 121.373 157.373 116.000 164.000 116.000 C 170.627 116.000 176.000 121.373 176.000 128.000 ZM 104.000 172.000 C 104.000 178.627 98.627 184.000 92.000 184.000 C 85.373 184.000 80.000 178.627 80.000 172.000 C 80.000 165.373 85.373 160.000 92.000 160.000 C 98.627 160.000 104.000 165.373 104.000 172.000 ZM 176.000 172.000 C 176.000 178.627 170.627 184.000 164.000 184.000 C 157.373 184.000 152.000 178.627 152.000 172.000 C 152.000 165.373 157.373 160.000 164.000 160.000 C 170.627 160.000 176.000 165.373 176.000 172.000 Z"),
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
        return _diceSix!!
    }

private var _diceSix: ImageVector? = null
