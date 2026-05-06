package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorThinIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84c2.209 0 4 1.791 4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-6.627-5.373-12-12-12h-86.34L101.17 47.51C98.924 45.256 95.872 43.992 92.69 44h-52.69C33.373 44 28 49.373 28 56v144.61c.006 6.284 5.096 11.379 11.38 11.39h81.18c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-81.18c-1.868-.006-3.38-1.522-3.38-3.39v-116.61ZM40 52h52.69c1.058 .002 2.072 .422 2.82 1.17L118.34 76h-82.34v-20c0-2.209 1.791-4 4-4ZM235.81 160.41c-.488-1.557-1.873-2.661-3.5-2.79l-32.24-2.49L187.67 126.41c-.634-1.463-2.076-2.409-3.67-2.409-1.594 0-3.036 .946-3.67 2.409l-12.4 28.72-32.24 2.49c-1.63 .122-3.022 1.224-3.515 2.782-.493 1.559 .012 3.26 1.275 4.298l24.46 20.19L150.45 215c-.387 1.563 .2 3.205 1.49 4.168 1.29 .963 3.032 1.058 4.42 .242L184 203.18l27.64 16.27c.607 .356 1.297 .546 2 .55 .86-.003 1.697-.279 2.39-.79 1.291-.963 1.878-2.607 1.49-4.17l-7.46-30.15 24.46-20.19c1.266-1.033 1.776-2.731 1.29-4.29ZM203.05 180.32c-1.186 .982-1.703 2.557-1.33 4.05l5.78 23.36L186 195.09c-1.253-.738-2.807-.738-4.06 0l-21.44 12.64 5.78-23.36c.373-1.493-.144-3.068-1.33-4.05L146.19 164.84 171 162.92c1.478-.115 2.771-1.039 3.36-2.4L184 138.1l9.68 22.42c.589 1.361 1.882 2.285 3.36 2.4l24.77 1.92Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
