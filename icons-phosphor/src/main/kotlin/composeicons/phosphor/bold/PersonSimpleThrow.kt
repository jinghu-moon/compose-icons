package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorBoldIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 92c19.882 0 36-16.118 36-36C164 36.118 147.882 20 128 20 108.118 20 92 36.118 92 56c0 19.882 16.118 36 36 36ZM128 44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM44 96C44 84.954 52.954 76 64 76c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C52.954 116 44 107.046 44 96ZM228 113.6c.016 4.623-2.626 8.844-6.791 10.851-4.165 2.007-9.113 1.442-12.719-1.451 0 0-21-15.48-53.34 .28-.34 4.75-1 10.94-2.13 18l30.66 25.55c3.789 3.161 5.256 8.318 3.7 13l-16 48c-1.273 4.17-4.709 7.321-8.973 8.231-4.264 .91-8.686-.565-11.551-3.852-2.865-3.287-3.721-7.869-2.236-11.969L162 180 146.56 167.14c-1.638 4.847-3.548 9.598-5.72 14.23-14.64 31-39.34 51.93-73.42 62.15-1.11 .327-2.263 .488-3.42 .48-5.963 .011-11.029-4.358-11.895-10.257-.866-5.899 2.731-11.54 8.445-13.243 37.84-11.35 60.77-38.71 68.41-81.44-24 13.54-43.11 17-56.46 17C65.175 156.014 57.908 154.747 51 152.31c-5.834-2.814-8.382-9.75-5.758-15.671 2.625-5.921 9.475-8.692 15.478-6.259 .43 .17 25.42 9.53 68.5-19.76 54.71-37.18 94.26-6.38 94.26-6.38 2.85 2.272 4.513 5.715 4.52 9.36Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
