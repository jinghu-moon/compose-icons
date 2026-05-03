package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorFillIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 ZM 128.000 208.000 C 92.344 207.996 60.994 184.396 51.130 150.131 C 41.267 115.867 55.270 79.210 85.466 60.249 C 115.663 41.288 154.763 44.600 181.340 68.370 C 184.548 71.335 184.785 76.326 181.871 79.581 C 178.957 82.836 173.971 83.152 170.670 80.290 C 148.721 60.658 116.209 58.537 91.896 75.150 C 67.582 91.764 57.743 122.824 68.056 150.407 C 78.369 177.989 106.173 194.974 135.422 191.561 C 164.671 188.147 187.816 165.216 191.500 136.000 L 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 L 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 C 207.950 172.162 172.162 207.950 128.000 208.000 Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
