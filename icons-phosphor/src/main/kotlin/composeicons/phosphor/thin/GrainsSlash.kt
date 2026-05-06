package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorThinIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L61.81 61.13C57.245 60.377 52.626 59.999 48 60c-2.209 0-4 1.791-4 4v80c.05 46.371 37.629 83.95 84 84h0c23.248 .022 45.46-9.612 61.33-26.6L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM71.39 71.68l70.06 77.06c-5.933 7.715-10.483 16.401-13.45 25.67C117.275 141.047 87.002 117.82 52 116.1v-48c6.592 .345 13.11 1.548 19.39 3.58ZM124 219.9C83.66 217.718 52.053 184.399 52 144v-19.9c40.34 2.182 71.947 35.501 72 75.9ZM132 219.9v-19.9c.007-16.285 5.244-32.137 14.94-45.22l37 40.68C170.496 210.095 151.846 218.871 132 219.9ZM212 144c.004 7.547-1.005 15.061-3 22.34-.478 1.738-2.058 2.941-3.86 2.94-.358 .003-.715-.044-1.06-.14-1.024-.28-1.895-.957-2.42-1.88-.525-.923-.662-2.017-.38-3.04 1.811-6.587 2.726-13.388 2.72-20.22v-19.9c-10.582 .522-20.934 3.282-30.37 8.1-1.972 1-4.38 .212-5.38-1.76-1-1.972-.212-4.38 1.76-5.38 10.56-5.396 22.154-8.465 34-9v-48c-22.936 1.251-44.089 12.766-57.59 31.35-.829 1.181-2.23 1.824-3.666 1.683-1.436-.141-2.685-1.045-3.267-2.365-.583-1.32-.41-2.851 .453-4.008 7.156-9.86 16.369-18.049 27-24C156.88 46.53 134.48 32.28 128 28.56c-9.981 5.809-18.921 13.244-26.45 22-1.428 1.687-3.953 1.898-5.64 .47-1.687-1.428-1.898-3.953-.47-5.64 8.628-10.159 19.06-18.635 30.77-25 1.127-.564 2.453-.564 3.58 0 1.32 .66 31.31 16 44.33 46.75C184.794 62.431 196.333 59.999 208 60c2.209 0 4 1.791 4 4Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
