package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorLightIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 34h-37.17C154.108 23.843 141.388 18 128 18c-13.388 0-26.108 5.844-34.83 16h-37.17C48.268 34 42 40.268 42 48v168c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-168c0-7.732-6.268-14-14-14ZM128 30c18.778 0 34 15.222 34 34v2h-68v-2C94 45.222 109.222 30 128 30ZM202 216c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-168c0-1.105 .895-2 2-2h29.67C83.243 51.69 81.994 57.814 82 64v8c0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6v-8c.006-6.186-1.243-12.31-3.67-18h29.67c1.105 0 2 .895 2 2Z"),
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
