package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccessibilityLine: ImageVector
    get() {
        if (_accessibilityLine != null) return _accessibilityLine!!
        _accessibilityLine = remixIcon(
            name = "AccessibilityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12C4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12ZM12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2ZM12 8.5c.828 0 1.5-.672 1.5-1.5C13.5 6.172 12.828 5.5 12 5.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM12 9.5c-1.557 0-3.178-.357-4.629-.929l-.742 1.857c1.076 .429 2.228 .718 3.371 .902 0 .87 .085 1.764-.317 2.567L8.105 17.053l1.789 .894 1.553-3.106c.105-.209 .319-.342 .553-.342 .234 0 .448 .132 .553 .342l1.553 3.106 1.789-.894L14.317 13.897c-.402-.804-.317-1.697-.317-2.567 1.141-.183 2.282-.477 3.359-.897 .025-.01-.73-1.862-.733-1.861C15.173 9.139 13.559 9.5 12 9.5Z"),
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
        return _accessibilityLine!!
    }

private var _accessibilityLine: ImageVector? = null
