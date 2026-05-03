package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorLightIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 46.000 46.000 L 46.000 210.000 L 80.000 210.000 C 83.314 210.000 86.000 212.686 86.000 216.000 C 86.000 219.314 83.314 222.000 80.000 222.000 L 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 L 34.000 40.000 C 34.000 36.686 36.686 34.000 40.000 34.000 L 80.000 34.000 C 83.314 34.000 86.000 36.686 86.000 40.000 C 86.000 43.314 83.314 46.000 80.000 46.000 ZM 216.000 34.000 L 176.000 34.000 C 172.686 34.000 170.000 36.686 170.000 40.000 C 170.000 43.314 172.686 46.000 176.000 46.000 L 210.000 46.000 L 210.000 210.000 L 176.000 210.000 C 172.686 210.000 170.000 212.686 170.000 216.000 C 170.000 219.314 172.686 222.000 176.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
