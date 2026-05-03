package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyMeh: ImageVector
    get() {
        if (_smileyMeh != null) return _smileyMeh!!
        _smileyMeh = phosphorFillIcon(
            name = "SmileyMeh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.928 70.592 185.408 24.072 128.000 24.000 ZM 92.000 96.000 C 98.627 96.000 104.000 101.373 104.000 108.000 C 104.000 114.627 98.627 120.000 92.000 120.000 C 85.373 120.000 80.000 114.627 80.000 108.000 C 80.000 101.373 85.373 96.000 92.000 96.000 ZM 168.000 168.000 L 88.000 168.000 C 83.582 168.000 80.000 164.418 80.000 160.000 C 80.000 155.582 83.582 152.000 88.000 152.000 L 168.000 152.000 C 172.418 152.000 176.000 155.582 176.000 160.000 C 176.000 164.418 172.418 168.000 168.000 168.000 ZM 164.000 120.000 C 157.373 120.000 152.000 114.627 152.000 108.000 C 152.000 101.373 157.373 96.000 164.000 96.000 C 170.627 96.000 176.000 101.373 176.000 108.000 C 176.000 114.627 170.627 120.000 164.000 120.000 Z"),
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
        return _smileyMeh!!
    }

private var _smileyMeh: ImageVector? = null
