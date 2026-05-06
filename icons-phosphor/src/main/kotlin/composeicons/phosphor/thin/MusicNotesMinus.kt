package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorThinIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM212 88v76c.028 15.492-11.025 28.788-26.261 31.59-15.236 2.802-30.297-5.691-35.782-20.179-5.485-14.488 .174-30.826 13.445-38.817 13.272-7.991 30.359-5.349 40.598 6.277v-54.87c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM204 164c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24ZM84 107.12v88.88c.028 15.492-11.025 28.788-26.261 31.59C42.503 230.392 27.442 221.899 21.957 207.411c-5.485-14.488 .174-30.826 13.445-38.817 13.272-7.991 30.359-5.349 40.598 6.277v-118.87c-.003-1.827 1.231-3.423 3-3.88l56-14c2.143-.552 4.328 .737 4.88 2.88 .552 2.143-.737 4.328-2.88 4.88L84 59.12v39.76L159 80.12c2.143-.552 4.328 .737 4.88 2.88 .552 2.143-.737 4.328-2.88 4.88ZM76 196C76 182.745 65.255 172 52 172c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
