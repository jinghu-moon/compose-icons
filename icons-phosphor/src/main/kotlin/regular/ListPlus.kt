package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorRegularIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 40.000 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 C 224.000 123.582 220.418 120.000 216.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 ZM 144.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 144.000 200.000 C 148.418 200.000 152.000 196.418 152.000 192.000 C 152.000 187.582 148.418 184.000 144.000 184.000 ZM 232.000 184.000 L 216.000 184.000 L 216.000 168.000 C 216.000 163.582 212.418 160.000 208.000 160.000 C 203.582 160.000 200.000 163.582 200.000 168.000 L 200.000 184.000 L 184.000 184.000 C 179.582 184.000 176.000 187.582 176.000 192.000 C 176.000 196.418 179.582 200.000 184.000 200.000 L 200.000 200.000 L 200.000 216.000 C 200.000 220.418 203.582 224.000 208.000 224.000 C 212.418 224.000 216.000 220.418 216.000 216.000 L 216.000 200.000 L 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 C 240.000 187.582 236.418 184.000 232.000 184.000 Z"),
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
