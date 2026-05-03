package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorLightIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 80.000 C 178.000 76.686 180.686 74.000 184.000 74.000 L 216.000 74.000 C 219.314 74.000 222.000 76.686 222.000 80.000 C 222.000 83.314 219.314 86.000 216.000 86.000 L 184.000 86.000 C 180.686 86.000 178.000 83.314 178.000 80.000 ZM 40.000 86.000 L 146.000 86.000 L 146.000 104.000 C 146.000 107.314 148.686 110.000 152.000 110.000 C 155.314 110.000 158.000 107.314 158.000 104.000 L 158.000 56.000 C 158.000 52.686 155.314 50.000 152.000 50.000 C 148.686 50.000 146.000 52.686 146.000 56.000 L 146.000 74.000 L 40.000 74.000 C 36.686 74.000 34.000 76.686 34.000 80.000 C 34.000 83.314 36.686 86.000 40.000 86.000 ZM 216.000 170.000 L 120.000 170.000 C 116.686 170.000 114.000 172.686 114.000 176.000 C 114.000 179.314 116.686 182.000 120.000 182.000 L 216.000 182.000 C 219.314 182.000 222.000 179.314 222.000 176.000 C 222.000 172.686 219.314 170.000 216.000 170.000 ZM 88.000 146.000 C 84.686 146.000 82.000 148.686 82.000 152.000 L 82.000 170.000 L 40.000 170.000 C 36.686 170.000 34.000 172.686 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 L 82.000 182.000 L 82.000 200.000 C 82.000 203.314 84.686 206.000 88.000 206.000 C 91.314 206.000 94.000 203.314 94.000 200.000 L 94.000 152.000 C 94.000 148.686 91.314 146.000 88.000 146.000 Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
