package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) return _fileCsv!!
        _fileCsv = phosphorThinIcon(
            name = "FileCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 180c0 13.23 9 24 20 24 4.996-.078 9.738-2.213 13.11-5.9 1.53-1.596 4.064-1.65 5.66-.12 1.596 1.53 1.65 4.064 .12 5.66C78.01 208.905 71.178 211.929 64 212 48.56 212 36 197.64 36 180c0-17.64 12.56-32 28-32 7.178 .071 14.01 3.095 18.89 8.36 1.53 1.596 1.476 4.13-.12 5.66-1.596 1.53-4.13 1.476-5.66-.12C73.738 158.213 68.996 156.078 64 156c-11 0-20 10.77-20 24ZM126.49 175.15c-10.53-3-15.08-4.91-14.42-10.08 .179-2.627 1.563-5.023 3.75-6.49 6.25-4.23 18.77-2.24 23.06-1.11 2.101 .458 4.188-.826 4.726-2.907 .538-2.082-.666-4.216-2.726-4.833-3.437-.839-6.94-1.377-10.47-1.61-8.12-.54-14.54 .75-19.1 3.82-4.085 2.774-6.73 7.216-7.22 12.13-1.58 12.49 10.46 16 20.14 18.77 11.26 3.25 16.47 5.49 15.64 11.94-.201 2.73-1.642 5.217-3.91 6.75-6.27 4.17-18.61 2.05-22.83 .88-1.395-.446-2.922-.094-3.981 .918-1.059 1.012-1.48 2.521-1.099 3.935 .382 1.414 1.505 2.506 2.929 2.847 4.64 1.216 9.413 1.851 14.21 1.89 5.18 0 10.83-.86 15.22-3.77 4.201-2.824 6.924-7.373 7.43-12.41C149.64 181.84 136.26 178 126.49 175.15ZM209.34 148.23c-2.079-.742-4.366 .341-5.11 2.42L188 196.11 171.77 150.65c-.746-2.082-3.038-3.166-5.12-2.42-2.082 .746-3.166 3.038-2.42 5.12l20 56c.566 1.596 2.076 2.663 3.77 2.663 1.694 0 3.204-1.067 3.77-2.663l20-56c.359-1.001 .304-2.104-.152-3.065-.456-.961-1.276-1.7-2.278-2.055ZM212 88v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM198.34 84 156 41.65v42.35Z"),
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
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
