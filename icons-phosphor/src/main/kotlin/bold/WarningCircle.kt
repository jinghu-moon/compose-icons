package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningCircle: ImageVector
    get() {
        if (_warningCircle != null) return _warningCircle!!
        _warningCircle = phosphorBoldIcon(
            name = "WarningCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 116.000 132.000 L 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 L 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 ZM 144.000 172.000 C 144.000 180.837 136.837 188.000 128.000 188.000 C 119.163 188.000 112.000 180.837 112.000 172.000 C 112.000 163.163 119.163 156.000 128.000 156.000 C 136.837 156.000 144.000 163.163 144.000 172.000 Z"),
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
        return _warningCircle!!
    }

private var _warningCircle: ImageVector? = null
