package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorLightIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 54.000 136.000 C 54.000 139.314 51.314 142.000 48.000 142.000 L 24.000 142.000 C 20.686 142.000 18.000 139.314 18.000 136.000 C 18.000 132.686 20.686 130.000 24.000 130.000 L 34.000 130.000 L 34.000 62.000 L 24.000 62.000 C 20.686 62.000 18.000 59.314 18.000 56.000 C 18.000 52.686 20.686 50.000 24.000 50.000 L 40.000 50.000 L 40.000 50.000 C 42.066 49.995 43.988 51.053 45.090 52.800 L 80.000 108.680 L 114.910 52.820 C 116.007 51.065 117.931 49.999 120.000 50.000 L 120.000 50.000 L 136.000 50.000 C 139.314 50.000 142.000 52.686 142.000 56.000 C 142.000 59.314 139.314 62.000 136.000 62.000 L 126.000 62.000 L 126.000 130.000 L 136.000 130.000 C 139.314 130.000 142.000 132.686 142.000 136.000 C 142.000 139.314 139.314 142.000 136.000 142.000 L 112.000 142.000 C 108.686 142.000 106.000 139.314 106.000 136.000 C 106.000 132.686 108.686 130.000 112.000 130.000 L 114.000 130.000 L 114.000 76.920 L 85.090 123.180 C 83.994 124.936 82.070 126.003 80.000 126.003 C 77.930 126.003 76.006 124.936 74.910 123.180 L 46.000 76.920 L 46.000 130.000 L 48.000 130.000 C 51.314 130.000 54.000 132.686 54.000 136.000 ZM 168.000 110.000 L 232.000 110.000 C 235.314 110.000 238.000 107.314 238.000 104.000 C 238.000 100.686 235.314 98.000 232.000 98.000 L 168.000 98.000 C 164.686 98.000 162.000 100.686 162.000 104.000 C 162.000 107.314 164.686 110.000 168.000 110.000 ZM 232.000 130.000 L 168.000 130.000 C 164.686 130.000 162.000 132.686 162.000 136.000 C 162.000 139.314 164.686 142.000 168.000 142.000 L 232.000 142.000 C 235.314 142.000 238.000 139.314 238.000 136.000 C 238.000 132.686 235.314 130.000 232.000 130.000 ZM 232.000 162.000 L 80.000 162.000 C 76.686 162.000 74.000 164.686 74.000 168.000 C 74.000 171.314 76.686 174.000 80.000 174.000 L 232.000 174.000 C 235.314 174.000 238.000 171.314 238.000 168.000 C 238.000 164.686 235.314 162.000 232.000 162.000 ZM 232.000 194.000 L 80.000 194.000 C 76.686 194.000 74.000 196.686 74.000 200.000 C 74.000 203.314 76.686 206.000 80.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 C 238.000 196.686 235.314 194.000 232.000 194.000 Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
