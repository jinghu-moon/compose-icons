package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorLightIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98.3 130.46c-2.242-.929-4.824-.416-6.54 1.3L69.51 154h-21.51c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h21.51l22.25 22.24c1.716 1.714 4.295 2.226 6.535 1.298 2.241-.928 3.702-3.113 3.705-5.538v-88c-.001-2.425-1.461-4.611-3.7-5.54ZM90 209.46 76.24 195.76C75.116 194.634 73.591 194.001 72 194h-18v-28h18c1.591-.001 3.116-.634 4.24-1.76L90 150.49ZM150 180c-.012 13.644-7.239 26.264-19 33.18-2.832 1.391-6.257 .352-7.838-2.378-1.581-2.73-.778-6.218 1.838-7.982 8.074-4.766 13.028-13.444 13.028-22.82 0-9.376-4.954-18.054-13.028-22.82-2.616-1.764-3.419-5.252-1.838-7.982 1.581-2.73 5.006-3.769 7.838-2.378 11.761 6.916 18.988 19.536 19 33.18ZM212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52Z"),
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
