package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorLightIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 18.000 C 196.686 18.000 194.000 20.686 194.000 24.000 L 194.000 42.000 L 158.000 42.000 L 158.000 24.000 C 158.000 20.686 155.314 18.000 152.000 18.000 C 148.686 18.000 146.000 20.686 146.000 24.000 L 146.000 42.000 L 110.000 42.000 L 110.000 24.000 C 110.000 20.686 107.314 18.000 104.000 18.000 C 100.686 18.000 98.000 20.686 98.000 24.000 L 98.000 42.000 L 62.000 42.000 L 62.000 24.000 C 62.000 20.686 59.314 18.000 56.000 18.000 C 52.686 18.000 50.000 20.686 50.000 24.000 L 50.000 232.000 C 50.000 235.314 52.686 238.000 56.000 238.000 C 59.314 238.000 62.000 235.314 62.000 232.000 L 62.000 214.000 L 98.000 214.000 L 98.000 232.000 C 98.000 235.314 100.686 238.000 104.000 238.000 C 107.314 238.000 110.000 235.314 110.000 232.000 L 110.000 214.000 L 146.000 214.000 L 146.000 232.000 C 146.000 235.314 148.686 238.000 152.000 238.000 C 155.314 238.000 158.000 235.314 158.000 232.000 L 158.000 214.000 L 194.000 214.000 L 194.000 232.000 C 194.000 235.314 196.686 238.000 200.000 238.000 C 203.314 238.000 206.000 235.314 206.000 232.000 L 206.000 24.000 C 206.000 20.686 203.314 18.000 200.000 18.000 ZM 62.000 54.000 L 194.000 54.000 L 194.000 202.000 L 62.000 202.000 ZM 128.000 174.000 C 130.105 173.999 132.056 172.895 133.140 171.090 L 157.140 131.090 C 158.282 129.188 158.282 126.812 157.140 124.910 L 133.140 84.910 C 132.055 83.107 130.104 82.005 128.000 82.005 C 125.896 82.005 123.945 83.107 122.860 84.910 L 98.860 124.910 C 97.718 126.812 97.718 129.188 98.860 131.090 L 122.860 171.090 C 123.944 172.895 125.895 173.999 128.000 174.000 ZM 128.000 99.660 L 145.000 128.000 L 128.000 156.340 L 111.000 128.000 Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
