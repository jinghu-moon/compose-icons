package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CandyOff: ImageVector
    get() {
        if (_candyOff != null) return _candyOff!!
        _candyOff = tablerOutlineIcon(
            name = "CandyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.174 7.170 L 11.293 7.050 C 12.074 6.269 13.340 6.269 14.121 7.050 L 16.950 9.880 C 17.731 10.661 17.731 11.927 16.950 12.708 L 16.826 12.832M 14.826 14.832 L 12.703 16.955 C 11.922 17.736 10.656 17.736 9.875 16.955 L 7.046 14.124 C 6.265 13.343 6.265 12.077 7.046 11.296 L 9.159 9.184"),
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
        pathData = parseSvgPathData("M 16.243 9.172 L 19.329 8.400 C 19.853 8.269 20.267 7.866 20.411 7.345 C 20.555 6.824 20.408 6.266 20.026 5.884 L 17.810 3.667 C 17.458 3.315 16.954 3.160 16.465 3.254 C 15.976 3.349 15.566 3.679 15.370 4.137 L 14.122 7.050"),
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
        pathData = parseSvgPathData("M 9.172 16.243 L 8.400 19.329 C 8.269 19.853 7.866 20.267 7.345 20.411 C 6.824 20.555 6.266 20.408 5.884 20.026 L 3.667 17.810 C 3.315 17.458 3.160 16.954 3.254 16.465 C 3.349 15.976 3.679 15.566 4.137 15.370 L 7.050 14.122"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
