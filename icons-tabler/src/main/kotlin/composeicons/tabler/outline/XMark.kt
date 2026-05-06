package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XMark: ImageVector
    get() {
        if (_xMark != null) return _xMark!!
        _xMark = tablerOutlineIcon(
            name = "XMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 16l3.644 3.644c.227 .227 .535 .355 .856 .355 .321 0 .629-.128 .856-.355l2.288-2.288c.227-.227 .355-.535 .355-.856 0-.321-.128-.629-.355-.856L16 12 19.644 8.356c.227-.227 .355-.535 .355-.856 0-.321-.128-.629-.355-.856L17.356 4.356c-.227-.227-.535-.355-.856-.355-.321 0-.629 .128-.856 .355L12 8 8.356 4.356C8.129 4.129 7.821 4.001 7.5 4.001c-.321 0-.629 .128-.856 .355L4.356 6.644c-.227 .227-.355 .535-.355 .856 0 .321 .128 .629 .355 .856L8 12 4.356 15.644c-.227 .227-.355 .535-.355 .856 0 .321 .128 .629 .355 .856l2.288 2.288c.227 .227 .535 .355 .856 .355 .321 0 .629-.128 .856-.355L12 16"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _xMark!!
    }

private var _xMark: ImageVector? = null
