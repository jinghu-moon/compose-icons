package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorDuotoneIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 72v112h-160v-112Z"),
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
                pathData = parseSvgPathData("M232 64v-16c0-8.837-7.163-16-16-16h-176C31.163 32 24 39.163 24 48v16c0 8.837 7.163 16 16 16v96h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88v17.38c-11.02 3.896-17.631 15.165-15.654 26.686 1.977 11.521 11.965 19.942 23.654 19.942 11.689 0 21.678-8.421 23.654-19.942C153.631 224.545 147.02 213.276 136 209.38v-17.38h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-96c8.837 0 16-7.163 16-16ZM128 240c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM40 48h176v16h-176ZM200 176h-144v-96h144Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
