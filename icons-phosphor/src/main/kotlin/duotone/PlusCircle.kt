package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) return _plusCircle!!
        _plusCircle = phosphorDuotoneIcon(
            name = "PlusCircle",
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 176.000 128.000 C 176.000 132.418 172.418 136.000 168.000 136.000 L 136.000 136.000 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 136.000 L 88.000 136.000 C 83.582 136.000 80.000 132.418 80.000 128.000 C 80.000 123.582 83.582 120.000 88.000 120.000 L 120.000 120.000 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 L 136.000 120.000 L 168.000 120.000 C 172.418 120.000 176.000 123.582 176.000 128.000 Z"),
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
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null
