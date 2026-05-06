package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorDuotoneIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 48v168c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-168c0-4.418 3.582-8 8-8h40c-5.204 6.918-8.012 15.343-8 24v8h80v-8c.012-8.657-2.796-17.082-8-24h40c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M200 32h-36.26C154.648 21.821 141.648 16.001 128 16.001c-13.648 0-26.649 5.82-35.74 15.999h-36.26C47.163 32 40 39.163 40 48v168c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-168c0-8.837-7.163-16-16-16ZM128 32c17.673 0 32 14.327 32 32h-64C96 46.327 110.327 32 128 32ZM200 216h-144v-168h26.75C80.93 53.138 80 58.549 80 64v8c0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8v-8c-0-5.451-.93-10.862-2.75-16h26.75Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
