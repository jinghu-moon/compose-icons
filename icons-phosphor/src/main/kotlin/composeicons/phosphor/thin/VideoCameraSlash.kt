package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorThinIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.89 76.47c-1.302-.697-2.882-.62-4.11 .2L204 104.53v-32.53c0-6.627-5.373-12-12-12h-78.94c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h78.94c2.209 0 4 1.791 4 4v87.63c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8.16l41.78 27.86c1.228 .819 2.807 .896 4.108 .199 1.301-.697 2.113-2.053 2.112-3.529v-96c.002-1.476-.809-2.833-2.11-3.53ZM244 168.53 204 141.86v-27.72L244 87.47ZM51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L60.78 60h-28.78C25.373 60 20 65.373 20 72v112c0 6.627 5.373 12 12 12h152.41L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM32 188c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h36.05L177.14 188Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
