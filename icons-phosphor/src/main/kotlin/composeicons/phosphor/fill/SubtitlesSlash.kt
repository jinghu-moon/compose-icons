package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorFillIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.464 33.019 50.421 32.075 48.258 32.006c-2.163-.07-4.262 .74-5.818 2.244-3.085 3.145-3.146 8.16-.14 11.38L44.46 48h-12.46C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h157.92l12.16 13.38c1.432 1.575 3.433 2.514 5.559 2.61 2.126 .096 4.203-.66 5.771-2.1 3.172-3.135 3.305-8.214 .3-11.51ZM104 128h13.19l14.54 16h-27.46c-4.289 .063-7.898-3.197-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527ZM56 128h16c2.217-.005 4.336 .91 5.853 2.527 1.517 1.617 2.294 3.791 2.147 6.003-.372 4.273-3.981 7.533-8.27 7.47h-15.46c-4.289 .063-7.898-3.197-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C51.664 128.91 53.783 127.995 56 128ZM152 176h-95.73c-4.289 .063-7.898-3.197-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C51.664 160.91 53.783 159.995 56 160h90.28l11.9 13.09c-1.522 1.845-3.789 2.912-6.18 2.91ZM240 64v128c-.004 4.48-1.887 8.753-5.19 11.78-.784 .733-1.829 1.12-2.9 1.075-1.072-.045-2.081-.519-2.8-1.315L175 144h25c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.367-4.268-3.967-7.528-8.25-7.47h-39.3L93.79 54.69c-1.07-1.177-1.34-2.876-.69-4.327 .651-1.451 2.099-2.379 3.69-2.363h127.21c8.837 0 16 7.163 16 16Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
