package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) return _fileHtml!!
        _fileHtml = phosphorThinIcon(
            name = "FileHtml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 88c.001-1.061-.42-2.079-1.17-2.83l-2-2h0l-54-54C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4ZM156 41.65 198.34 84h-42.34ZM64 160v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-28v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h28v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM120 160c0 2.209-1.791 4-4 4h-12v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-44h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM192 160v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36l-16.8 22.4c-.755 1.007-1.941 1.6-3.2 1.6-1.259 0-2.445-.593-3.2-1.6L144 172v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-1.722 1.102-3.25 2.735-3.795 1.633-.544 3.432 .017 4.465 1.395L164 185.33l20.8-27.73c1.033-1.377 2.832-1.939 4.465-1.395 1.633 .544 2.735 2.073 2.735 3.795ZM248 208c0 2.209-1.791 4-4 4h-28c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v44h24c2.209 0 4 1.791 4 4Z"),
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
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
