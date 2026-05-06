package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorThinIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 152c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM236 116v60c0 6.627-5.373 12-12 12h-92v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36h-92c-6.627 0-12-5.373-12-12v-60C20.033 85.086 45.086 60.033 76 60h80v-36c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-28v32h16c30.914 .033 55.967 25.086 56 56ZM124 180v-64C124 89.49 102.51 68 76 68 49.49 68 28 89.49 28 116v60c0 2.209 1.791 4 4 4ZM228 116C227.972 89.502 206.498 68.028 180 68h-16v76c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-76h-51.18c16.858 10.119 27.175 28.338 27.18 48v64h92c2.209 0 4-1.791 4-4Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
