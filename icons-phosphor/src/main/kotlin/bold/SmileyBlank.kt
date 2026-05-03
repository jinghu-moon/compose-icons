package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyBlank: ImageVector
    get() {
        if (_smileyBlank != null) return _smileyBlank!!
        _smileyBlank = phosphorBoldIcon(
            name = "SmileyBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 108.000 108.000 C 108.000 116.837 100.837 124.000 92.000 124.000 C 83.163 124.000 76.000 116.837 76.000 108.000 C 76.000 99.163 83.163 92.000 92.000 92.000 C 100.837 92.000 108.000 99.163 108.000 108.000 ZM 180.000 108.000 C 180.000 116.837 172.837 124.000 164.000 124.000 C 155.163 124.000 148.000 116.837 148.000 108.000 C 148.000 99.163 155.163 92.000 164.000 92.000 C 172.837 92.000 180.000 99.163 180.000 108.000 Z"),
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
        return _smileyBlank!!
    }

private var _smileyBlank: ImageVector? = null
