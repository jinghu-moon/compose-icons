package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleAnalytics: ImageVector
    get() {
        if (_brandGoogleAnalytics != null) return _brandGoogleAnalytics!!
        _brandGoogleAnalytics = tablerOutlineIcon(
            name = "BrandGoogleAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 10.105 C 10.000 9.495 10.495 9.000 11.105 9.000 L 12.895 9.000 C 13.505 9.000 14.000 9.495 14.000 10.105 L 14.000 19.895 C 14.000 20.505 13.505 21.000 12.895 21.000 L 11.105 21.000 C 10.495 21.000 10.000 20.505 10.000 19.895 L 10.000 10.105"),
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
        pathData = parseSvgPathData("M 17.000 4.105 C 17.000 3.495 17.495 3.000 18.105 3.000 L 19.895 3.000 C 20.505 3.000 21.000 3.495 21.000 4.105 L 21.000 19.895 C 21.000 20.505 20.505 21.000 19.895 21.000 L 18.105 21.000 C 17.495 21.000 17.000 20.505 17.000 19.895 L 17.000 4.105"),
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
        pathData = parseSvgPathData("M 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 C 6.105 21.000 7.000 20.105 7.000 19.000 C 7.000 17.895 6.105 17.000 5.000 17.000 C 3.895 17.000 3.000 17.895 3.000 19.000"),
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
        return _brandGoogleAnalytics!!
    }

private var _brandGoogleAnalytics: ImageVector? = null
