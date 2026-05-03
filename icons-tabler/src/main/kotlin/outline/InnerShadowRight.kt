package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowRight: ImageVector
    get() {
        if (_innerShadowRight != null) return _innerShadowRight!!
        _innerShadowRight = tablerOutlineIcon(
            name = "InnerShadowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 18.364 C 14.849 21.879 9.151 21.879 5.636 18.364 C 2.121 14.849 2.121 9.151 5.636 5.636 C 9.151 2.121 14.849 2.121 18.364 5.636 C 21.879 9.151 21.879 14.849 18.364 18.364"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.243 7.757 C 17.368 8.882 18.001 10.409 18.001 12.000 C 18.001 13.591 17.368 15.118 16.243 16.243"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _innerShadowRight!!
    }

private var _innerShadowRight: ImageVector? = null
