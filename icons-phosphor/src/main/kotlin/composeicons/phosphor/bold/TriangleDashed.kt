package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorBoldIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 216c0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12ZM240.26 186.1 235.6 178c-3.314-5.741-10.654-7.709-16.395-4.395-5.741 3.314-7.709 10.654-4.395 16.395l4.65 8.08c.703 1.144 .703 2.586 0 3.73-.829 1.412-2.364 2.256-4 2.2h-23.46c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h23.46c10.219 .091 19.693-5.332 24.79-14.19 5.007-8.561 5.011-19.156 .01-27.72ZM64 204h-23.45c-1.636 .056-3.171-.788-4-2.2-.703-1.144-.703-2.586 0-3.73L41.19 190c3.314-5.741 1.346-13.081-4.395-16.395C31.054 170.291 23.714 172.259 20.4 178l-4.66 8.09c-5 8.56-5 19.15 0 27.71 5.098 8.868 14.582 14.296 24.81 14.2h23.45c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM202.17 156c4.287-.001 8.248-2.288 10.391-6.001 2.143-3.713 2.143-8.287-.001-11.999l-23-40c-3.314-5.744-10.656-7.714-16.4-4.4-5.744 3.314-7.714 10.656-4.4 16.4l23 40c2.149 3.721 6.123 6.01 10.42 6ZM166.5 58 152.81 34.23C147.656 25.415 138.211 19.997 128 19.997c-10.211 0-19.656 5.418-24.81 14.233L89.5 58c-3.314 5.741-1.346 13.081 4.395 16.395 5.741 3.314 13.081 1.346 16.395-4.395L124 46.2c.873-1.363 2.381-2.188 4-2.188 1.619 0 3.127 .825 4 2.188L145.71 70c2.147 3.718 6.116 6.006 10.41 6 2.107 .009 4.177-.544 6-1.6 2.756-1.593 4.766-4.217 5.588-7.293 .821-3.076 .387-6.352-1.208-9.107ZM82.85 93.6C77.109 90.289 69.771 92.259 66.46 98l-23 40c-3.314 5.744-1.344 13.086 4.4 16.4 5.744 3.314 13.086 1.344 16.4-4.4l23-40c1.592-2.759 2.022-6.038 1.195-9.114-.827-3.076-2.844-5.697-5.605-7.286Z"),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
