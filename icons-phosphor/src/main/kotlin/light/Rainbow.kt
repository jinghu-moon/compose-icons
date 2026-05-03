package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorLightIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 168.000 L 182.000 184.000 C 182.000 187.314 179.314 190.000 176.000 190.000 C 172.686 190.000 170.000 187.314 170.000 184.000 L 170.000 168.000 C 170.000 144.804 151.196 126.000 128.000 126.000 C 104.804 126.000 86.000 144.804 86.000 168.000 L 86.000 184.000 C 86.000 187.314 83.314 190.000 80.000 190.000 C 76.686 190.000 74.000 187.314 74.000 184.000 L 74.000 168.000 C 74.000 138.177 98.177 114.000 128.000 114.000 C 157.823 114.000 182.000 138.177 182.000 168.000 ZM 128.000 82.000 C 80.526 82.055 42.055 120.526 42.000 168.000 L 42.000 184.000 C 42.000 187.314 44.686 190.000 48.000 190.000 C 51.314 190.000 54.000 187.314 54.000 184.000 L 54.000 168.000 C 54.000 127.131 87.131 94.000 128.000 94.000 C 168.869 94.000 202.000 127.131 202.000 168.000 L 202.000 184.000 C 202.000 187.314 204.686 190.000 208.000 190.000 C 211.314 190.000 214.000 187.314 214.000 184.000 L 214.000 168.000 C 213.945 120.526 175.474 82.055 128.000 82.000 ZM 128.000 50.000 C 62.860 50.072 10.072 102.860 10.000 168.000 L 10.000 184.000 C 10.000 187.314 12.686 190.000 16.000 190.000 C 19.314 190.000 22.000 187.314 22.000 184.000 L 22.000 168.000 C 22.000 109.458 69.458 62.000 128.000 62.000 C 186.542 62.000 234.000 109.458 234.000 168.000 L 234.000 184.000 C 234.000 187.314 236.686 190.000 240.000 190.000 C 243.314 190.000 246.000 187.314 246.000 184.000 L 246.000 168.000 C 245.928 102.860 193.140 50.072 128.000 50.000 Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
