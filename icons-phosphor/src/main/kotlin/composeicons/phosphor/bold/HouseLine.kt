package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorBoldIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 204h-12v-60c5.278 1.855 11.138-.184 14.125-4.914 2.987-4.73 2.309-10.897-1.635-14.866L142.14 25.85c-7.81-7.808-20.47-7.808-28.28 0L15.51 124.2c-3.968 3.964-4.661 10.148-1.668 14.892 2.992 4.744 8.872 6.782 14.158 4.908v60h-12C9.373 204 4 209.373 4 216c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM52 121.65l76-76 76 76v82.35h-40v-52c0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v52h-40ZM140 204h-24v-40h24Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
