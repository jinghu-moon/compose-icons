package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorBoldIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 104C72 95.163 79.163 88 88 88c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM168 120c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM236 80v112c0 19.882-16.118 36-36 36h-144C36.118 228 20 211.882 20 192v-112C20 60.118 36.118 44 56 44h60v-28C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12v28h60c19.882 0 36 16.118 36 36ZM212 80c0-6.627-5.373-12-12-12h-144C49.373 68 44 73.373 44 80v112c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12ZM200 162c0 16.569-13.431 30-30 30h-84C69.431 192 56 178.569 56 162c0-16.569 13.431-30 30-30h84c16.569 0 30 13.431 30 30ZM120 156v12h16v-12ZM86 168h10v-12h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM176 162c0-3.314-2.686-6-6-6h-10v12h10c3.314 0 6-2.686 6-6Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
