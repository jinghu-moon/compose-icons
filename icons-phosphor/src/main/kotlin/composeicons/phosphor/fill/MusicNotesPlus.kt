package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorFillIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8ZM160.6 77.86l-6.76-6.76C147.944 65.336 144.431 57.564 144 49.33c-.173-3.957 .394-7.911 1.67-11.66 .458-1.383 .128-2.906-.862-3.975-.99-1.069-2.483-1.515-3.898-1.165L78.06 48.25C74.503 49.139 72.005 52.333 72 56v110.1c-12.864-8.623-29.8-8.053-42.055 1.415-12.255 9.468-17.081 25.713-11.985 40.336 5.097 14.624 18.975 24.349 34.46 24.149C72.25 231.77 88 215.13 88 195.3v-93.05L158.74 84.56c1.395-.351 2.494-1.423 2.878-2.809 .385-1.386-.004-2.871-1.018-3.891ZM210.71 102.17c-2.31 .816-4.705 1.362-7.14 1.63-2.04 .221-3.582 1.948-3.57 4v26.3c-12.864-8.623-29.8-8.053-42.055 1.415-12.255 9.468-17.081 25.713-11.985 40.336 5.097 14.624 18.975 24.349 34.46 24.149C200.25 199.77 216 183.14 216 163.3v-57.3c.014-1.298-.602-2.522-1.654-3.284-1.052-.761-2.407-.965-3.636-.546Z"),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
