package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorFillIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.09 98.9c4.804 7.375 5.186 16.788 .995 24.528C160.894 131.168 152.802 135.993 144 136h-12.37ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM189.27 58c-1.597-1.398-3.683-2.104-5.8-1.964-2.117 .141-4.092 1.117-5.49 2.714L162.42 76.51C156.733 73.545 150.414 71.998 144 72h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c2.499-.001 4.983 .39 7.36 1.16l-41 46.84h-30.36c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16.37L66 186.73c-2.599 3.341-2.145 8.129 1.035 10.923 3.181 2.794 7.987 2.626 10.965-.383L89.63 184h86.37c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72.37l14-16h26.37c15.47-.009 29.549-8.937 36.152-22.928 6.603-13.991 4.546-30.534-5.282-42.482L190 69.27c2.903-3.316 2.576-8.356-.73-11.27Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
