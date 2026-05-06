package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorDuotoneIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 136v48h-56c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 128h-192c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16ZM32 144h48v32h-48ZM224 176h-128v-32h128v32ZM201 60.08c8-14.23 7.42-21.71 6.36-24.91-.464-1.527-1.385-2.874-2.64-3.86-2.625-1.152-4.433-3.622-4.739-6.472-.306-2.851 .938-5.647 3.259-7.33 2.321-1.683 5.365-1.995 7.98-.818 5.434 2.767 9.517 7.615 11.32 13.44 3.36 10.14 .81 22.85-7.6 37.79-8 14.23-7.42 21.72-6.36 24.92 .466 1.523 1.387 2.867 2.64 3.85 2.625 1.152 4.433 3.622 4.739 6.472 .306 2.851-.938 5.647-3.259 7.33-2.321 1.683-5.365 1.995-7.98 .818-5.437-2.763-9.521-7.613-11.32-13.44C190.07 87.73 192.62 75 201 60.08ZM161 60.08c8-14.23 7.42-21.71 6.36-24.91-.464-1.527-1.385-2.874-2.64-3.86-2.625-1.152-4.433-3.622-4.739-6.472-.306-2.851 .938-5.647 3.259-7.33 2.321-1.683 5.365-1.995 7.98-.818 5.434 2.767 9.517 7.615 11.32 13.44 3.36 10.14 .81 22.85-7.6 37.79-8 14.23-7.42 21.72-6.36 24.92 .466 1.523 1.387 2.867 2.64 3.85 2.625 1.152 4.433 3.622 4.739 6.472 .306 2.851-.938 5.647-3.259 7.33-2.321 1.683-5.365 1.995-7.98 .818-5.437-2.763-9.521-7.613-11.32-13.44C150.07 87.73 152.62 75 161 60.08Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
