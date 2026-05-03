package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorDuotoneIcon(
            name = "NumberCircleSix",
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 128.000 112.000 C 127.390 112.000 126.780 112.000 126.180 112.000 L 142.870 84.100 C 145.134 80.306 143.894 75.394 140.100 73.130 C 136.306 70.866 131.394 72.106 129.130 75.900 L 96.900 129.900 C 88.702 143.995 91.001 161.841 102.505 173.398 C 114.009 184.954 131.845 187.335 145.977 179.201 C 160.110 171.067 167.010 154.449 162.796 138.697 C 158.582 122.944 144.306 111.991 128.000 112.000 ZM 128.000 168.000 C 116.954 168.000 108.000 159.046 108.000 148.000 C 108.000 136.954 116.954 128.000 128.000 128.000 C 139.046 128.000 148.000 136.954 148.000 148.000 C 148.000 159.046 139.046 168.000 128.000 168.000 Z"),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
