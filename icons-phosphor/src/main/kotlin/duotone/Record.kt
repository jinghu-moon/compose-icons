package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Record: ImageVector
    get() {
        if (_record != null) return _record!!
        _record = phosphorDuotoneIcon(
            name = "Record",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 128.000 C 192.000 163.346 163.346 192.000 128.000 192.000 C 92.654 192.000 64.000 163.346 64.000 128.000 C 64.000 92.654 92.654 64.000 128.000 64.000 C 163.346 64.000 192.000 92.654 192.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 128.000 56.000 C 88.235 56.000 56.000 88.235 56.000 128.000 C 56.000 167.764 88.235 200.000 128.000 200.000 C 167.764 200.000 200.000 167.764 200.000 128.000 C 199.956 88.254 167.746 56.044 128.000 56.000 ZM 128.000 184.000 C 97.072 184.000 72.000 158.928 72.000 128.000 C 72.000 97.072 97.072 72.000 128.000 72.000 C 158.928 72.000 184.000 97.072 184.000 128.000 C 183.967 158.914 158.914 183.967 128.000 184.000 Z"),
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
        return _record!!
    }

private var _record: ImageVector? = null
