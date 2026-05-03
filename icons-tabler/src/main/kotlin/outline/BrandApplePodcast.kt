package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApplePodcast: ImageVector
    get() {
        if (_brandApplePodcast != null) return _brandApplePodcast!!
        _brandApplePodcast = tablerOutlineIcon(
            name = "BrandApplePodcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 18.364 C 21.879 14.849 21.879 9.151 18.364 5.636 C 14.849 2.121 9.151 2.121 5.636 5.636 C 2.121 9.151 2.121 14.849 5.636 18.364"),
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
        pathData = parseSvgPathData("M 11.766 22.000 L 12.234 22.000 C 13.243 22.000 14.094 21.249 14.219 20.248 L 14.719 16.248 C 14.790 15.679 14.613 15.106 14.234 14.676 C 13.854 14.246 13.308 14.000 12.734 14.000 L 11.266 14.000 C 10.692 14.000 10.146 14.246 9.766 14.676 C 9.387 15.106 9.210 15.679 9.281 16.248 L 9.781 20.248 C 9.906 21.249 10.757 22.000 11.766 22.000"),
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
        pathData = parseSvgPathData("M 10.000 9.000 C 10.000 10.105 10.895 11.000 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000"),
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
        return _brandApplePodcast!!
    }

private var _brandApplePodcast: ImageVector? = null
