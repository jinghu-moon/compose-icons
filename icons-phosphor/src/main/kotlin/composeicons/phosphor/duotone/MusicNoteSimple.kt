package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorDuotoneIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 184c0 22.091-17.909 40-40 40C65.909 224 48 206.091 48 184c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M210.3 56.34l-80-24c-2.422-.727-5.045-.266-7.074 1.243C121.197 35.092 120.001 37.471 120 40v108.26C103.116 133.159 77.973 131.916 59.682 145.28 41.392 158.644 34.934 182.975 44.19 203.65c9.256 20.675 31.706 32.065 53.856 27.324C120.196 226.233 136.018 206.652 136 184v-133.25l69.7 20.91c2.76 .899 5.79 .233 7.918-1.741 2.128-1.974 3.02-4.945 2.331-7.764-.689-2.819-2.851-5.045-5.649-5.815ZM88 216C70.327 216 56 201.673 56 184c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
