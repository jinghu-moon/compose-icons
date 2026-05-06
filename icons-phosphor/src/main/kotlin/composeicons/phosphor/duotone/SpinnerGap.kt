package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorDuotoneIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M136 32v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 120h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM178.91 167.6c-3.145-2.988-8.099-2.925-11.167 .143-3.068 3.068-3.131 8.022-.143 11.167l22.62 22.63c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM128 184c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8ZM77.09 167.6 54.46 190.22c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L88.4 178.91c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143ZM72 128c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8ZM65.78 54.46c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L77.09 88.4c3.145 2.988 8.099 2.925 11.167-.143 3.068-3.068 3.131-8.022 .143-11.167Z"),
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
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
