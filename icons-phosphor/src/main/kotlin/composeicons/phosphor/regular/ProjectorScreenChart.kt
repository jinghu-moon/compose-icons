package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorRegularIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 144v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 152c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8ZM160 152c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM216 80v96h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-88v17.38c11.02 3.896 17.631 15.165 15.654 26.686-1.977 11.521-11.965 19.942-23.654 19.942-11.689 0-21.678-8.421-23.654-19.942-1.977-11.521 4.634-22.79 15.654-26.686v-17.38h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-96C31.163 80 24 72.837 24 64v-16C24 39.163 31.163 32 40 32h176c8.837 0 16 7.163 16 16v16c0 8.837-7.163 16-16 16ZM136 232c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM40 64h176v-16h-176ZM200 80h-144v96h144Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
