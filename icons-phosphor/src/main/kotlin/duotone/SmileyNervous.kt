package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorDuotoneIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 80.000 108.000 C 80.000 101.373 85.373 96.000 92.000 96.000 C 98.627 96.000 104.000 101.373 104.000 108.000 C 104.000 114.627 98.627 120.000 92.000 120.000 C 85.373 120.000 80.000 114.627 80.000 108.000 ZM 152.000 108.000 C 152.000 101.373 157.373 96.000 164.000 96.000 C 170.627 96.000 176.000 101.373 176.000 108.000 C 176.000 114.627 170.627 120.000 164.000 120.000 C 157.373 120.000 152.000 114.627 152.000 108.000 ZM 184.000 168.000 C 184.000 172.418 180.418 176.000 176.000 176.000 C 166.000 176.000 160.950 169.260 157.600 164.800 C 154.600 160.800 153.680 160.000 152.000 160.000 C 150.320 160.000 149.430 160.760 146.400 164.800 C 143.050 169.260 138.000 176.000 128.000 176.000 C 118.000 176.000 113.000 169.260 109.600 164.800 C 106.600 160.800 105.680 160.000 104.000 160.000 C 102.320 160.000 101.430 160.760 98.400 164.800 C 95.050 169.260 90.000 176.000 80.000 176.000 C 75.582 176.000 72.000 172.418 72.000 168.000 C 72.000 163.582 75.582 160.000 80.000 160.000 C 81.680 160.000 82.570 159.240 85.600 155.200 C 89.000 150.740 94.000 144.000 104.000 144.000 C 114.000 144.000 119.000 150.740 122.400 155.200 C 125.400 159.200 126.320 160.000 128.000 160.000 C 129.680 160.000 130.570 159.240 133.600 155.200 C 137.000 150.740 142.000 144.000 152.000 144.000 C 162.000 144.000 167.050 150.740 170.400 155.200 C 173.400 159.200 174.320 160.000 176.000 160.000 C 180.418 160.000 184.000 163.582 184.000 168.000 Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
