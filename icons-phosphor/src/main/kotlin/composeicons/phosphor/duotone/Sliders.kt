package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorDuotoneIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 136c0 13.255-10.745 24-24 24C42.745 160 32 149.255 32 136c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM128 64c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C152 74.745 141.255 64 128 64ZM200 144c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
                pathData = parseSvgPathData("M64 105v-65c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v65c-14.159 3.625-24.063 16.384-24.063 31 0 14.616 9.903 27.375 24.063 31v49c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-49c14.159-3.625 24.063-16.384 24.063-31C88.063 121.384 78.159 108.625 64 105ZM56 152c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM136 57v-17c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v17C105.841 60.625 95.937 73.384 95.937 88c0 14.616 9.903 27.375 24.063 31v97c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-97c14.159-3.625 24.063-16.384 24.063-31C160.063 73.384 150.159 60.625 136 57ZM128 104c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM232 168c-.014-14.591-9.878-27.332-24-31v-97c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v97c-14.159 3.625-24.063 16.384-24.063 31 0 14.616 9.903 27.375 24.063 31v17c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-17c14.122-3.668 23.986-16.409 24-31ZM200 184c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
