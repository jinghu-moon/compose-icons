package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorFillIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.3 56.34l-80-24c-2.422-.727-5.045-.266-7.074 1.243C121.197 35.092 120.001 37.471 120 40v108.26C103.116 133.159 77.973 131.916 59.682 145.28 41.392 158.644 34.934 182.975 44.19 203.65c9.256 20.675 31.706 32.065 53.856 27.324C120.196 226.233 136.018 206.652 136 184v-85.25l69.7 20.91c2.422 .727 5.045 .266 7.074-1.243 2.029-1.509 3.225-3.888 3.226-6.417v-48c-.001-3.532-2.318-6.645-5.7-7.66Z"),
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
