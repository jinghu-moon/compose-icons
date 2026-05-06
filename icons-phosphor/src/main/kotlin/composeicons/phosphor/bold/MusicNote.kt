package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorBoldIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.45 52.51l-80-24c-3.633-1.09-7.567-.399-10.611 1.864C117.795 32.638 116.001 36.207 116 40v100.22C95.981 127.428 69.839 129.829 52.486 146.055 35.133 162.28 30.982 188.202 42.402 209.034c11.42 20.832 35.506 31.275 58.518 25.373C123.932 228.505 140.017 207.757 140 184v-79.87l64.55 19.36c3.633 1.09 7.567 .399 10.611-1.864 3.044-2.263 4.838-5.833 4.839-9.626v-48c-.001-5.297-3.476-9.967-8.55-11.49ZM88 212C72.536 212 60 199.464 60 184c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM196 95.87 140 79.07v-22.94l56 16.8Z"),
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
