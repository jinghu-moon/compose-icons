package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMixpanel: ImageVector
    get() {
        if (_brandMixpanel != null) return _brandMixpanel!!
        _brandMixpanel = tablerOutlineIcon(
            name = "BrandMixpanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.000 13.381 3.119 14.500 4.500 14.500 C 5.881 14.500 7.000 13.381 7.000 12.000 C 7.000 10.619 5.881 9.500 4.500 9.500 C 3.119 9.500 2.000 10.619 2.000 12.000"),
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
                pathData = parseSvgPathData("M 19.000 12.000 C 19.000 12.828 19.672 13.500 20.500 13.500 C 21.328 13.500 22.000 12.828 22.000 12.000 C 22.000 11.172 21.328 10.500 20.500 10.500 C 19.672 10.500 19.000 11.172 19.000 12.000"),
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
                pathData = parseSvgPathData("M 11.000 12.000 C 11.000 13.105 11.895 14.000 13.000 14.000 C 14.105 14.000 15.000 13.105 15.000 12.000 C 15.000 10.895 14.105 10.000 13.000 10.000 C 11.895 10.000 11.000 10.895 11.000 12.000"),
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
        return _brandMixpanel!!
    }

private var _brandMixpanel: ImageVector? = null
