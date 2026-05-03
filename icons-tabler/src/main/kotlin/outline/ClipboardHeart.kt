package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) return _clipboardHeart!!
        _clipboardHeart = tablerOutlineIcon(
            name = "ClipboardHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 5.000 L 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 L 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 17.000 21.000 C 18.105 21.000 19.000 20.105 19.000 19.000 L 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 L 15.000 5.000"),
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
        pathData = parseSvgPathData("M 9.000 5.000 C 9.000 3.895 9.895 3.000 11.000 3.000 L 13.000 3.000 C 14.105 3.000 15.000 3.895 15.000 5.000 C 15.000 6.105 14.105 7.000 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 6.105 9.000 5.000"),
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
        pathData = parseSvgPathData("M 11.993 16.750 L 14.740 13.935 C 15.446 13.200 15.446 12.038 14.740 11.303 C 14.405 10.955 13.943 10.758 13.460 10.758 C 12.977 10.758 12.515 10.955 12.180 11.303 L 11.997 11.491 L 11.814 11.302 C 11.479 10.954 11.017 10.757 10.534 10.757 C 10.051 10.757 9.589 10.954 9.254 11.302 C 8.547 12.037 8.547 13.199 9.254 13.934 L 11.992 16.759 L 11.993 16.750"),
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
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
