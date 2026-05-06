package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorLightIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.69 19.27c-1.457-1.137-3.357-1.539-5.15-1.09l-128 32C75.871 50.85 74 53.249 74 56v114.11C61.829 159.781 44.111 159.31 31.409 168.977c-12.703 9.668-16.969 26.87-10.256 41.353 6.713 14.483 22.597 22.346 38.184 18.901C74.924 225.787 86.015 211.963 86 196v-87.32l116-29v58.43c-12.171-10.329-29.889-10.8-42.591-1.133-12.703 9.668-16.969 26.87-10.256 41.353 6.713 14.483 22.597 22.346 38.184 18.901C202.924 193.787 214.015 179.963 214 164v-140c-0-1.848-.853-3.593-2.31-4.73ZM52 218C39.85 218 30 208.15 30 196c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM86 96.32v-35.64l116-29v35.64ZM180 186c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
