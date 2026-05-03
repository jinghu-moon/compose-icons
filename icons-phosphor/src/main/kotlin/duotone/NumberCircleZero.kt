package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorDuotoneIcon(
            name = "NumberCircleZero",
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 128.000 72.000 C 113.770 72.000 102.000 78.440 94.000 90.610 C 87.530 100.470 84.000 113.750 84.000 128.000 C 84.000 142.250 87.560 155.530 94.000 165.390 C 102.000 177.570 113.740 184.000 128.000 184.000 C 142.260 184.000 154.000 177.570 162.000 165.390 C 168.470 155.530 172.000 142.250 172.000 128.000 C 172.000 113.750 168.440 100.470 162.000 90.610 C 154.000 78.440 142.230 72.000 128.000 72.000 ZM 128.000 168.000 C 105.900 168.000 100.000 142.860 100.000 128.000 C 100.000 113.140 105.900 88.000 128.000 88.000 C 150.100 88.000 156.000 113.140 156.000 128.000 C 156.000 142.860 150.100 168.000 128.000 168.000 Z"),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
