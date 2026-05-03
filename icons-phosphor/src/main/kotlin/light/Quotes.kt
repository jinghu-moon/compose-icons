package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorLightIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 58.000 L 40.000 58.000 C 32.268 58.000 26.000 64.268 26.000 72.000 L 26.000 136.000 C 26.000 143.732 32.268 150.000 40.000 150.000 L 102.000 150.000 L 102.000 160.000 C 102.000 178.778 86.778 194.000 68.000 194.000 C 64.686 194.000 62.000 196.686 62.000 200.000 C 62.000 203.314 64.686 206.000 68.000 206.000 C 93.391 205.967 113.967 185.391 114.000 160.000 L 114.000 72.000 C 114.000 64.268 107.732 58.000 100.000 58.000 ZM 102.000 138.000 L 40.000 138.000 C 38.895 138.000 38.000 137.105 38.000 136.000 L 38.000 72.000 C 38.000 70.895 38.895 70.000 40.000 70.000 L 100.000 70.000 C 101.105 70.000 102.000 70.895 102.000 72.000 ZM 216.000 58.000 L 156.000 58.000 C 148.268 58.000 142.000 64.268 142.000 72.000 L 142.000 136.000 C 142.000 143.732 148.268 150.000 156.000 150.000 L 218.000 150.000 L 218.000 160.000 C 218.000 178.778 202.778 194.000 184.000 194.000 C 180.686 194.000 178.000 196.686 178.000 200.000 C 178.000 203.314 180.686 206.000 184.000 206.000 C 209.391 205.967 229.967 185.391 230.000 160.000 L 230.000 72.000 C 230.000 64.268 223.732 58.000 216.000 58.000 ZM 218.000 138.000 L 156.000 138.000 C 154.895 138.000 154.000 137.105 154.000 136.000 L 154.000 72.000 C 154.000 70.895 154.895 70.000 156.000 70.000 L 216.000 70.000 C 217.105 70.000 218.000 70.895 218.000 72.000 Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
