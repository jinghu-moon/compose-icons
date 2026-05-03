package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerOutlineIcon(
            name = "InnerShadowTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.636 5.636 C 2.121 9.151 2.121 14.849 5.636 18.364 C 9.151 21.879 14.849 21.879 18.364 18.364 C 21.879 14.849 21.879 9.151 18.364 5.636 C 14.849 2.121 9.151 2.121 5.636 5.636"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.243 7.757 C 15.118 6.632 13.591 5.999 12.000 5.999 C 10.409 5.999 8.882 6.632 7.757 7.757"),
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
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null
