package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorBoldIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.68 97.22 34.74 128l36.94 30.78c3.334 2.732 4.946 7.042 4.224 11.291-.722 4.249-3.667 7.785-7.716 9.263-4.049 1.478-8.579 .671-11.869-2.114l-48-40C5.583 134.94 4.001 131.562 4.001 128c0-3.562 1.583-6.94 4.319-9.22l48-40c5.097-4.177 12.609-3.462 16.827 1.601 4.218 5.063 3.563 12.581-1.467 16.839ZM247.68 118.78l-48-40c-3.289-2.785-7.82-3.592-11.869-2.114-4.049 1.478-6.994 5.014-7.716 9.263-.722 4.249 .891 8.559 4.224 11.291L221.26 128l-36.94 30.78c-3.334 2.732-4.946 7.042-4.224 11.291 .722 4.249 3.667 7.785 7.716 9.263 4.049 1.478 8.579 .671 11.869-2.114l48-40c2.737-2.28 4.319-5.658 4.319-9.22 0-3.562-1.583-6.94-4.319-9.22ZM164.1 28.72c-2.992-1.088-6.293-.943-9.177 .404-2.884 1.347-5.116 3.784-6.203 6.776l-64 176c-2.259 6.227 .955 13.106 7.18 15.37 1.313 .485 2.701 .732 4.1 .73 5.047 .001 9.556-3.157 11.28-7.9l64-176c1.088-2.992 .943-6.293-.404-9.177-1.347-2.884-3.784-5.116-6.776-6.203Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _code!!
    }

private var _code: ImageVector? = null
