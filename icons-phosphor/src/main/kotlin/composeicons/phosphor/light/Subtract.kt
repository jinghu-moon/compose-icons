package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorLightIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.91 83.08C166.335 43.887 131.345 15.904 91.666 18.105 51.986 20.305 20.305 51.986 18.105 91.666c-2.201 39.679 25.783 74.669 64.975 81.244 6.575 39.193 41.565 67.176 81.244 64.975 39.679-2.201 71.36-33.882 73.561-73.561C240.086 124.645 212.103 89.655 172.91 83.08ZM226 160c-.004 2.977-.211 5.951-.62 8.9L171.62 115.13C173.203 108.877 174.002 102.451 174 96c0-.17 0-.34 0-.51 30.396 6.52 52.082 33.423 52 64.51ZM146.71 155.19l55.5 55.5c-5.861 4.879-12.523 8.706-19.69 11.31L127.72 167.19c6.877-3.061 13.273-7.103 18.99-12ZM155.19 146.71c4.898-5.72 8.94-12.12 12-19L222 182.52c-2.616 7.17-6.457 13.832-11.35 19.69ZM30 96C30 59.549 59.549 30 96 30c36.451 0 66 29.549 66 66 0 36.451-29.549 66-66 66C59.567 161.956 30.044 132.433 30 96ZM95.49 174h.51c6.451 .002 12.877-.797 19.13-2.38l53.77 53.76C134.756 230.098 102.748 207.696 95.49 174Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
