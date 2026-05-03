package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorDuotoneIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 64.000 L 224.000 208.000 L 32.000 208.000 L 32.000 48.000 L 208.000 48.000 C 216.837 48.000 224.000 55.163 224.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 L 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 C 36.418 40.000 40.000 43.582 40.000 48.000 L 40.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 ZM 132.000 160.000 C 138.627 160.000 144.000 154.627 144.000 148.000 C 144.000 141.373 138.627 136.000 132.000 136.000 C 125.373 136.000 120.000 141.373 120.000 148.000 C 120.000 154.627 125.373 160.000 132.000 160.000 ZM 108.000 104.000 C 114.627 104.000 120.000 98.627 120.000 92.000 C 120.000 85.373 114.627 80.000 108.000 80.000 C 101.373 80.000 96.000 85.373 96.000 92.000 C 96.000 98.627 101.373 104.000 108.000 104.000 ZM 76.000 176.000 C 82.627 176.000 88.000 170.627 88.000 164.000 C 88.000 157.373 82.627 152.000 76.000 152.000 C 69.373 152.000 64.000 157.373 64.000 164.000 C 64.000 170.627 69.373 176.000 76.000 176.000 ZM 172.000 128.000 C 178.627 128.000 184.000 122.627 184.000 116.000 C 184.000 109.373 178.627 104.000 172.000 104.000 C 165.373 104.000 160.000 109.373 160.000 116.000 C 160.000 122.627 165.373 128.000 172.000 128.000 ZM 196.000 88.000 C 202.627 88.000 208.000 82.627 208.000 76.000 C 208.000 69.373 202.627 64.000 196.000 64.000 C 189.373 64.000 184.000 69.373 184.000 76.000 C 184.000 82.627 189.373 88.000 196.000 88.000 ZM 176.000 164.000 C 176.000 170.627 181.373 176.000 188.000 176.000 C 194.627 176.000 200.000 170.627 200.000 164.000 C 200.000 157.373 194.627 152.000 188.000 152.000 C 181.373 152.000 176.000 157.373 176.000 164.000 Z"),
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
