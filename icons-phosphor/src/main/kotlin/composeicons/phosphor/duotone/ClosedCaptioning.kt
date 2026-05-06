package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorDuotoneIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 64v128c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M224 48h-192C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM224 192h-192v-128h192v128ZM118.93 151.71c1.061 1.838 1.349 4.022 .799 6.072-.55 2.05-1.891 3.797-3.729 4.858-16.811 9.707-38.165 5.942-50.643-8.928-12.478-14.87-12.478-36.554 0-51.424C77.835 87.418 99.189 83.653 116 93.36c2.556 1.388 4.157 4.053 4.182 6.962 .025 2.908-1.53 5.601-4.062 7.032-2.532 1.432-5.641 1.376-8.12-.144-10.087-5.818-22.895-3.555-30.378 5.366-7.483 8.921-7.483 21.927 0 30.848 7.483 8.921 20.291 11.183 30.378 5.366 3.825-2.212 8.718-.904 10.93 2.92ZM198.93 151.71c1.061 1.838 1.349 4.022 .799 6.072-.55 2.05-1.891 3.797-3.729 4.858-16.811 9.707-38.165 5.942-50.643-8.928-12.478-14.87-12.478-36.554 0-51.424C157.835 87.418 179.189 83.653 196 93.36c2.556 1.388 4.157 4.053 4.182 6.962 .025 2.908-1.53 5.601-4.062 7.032-2.532 1.432-5.641 1.376-8.12-.144-10.087-5.818-22.895-3.555-30.378 5.366-7.483 8.921-7.483 21.927 0 30.848 7.483 8.921 20.291 11.183 30.378 5.366 3.825-2.212 8.718-.904 10.93 2.92Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
