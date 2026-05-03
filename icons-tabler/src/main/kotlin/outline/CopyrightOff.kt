package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyrightOff: ImageVector
    get() {
        if (_copyrightOff != null) return _copyrightOff!!
        _copyrightOff = tablerOutlineIcon(
            name = "CopyrightOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 9.750 C 13.786 9.562 13.547 9.405 13.289 9.284M 9.879 9.880 C 8.722 11.033 8.703 12.901 9.837 14.077 C 10.955 15.238 12.789 15.314 14.000 14.250"),
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
                pathData = parseSvgPathData("M 20.042 16.045 C 21.790 12.576 21.115 8.378 18.368 5.632 C 15.622 2.885 11.424 2.210 7.955 3.958M 5.637 5.635 C 3.332 7.902 2.420 11.231 3.248 14.356 C 4.075 17.481 6.515 19.922 9.640 20.751 C 12.765 21.580 16.094 20.669 18.362 18.365"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _copyrightOff!!
    }

private var _copyrightOff: ImageVector? = null
