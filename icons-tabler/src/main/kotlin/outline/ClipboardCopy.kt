package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClipboardCopy: ImageVector
    get() {
        if (_clipboardCopy != null) return _clipboardCopy!!
        _clipboardCopy = tablerOutlineIcon(
            name = "ClipboardCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 5.000 L 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 L 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 10.000 21.000M 19.000 12.000 L 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 L 15.000 5.000"),
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
                pathData = parseSvgPathData("M 13.000 17.000 L 13.000 16.000 C 13.000 15.448 13.448 15.000 14.000 15.000 L 15.000 15.000M 18.000 15.000 L 19.000 15.000 C 19.552 15.000 20.000 15.448 20.000 16.000 L 20.000 17.000M 20.000 20.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 18.000 22.000M 15.000 22.000 L 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 20.000"),
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
                pathData = parseSvgPathData("M 9.000 5.000 C 9.000 3.895 9.895 3.000 11.000 3.000 L 13.000 3.000 C 14.105 3.000 15.000 3.895 15.000 5.000 C 15.000 6.105 14.105 7.000 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 6.105 9.000 5.000"),
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
        return _clipboardCopy!!
    }

private var _clipboardCopy: ImageVector? = null
