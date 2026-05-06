package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorBoldIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.38 14.54c-2.912-2.271-6.707-3.075-10.29-2.18l-128 32C71.748 45.695 68.001 50.494 68 56v103.35C51.787 152.274 32.852 156.688 21.439 170.203 10.026 183.718 8.846 203.125 18.537 217.924c9.691 14.799 27.952 21.475 44.902 16.416C80.39 229.281 92.005 213.69 92 196v-130.63L196 39.37v88c-16.214-7.077-35.152-2.661-46.564 10.857-11.413 13.518-12.589 32.927-2.894 47.725 9.696 14.798 27.961 21.469 44.911 16.404C208.404 197.29 220.014 181.691 220 164v-140c-.001-3.697-1.705-7.187-4.62-9.46ZM52 212c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM180 180c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
