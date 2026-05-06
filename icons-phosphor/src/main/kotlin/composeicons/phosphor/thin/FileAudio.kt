package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorThinIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M97.53 132.3c-1.496-.619-3.217-.275-4.36 .87L70.34 156h-22.34c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h22.34l22.83 22.83c1.144 1.145 2.866 1.488 4.361 .868 1.496-.62 2.47-2.08 2.469-3.698v-88c.002-1.62-.974-3.08-2.47-3.7ZM92 214.3 74.83 197.17C74.079 196.42 73.061 195.999 72 196h-20v-32h20c1.061 .001 2.079-.42 2.83-1.17L92 145.66ZM148 180c-.009 12.931-6.855 24.893-18 31.45-1.883 .903-4.143 .206-5.19-1.6-1.047-1.806-.529-4.114 1.19-5.3 8.69-5.124 14.024-14.461 14.024-24.55 0-10.089-5.334-19.426-14.024-24.55-1.719-1.185-2.238-3.493-1.19-5.3 1.047-1.806 3.308-2.503 5.19-1.6 11.145 6.557 17.991 18.519 18 31.45ZM210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34Z"),
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
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
