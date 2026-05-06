package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorDuotoneIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 128c0 17.673 14.327 32 32 32v32c0 4.418-3.582 8-8 8h-128v-144h128c4.418 0 8 3.582 8 8v32c-17.673 0-32 14.327-32 32Z"),
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
                pathData = parseSvgPathData("M232 104c4.418 0 8-3.582 8-8v-32c0-8.837-7.163-16-16-16h-192C23.163 48 16 55.163 16 64v32c0 4.418 3.582 8 8 8 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-4.418 0-8 3.582-8 8v32c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-32c0-4.418-3.582-8-8-8-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24ZM32 167.2C50.643 163.414 64.04 147.023 64.04 128 64.04 108.977 50.643 92.586 32 88.8v-24.8h56v128h-56ZM224 167.2v24.8h-120v-128h120v24.8C205.357 92.586 191.96 108.977 191.96 128c0 19.023 13.398 35.414 32.04 39.2Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
