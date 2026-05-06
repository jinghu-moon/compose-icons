package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorThinIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 20h-32C78.879 20.039 52.039 46.879 52 80v96c.039 33.121 26.879 59.961 60 60h32c33.121-.039 59.961-26.879 60-60v-96C203.961 46.879 177.121 20.039 144 20ZM196 176c-.033 28.705-23.295 51.967-52 52h-32C83.295 227.967 60.033 204.705 60 176v-96C60.033 51.295 83.295 28.033 112 28h32c28.705 .033 51.967 23.295 52 52ZM132 73.66v108.68l17.17-17.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-24 24c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-24-24c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L124 182.34v-108.68L106.83 90.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l24-24c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l24 24c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
