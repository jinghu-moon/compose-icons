package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorBoldIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 132.000 C 56.000 138.627 50.627 144.000 44.000 144.000 L 24.000 144.000 C 17.373 144.000 12.000 138.627 12.000 132.000 C 12.000 125.373 17.373 120.000 24.000 120.000 L 28.000 120.000 L 28.000 68.000 L 24.000 68.000 C 17.373 68.000 12.000 62.627 12.000 56.000 C 12.000 49.373 17.373 44.000 24.000 44.000 L 40.000 44.000 C 44.015 43.992 47.768 45.992 50.000 49.330 L 80.000 94.330 L 110.000 49.330 C 112.232 45.992 115.985 43.992 120.000 44.000 L 136.000 44.000 C 142.627 44.000 148.000 49.373 148.000 56.000 C 148.000 62.627 142.627 68.000 136.000 68.000 L 132.000 68.000 L 132.000 120.000 L 136.000 120.000 C 142.627 120.000 148.000 125.373 148.000 132.000 C 148.000 138.627 142.627 144.000 136.000 144.000 L 116.000 144.000 C 111.031 143.993 106.581 140.926 104.807 136.284 C 103.033 131.643 104.303 126.389 108.000 123.070 L 108.000 95.630 L 90.000 122.630 C 87.777 125.982 84.022 127.997 80.000 127.997 C 75.978 127.997 72.223 125.982 70.000 122.630 L 52.000 95.630 L 52.000 123.070 C 54.542 125.343 55.996 128.590 56.000 132.000 ZM 176.000 104.000 L 232.000 104.000 C 238.627 104.000 244.000 98.627 244.000 92.000 C 244.000 85.373 238.627 80.000 232.000 80.000 L 176.000 80.000 C 169.373 80.000 164.000 85.373 164.000 92.000 C 164.000 98.627 169.373 104.000 176.000 104.000 ZM 232.000 120.000 L 176.000 120.000 C 169.373 120.000 164.000 125.373 164.000 132.000 C 164.000 138.627 169.373 144.000 176.000 144.000 L 232.000 144.000 C 238.627 144.000 244.000 138.627 244.000 132.000 C 244.000 125.373 238.627 120.000 232.000 120.000 ZM 232.000 160.000 L 80.000 160.000 C 73.373 160.000 68.000 165.373 68.000 172.000 C 68.000 178.627 73.373 184.000 80.000 184.000 L 232.000 184.000 C 238.627 184.000 244.000 178.627 244.000 172.000 C 244.000 165.373 238.627 160.000 232.000 160.000 ZM 232.000 200.000 L 80.000 200.000 C 73.373 200.000 68.000 205.373 68.000 212.000 C 68.000 218.627 73.373 224.000 80.000 224.000 L 232.000 224.000 C 238.627 224.000 244.000 218.627 244.000 212.000 C 244.000 205.373 238.627 200.000 232.000 200.000 Z"),
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
