package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorBoldIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.75 30.52c-6.36-3.527-14.133-3.324-20.3 .53L68 102v-62C68 33.373 62.627 28 56 28 49.373 28 44 33.373 44 40v176c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-62l113.45 71c6.151 3.819 13.886 4.016 20.223 .515 6.337-3.502 10.287-10.155 10.327-17.395v-160.24c-.007-7.22-3.932-13.867-10.25-17.36ZM188 200.73 71.7 128 188 55.27Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
