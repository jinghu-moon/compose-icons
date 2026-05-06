package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorThinIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.83 141.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L120 162.34 93.66 136l21.17-21.17c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L88 130.34 66.83 109.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L70.34 124 44.2 150.14c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8l8.2 8.2L21.17 229.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L58.06 203.6l8.2 8.2c5.251 5.252 12.373 8.202 19.8 8.202 7.427 0 14.549-2.95 19.8-8.202L132 185.66l9.17 9.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L125.66 168l21.17-21.17c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM100.2 206.17c-7.81 7.808-20.47 7.808-28.28 0L49.86 184.08c-7.808-7.81-7.808-20.47 0-28.28L76 129.66 126.34 180ZM234.83 21.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L197.94 52.4l-8.2-8.2c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202L124 70.34l-9.17-9.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l80 80c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L185.66 132l26.14-26.14c5.252-5.251 8.202-12.373 8.202-19.8 0-7.427-2.95-14.549-8.202-19.8l-8.2-8.2L234.83 26.83c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM212 86.06c.014 5.307-2.096 10.399-5.86 14.14L180 126.34 129.66 76 155.8 49.86c7.81-7.808 20.47-7.808 28.28 0l22.06 22.06c3.765 3.74 5.875 8.833 5.86 14.14Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
