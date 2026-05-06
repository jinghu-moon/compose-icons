package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorLightIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.72 58.25l-80-24c-1.817-.544-3.783-.196-5.304 .936C122.895 36.319 121.999 38.104 122 40v113.05C107.081 136.679 82.613 133.264 63.782 144.925 44.951 156.586 37.104 180.011 45.111 200.663c8.007 20.651 29.594 32.664 51.365 28.583C118.246 225.165 134.016 206.149 134 184v-87.94l72.28 21.69c1.817 .544 3.783 .196 5.304-.936 1.521-1.133 2.417-2.918 2.416-4.814v-48c.001-2.652-1.739-4.99-4.28-5.75ZM88 218C69.222 218 54 202.778 54 184c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM202 103.94 134 83.54v-35.48l68 20.4Z"),
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
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
