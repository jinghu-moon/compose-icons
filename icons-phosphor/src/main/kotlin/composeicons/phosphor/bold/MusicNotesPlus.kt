package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorBoldIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 48c0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12ZM220 112v52c.005 17.69-11.61 33.281-28.561 38.34-16.951 5.059-35.211-1.617-44.902-16.416-9.691-14.799-8.511-34.206 2.903-47.721C160.852 124.688 179.787 120.274 196 127.35v-15.35c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM196 164c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM92 113.37v82.63c.005 17.69-11.61 33.281-28.561 38.34C46.488 239.399 28.227 232.723 18.537 217.924 8.846 203.125 10.026 183.718 21.439 170.203 32.852 156.688 51.787 152.274 68 159.35v-103.35c.001-5.506 3.748-10.305 9.09-11.64l56-14c6.378-1.479 12.764 2.428 14.352 8.779 1.588 6.352-2.209 12.804-8.532 14.501L92 65.37v23.26L157.09 72.36c6.378-1.479 12.764 2.428 14.352 8.779 1.588 6.352-2.209 12.804-8.532 14.501ZM68 196c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16Z"),
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
