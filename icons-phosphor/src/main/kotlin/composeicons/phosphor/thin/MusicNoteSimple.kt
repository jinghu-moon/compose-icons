package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorThinIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.15 60.17l-80-24c-1.211-.363-2.522-.133-3.537 .621-1.015 .754-1.613 1.944-1.613 3.209v118.75C111.516 140.984 87.938 134.982 68.478 144.616c-19.459 9.634-28.982 32.022-22.424 52.722 6.558 20.699 27.236 33.52 48.693 30.19C116.204 224.198 132.024 205.714 132 184v-138.62l74.85 22.45c2.095 .576 4.267-.625 4.892-2.706 .625-2.081-.526-4.281-2.592-4.954ZM88 220C68.118 220 52 203.882 52 184c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
