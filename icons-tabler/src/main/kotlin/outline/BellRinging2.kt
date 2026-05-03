package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerOutlineIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.364 4.636 C 20.145 5.417 20.145 6.683 19.364 7.464 C 20.237 9.901 19.693 12.622 17.950 14.536 L 15.828 16.656 C 15.044 17.656 14.782 18.968 15.121 20.192 L 3.808 8.880 C 5.032 9.219 6.344 8.956 7.343 8.173 L 9.464 6.050 C 11.378 4.307 14.099 3.763 16.536 4.636 C 17.317 3.855 18.583 3.855 19.364 4.636"),
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
        pathData = parseSvgPathData("M 7.343 12.414 L 6.636 13.121 C 5.464 14.293 5.464 16.192 6.636 17.364 C 7.808 18.536 9.707 18.536 10.879 17.364 L 11.586 16.657"),
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
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
