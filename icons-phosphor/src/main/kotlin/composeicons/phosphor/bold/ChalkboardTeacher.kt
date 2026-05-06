package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorBoldIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 84C56 77.373 61.373 72 68 72h120c6.627 0 12 5.373 12 12v88c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-76h-108C61.373 96 56 90.627 56 84ZM236 56v144c0 11.046-8.954 20-20 20h-66.74c-5.186-.001-9.784-3.333-11.4-8.26-5.144-14.281-18.691-23.801-33.87-23.801-15.179 0-28.726 9.52-33.87 23.801-1.614 4.92-6.202 8.25-11.38 8.26h-18.74C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM104 164c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM212 60h-168v136h6.92c5.047-9.53 12.563-17.529 21.76-23.16C59.672 156.465 61.473 132.835 76.811 118.62c15.339-14.215 39.038-14.215 54.377 0 15.339 14.215 17.139 37.845 4.131 54.22 9.197 5.631 16.713 13.63 21.76 23.16h54.92Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
