package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = phosphorLightIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 64.000 98.000 C 60.686 98.000 58.000 100.686 58.000 104.000 C 58.000 107.314 60.686 110.000 64.000 110.000 L 192.000 110.000 C 195.314 110.000 198.000 107.314 198.000 104.000 C 198.000 100.686 195.314 98.000 192.000 98.000 ZM 216.000 138.000 L 40.000 138.000 C 36.686 138.000 34.000 140.686 34.000 144.000 C 34.000 147.314 36.686 150.000 40.000 150.000 L 216.000 150.000 C 219.314 150.000 222.000 147.314 222.000 144.000 C 222.000 140.686 219.314 138.000 216.000 138.000 ZM 192.000 178.000 L 64.000 178.000 C 60.686 178.000 58.000 180.686 58.000 184.000 C 58.000 187.314 60.686 190.000 64.000 190.000 L 192.000 190.000 C 195.314 190.000 198.000 187.314 198.000 184.000 C 198.000 180.686 195.314 178.000 192.000 178.000 Z"),
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
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
