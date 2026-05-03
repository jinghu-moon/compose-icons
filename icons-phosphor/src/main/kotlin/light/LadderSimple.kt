package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorLightIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 26.000 C 188.686 26.000 186.000 28.686 186.000 32.000 L 186.000 66.000 L 70.000 66.000 L 70.000 32.000 C 70.000 28.686 67.314 26.000 64.000 26.000 C 60.686 26.000 58.000 28.686 58.000 32.000 L 58.000 224.000 C 58.000 227.314 60.686 230.000 64.000 230.000 C 67.314 230.000 70.000 227.314 70.000 224.000 L 70.000 190.000 L 186.000 190.000 L 186.000 224.000 C 186.000 227.314 188.686 230.000 192.000 230.000 C 195.314 230.000 198.000 227.314 198.000 224.000 L 198.000 32.000 C 198.000 28.686 195.314 26.000 192.000 26.000 ZM 186.000 78.000 L 186.000 122.000 L 70.000 122.000 L 70.000 78.000 ZM 70.000 178.000 L 70.000 134.000 L 186.000 134.000 L 186.000 178.000 Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
